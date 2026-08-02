package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: CacheLoadParams.kt */
/* loaded from: classes8.dex */
public abstract class bx8 {

    /* compiled from: CacheLoadParams.kt */
    public static final class a extends bx8 {
        public final long a;
        public final long b;
        public final long c;

        public a(long j) {
            this.a = j;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.b = timeUnit.toMicros(0L);
            this.c = timeUnit.toMicros(j);
        }
    }
}
