package xsna;

import android.view.ViewTreeObserver;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: NavigationDelegateLeftMenu.java */
/* loaded from: classes7.dex */
public final class cy50 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ yx50 b;

    public cy50(yx50 yx50Var) {
        this.b = yx50Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        yx50 yx50Var = this.b;
        yx50Var.u.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        yx50Var.u.setExpansion(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
