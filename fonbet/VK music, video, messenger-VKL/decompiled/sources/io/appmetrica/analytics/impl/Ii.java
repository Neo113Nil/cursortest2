package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import xsna.epx;

/* loaded from: classes8.dex */
public final class Ii implements InterfaceC5046nk {
    public static final Hi e = new Hi();
    public static final long f;
    public static final long g;
    public final C5078p0 a;
    public final C4916ik b;
    public final TimeProvider c;
    public final ICommonExecutor d;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f = timeUnit.toMillis(1L);
        g = timeUnit.toMillis(4L);
    }

    public Ii(C5078p0 c5078p0, C4916ik c4916ik, TimeProvider timeProvider) {
        this.a = c5078p0;
        this.b = c4916ik;
        this.c = timeProvider;
        this.d = C5030n4.l().g().b();
    }

    public final void a(Fh fh) {
        Callable zg;
        ICommonExecutor iCommonExecutor = this.d;
        if (fh.b) {
            C4916ik c4916ik = this.b;
            zg = new C5058o6(c4916ik.a, c4916ik.b, c4916ik.c, fh);
        } else {
            C4916ik c4916ik2 = this.b;
            zg = new Zg(c4916ik2.b, c4916ik2.c, fh);
        }
        iCommonExecutor.submit(zg);
    }

    public final void b(Fh fh) {
        long uptimeMillis = this.c.uptimeMillis();
        C4916ik c4916ik = this.b;
        C5058o6 c5058o6 = new C5058o6(c4916ik.a, c4916ik.b, c4916ik.c, fh);
        long j = epx.f(Looper.myLooper(), Looper.getMainLooper()) ? f : g;
        if (this.a.a()) {
            try {
                this.d.submit(c5058o6).get(j, TimeUnit.MILLISECONDS);
            } catch (Throwable unused) {
            }
        }
        if (c5058o6.c) {
            return;
        }
        try {
            c5058o6.a();
            Thread.sleep(Math.max(0L, j - (this.c.uptimeMillis() - uptimeMillis)));
        } catch (Throwable unused2) {
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5046nk
    public final void reportData(int i, Bundle bundle) {
        ICommonExecutor iCommonExecutor = this.d;
        C4916ik c4916ik = this.b;
        iCommonExecutor.submit(new Xn(c4916ik.b, c4916ik.c, i, bundle));
    }

    public Ii(C5078p0 c5078p0, C4916ik c4916ik) {
        this(c5078p0, c4916ik, new SystemTimeProvider());
    }

    public final void a(Lf lf) {
        ICommonExecutor iCommonExecutor = this.d;
        C4916ik c4916ik = this.b;
        iCommonExecutor.submit(new Ce(c4916ik.b, c4916ik.c, lf));
    }

    public final void b(Lf lf) {
        ICommonExecutor iCommonExecutor = this.d;
        C4916ik c4916ik = this.b;
        iCommonExecutor.submit(new Oi(c4916ik.b, c4916ik.c, lf));
    }
}
