package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.Owner;
import com.vk.newsfeed.api.data.NewsComment;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NewsCommentResponseAdapter.kt */
/* loaded from: classes4.dex */
public final class v960 implements ecg {
    public final u960 a;

    public v960(u960 u960Var) {
        this.a = u960Var;
    }

    @Override // xsna.ecg
    public final NewsComment a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        JSONObject optJSONObject2 = (optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("items")) == null) ? null : optJSONArray.optJSONObject(0);
        if (optJSONObject2 == null) {
            com.vk.metrics.eventtracking.b.a.a(new IllegalStateException("EditCommentApiRequest: comment item is missing in response"));
        } else {
            optJSONObject2.put("post_type", "reply");
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONObject jSONObject3 = jSONObject2.getJSONArray("items").getJSONObject(0);
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("profiles");
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("groups");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject4 = optJSONArray2.getJSONObject(i);
                Serializer.c<Owner> cVar = Owner.CREATOR;
                Owner f = Owner.a.f(jSONObject4);
                linkedHashMap.put(f.b, f);
            }
        }
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Serializer.c<Owner> cVar2 = Owner.CREATOR;
                Owner d = Owner.a.d(optJSONArray3.getJSONObject(i2));
                linkedHashMap.put(d.b, d);
            }
        }
        return new NewsComment(jSONObject3, new bcg(null, linkedHashMap, jgp.b, null, this.a.a));
    }
}
