package defpackage;

/* loaded from: classes.dex */
public abstract class esk0 {
    public static final qwd a = new qwd(new eqj0(10));
    public static final hsk0 b;
    public static final hsk0 c;

    static {
        long j = ldc.m;
        b = new hsk0(Float.NaN, j, true);
        c = new hsk0(Float.NaN, j, false);
    }

    public static hsk0 a(int i, float f, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = ldc.m;
        return (y7m.b(f, Float.NaN) && ldc.c(j, j)) ? z ? b : c : new hsk0(f, j, z);
    }
}
