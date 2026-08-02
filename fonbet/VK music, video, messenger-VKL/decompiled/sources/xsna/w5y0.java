package xsna;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import xsna.jwj0;

/* loaded from: classes11.dex */
public final class w5y0 implements pcn {
    public final ScheduledThreadPoolExecutor a = new ScheduledThreadPoolExecutor(1);

    @Override // xsna.pcn
    public final hgn a(long j, TimeUnit timeUnit, jwj0.a.C3151a c3151a) {
        return new u5y0(this.a.schedule(new yv6(c3151a, 8), j, timeUnit));
    }

    @Override // xsna.pcn
    public final void b(gzs<s3q0> gzsVar) {
        this.a.submit(new l6i(gzsVar));
    }
}
