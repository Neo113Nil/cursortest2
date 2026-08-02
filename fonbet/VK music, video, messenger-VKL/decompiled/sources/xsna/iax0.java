package xsna;

import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.data.NewsfeedSearchList;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: WallSearchDataSource.kt */
/* loaded from: classes4.dex */
public final class iax0 extends rsg0<NewsfeedSearchList<NewsEntry>> {
    public static final String v = j5g.g0(e43.l("photo_base", "sex", "video_files", "verified", "trending", "is_verified", "is_member", "friend_status", "emoji_status", "image_status", "can_write_private_message", "can_message", "has_unseen_stories", "is_government_organization", "first_name_gen", "last_name_gen"), StringUtils.COMMA, null, null, 0, null, 62);
    public String s;
    public int t;
    public int u;

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONArray optJSONArray;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        String valueOf = ((optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray("items")) == null) ? 0 : optJSONArray.length()) > 0 ? String.valueOf(this.t + this.u) : null;
        String str = this.s;
        JSONArray optJSONArray2 = optJSONObject != null ? optJSONObject.optJSONArray("suggested_queries") : null;
        NewsfeedSearchList newsfeedSearchList = new NewsfeedSearchList(valueOf, str, (optJSONArray2 == null || optJSONArray2.length() <= 0) ? null : optJSONArray2.optString(0));
        com.vk.dto.newsfeed.a.b(optJSONObject, "post", newsfeedSearchList, null, 8);
        return newsfeedSearchList;
    }
}
