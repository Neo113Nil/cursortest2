package defpackage;

import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.toolbox.HttpResponse;
import com.monetization.ads.utils.logger.collectors.MobileAdsLogsCollector;
import com.yandex.mobile.ads.network.interceptor.NetworkInterceptor;
import com.yandex.mobile.ads.network.interceptor.a;
import com.yandex.mobile.ads.network.interceptor.b;
import java.util.HashMap;
import java.util.Map;
import ru.yandex.video.m3.ott.data.net.impl.ExtFunctionsKt;
import yads.ys1;

/* loaded from: classes7.dex */
public final class eu71 extends c681 {
    public final o291 a;
    public final g671 b;

    public eu71(o291 o291Var) {
        g671 g671Var = new g671();
        this.a = o291Var;
        this.b = g671Var;
    }

    public final HttpResponse a(Request request, Map map) {
        HttpResponse httpResponse;
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        this.b.a.getClass();
        hashMap.put(ExtFunctionsKt.HEADER_USER_AGENT, ou71.a());
        o291 o291Var = this.a;
        o291Var.getClass();
        if (!MobileAdsLogsCollector.INSTANCE.getLogsCollectingEnabled()) {
            return o291Var.a(request, hashMap);
        }
        b bVar = gga1.b;
        ys1 ys1Var = new ys1(o291Var, hashMap);
        if (bVar != null) {
            uk71 uk71Var = new uk71(request, ys1Var);
            NetworkInterceptor networkInterceptor = bVar.a;
            NetworkInterceptor.Companion.getClass();
            a aVar = new a(uk71Var);
            ((fp20) networkInterceptor).getClass();
            httpResponse = aVar.proceed(aVar.getRequest());
        } else {
            httpResponse = null;
        }
        return httpResponse == null ? (HttpResponse) ys1Var.invoke(request) : httpResponse;
    }
}
