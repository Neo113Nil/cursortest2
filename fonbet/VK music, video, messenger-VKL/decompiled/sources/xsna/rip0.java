package xsna;

import android.net.TrafficStats;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.Interceptor;

/* compiled from: TrafficStatsTaggerInterceptor.kt */
/* loaded from: classes.dex */
public final class rip0 implements Interceptor, uz80 {
    public final AtomicInteger a = new AtomicInteger(0);

    @Override // xsna.uz80
    public final String getTag() {
        return "TrafficStats";
    }

    @Override // okhttp3.Interceptor
    public final okhttp3.u intercept(Interceptor.a aVar) {
        TrafficStats.setThreadStatsTag(this.a.getAndIncrement());
        return aVar.a(aVar.request());
    }
}
