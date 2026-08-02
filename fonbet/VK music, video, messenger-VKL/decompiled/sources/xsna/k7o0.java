package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: Tasks.kt */
/* loaded from: classes11.dex */
public final class k7o0 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final du50 f;

    static {
        String str;
        int i = crn0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = m9u0.b(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int i2 = crn0.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = m9u0.c(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = m9u0.c(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(m9u0.b(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = du50.a;
    }
}
