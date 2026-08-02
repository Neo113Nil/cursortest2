package defpackage;

/* loaded from: classes10.dex */
public abstract class gsk0 {
    public static final qwd a = new qwd(new apk0(3));
    public static final jsk0 b;
    public static final jsk0 c;
    public static final rrk0 d;
    public static final rrk0 e;
    public static final rrk0 f;

    static {
        long j = ldc.m;
        b = new jsk0(Float.NaN, j, true);
        c = new jsk0(Float.NaN, j, false);
        d = new rrk0(0.16f, 0.24f, 0.08f, 0.24f);
        e = new rrk0(0.08f, 0.12f, 0.04f, 0.12f);
        f = new rrk0(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static jsk0 a(float f2, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f2 = Float.NaN;
        }
        long j = ldc.m;
        return (y7m.b(f2, Float.NaN) && ldc.c(j, j)) ? z ? b : c : new jsk0(f2, j, z);
    }
}
