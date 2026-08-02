package xsna;

/* compiled from: ExtendedMath.java */
/* loaded from: classes8.dex */
public final class vbq {
    public static final /* synthetic */ int a = 0;

    static {
        Math.toDegrees(3600.0d);
    }

    public static boolean a(double d) {
        return !Double.isNaN(d) && Math.round(Math.signum(d)) == 0;
    }
}
