package xsna;

import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: InteractiveContainerController.kt */
/* loaded from: classes3.dex */
public final class bbx {
    public final ViewGroup a;

    public bbx(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final void a(boolean z, boolean z2) {
        ViewGroup viewGroup = this.a;
        if ((!z || viewGroup.getAlpha() > 0.5f) && (z || viewGroup.getAlpha() < 1.0f)) {
            return;
        }
        float f = z ? 1.0f : 0.5f;
        if (z2) {
            cdi.u(viewGroup, 2, f);
        } else {
            d3m.b(viewGroup, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
        }
    }
}
