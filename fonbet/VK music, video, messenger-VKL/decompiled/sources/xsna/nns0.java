package xsna;

import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.VideoFileOld;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VideoGetOwnerLives.kt */
/* loaded from: classes15.dex */
public final class nns0 extends rsg0<h7d> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(new VideoFileOld(jSONArray.getJSONObject(i)));
        }
        PaginationKey paginationKey = PaginationKey.LoadedFull.b;
        String optString = jSONObject2.optString("next_from");
        return new h7d(arrayList, paginationKey, (optString == null || optString.length() == 0 || optString.equals("null")) ? paginationKey : new PaginationKey.Next(optString), 0L, null, null);
    }
}
