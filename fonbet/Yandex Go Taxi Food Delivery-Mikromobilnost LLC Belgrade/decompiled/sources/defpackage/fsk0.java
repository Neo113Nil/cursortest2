package defpackage;

/* loaded from: classes.dex */
public abstract class fsk0 {
    public static final qwd a = new qwd(new eqj0(11));
    public static final isk0 b;
    public static final isk0 c;

    static {
        long j = ldc.m;
        b = new isk0(true, null, j);
        c = new isk0(false, null, j);
    }

    public static isk0 a(int i, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        long j = ldc.m;
        return (y7m.b(Float.NaN, Float.NaN) && ldc.c(j, j)) ? z ? b : c : new isk0(z, null, j);
    }
}
