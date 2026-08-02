package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StoreGetStockItems.kt */
/* loaded from: classes15.dex */
public final class sil0 extends rsg0<List<? extends StickerStockItem>> {
    public sil0(List<Integer> list, String str) {
        super("store.getStockItems");
        K("type", "stickers");
        K("product_ids", j5g.g0(list, StringUtils.COMMA, null, null, 0, null, 62));
        BuildInfo.Client client = BuildInfo.a;
        K("merchant", BuildInfo.v());
        C(0, "force_inapp");
        if (str != null) {
            K("fields", str);
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        try {
            JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
            if (jSONArray == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
                    arrayList.add(StickerStockItem.a.a(optJSONObject));
                }
            }
            return arrayList;
        } catch (Exception e) {
            com.vk.metrics.eventtracking.b.a.a(e);
            return EmptyList.b;
        }
    }

    @Override // xsna.xz2
    public final void n() {
        C(0, "no_inapp");
    }
}
