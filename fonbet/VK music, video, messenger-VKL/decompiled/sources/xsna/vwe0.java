package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: Rate.java */
/* loaded from: classes13.dex */
public final class vwe0 {
    public final long a;
    public final long b;
    public final TimeUnit c;

    /* compiled from: Rate.java */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public vwe0(long j, long j2, TimeUnit timeUnit) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
    }
}
