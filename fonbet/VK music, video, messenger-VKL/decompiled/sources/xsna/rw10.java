package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashSet;

/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes12.dex */
public final class rw10 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ androidx.mediarouter.app.b b;

    public rw10(androidx.mediarouter.app.b bVar) {
        this.b = bVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        androidx.mediarouter.app.b bVar = this.b;
        bVar.G.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        HashSet hashSet = bVar.J;
        if (hashSet == null || hashSet.size() == 0) {
            bVar.r(true);
            return;
        }
        sw10 sw10Var = new sw10(bVar);
        int firstVisiblePosition = bVar.G.getFirstVisiblePosition();
        boolean z = false;
        for (int i = 0; i < bVar.G.getChildCount(); i++) {
            View childAt = bVar.G.getChildAt(i);
            if (bVar.J.contains(bVar.H.getItem(firstVisiblePosition + i))) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                alphaAnimation.setDuration(bVar.k0);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                if (!z) {
                    alphaAnimation.setAnimationListener(sw10Var);
                    z = true;
                }
                childAt.clearAnimation();
                childAt.startAnimation(alphaAnimation);
            }
        }
    }
}
