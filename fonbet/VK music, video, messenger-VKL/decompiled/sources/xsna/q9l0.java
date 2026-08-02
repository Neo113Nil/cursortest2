package xsna;

import androidx.room.l;
import com.coremedia.iso.boxes.FreeBox;
import com.ironsource.C4313f8;
import com.ironsource.C4504q2;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.nxn0;

/* compiled from: StickersDatabase_Impl.kt */
/* loaded from: classes5.dex */
public final class q9l0 extends androidx.room.l {
    public final /* synthetic */ StickersDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q9l0(StickersDatabase_Impl stickersDatabase_Impl) {
        super(22, "520fd459816e72a181b81264b347c6f8", "1d3f8b1da61d9f532975c6b47199fdbb");
        this.d = stickersDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `store_packs` (`id` INTEGER NOT NULL, `contextId` INTEGER NOT NULL, `type` TEXT NOT NULL, `copyright` TEXT, `purchased` INTEGER NOT NULL, `active` INTEGER NOT NULL, `title` TEXT NOT NULL, `stickers` TEXT NOT NULL, `icon` TEXT, `previews` TEXT, `url` TEXT NOT NULL, `author` TEXT NOT NULL, `description` TEXT NOT NULL, `styles` TEXT NOT NULL, `styleStickerIds` TEXT, `baseId` INTEGER, `vmojiAvatar` TEXT, `hasAnimation` INTEGER NOT NULL, `canPurchase` INTEGER NOT NULL, `canPurchaseFor` INTEGER NOT NULL, `promoted` INTEGER NOT NULL, `free` INTEGER NOT NULL, `prices` TEXT NOT NULL, `merchantId` TEXT, `paymentTypeStr` TEXT, `photo35` TEXT, `photo70` TEXT, `photo140` TEXT, `photo296` TEXT, `photo592` TEXT, `noPurchaseReason` TEXT, `purchaseDate` INTEGER NOT NULL, `order` INTEGER NOT NULL, `canGift` INTEGER NOT NULL, `note` TEXT, `badge` TEXT, `purchaseDetails` TEXT, `isForVkMeOnly` INTEGER NOT NULL, `versionHash` TEXT NOT NULL, `isNotViewed` INTEGER NOT NULL, `referrer` TEXT, `isVmoji` INTEGER NOT NULL, `isPopup` INTEGER, PRIMARY KEY(`id`, `contextId`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `recents_stickers` (`id` INTEGER NOT NULL, `productId` INTEGER NOT NULL, `images` TEXT NOT NULL, `imagesWithBackground` TEXT NOT NULL, `config` TEXT, `animations` TEXT NOT NULL, `isAllowed` INTEGER NOT NULL, `render` TEXT, `vmojiCharacter` TEXT, `popup` TEXT, `order` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `favorites_stickers` (`id` INTEGER NOT NULL, `productId` INTEGER NOT NULL, `images` TEXT NOT NULL, `imagesWithBackground` TEXT NOT NULL, `config` TEXT, `animations` TEXT NOT NULL, `isAllowed` INTEGER NOT NULL, `render` TEXT, `vmojiCharacter` TEXT, `popup` TEXT, PRIMARY KEY(`id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `stickers_suggests` (`words` TEXT NOT NULL, `stickers` TEXT NOT NULL, `is_special` INTEGER NOT NULL, PRIMARY KEY(`words`, `stickers`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `vmoji_avatar` (`avatar` TEXT NOT NULL, `avatarIcon` TEXT, `avatarIconDark` TEXT, `avatarColor` INTEGER NOT NULL, `avatarColorDark` INTEGER NOT NULL, `contextStickerPackId` INTEGER, PRIMARY KEY(`avatar`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `stickers_image_configs` (`hash` TEXT NOT NULL, `defaultConfig` INTEGER NOT NULL, `configs` TEXT NOT NULL, PRIMARY KEY(`hash`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `excluded_packs_stickers` (`version` INTEGER NOT NULL, `packIds` TEXT NOT NULL, PRIMARY KEY(`version`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `stickers_promo` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `newStickersItems` INTEGER NOT NULL, `globalPromotes` INTEGER NOT NULL, `vmojiPromoCounter` INTEGER NOT NULL, `vmojiPromoCounterColor` TEXT, `vmojiPromoDotColor` TEXT, `vmojiPromoOpenParams` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `ugc_packs` (`ownerId` INTEGER NOT NULL, `id` INTEGER NOT NULL, `stickers` TEXT NOT NULL, `hash` TEXT NOT NULL, `editParams` TEXT, PRIMARY KEY(`id`, `ownerId`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `ugc_chat_settings` (`chat_id` INTEGER NOT NULL, `isHiddenInKb` INTEGER NOT NULL, `isHiddenEverywhere` INTEGER NOT NULL, `needToShowOnboarding` INTEGER NOT NULL, `isEditBanned` INTEGER NOT NULL, `canEdit` INTEGER NOT NULL, `canHide` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `vmoji_promo_in_suggests` (`vmoji_promo_dictionary` TEXT NOT NULL, `vmoji_promo_stickers` TEXT NOT NULL, PRIMARY KEY(`vmoji_promo_dictionary`, `vmoji_promo_stickers`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `popup_stickers_chat_settings` (`peerId` INTEGER NOT NULL, `animation_autoplay` INTEGER NOT NULL, `countOfInterruptClicks` INTEGER NOT NULL, PRIMARY KEY(`peerId`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `stickers_recommendations` (`id` INTEGER NOT NULL, `packIdsInKeyboard` TEXT NOT NULL, `packs` TEXT NOT NULL, PRIMARY KEY(`id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `promoted_stickers` (`id` INTEGER NOT NULL, `sticker` TEXT NOT NULL, `lastUsedTime` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '520fd459816e72a181b81264b347c6f8')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `store_packs`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `recents_stickers`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `favorites_stickers`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `stickers_suggests`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `vmoji_avatar`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `stickers_image_configs`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `excluded_packs_stickers`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `stickers_promo`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `ugc_packs`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `ugc_chat_settings`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `vmoji_promo_in_suggests`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `popup_stickers_chat_settings`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `stickers_recommendations`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `promoted_stickers`");
    }

    @Override // androidx.room.l
    public final void d(hyg0 hyg0Var) {
        int i = StickersDatabase_Impl.B;
        this.d.r(hyg0Var);
    }

    @Override // androidx.room.l
    public final void f(hyg0 hyg0Var) {
        urk.a(hyg0Var);
    }

    @Override // androidx.room.l
    public final l.a g(hyg0 hyg0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap.put("contextId", new nxn0.a(2, "contextId", "INTEGER", null, true, 1));
        linkedHashMap.put("type", new nxn0.a(0, "type", "TEXT", null, true, 1));
        linkedHashMap.put("copyright", new nxn0.a(0, "copyright", "TEXT", null, false, 1));
        linkedHashMap.put("purchased", new nxn0.a(0, "purchased", "INTEGER", null, true, 1));
        linkedHashMap.put(SignalingProtocol.KEY_ACTIVE, new nxn0.a(0, SignalingProtocol.KEY_ACTIVE, "INTEGER", null, true, 1));
        linkedHashMap.put("title", new nxn0.a(0, "title", "TEXT", null, true, 1));
        linkedHashMap.put("stickers", new nxn0.a(0, "stickers", "TEXT", null, true, 1));
        linkedHashMap.put("icon", new nxn0.a(0, "icon", "TEXT", null, false, 1));
        linkedHashMap.put("previews", new nxn0.a(0, "previews", "TEXT", null, false, 1));
        linkedHashMap.put("url", new nxn0.a(0, "url", "TEXT", null, true, 1));
        linkedHashMap.put("author", new nxn0.a(0, "author", "TEXT", null, true, 1));
        linkedHashMap.put("description", new nxn0.a(0, "description", "TEXT", null, true, 1));
        linkedHashMap.put("styles", new nxn0.a(0, "styles", "TEXT", null, true, 1));
        linkedHashMap.put("styleStickerIds", new nxn0.a(0, "styleStickerIds", "TEXT", null, false, 1));
        linkedHashMap.put("baseId", new nxn0.a(0, "baseId", "INTEGER", null, false, 1));
        linkedHashMap.put("vmojiAvatar", new nxn0.a(0, "vmojiAvatar", "TEXT", null, false, 1));
        linkedHashMap.put("hasAnimation", new nxn0.a(0, "hasAnimation", "INTEGER", null, true, 1));
        linkedHashMap.put("canPurchase", new nxn0.a(0, "canPurchase", "INTEGER", null, true, 1));
        linkedHashMap.put("canPurchaseFor", new nxn0.a(0, "canPurchaseFor", "INTEGER", null, true, 1));
        linkedHashMap.put("promoted", new nxn0.a(0, "promoted", "INTEGER", null, true, 1));
        linkedHashMap.put(FreeBox.TYPE, new nxn0.a(0, FreeBox.TYPE, "INTEGER", null, true, 1));
        linkedHashMap.put("prices", new nxn0.a(0, "prices", "TEXT", null, true, 1));
        linkedHashMap.put("merchantId", new nxn0.a(0, "merchantId", "TEXT", null, false, 1));
        linkedHashMap.put("paymentTypeStr", new nxn0.a(0, "paymentTypeStr", "TEXT", null, false, 1));
        linkedHashMap.put("photo35", new nxn0.a(0, "photo35", "TEXT", null, false, 1));
        linkedHashMap.put("photo70", new nxn0.a(0, "photo70", "TEXT", null, false, 1));
        linkedHashMap.put("photo140", new nxn0.a(0, "photo140", "TEXT", null, false, 1));
        linkedHashMap.put("photo296", new nxn0.a(0, "photo296", "TEXT", null, false, 1));
        linkedHashMap.put("photo592", new nxn0.a(0, "photo592", "TEXT", null, false, 1));
        linkedHashMap.put("noPurchaseReason", new nxn0.a(0, "noPurchaseReason", "TEXT", null, false, 1));
        linkedHashMap.put("purchaseDate", new nxn0.a(0, "purchaseDate", "INTEGER", null, true, 1));
        linkedHashMap.put(C4504q2.u, new nxn0.a(0, C4504q2.u, "INTEGER", null, true, 1));
        linkedHashMap.put("canGift", new nxn0.a(0, "canGift", "INTEGER", null, true, 1));
        linkedHashMap.put("note", new nxn0.a(0, "note", "TEXT", null, false, 1));
        linkedHashMap.put("badge", new nxn0.a(0, "badge", "TEXT", null, false, 1));
        linkedHashMap.put("purchaseDetails", new nxn0.a(0, "purchaseDetails", "TEXT", null, false, 1));
        linkedHashMap.put("isForVkMeOnly", new nxn0.a(0, "isForVkMeOnly", "INTEGER", null, true, 1));
        linkedHashMap.put("versionHash", new nxn0.a(0, "versionHash", "TEXT", null, true, 1));
        linkedHashMap.put("isNotViewed", new nxn0.a(0, "isNotViewed", "INTEGER", null, true, 1));
        linkedHashMap.put("referrer", new nxn0.a(0, "referrer", "TEXT", null, false, 1));
        linkedHashMap.put("isVmoji", new nxn0.a(0, "isVmoji", "INTEGER", null, true, 1));
        nxn0 nxn0Var = new nxn0("store_packs", linkedHashMap, b690.a(linkedHashMap, "isPopup", new nxn0.a(0, "isPopup", "INTEGER", null, false, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "store_packs");
        if (!nxn0Var.equals(a)) {
            return new l.a(false, t3j0.a("store_packs(com.vk.repository.internal.repos.stickers.database.entity.StickerPackEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap2.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, new nxn0.a(0, InAppPurchaseMetaData.KEY_PRODUCT_ID, "INTEGER", null, true, 1));
        linkedHashMap2.put("images", new nxn0.a(0, "images", "TEXT", null, true, 1));
        linkedHashMap2.put("imagesWithBackground", new nxn0.a(0, "imagesWithBackground", "TEXT", null, true, 1));
        linkedHashMap2.put("config", new nxn0.a(0, "config", "TEXT", null, false, 1));
        linkedHashMap2.put("animations", new nxn0.a(0, "animations", "TEXT", null, true, 1));
        linkedHashMap2.put("isAllowed", new nxn0.a(0, "isAllowed", "INTEGER", null, true, 1));
        linkedHashMap2.put("render", new nxn0.a(0, "render", "TEXT", null, false, 1));
        linkedHashMap2.put("vmojiCharacter", new nxn0.a(0, "vmojiCharacter", "TEXT", null, false, 1));
        linkedHashMap2.put("popup", new nxn0.a(0, "popup", "TEXT", null, false, 1));
        nxn0 nxn0Var2 = new nxn0("recents_stickers", linkedHashMap2, b690.a(linkedHashMap2, C4504q2.u, new nxn0.a(0, C4504q2.u, "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a2 = nxn0.b.a(hyg0Var, "recents_stickers");
        if (!nxn0Var2.equals(a2)) {
            return new l.a(false, t3j0.a("recents_stickers(com.vk.repository.internal.repos.stickers.database.entity.StickerEntity).\n Expected:\n", nxn0Var2, "\n Found:\n", a2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap3.put(InAppPurchaseMetaData.KEY_PRODUCT_ID, new nxn0.a(0, InAppPurchaseMetaData.KEY_PRODUCT_ID, "INTEGER", null, true, 1));
        linkedHashMap3.put("images", new nxn0.a(0, "images", "TEXT", null, true, 1));
        linkedHashMap3.put("imagesWithBackground", new nxn0.a(0, "imagesWithBackground", "TEXT", null, true, 1));
        linkedHashMap3.put("config", new nxn0.a(0, "config", "TEXT", null, false, 1));
        linkedHashMap3.put("animations", new nxn0.a(0, "animations", "TEXT", null, true, 1));
        linkedHashMap3.put("isAllowed", new nxn0.a(0, "isAllowed", "INTEGER", null, true, 1));
        linkedHashMap3.put("render", new nxn0.a(0, "render", "TEXT", null, false, 1));
        linkedHashMap3.put("vmojiCharacter", new nxn0.a(0, "vmojiCharacter", "TEXT", null, false, 1));
        nxn0 nxn0Var3 = new nxn0("favorites_stickers", linkedHashMap3, b690.a(linkedHashMap3, "popup", new nxn0.a(0, "popup", "TEXT", null, false, 1)), new LinkedHashSet());
        nxn0 a3 = nxn0.b.a(hyg0Var, "favorites_stickers");
        if (!nxn0Var3.equals(a3)) {
            return new l.a(false, t3j0.a("favorites_stickers(com.vk.repository.internal.repos.stickers.database.entity.FavoriteStickerEntity).\n Expected:\n", nxn0Var3, "\n Found:\n", a3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("words", new nxn0.a(1, "words", "TEXT", null, true, 1));
        linkedHashMap4.put("stickers", new nxn0.a(2, "stickers", "TEXT", null, true, 1));
        nxn0 nxn0Var4 = new nxn0("stickers_suggests", linkedHashMap4, b690.a(linkedHashMap4, "is_special", new nxn0.a(0, "is_special", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a4 = nxn0.b.a(hyg0Var, "stickers_suggests");
        if (!nxn0Var4.equals(a4)) {
            return new l.a(false, t3j0.a("stickers_suggests(com.vk.repository.internal.repos.stickers.database.entity.DictionaryItemEntity).\n Expected:\n", nxn0Var4, "\n Found:\n", a4));
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("avatar", new nxn0.a(1, "avatar", "TEXT", null, true, 1));
        linkedHashMap5.put("avatarIcon", new nxn0.a(0, "avatarIcon", "TEXT", null, false, 1));
        linkedHashMap5.put("avatarIconDark", new nxn0.a(0, "avatarIconDark", "TEXT", null, false, 1));
        linkedHashMap5.put("avatarColor", new nxn0.a(0, "avatarColor", "INTEGER", null, true, 1));
        linkedHashMap5.put("avatarColorDark", new nxn0.a(0, "avatarColorDark", "INTEGER", null, true, 1));
        nxn0 nxn0Var5 = new nxn0("vmoji_avatar", linkedHashMap5, b690.a(linkedHashMap5, "contextStickerPackId", new nxn0.a(0, "contextStickerPackId", "INTEGER", null, false, 1)), new LinkedHashSet());
        nxn0 a5 = nxn0.b.a(hyg0Var, "vmoji_avatar");
        if (!nxn0Var5.equals(a5)) {
            return new l.a(false, t3j0.a("vmoji_avatar(com.vk.repository.internal.repos.stickers.database.entity.VmojiAvatarEntity).\n Expected:\n", nxn0Var5, "\n Found:\n", a5));
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("hash", new nxn0.a(1, "hash", "TEXT", null, true, 1));
        linkedHashMap6.put("defaultConfig", new nxn0.a(0, "defaultConfig", "INTEGER", null, true, 1));
        nxn0 nxn0Var6 = new nxn0("stickers_image_configs", linkedHashMap6, b690.a(linkedHashMap6, C4313f8.p, new nxn0.a(0, C4313f8.p, "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a6 = nxn0.b.a(hyg0Var, "stickers_image_configs");
        if (!nxn0Var6.equals(a6)) {
            return new l.a(false, t3j0.a("stickers_image_configs(com.vk.repository.internal.repos.stickers.database.entity.ImagesConfigsEntity).\n Expected:\n", nxn0Var6, "\n Found:\n", a6));
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("version", new nxn0.a(1, "version", "INTEGER", null, true, 1));
        nxn0 nxn0Var7 = new nxn0("excluded_packs_stickers", linkedHashMap7, b690.a(linkedHashMap7, "packIds", new nxn0.a(0, "packIds", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a7 = nxn0.b.a(hyg0Var, "excluded_packs_stickers");
        if (!nxn0Var7.equals(a7)) {
            return new l.a(false, t3j0.a("excluded_packs_stickers(com.vk.repository.internal.repos.stickers.database.entity.StickersConfigEntity).\n Expected:\n", nxn0Var7, "\n Found:\n", a7));
        }
        LinkedHashMap linkedHashMap8 = new LinkedHashMap();
        linkedHashMap8.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap8.put("newStickersItems", new nxn0.a(0, "newStickersItems", "INTEGER", null, true, 1));
        linkedHashMap8.put("globalPromotes", new nxn0.a(0, "globalPromotes", "INTEGER", null, true, 1));
        linkedHashMap8.put("vmojiPromoCounter", new nxn0.a(0, "vmojiPromoCounter", "INTEGER", null, true, 1));
        linkedHashMap8.put("vmojiPromoCounterColor", new nxn0.a(0, "vmojiPromoCounterColor", "TEXT", null, false, 1));
        linkedHashMap8.put("vmojiPromoDotColor", new nxn0.a(0, "vmojiPromoDotColor", "TEXT", null, false, 1));
        nxn0 nxn0Var8 = new nxn0("stickers_promo", linkedHashMap8, b690.a(linkedHashMap8, "vmojiPromoOpenParams", new nxn0.a(0, "vmojiPromoOpenParams", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a8 = nxn0.b.a(hyg0Var, "stickers_promo");
        if (!nxn0Var8.equals(a8)) {
            return new l.a(false, t3j0.a("stickers_promo(com.vk.repository.internal.repos.stickers.database.entity.StickersPromoEntity).\n Expected:\n", nxn0Var8, "\n Found:\n", a8));
        }
        LinkedHashMap linkedHashMap9 = new LinkedHashMap();
        linkedHashMap9.put("ownerId", new nxn0.a(2, "ownerId", "INTEGER", null, true, 1));
        linkedHashMap9.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap9.put("stickers", new nxn0.a(0, "stickers", "TEXT", null, true, 1));
        linkedHashMap9.put("hash", new nxn0.a(0, "hash", "TEXT", null, true, 1));
        nxn0 nxn0Var9 = new nxn0("ugc_packs", linkedHashMap9, b690.a(linkedHashMap9, "editParams", new nxn0.a(0, "editParams", "TEXT", null, false, 1)), new LinkedHashSet());
        nxn0 a9 = nxn0.b.a(hyg0Var, "ugc_packs");
        if (!nxn0Var9.equals(a9)) {
            return new l.a(false, t3j0.a("ugc_packs(com.vk.repository.internal.repos.stickers.database.entity.UGCPackEntity).\n Expected:\n", nxn0Var9, "\n Found:\n", a9));
        }
        LinkedHashMap linkedHashMap10 = new LinkedHashMap();
        linkedHashMap10.put("chat_id", new nxn0.a(1, "chat_id", "INTEGER", null, true, 1));
        linkedHashMap10.put("isHiddenInKb", new nxn0.a(0, "isHiddenInKb", "INTEGER", null, true, 1));
        linkedHashMap10.put("isHiddenEverywhere", new nxn0.a(0, "isHiddenEverywhere", "INTEGER", null, true, 1));
        linkedHashMap10.put("needToShowOnboarding", new nxn0.a(0, "needToShowOnboarding", "INTEGER", null, true, 1));
        linkedHashMap10.put("isEditBanned", new nxn0.a(0, "isEditBanned", "INTEGER", null, true, 1));
        linkedHashMap10.put("canEdit", new nxn0.a(0, "canEdit", "INTEGER", null, true, 1));
        nxn0 nxn0Var10 = new nxn0("ugc_chat_settings", linkedHashMap10, b690.a(linkedHashMap10, "canHide", new nxn0.a(0, "canHide", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a10 = nxn0.b.a(hyg0Var, "ugc_chat_settings");
        if (!nxn0Var10.equals(a10)) {
            return new l.a(false, t3j0.a("ugc_chat_settings(com.vk.repository.internal.repos.stickers.database.entity.UGCChatSettingsEntity).\n Expected:\n", nxn0Var10, "\n Found:\n", a10));
        }
        LinkedHashMap linkedHashMap11 = new LinkedHashMap();
        linkedHashMap11.put("vmoji_promo_dictionary", new nxn0.a(1, "vmoji_promo_dictionary", "TEXT", null, true, 1));
        nxn0 nxn0Var11 = new nxn0("vmoji_promo_in_suggests", linkedHashMap11, b690.a(linkedHashMap11, "vmoji_promo_stickers", new nxn0.a(2, "vmoji_promo_stickers", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a11 = nxn0.b.a(hyg0Var, "vmoji_promo_in_suggests");
        if (!nxn0Var11.equals(a11)) {
            return new l.a(false, t3j0.a("vmoji_promo_in_suggests(com.vk.repository.internal.repos.stickers.database.entity.VmojiPromoInSuggestsEntity).\n Expected:\n", nxn0Var11, "\n Found:\n", a11));
        }
        LinkedHashMap linkedHashMap12 = new LinkedHashMap();
        linkedHashMap12.put("peerId", new nxn0.a(1, "peerId", "INTEGER", null, true, 1));
        linkedHashMap12.put("animation_autoplay", new nxn0.a(0, "animation_autoplay", "INTEGER", null, true, 1));
        nxn0 nxn0Var12 = new nxn0("popup_stickers_chat_settings", linkedHashMap12, b690.a(linkedHashMap12, "countOfInterruptClicks", new nxn0.a(0, "countOfInterruptClicks", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a12 = nxn0.b.a(hyg0Var, "popup_stickers_chat_settings");
        if (!nxn0Var12.equals(a12)) {
            return new l.a(false, t3j0.a("popup_stickers_chat_settings(com.vk.repository.internal.repos.stickers.database.entity.PopupStickersChatSettingsEntity).\n Expected:\n", nxn0Var12, "\n Found:\n", a12));
        }
        LinkedHashMap linkedHashMap13 = new LinkedHashMap();
        linkedHashMap13.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap13.put("packIdsInKeyboard", new nxn0.a(0, "packIdsInKeyboard", "TEXT", null, true, 1));
        nxn0 nxn0Var13 = new nxn0("stickers_recommendations", linkedHashMap13, b690.a(linkedHashMap13, "packs", new nxn0.a(0, "packs", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a13 = nxn0.b.a(hyg0Var, "stickers_recommendations");
        if (!nxn0Var13.equals(a13)) {
            return new l.a(false, t3j0.a("stickers_recommendations(com.vk.repository.internal.repos.stickers.database.entity.StickersRecommendationsEntity).\n Expected:\n", nxn0Var13, "\n Found:\n", a13));
        }
        LinkedHashMap linkedHashMap14 = new LinkedHashMap();
        linkedHashMap14.put("id", new nxn0.a(1, "id", "INTEGER", null, true, 1));
        linkedHashMap14.put("sticker", new nxn0.a(0, "sticker", "TEXT", null, true, 1));
        nxn0 nxn0Var14 = new nxn0("promoted_stickers", linkedHashMap14, b690.a(linkedHashMap14, "lastUsedTime", new nxn0.a(0, "lastUsedTime", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a14 = nxn0.b.a(hyg0Var, "promoted_stickers");
        return !nxn0Var14.equals(a14) ? new l.a(false, t3j0.a("promoted_stickers(com.vk.repository.internal.repos.stickers.database.entity.PromotedStickerEntity).\n Expected:\n", nxn0Var14, "\n Found:\n", a14)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
