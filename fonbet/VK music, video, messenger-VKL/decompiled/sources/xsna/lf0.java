package xsna;

import android.animation.Animator;
import android.widget.TextView;
import com.vkontakte.android.R;
import xsna.jf0;

/* compiled from: AdFooterHolderV2.kt */
/* loaded from: classes4.dex */
public final class lf0 implements Animator.AnimatorListener {
    public final /* synthetic */ jf0 b;

    public lf0(jf0 jf0Var) {
        this.b = jf0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        jf0 jf0Var = this.b;
        TextView textView = jf0Var.G;
        abg0 abg0Var = dhr0.t;
        textView.setTextColor(abg0Var.c(R.attr.vk_ui_text_contrast));
        jf0Var.I.setColorFilter(abg0Var.c(R.attr.vk_ui_icon_contrast));
        jf0Var.H.setColorFilter(abg0Var.c(R.attr.vk_ui_icon_contrast));
        jf0Var.N = jf0.a.ACTIVE;
        bwt0.p0(jf0Var.K, false);
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
