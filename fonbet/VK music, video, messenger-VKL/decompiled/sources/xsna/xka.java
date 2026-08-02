package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.core.view.components.text.VkText;

/* compiled from: CategoryItemAnimator.kt */
/* loaded from: classes16.dex */
public final class xka extends AnimatorListenerAdapter {
    public final /* synthetic */ hla b;
    public final /* synthetic */ wka c;

    public xka(hla hlaVar, wka wkaVar) {
        this.b = hlaVar;
        this.c = wkaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        fla flaVar = this.b.p;
        VkText vkText = flaVar.b;
        vkText.setAlpha(1.0f);
        vkText.setScaleX(1.0f);
        vkText.setScaleY(1.0f);
        flaVar.c.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        hla hlaVar = this.b;
        hlaVar.p.e = null;
        animator.removeListener(null);
        wka wkaVar = this.c;
        wkaVar.h.c();
        wkaVar.h(hlaVar);
        wkaVar.t.remove(hlaVar);
        wkaVar.D();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.b.p.e = animator;
        this.c.h.b();
    }
}
