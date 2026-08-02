package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.clips.ClipItemFilterType;
import com.vk.dto.clips.filters.FilterInfo;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipDraftJsonMigration3to4.kt */
/* loaded from: classes14.dex */
public final class mrc extends be {
    @Override // xsna.be
    public final JSONObject S(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("files");
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                String optString = jSONObject2.optString("filter", "");
                jSONObject2.remove("filter");
                if (!epx.f(optString, "")) {
                    ClipItemFilterType.Companion.getClass();
                    jSONObject2.put("filter_info", new FilterInfo(ClipItemFilterType.a.a(optString), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 14, null).e5());
                }
            }
        }
        return jSONObject;
    }
}
