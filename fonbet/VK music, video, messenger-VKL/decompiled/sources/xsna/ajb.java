package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.im.engine.internal.storage.delegates.channels.ChannelsDb;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ajb implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ajb(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NewsEntriesContainer.NewsPageCacheConfig newsPageCacheConfig;
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                ChannelsDb channelsDb = ((gkb) obj2).b;
                Long l = ((bdb) obj).u;
                StringBuilder sb = new StringBuilder("\n                UPDATE ");
                sb.append(channelsDb.a.a);
                sb.append(" \n                SET ");
                sr.c(ChannelsDb.Column.LAST_HISTORY_EXPIRED_TIME, sb, " = ? \n                WHERE ");
                channelsDb.b.b().execSQL(bo.d(ChannelsDb.Column.ID, sb, " = ?\n            "), new Long[]{l, Long.valueOf(this.c)});
                return s3q0.a;
            default:
                gk60 gk60Var = (gk60) obj2;
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                if (optJSONObject == null) {
                    throw new NullPointerException("response is null");
                }
                String a = cqm0.a(optJSONObject.optString("next_from"));
                String optString = optJSONObject.optString("news_custom_title");
                String optString2 = optJSONObject.optString("referer", gk60Var.c);
                String str = gk60Var.b;
                String str2 = gk60Var.a;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache_config");
                if (optJSONObject2 != null) {
                    Serializer.c<NewsEntriesContainer.NewsPageCacheConfig> cVar = NewsEntriesContainer.NewsPageCacheConfig.CREATOR;
                    newsPageCacheConfig = NewsEntriesContainer.NewsPageCacheConfig.a.a(optJSONObject2);
                } else {
                    newsPageCacheConfig = null;
                }
                NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(new NewsEntriesContainer.Info(a, optString, str, optString2, 0L, false, 0L, 0L, this.c, 0L, str2, newsPageCacheConfig, 752, null), null, 2, null);
                com.vk.dto.newsfeed.a.b(optJSONObject, null, newsEntriesContainer.c, null, 10);
                return newsEntriesContainer;
        }
    }
}
