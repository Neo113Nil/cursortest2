package xsna;

import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: AddMusicTrackDrawDelegate.kt */
/* loaded from: classes18.dex */
public final class hm0 extends jfp0 implements xoo {
    public static final int A = dn70.b(4);

    @Override // xsna.xoo
    public final RectF a(RectF rectF) {
        float measureText = this.n.measureText(this.p) + rectF.left;
        float f = hip0.a;
        float f2 = (hip0.a * 2) + measureText + hip0.b + jfp0.t + A;
        ywo0 ywo0Var = this.b;
        return new RectF(Float.max(ywo0Var.d(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), rectF.top, Float.max(ywo0Var.t, f2), rectF.bottom);
    }
}
