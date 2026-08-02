package xsna;

import android.view.animation.Animation;
import com.vk.money.pin.PinFragment;

/* compiled from: PinFragment.kt */
/* loaded from: classes3.dex */
public final class cma0 implements sp2 {
    public final /* synthetic */ PinFragment b;

    public cma0(PinFragment pinFragment) {
        this.b = pinFragment;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        PinFragment pinFragment = this.b;
        qla0 qla0Var = (qla0) pinFragment.S;
        if (qla0Var != null) {
            qla0Var.a7();
        }
        pinFragment.Ob();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
