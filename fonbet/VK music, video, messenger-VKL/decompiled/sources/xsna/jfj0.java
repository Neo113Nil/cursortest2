package xsna;

import android.animation.Animator;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import xsna.mih0;

/* compiled from: Animator.kt */
/* loaded from: classes17.dex */
public final class jfj0 implements Animator.AnimatorListener {
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k c;
    public final /* synthetic */ mih0.p d;

    public jfj0(LinearLayout linearLayout, com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.k kVar, mih0.p pVar) {
        this.b = linearLayout;
        this.c = kVar;
        this.d = pVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LinearLayout linearLayout = this.b;
        ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -2;
        }
        linearLayout.setScaleX(1.0f);
        linearLayout.setScaleY(1.0f);
        linearLayout.setAlpha(1.0f);
        yy5 yy5Var = this.c.m;
        if (yy5Var != null) {
            yy5Var.b(this.d);
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
