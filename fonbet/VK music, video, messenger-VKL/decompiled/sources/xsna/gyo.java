package xsna;

import android.os.Build;
import android.widget.EdgeEffect;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: EdgeEffectCompat.android.kt */
/* loaded from: classes11.dex */
public final class gyo {
    public static float a(EdgeEffect edgeEffect, float f, float f2, azl azlVar) {
        float f3 = hyo.a;
        double density = azlVar.getDensity() * 386.0878f * 160.0f * 0.84f;
        double d = hyo.a * density;
        float exp = (float) (Math.exp((hyo.b / hyo.c) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
        int i = Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? uw2.b(edgeEffect) : 0.0f) * f2) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        int b = an10.b(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(b);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(b);
        }
        return f;
    }
}
