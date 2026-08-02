package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StoreGetStickerStockItemById.kt */
/* loaded from: classes15.dex */
public final class kil0 extends rsg0<StickerStockItem> {
    public kil0(int i, String str) {
        super("store.getStockItems");
        K("type", "stickers");
        BuildInfo.Client client = BuildInfo.a;
        K("merchant", BuildInfo.v());
        C(i, "product_ids");
        C(0, "force_inapp");
        C(!vx2.d.o() ? 1 : 0, "no_inapp");
        G("fields", e43.l("wishlists_status", "stickers_author_subscription"));
        if (str != null) {
            K("vmoji_character_id", str);
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        nkv m = j03.m("response", jSONObject);
        Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
        StickerStockItem a = StickerStockItem.a.a(((JSONArray) m.c).getJSONObject(0));
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(a);
        wge0.a(arrayList);
        return a;
    }
}
