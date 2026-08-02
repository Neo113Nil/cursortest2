package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class znm implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ znm(long j, ArrayList arrayList, hpm hpmVar) {
        this.d = arrayList;
        this.c = j;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NewsEntriesContainer.NewsPageCacheConfig newsPageCacheConfig;
        int i = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                e0w e0wVar = (e0w) obj;
                Iterator it = ((ArrayList) obj2).iterator();
                while (it.hasNext()) {
                    hpm.d0(e0wVar, this.c, ((Number) it.next()).intValue());
                }
                return s3q0.a;
            default:
                dk60 dk60Var = (dk60) obj2;
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                if (optJSONObject == null) {
                    throw new NullPointerException("response is null");
                }
                String a = cqm0.a(optJSONObject.optString("next_from"));
                String optString = optJSONObject.optString("news_custom_title");
                String optString2 = optJSONObject.optString("referer", dk60Var.c);
                String str = dk60Var.b;
                String str2 = dk60Var.a;
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

    public /* synthetic */ znm(dk60 dk60Var, long j) {
        this.d = dk60Var;
        this.c = j;
    }
}
