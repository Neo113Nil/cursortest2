package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.vkontakte.android.R;

/* compiled from: V.java */
/* loaded from: classes8.dex */
public final class d6r0 extends AnimatorListenerAdapter {
    public boolean b = false;
    public final /* synthetic */ Animator.AnimatorListener c;
    public final /* synthetic */ View d;
    public final /* synthetic */ int e;

    public d6r0(int i, Animator.AnimatorListener animatorListener, View view) {
        this.c = animatorListener;
        this.d = view;
        this.e = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.b = true;
        Animator.AnimatorListener animatorListener = this.c;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.d;
        view.setTag(R.id.tag_visibility_anim, null);
        j6r0.a.remove(view);
        if (this.b) {
            return;
        }
        view.setVisibility(this.e);
        view.setAlpha(1.0f);
        Animator.AnimatorListener animatorListener = this.c;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        Animator.AnimatorListener animatorListener = this.c;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}
