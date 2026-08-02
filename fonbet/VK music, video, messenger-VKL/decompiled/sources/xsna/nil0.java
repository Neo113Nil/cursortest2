package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StoreGetStickersPackRecommendationBlocks.kt */
/* loaded from: classes15.dex */
public final class nil0 extends rsg0<List<? extends StickerPackRecommendationBlock>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray optJSONArray = jSONObject2.optJSONArray("packs");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    Serializer.c<StickerStockItem> cVar = StickerStockItem.CREATOR;
                    arrayList.add(StickerStockItem.a.a(optJSONObject));
                }
            }
        } else {
            arrayList = null;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("blocks");
        if (optJSONArray2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
        int length2 = optJSONArray2.length();
        for (int i2 = 0; i2 < length2; i2++) {
            JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
            if (optJSONObject2 != null) {
                Serializer.c<StickerPackRecommendationBlock> cVar2 = StickerPackRecommendationBlock.CREATOR;
                arrayList2.add(StickerPackRecommendationBlock.a.a(arrayList, optJSONObject2));
            }
        }
        return arrayList2;
    }
}
