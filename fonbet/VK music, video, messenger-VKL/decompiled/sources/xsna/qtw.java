package xsna;

import android.view.animation.Animation;
import com.unity3d.services.UnityAdsConstants;
import xsna.xn6;

/* compiled from: IndeterminateSpinnerDrawable.kt */
/* loaded from: classes.dex */
public final class qtw implements Animation.AnimationListener {
    public final /* synthetic */ stw b;

    public qtw(stw stwVar) {
        this.b = stwVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        stw stwVar = this.b;
        xn6.a aVar = stwVar.b;
        aVar.e = aVar.a;
        float f = aVar.b;
        aVar.f = f;
        aVar.g = aVar.c;
        aVar.a = f;
        stwVar.f = (stwVar.f + 1) % 5.0f;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.b.f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }
}
