package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.vk.content.design.view.camera.ShutterButton;

/* compiled from: ShutterButton.kt */
/* loaded from: classes17.dex */
public final class nkj0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ShutterButton b;

    public nkj0(ShutterButton shutterButton) {
        this.b = shutterButton;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        ShutterButton shutterButton = this.b;
        shutterButton.setForwardDirection(!shutterButton.getForwardDirection());
        shutterButton.C++;
    }
}
