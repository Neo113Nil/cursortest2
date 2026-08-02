package xsna;

import com.vk.dto.stickers.StickerSuggestion;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: StickersGetStickerSuggestions.kt */
/* loaded from: classes15.dex */
public final class hal0 extends rsg0<List<? extends StickerSuggestion>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        ArrayList arrayList = null;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("suggestions") : null;
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new StickerSuggestion(optJSONObject2.optString("word"), optJSONObject2.optBoolean("is_primary"), optJSONObject2.optBoolean("is_user"), false, 8, null));
                }
            }
        }
        return arrayList;
    }
}
