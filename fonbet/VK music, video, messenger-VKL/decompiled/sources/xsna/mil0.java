package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.stickers.StickerPackRecommendationBlock;
import com.vk.dto.stickers.StickerStockItem;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StoreGetStickersPackRecommendationBlock.kt */
/* loaded from: classes15.dex */
public final class mil0 extends rsg0<StickerPackRecommendationBlock> {
    public mil0(String str) {
        super("store.getStickerPacksRecommendationBlock");
        K("block_id", str);
    }

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
        Serializer.c<StickerPackRecommendationBlock> cVar2 = StickerPackRecommendationBlock.CREATOR;
        return StickerPackRecommendationBlock.a.a(arrayList, jSONObject2.getJSONObject("block"));
    }
}
