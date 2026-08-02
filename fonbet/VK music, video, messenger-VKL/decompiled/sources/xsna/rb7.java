package xsna;

/* compiled from: BitmapCounterProvider.kt */
/* loaded from: classes12.dex */
public final class rb7 {
    public static final int a;
    public static final int b;
    public static volatile qb7 c;

    static {
        new rb7();
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        a = ((long) min) > 16777216 ? (min / 4) * 3 : min / 2;
        b = 384;
    }

    public static final qb7 a() {
        if (c == null) {
            synchronized (rb7.class) {
                try {
                    if (c == null) {
                        c = new qb7(b, a);
                    }
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }
}
