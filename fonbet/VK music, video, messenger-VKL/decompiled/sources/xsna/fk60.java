package xsna;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import org.json.JSONObject;

/* compiled from: NewsfeedGetDiscoverMedia.kt */
/* loaded from: classes4.dex */
public final class fk60 extends rsg0<NewsEntriesContainer> {
    public final String s;
    public final String t;
    public final String u;
    public final long v;
    public awq w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk60(String str, String str2, String str3, DiscoverCustomIntent discoverCustomIntent, Integer num) {
        super("newsfeed.getDiscoverMedia");
        UserId userId = UserId.d;
        this.s = str;
        this.t = str2;
        this.u = str3;
        xuo0.a.getClass();
        this.v = xuo0.a();
        this.w = new zvq();
        K("start_from", str);
        C(1, "extended");
        K("fields", "photo_base,sex,verified,trending,video_files,emoji_status,image_status,can_write_private_message,can_message,has_unseen_stories,is_government_organization,is_verified,social_button_type,first_name_gen,last_name_gen,first_name_acc,url,members_count,followers_count");
        if (fkq0.c(userId)) {
            F(userId, "recommended_owner_id");
        }
        if (num != null) {
            C(num.intValue(), "count");
        }
        K("connection_type", com.vk.core.utils.newtork.b.c().b());
        K("connection_subtype", com.vk.core.utils.newtork.b.c().a());
        K(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, discoverCustomIntent != null ? discoverCustomIntent.h() : null);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        NewsEntriesContainer.NewsPageCacheConfig newsPageCacheConfig;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        awq awqVar = this.w;
        NewsEntriesContainer newsEntriesContainer = null;
        if (optJSONObject != null) {
            awqVar.g();
            String a = cqm0.a(optJSONObject.optString("next_from"));
            String optString = optJSONObject.optString("news_custom_title");
            String optString2 = optJSONObject.optString("referer", this.u);
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache_config");
            if (optJSONObject2 != null) {
                Serializer.c<NewsEntriesContainer.NewsPageCacheConfig> cVar = NewsEntriesContainer.NewsPageCacheConfig.CREATOR;
                newsPageCacheConfig = NewsEntriesContainer.NewsPageCacheConfig.a.a(optJSONObject2);
            } else {
                newsPageCacheConfig = null;
            }
            NewsEntriesContainer newsEntriesContainer2 = new NewsEntriesContainer(new NewsEntriesContainer.Info(a, optString, this.t, optString2, 0L, false, 0L, 0L, this.v, 0L, this.s, newsPageCacheConfig, 752, null), null, 2, null);
            com.vk.dto.newsfeed.a.b(optJSONObject, null, newsEntriesContainer2.c, new qus(awqVar), 2);
            awqVar.c();
            newsEntriesContainer = newsEntriesContainer2;
        }
        if (newsEntriesContainer != null) {
            return newsEntriesContainer;
        }
        throw new NullPointerException("response is null");
    }
}
