package xsna;

import androidx.room.l;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.attachpicker.stat.data.PhotoParamsDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import xsna.nxn0;

/* compiled from: PhotoParamsDatabase_Impl.kt */
/* loaded from: classes15.dex */
public final class kaa0 extends androidx.room.l {
    public final /* synthetic */ PhotoParamsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kaa0(PhotoParamsDatabase_Impl photoParamsDatabase_Impl) {
        super(6, "f7d90379d20e29a8586fd6be919ceae9", "775251f379cac84b3875594e167873a2");
        this.d = photoParamsDatabase_Impl;
    }

    @Override // androidx.room.l
    public final void a(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `photo_params` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `media_key` TEXT NOT NULL, `create_entry_point` TEXT NOT NULL, `isCropped` INTEGER NOT NULL, `isRotated` INTEGER NOT NULL, `isZoomed` INTEGER NOT NULL, `hasGraffity` INTEGER NOT NULL, `hasSticker` INTEGER NOT NULL, `hasText` INTEGER NOT NULL, `zoomValue` INTEGER, `rotation` INTEGER, `isAutocorrected` INTEGER NOT NULL, `autocorrectionValue` INTEGER, `hasFilter` INTEGER NOT NULL, `filter` TEXT, `filterValue` INTEGER, `ratio` TEXT, `height` INTEGER NOT NULL, `width` INTEGER NOT NULL, `collageGrid` TEXT, `collageBorderWidth` INTEGER, `collageCornerRadius` INTEGER, `collageBorderColor` TEXT, `colorGradingParams` TEXT, `colorGradingValues` TEXT, `isUpgraded` INTEGER NOT NULL)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `sticker_params` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `photoId` INTEGER NOT NULL, `type` TEXT NOT NULL, `stickerId` INTEGER, `packId` INTEGER)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `text_params` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `photoId` INTEGER NOT NULL, `size` INTEGER NOT NULL, `align` TEXT NOT NULL, `text` TEXT NOT NULL, `font` TEXT NOT NULL, `textColor` INTEGER NOT NULL, `backgroundColor` INTEGER NOT NULL)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS `graffity_params` (`id` INTEGER PRIMARY KEY AUTOINCREMENT, `photoId` INTEGER NOT NULL, `size` INTEGER NOT NULL, `color` INTEGER NOT NULL, `brushType` TEXT NOT NULL)");
        p7i.e(hyg0Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        p7i.e(hyg0Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f7d90379d20e29a8586fd6be919ceae9')");
    }

    @Override // androidx.room.l
    public final void b(hyg0 hyg0Var) {
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `photo_params`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `sticker_params`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `text_params`");
        p7i.e(hyg0Var, "DROP TABLE IF EXISTS `graffity_params`");
    }

    @Override // androidx.room.l
    public final void d(hyg0 hyg0Var) {
        this.d.r(hyg0Var);
    }

    @Override // androidx.room.l
    public final void f(hyg0 hyg0Var) {
        urk.a(hyg0Var);
    }

    @Override // androidx.room.l
    public final l.a g(hyg0 hyg0Var) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new nxn0.a(1, "id", "INTEGER", null, false, 1));
        linkedHashMap.put("media_key", new nxn0.a(0, "media_key", "TEXT", null, true, 1));
        linkedHashMap.put("create_entry_point", new nxn0.a(0, "create_entry_point", "TEXT", null, true, 1));
        linkedHashMap.put("isCropped", new nxn0.a(0, "isCropped", "INTEGER", null, true, 1));
        linkedHashMap.put("isRotated", new nxn0.a(0, "isRotated", "INTEGER", null, true, 1));
        linkedHashMap.put("isZoomed", new nxn0.a(0, "isZoomed", "INTEGER", null, true, 1));
        linkedHashMap.put("hasGraffity", new nxn0.a(0, "hasGraffity", "INTEGER", null, true, 1));
        linkedHashMap.put("hasSticker", new nxn0.a(0, "hasSticker", "INTEGER", null, true, 1));
        linkedHashMap.put("hasText", new nxn0.a(0, "hasText", "INTEGER", null, true, 1));
        linkedHashMap.put("zoomValue", new nxn0.a(0, "zoomValue", "INTEGER", null, false, 1));
        linkedHashMap.put("rotation", new nxn0.a(0, "rotation", "INTEGER", null, false, 1));
        linkedHashMap.put("isAutocorrected", new nxn0.a(0, "isAutocorrected", "INTEGER", null, true, 1));
        linkedHashMap.put("autocorrectionValue", new nxn0.a(0, "autocorrectionValue", "INTEGER", null, false, 1));
        linkedHashMap.put("hasFilter", new nxn0.a(0, "hasFilter", "INTEGER", null, true, 1));
        linkedHashMap.put("filter", new nxn0.a(0, "filter", "TEXT", null, false, 1));
        linkedHashMap.put("filterValue", new nxn0.a(0, "filterValue", "INTEGER", null, false, 1));
        linkedHashMap.put("ratio", new nxn0.a(0, "ratio", "TEXT", null, false, 1));
        linkedHashMap.put("height", new nxn0.a(0, "height", "INTEGER", null, true, 1));
        linkedHashMap.put("width", new nxn0.a(0, "width", "INTEGER", null, true, 1));
        linkedHashMap.put("collageGrid", new nxn0.a(0, "collageGrid", "TEXT", null, false, 1));
        linkedHashMap.put("collageBorderWidth", new nxn0.a(0, "collageBorderWidth", "INTEGER", null, false, 1));
        linkedHashMap.put("collageCornerRadius", new nxn0.a(0, "collageCornerRadius", "INTEGER", null, false, 1));
        linkedHashMap.put("collageBorderColor", new nxn0.a(0, "collageBorderColor", "TEXT", null, false, 1));
        linkedHashMap.put("colorGradingParams", new nxn0.a(0, "colorGradingParams", "TEXT", null, false, 1));
        linkedHashMap.put("colorGradingValues", new nxn0.a(0, "colorGradingValues", "TEXT", null, false, 1));
        nxn0 nxn0Var = new nxn0("photo_params", linkedHashMap, b690.a(linkedHashMap, "isUpgraded", new nxn0.a(0, "isUpgraded", "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a = nxn0.b.a(hyg0Var, "photo_params");
        if (!nxn0Var.equals(a)) {
            return new l.a(false, t3j0.a("photo_params(com.vk.attachpicker.stat.data.PhotoParamsEntity).\n Expected:\n", nxn0Var, "\n Found:\n", a));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new nxn0.a(1, "id", "INTEGER", null, false, 1));
        linkedHashMap2.put("photoId", new nxn0.a(0, "photoId", "INTEGER", null, true, 1));
        linkedHashMap2.put("type", new nxn0.a(0, "type", "TEXT", null, true, 1));
        linkedHashMap2.put("stickerId", new nxn0.a(0, "stickerId", "INTEGER", null, false, 1));
        nxn0 nxn0Var2 = new nxn0("sticker_params", linkedHashMap2, b690.a(linkedHashMap2, "packId", new nxn0.a(0, "packId", "INTEGER", null, false, 1)), new LinkedHashSet());
        nxn0 a2 = nxn0.b.a(hyg0Var, "sticker_params");
        if (!nxn0Var2.equals(a2)) {
            return new l.a(false, t3j0.a("sticker_params(com.vk.attachpicker.stat.data.StickerParamsEntity).\n Expected:\n", nxn0Var2, "\n Found:\n", a2));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new nxn0.a(1, "id", "INTEGER", null, false, 1));
        linkedHashMap3.put("photoId", new nxn0.a(0, "photoId", "INTEGER", null, true, 1));
        linkedHashMap3.put("size", new nxn0.a(0, "size", "INTEGER", null, true, 1));
        linkedHashMap3.put("align", new nxn0.a(0, "align", "TEXT", null, true, 1));
        linkedHashMap3.put("text", new nxn0.a(0, "text", "TEXT", null, true, 1));
        linkedHashMap3.put("font", new nxn0.a(0, "font", "TEXT", null, true, 1));
        linkedHashMap3.put("textColor", new nxn0.a(0, "textColor", "INTEGER", null, true, 1));
        nxn0 nxn0Var3 = new nxn0("text_params", linkedHashMap3, b690.a(linkedHashMap3, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, new nxn0.a(0, TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "INTEGER", null, true, 1)), new LinkedHashSet());
        nxn0 a3 = nxn0.b.a(hyg0Var, "text_params");
        if (!nxn0Var3.equals(a3)) {
            return new l.a(false, t3j0.a("text_params(com.vk.attachpicker.stat.data.TextParamsEntity).\n Expected:\n", nxn0Var3, "\n Found:\n", a3));
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new nxn0.a(1, "id", "INTEGER", null, false, 1));
        linkedHashMap4.put("photoId", new nxn0.a(0, "photoId", "INTEGER", null, true, 1));
        linkedHashMap4.put("size", new nxn0.a(0, "size", "INTEGER", null, true, 1));
        linkedHashMap4.put("color", new nxn0.a(0, "color", "INTEGER", null, true, 1));
        nxn0 nxn0Var4 = new nxn0("graffity_params", linkedHashMap4, b690.a(linkedHashMap4, "brushType", new nxn0.a(0, "brushType", "TEXT", null, true, 1)), new LinkedHashSet());
        nxn0 a4 = nxn0.b.a(hyg0Var, "graffity_params");
        return !nxn0Var4.equals(a4) ? new l.a(false, t3j0.a("graffity_params(com.vk.attachpicker.stat.data.GraffityParamsEntity).\n Expected:\n", nxn0Var4, "\n Found:\n", a4)) : new l.a(true, null);
    }

    @Override // androidx.room.l
    public final void c() {
    }

    @Override // androidx.room.l
    public final void e() {
    }
}
