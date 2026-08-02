package xsna;

import android.animation.Animator;
import androidx.viewpager2.widget.ViewPager2;

/* compiled from: ClipsTemplateEditorCropperView.kt */
/* loaded from: classes16.dex */
public final class c7f implements Animator.AnimatorListener {
    public final /* synthetic */ ViewPager2 b;
    public final /* synthetic */ int c;

    public c7f(ViewPager2 viewPager2, int i) {
        this.b = viewPager2;
        this.c = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.c;
        ViewPager2 viewPager2 = this.b;
        viewPager2.e(i, true);
        viewPager2.post(new p69(viewPager2, 3));
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
