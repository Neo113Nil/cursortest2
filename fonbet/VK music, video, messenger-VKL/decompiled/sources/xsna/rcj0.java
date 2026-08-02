package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: SharingV2View.kt */
/* loaded from: classes5.dex */
public final class rcj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ com.vk.sharing.core.view.f b;

    public rcj0(com.vk.sharing.core.view.f fVar) {
        this.b = fVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        com.vk.sharing.core.view.f fVar = this.b;
        fVar.G0 = true;
        fVar.t1(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        com.vk.sharing.core.view.f fVar = this.b;
        fVar.G0 = true;
        fVar.t1(null);
    }
}
