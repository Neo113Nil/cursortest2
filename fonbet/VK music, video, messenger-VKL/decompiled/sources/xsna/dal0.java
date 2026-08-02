package xsna;

import com.vk.dto.stickers.StickerItem;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StickersGetFavoriteStickers.kt */
/* loaded from: classes15.dex */
public final class dal0 extends rsg0<List<? extends StickerItem>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONObject("response").optJSONArray("items");
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray.length());
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                StickerItem stickerItem = StickerItem.l;
                arrayList.add(StickerItem.a.a(optJSONObject));
            }
        }
        return arrayList;
    }
}
