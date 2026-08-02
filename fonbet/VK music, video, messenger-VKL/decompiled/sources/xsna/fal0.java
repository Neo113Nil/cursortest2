package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickersRecommendationBlock;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StickersGetRecommendationBlock.kt */
/* loaded from: classes15.dex */
public final class fal0 extends rsg0<StickersRecommendationBlock> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray jSONArray = jSONObject2.getJSONArray("packs");
        if (jSONArray != null) {
            arrayList = new ArrayList(jSONArray.length());
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
                    arrayList.add(StickerStockItem.a.a(optJSONObject));
                }
            }
        } else {
            arrayList = null;
        }
        Serializer.c<StickersRecommendationBlock> cVar2 = StickersRecommendationBlock.CREATOR;
        return StickersRecommendationBlock.a.a(arrayList, jSONObject2.getJSONObject("block"));
    }
}
