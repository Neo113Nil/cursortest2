package xsna;

import android.content.Context;
import com.unity3d.services.UnityAdsConstants;
import xsna.izy0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class bmy0 extends rgz0 {
    @Override // xsna.rgz0
    public final void c(boolean z, float f, Context context) {
        izy0.a a;
        if (b920.b(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) == 1) {
            b6z0 b6z0Var = this.a;
            h8z0.g(b6z0Var, 1, null);
            gu8.c("ViewabilityTracker: ShowStatTracker", "ViewIn tracked, kill self");
            if (e5z0.n(b6z0Var.c) && (a = a()) != null) {
                a.a();
            }
            d();
        }
    }

    @Override // xsna.rgz0
    public final void b() {
    }

    @Override // xsna.rgz0
    public final void e() {
    }
}
