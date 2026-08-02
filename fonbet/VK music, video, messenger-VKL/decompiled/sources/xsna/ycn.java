package xsna;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.jwj0;

/* compiled from: Dispatchers.kt */
/* loaded from: classes11.dex */
public final class ycn implements pcn {
    @Override // xsna.pcn
    public final hgn a(long j, TimeUnit timeUnit, jwj0.a.C3151a c3151a) {
        return new xcn(((ScheduledThreadPoolExecutor) adn.a.getValue()).schedule(new wk(c3151a, 9), j, timeUnit));
    }

    @Override // xsna.pcn
    public final void b(gzs<s3q0> gzsVar) {
        ((ThreadPoolExecutor) adn.b.getValue()).execute(new wcn(gzsVar));
    }
}
