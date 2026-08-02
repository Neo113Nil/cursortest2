package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.NewsfeedSearchList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: NewsfeedSearchDataSource.kt */
/* loaded from: classes4.dex */
public final class zw60 extends rsg0<NewsfeedSearchList<NewsEntry>> {
    public static final String t = j5g.g0(e43.l("photo_base", "sex", "video_files", "verified", "trending", "is_verified", "is_member", "friend_status", "emoji_status", "image_status", "can_write_private_message", "can_message", "has_unseen_stories", "is_government_organization", "first_name_gen", "last_name_gen"), StringUtils.COMMA, null, null, 0, null, 62);
    public String s;

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        String optString = optJSONObject != null ? optJSONObject.optString("next_from", "") : null;
        String str = this.s;
        JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray("suggested_queries") : null;
        NewsfeedSearchList newsfeedSearchList = new NewsfeedSearchList(optString, str, (optJSONArray == null || optJSONArray.length() <= 0) ? null : optJSONArray.optString(0));
        com.vk.dto.newsfeed.a.b(optJSONObject, "post", newsfeedSearchList, null, 8);
        return newsfeedSearchList;
    }
}
