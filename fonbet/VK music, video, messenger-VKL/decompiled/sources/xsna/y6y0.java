package xsna;

import android.animation.Animator;
import com.vk.photo.editor.views.zoom.ZoomRootLayout;

/* compiled from: Animator.kt */
/* loaded from: classes4.dex */
public final class y6y0 implements Animator.AnimatorListener {
    public final /* synthetic */ ZoomRootLayout b;

    public y6y0(ZoomRootLayout zoomRootLayout) {
        this.b = zoomRootLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bi80 bi80Var = this.b.k;
        if (bi80Var != null) {
            bi80Var.invoke();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
