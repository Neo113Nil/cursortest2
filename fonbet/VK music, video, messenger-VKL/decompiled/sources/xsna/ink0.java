package xsna;

import android.graphics.Path;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Squircles.kt */
/* loaded from: classes17.dex */
public final class ink0 {
    public static final mws a = new mws(10);

    public static final Path a(double d, int i) {
        double d2;
        double d3;
        double d4;
        Path path = new Path();
        if (i <= 0) {
            return path;
        }
        double d5 = i;
        double pow = Math.pow(d5, d);
        float f = i;
        path.moveTo(-f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        double d6 = -d5;
        double d7 = d6;
        boolean z = false;
        while (true) {
            double pow2 = pow - Math.pow(Math.abs(d7), d);
            d2 = d5;
            d3 = 1.0d / d;
            d4 = pow;
            double d8 = d7;
            path.lineTo((float) d8, (float) (Math.pow(Math.abs(pow2), d3) * Math.signum(pow2)));
            if (z) {
                break;
            }
            double e = swe0.e(d2 / 80, 0.2d, 1.0d) + d8;
            if (e >= d2) {
                pow = d4;
                d5 = d2;
                d7 = d5;
                z = true;
            } else {
                d7 = e;
                pow = d4;
                d5 = d2;
            }
        }
        double d9 = d2;
        boolean z2 = false;
        while (true) {
            double pow3 = d4 - Math.pow(Math.abs(d9), d);
            path.lineTo((float) d9, (float) (Math.pow(Math.abs(pow3), d3) * (-Math.signum(pow3))));
            if (z2) {
                path.close();
                path.offset(f, f);
                return path;
            }
            d9 -= swe0.e(d2 / 80, 0.2d, 1.0d);
            if (d9 <= (-i)) {
                d9 = d6;
                z2 = true;
            }
        }
    }
}
