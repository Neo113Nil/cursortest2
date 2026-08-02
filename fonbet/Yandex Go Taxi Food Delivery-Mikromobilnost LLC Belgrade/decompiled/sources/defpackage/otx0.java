package defpackage;

import java.util.concurrent.TimeUnit;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
public abstract class otx0 {
    public static final String a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final c250 f;

    static {
        String str;
        int i = t3x0.a;
        try {
            str = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str == null) {
            str = "DefaultDispatcher";
        }
        a = str;
        b = bvf0.X(100000L, 1L, "kotlinx.coroutines.scheduler.resolution.ns", ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
        int i2 = t3x0.a;
        if (i2 < 2) {
            i2 = 2;
        }
        c = bvf0.Y(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = bvf0.Y(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(bvf0.X(60L, 1L, "kotlinx.coroutines.scheduler.keep.alive.sec", ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED));
        f = c250.a;
    }
}
