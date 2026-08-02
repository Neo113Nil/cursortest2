package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.activities.Comment;
import com.vk.dto.reactions.ReactionSet;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ActivityParsers.kt */
/* loaded from: classes18.dex */
public final class oa0 {
    public static Comment a(JSONObject jSONObject, ReactionSet reactionSet, Map map) {
        ArrayList arrayList;
        int i = jSONObject.getInt("id");
        UserId userId = new UserId(jSONObject.getLong("from_id"));
        UserId userId2 = jSONObject.has("owner_id") ? new UserId(jSONObject.optLong("owner_id")) : UserId.d;
        long j = jSONObject.getLong("date");
        String string = jSONObject.getString("text");
        JSONObject optJSONObject = jSONObject.optJSONObject("likes");
        boolean z = optJSONObject != null && optJSONObject.optInt("user_likes") == 1;
        JSONObject optJSONObject2 = jSONObject.optJSONObject("likes");
        int optInt = optJSONObject2 != null ? optJSONObject2.optInt("count") : 0;
        JSONObject optJSONObject3 = jSONObject.optJSONObject("likes");
        boolean optBoolean = optJSONObject3 != null ? optJSONObject3.optBoolean("author_liked", false) : false;
        JSONObject optJSONObject4 = jSONObject.optJSONObject("likes");
        boolean optBoolean2 = optJSONObject4 != null ? optJSONObject4.optBoolean("group_liked", false) : false;
        JSONObject optJSONObject5 = jSONObject.optJSONObject("likes");
        boolean z2 = optJSONObject5 != null && optJSONObject5.optInt("can_like_as_author", 0) == 1;
        JSONArray optJSONArray = jSONObject.optJSONArray("attachments");
        if (optJSONArray != null) {
            arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject optJSONObject6 = optJSONArray.optJSONObject(i2);
                if (optJSONObject6 != null) {
                    arrayList.add(com.vkontakte.android.attachments.a.c(optJSONObject6, map, null));
                }
            }
        } else {
            arrayList = null;
        }
        String a = cqm0.a(jSONObject.optString("attachments_placeholder"));
        JSONArray optJSONArray2 = jSONObject.optJSONArray("parents_stack");
        int[] I = optJSONArray2 != null ? f370.I(optJSONArray2) : null;
        JSONObject optJSONObject7 = jSONObject.optJSONObject("donut");
        return new Comment(i, userId, userId2, 0, j, string, optInt, z, arrayList, a, I, optJSONObject7 != null ? vj90.b(optJSONObject7) : null, reactionSet, tci.p(jSONObject, reactionSet), z2, jSONObject.optBoolean("is_from_post_author", false), optBoolean, optBoolean2, jSONObject.optBoolean("is_pinned", false));
    }
}
