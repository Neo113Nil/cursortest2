package xsna;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: MsgTranscriptButton.kt */
/* loaded from: classes2.dex */
public final class a140 extends Animatable2.AnimationCallback {
    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        AnimatedVectorDrawable animatedVectorDrawable = drawable instanceof AnimatedVectorDrawable ? (AnimatedVectorDrawable) drawable : null;
        if (animatedVectorDrawable == null || animatedVectorDrawable.getAlpha() <= 0) {
            return;
        }
        animatedVectorDrawable.start();
    }
}
