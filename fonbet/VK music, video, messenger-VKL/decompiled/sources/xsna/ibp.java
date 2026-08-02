package xsna;

import android.content.Context;
import android.graphics.Color;
import androidx.annotation.NonNull;
import com.google.android.material.R$attr;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ElevationOverlayProvider.java */
/* loaded from: classes.dex */
public final class ibp {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ibp(@NonNull Context context) {
        boolean b = jl10.b(R$attr.elevationOverlayEnabled, context, false);
        int b2 = dm10.b(R$attr.elevationOverlayColor, 0, context);
        int b3 = dm10.b(R$attr.elevationOverlayAccentColor, 0, context);
        int b4 = dm10.b(R$attr.colorSurface, 0, context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = b;
        this.b = b2;
        this.c = b3;
        this.d = b4;
        this.e = f2;
    }

    public final int a(float f2, int i) {
        int i2;
        if (!this.a || n8g.l(i, 255) != this.d) {
            return i;
        }
        float min = (this.e <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int g = dm10.g(min, n8g.l(i, 255), this.b);
        if (min > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (i2 = this.c) != 0) {
            g = n8g.i(n8g.l(i2, f), g);
        }
        return n8g.l(g, alpha);
    }
}
