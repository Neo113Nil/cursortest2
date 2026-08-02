package xsna;

import android.animation.Animator;
import xsna.qhv0;

/* compiled from: Animator.kt */
/* loaded from: classes17.dex */
public final class yvc implements Animator.AnimatorListener {
    public final /* synthetic */ zjt b;
    public final /* synthetic */ qhv0 c;
    public final /* synthetic */ zjt d;
    public final /* synthetic */ qhv0.l e;
    public final /* synthetic */ xvc f;

    public yvc(zjt zjtVar, qhv0 qhv0Var, zjt zjtVar2, qhv0.l lVar, xvc xvcVar) {
        this.b = zjtVar;
        this.c = qhv0Var;
        this.d = zjtVar2;
        this.e = lVar;
        this.f = xvcVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        qhv0 qhv0Var = this.c;
        zjt zjtVar = this.b;
        zjtVar.setVkScaleType(qhv0Var);
        zjtVar.setClipToOutline(false);
        zjtVar.setOutlineProvider(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        qhv0.l lVar = this.e;
        zjt zjtVar = this.d;
        zjtVar.setVkScaleType(lVar);
        zjtVar.setClipToOutline(true);
        zjtVar.setOutlineProvider(this.f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
