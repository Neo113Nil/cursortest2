package xsna;

import android.view.animation.Animation;
import com.unity3d.services.UnityAdsConstants;
import xsna.om10;

/* compiled from: MaterialProgressDrawable.java */
/* loaded from: classes17.dex */
public final class nm10 implements Animation.AnimationListener {
    public final /* synthetic */ om10.b b;
    public final /* synthetic */ om10 c;

    public nm10(om10 om10Var, om10.b bVar) {
        this.c = om10Var;
        this.b = bVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        om10.b bVar = this.b;
        bVar.l = bVar.e;
        bVar.m = bVar.f;
        bVar.n = bVar.g;
        bVar.b((bVar.k + 1) % bVar.j.length);
        bVar.e = bVar.f;
        bVar.a();
        om10 om10Var = this.c;
        if (!om10Var.k) {
            om10Var.h = (om10Var.h + 1.0f) % 5.0f;
            return;
        }
        om10Var.k = false;
        animation.setDuration(1332L);
        if (bVar.o) {
            bVar.o = false;
            bVar.a();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.c.h = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
    }
}
