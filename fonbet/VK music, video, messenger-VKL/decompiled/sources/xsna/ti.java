package xsna;

import android.content.Context;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AccelerometerController.kt */
/* loaded from: classes3.dex */
public final class ti {
    public final Context a;
    public final ow4 b;
    public boolean c;
    public PointF d = new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final bpn0 e = new bpn0(new s5(this, 1));
    public final bpn0 f = new bpn0(new t5(this, 1));

    public ti(Context context, ow4 ow4Var) {
        this.a = context;
        this.b = ow4Var;
    }

    public static final float a(ti tiVar, float f, float f2, float f3) {
        if (f * f2 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f3 *= (float) Math.sqrt(1.0f - Math.abs(f));
        }
        return Math.max(-1.0f, Math.min(1.0f, (f2 * f3) + f));
    }
}
