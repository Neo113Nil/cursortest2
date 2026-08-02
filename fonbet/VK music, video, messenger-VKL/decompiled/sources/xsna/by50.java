package xsna;

import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: NavigationDelegateLeftMenu.java */
/* loaded from: classes7.dex */
public final class by50 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ yx50 b;

    public by50(yx50 yx50Var) {
        this.b = yx50Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        yx50 yx50Var = this.b;
        yx50Var.u.getViewTreeObserver().removeOnPreDrawListener(this);
        yx50Var.u.setExpansion(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        return true;
    }
}
