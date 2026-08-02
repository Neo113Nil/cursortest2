package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.core.tool.view.FrameLayoutSwiped;

/* compiled from: FrameLayoutSwiped.kt */
/* loaded from: classes17.dex */
public final class ifs extends AnimatorListenerAdapter {
    public final /* synthetic */ FrameLayoutSwiped b;

    public ifs(FrameLayoutSwiped frameLayoutSwiped) {
        this.b = frameLayoutSwiped;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b.k = false;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.b.k = false;
    }
}
