package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: ClipsConfig.kt */
/* loaded from: classes14.dex */
public final class ynd {
    public static final long a = TimeUnit.HOURS.toMillis(1);
    public static final int b;
    public static final int c;
    public static final int d;
    public static final int e;
    public static final int f;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int millis = (int) timeUnit.toMillis(1L);
        b = millis;
        c = millis * 3;
        d = (int) timeUnit.toMillis(1L);
        e = (int) TimeUnit.SECONDS.toMillis(3L);
        f = (int) timeUnit.toMillis(3L);
    }

    public static int a() {
        Integer b2 = g620.f().b();
        return b2 != null ? b2.intValue() * 1000 : c;
    }
}
