package io.github.cadiboo.examplemod.init;

import io.github.cadiboo.examplemod.ExampleMod;
import io.github.cadiboo.examplemod.item.ModdedSpawnEggItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * Holds a list of all our {@link Item}s.
 * Suppliers that create Items are added to the DeferredRegister.
 * The DeferredRegister is then added to our mod event bus in our constructor.
 * When the Item Registry Event is fired by Forge and it is time for the mod to
 * register its Items, our Items are created and registered by the DeferredRegister.
 * The Item Registry Event will always be called after the Block registry is filled.
 * Note: This supports registry overrides.
 *
 * @author Cadiboo
 */
public final class ModItems {

	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ExampleMod.MODID);

	// This is a very simple Item. It has no special properties except for being on our creative tab.
	public static final RegistryObject<Item> EXAMPLE_CRYSTAL = ITEMS.register("example_crystal", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));
	public static final RegistryObject<ModdedSpawnEggItem> WILD_BOAR_SPAWN_EGG = ITEMS.register("wild_boar_spawn_egg", () -> new ModdedSpawnEggItem(ModEntityTypes.WILD_BOAR, 0xF0A5A2, 0xA9672B, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

	// Chester
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", () -> new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)));

	// MJ
	// M
	public static final RegistryObject<Item> M_1 = ITEMS.register("m_1", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_2 = ITEMS.register("m_2", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_3 = ITEMS.register("m_3", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_4 = ITEMS.register("m_4", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_5 = ITEMS.register("m_5", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_6 = ITEMS.register("m_6", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_7 = ITEMS.register("m_7", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_8 = ITEMS.register("m_8", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> M_9 = ITEMS.register("m_9", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));

	// S
	public static final RegistryObject<Item> S_1 = ITEMS.register("s_1", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_2 = ITEMS.register("s_2", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_3 = ITEMS.register("s_3", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_4 = ITEMS.register("s_4", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_5 = ITEMS.register("s_5", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_6 = ITEMS.register("s_6", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_7 = ITEMS.register("s_7", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_8 = ITEMS.register("s_8", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> S_9 = ITEMS.register("s_9", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));

	// P
	public static final RegistryObject<Item> P_1 = ITEMS.register("p_1", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_2 = ITEMS.register("p_2", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_3 = ITEMS.register("p_3", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_4 = ITEMS.register("p_4", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_5 = ITEMS.register("p_5", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_6 = ITEMS.register("p_6", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_7 = ITEMS.register("p_7", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_8 = ITEMS.register("p_8", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> P_9 = ITEMS.register("p_9", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));

	// Font Tiles
	public static final RegistryObject<Item> EAST_TILE = ITEMS.register("east_tile", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> SOUTH_TILE = ITEMS.register("south_tile", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> WEST_TILE = ITEMS.register("west_tile", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> NORTH_TILE = ITEMS.register("north_tile", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> RED_DRAGON = ITEMS.register("red_dragon", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> GREEN_DRAGON = ITEMS.register("green_dragon", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
	public static final RegistryObject<Item> WHITE_DRAGON = ITEMS.register("white_dragon", () -> new Item(new Item.Properties().group(ModItemGroups.MJ_ITEM_GROUP)));
}
