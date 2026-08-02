package xsna;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.vkontakte.android.R;

/* compiled from: AdFooterHolderV2.kt */
/* loaded from: classes4.dex */
public final class mf0 implements Animation.AnimationListener {
    public final /* synthetic */ jf0 b;

    public mf0(jf0 jf0Var) {
        this.b = jf0Var;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        jf0 jf0Var = this.b;
        Animation loadAnimation = AnimationUtils.loadAnimation(jf0Var.itemView.getContext(), R.anim.shine_long_btn_infinite);
        jf0Var.J.startAnimation(loadAnimation);
        jf0Var.R = loadAnimation;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
