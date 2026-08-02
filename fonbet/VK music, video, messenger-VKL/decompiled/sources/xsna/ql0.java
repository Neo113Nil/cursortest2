package xsna;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.vk.content.design.view.camera.ShutterButton;
import com.vk.libvideo.live.impl.views.addbutton.AddImgButtonView;

/* compiled from: AddImgButtonView.java */
/* loaded from: classes3.dex */
public final class ql0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int b;
    public final /* synthetic */ View c;

    public /* synthetic */ ql0(View view, int i) {
        this.b = i;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.b) {
            case 0:
                bwt0.p0((AddImgButtonView) this.c, false);
                break;
            default:
                ShutterButton shutterButton = (ShutterButton) this.c;
                okj0 okj0Var = shutterButton.H;
                okj0Var.v0 = false;
                okj0Var.u0 = false;
                shutterButton.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.b) {
            case 1:
                ShutterButton shutterButton = (ShutterButton) this.c;
                shutterButton.H.v0 = true;
                shutterButton.invalidate();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
