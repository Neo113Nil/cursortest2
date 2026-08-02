package xsna;

import com.vk.core.preference.Preference;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import com.vk.newsfeed.api.data.discover.NewsEntriesContainer;
import org.json.JSONObject;
import xsna.ky6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rfx implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ rfx(long j, String str) {
        this.b = 0;
        this.c = j;
        this.d = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NewsEntriesContainer.NewsPageCacheConfig newsPageCacheConfig;
        int i = this.b;
        long j = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                String str = (String) obj2;
                long j2 = ((UserId) obj).b;
                if (j <= j2 && j2 <= Long.MAX_VALUE) {
                    return String.valueOf(j2);
                }
                StringBuilder d = rqi.d(j, "Param ", str, " not in ");
                d.append("..9223372036854775807");
                throw new IllegalArgumentException(d.toString());
            case 1:
                bk60 bk60Var = (bk60) obj2;
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("response");
                if (optJSONObject == null) {
                    throw new NullPointerException("response is null");
                }
                String a = cqm0.a(optJSONObject.optString("next_from"));
                String optString = optJSONObject.optString("news_custom_title");
                String optString2 = optJSONObject.optString("referer", bk60Var.c);
                String str2 = bk60Var.b;
                String str3 = bk60Var.a;
                JSONObject optJSONObject2 = optJSONObject.optJSONObject("cache_config");
                if (optJSONObject2 != null) {
                    Serializer.c<NewsEntriesContainer.NewsPageCacheConfig> cVar = NewsEntriesContainer.NewsPageCacheConfig.CREATOR;
                    newsPageCacheConfig = NewsEntriesContainer.NewsPageCacheConfig.a.a(optJSONObject2);
                } else {
                    newsPageCacheConfig = null;
                }
                NewsEntriesContainer newsEntriesContainer = new NewsEntriesContainer(new NewsEntriesContainer.Info(a, optString, str2, optString2, 0L, false, 0L, 0L, this.c, 0L, str3, newsPageCacheConfig, 752, null), null, 2, null);
                com.vk.dto.newsfeed.a.b(optJSONObject, null, newsEntriesContainer.c, null, 10);
                return newsEntriesContainer;
            default:
                com.vk.media.ok.b bVar = (com.vk.media.ok.b) obj2;
                long longValue = ((Long) obj).longValue();
                if (bVar.O0 && longValue > 0) {
                    bVar.O0 = longValue <= j;
                    com.vk.media.ok.a aVar = bVar.h;
                    if (aVar != null) {
                        aVar.l();
                    }
                }
                z930 z930Var = bVar.J0;
                if (z930Var != null) {
                    z930Var.e = longValue;
                }
                if (z930Var != null) {
                    z930Var.b = bVar.O0;
                }
                bVar.U0 = longValue;
                ky6.a aVar2 = (ky6.a) Preference.j().edit();
                aVar2.putLong("key_gpu_test_time", longValue);
                aVar2.a();
                L.p("GPU test is " + longValue);
                return s3q0.a;
        }
    }

    public /* synthetic */ rfx(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }
}
