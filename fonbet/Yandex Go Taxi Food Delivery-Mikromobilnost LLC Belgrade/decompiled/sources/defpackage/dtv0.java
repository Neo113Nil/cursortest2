package defpackage;

/* loaded from: classes7.dex */
public final class dtv0 {
    public static double a(double d) {
        double d2 = d % 360.0d;
        if (d2 > 180.0d) {
            d2 -= 360.0d;
        }
        return d2 <= -180.0d ? d2 + 360.0d : d2;
    }
}
