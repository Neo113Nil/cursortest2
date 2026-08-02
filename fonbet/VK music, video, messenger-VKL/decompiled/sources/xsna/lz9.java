package xsna;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import one.video.controls.view.buttons.CastButton;

/* compiled from: CastButton.kt */
/* loaded from: classes8.dex */
public final class lz9 extends Animatable2.AnimationCallback {
    public final /* synthetic */ CastButton a;

    public lz9(CastButton castButton) {
        this.a = castButton;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        AnimatedVectorDrawable connectAnimation;
        connectAnimation = this.a.getConnectAnimation();
        connectAnimation.start();
    }
}
