package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NewChannelPostRequest.kt */
/* loaded from: classes4.dex */
public final class m660 extends i860 {
    @Override // xsna.i860, xsna.oer0, xsna.k7r0
    /* renamed from: F0 */
    public final NewsEntry a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("response");
        LinkedHashMap linkedHashMap = this.s;
        vj90.d(optJSONObject3, linkedHashMap);
        com.vk.dto.newsfeed.entries.a aVar = new com.vk.dto.newsfeed.entries.a();
        if (optJSONObject3 == null || (optJSONArray = optJSONObject3.optJSONArray("attachments")) == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null || (optJSONObject2 = optJSONObject.optJSONObject("wall")) == null) {
            return null;
        }
        return com.vk.dto.newsfeed.entries.a.b(aVar, "post", optJSONObject2, null, null, linkedHashMap, false, null, 108);
    }
}
