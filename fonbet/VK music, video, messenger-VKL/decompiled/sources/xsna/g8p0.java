package xsna;

import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;

/* compiled from: TopBottomAnimationView.kt */
/* loaded from: classes16.dex */
public final class g8p0 extends View {
    public ObjectAnimator b;
    public float c;
    public float d;
    public float e;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setVisibility$lambda$1$lambda$0(g8p0 g8p0Var) {
        if (g8p0Var.getHeight() != 0) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(g8p0Var, (Property<g8p0, Float>) View.TRANSLATION_Y, iah0.u() - g8p0Var.e, g8p0Var.d - g8p0Var.getHeight());
            ofFloat.setDuration(2500L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(2);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addListener(new f8p0(g8p0Var));
            g8p0Var.b = ofFloat;
        }
        ObjectAnimator objectAnimator = g8p0Var.b;
        if (objectAnimator != null) {
            if (objectAnimator.isPaused() || !objectAnimator.isStarted()) {
                objectAnimator.start();
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.b;
        if (objectAnimator == null || !objectAnimator.isRunning()) {
            return;
        }
        objectAnimator.cancel();
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        ObjectAnimator objectAnimator;
        super.onVisibilityChanged(view, i);
        if ((i == 4 || i == 8) && (objectAnimator = this.b) != null && objectAnimator.isRunning()) {
            objectAnimator.cancel();
        }
    }

    public final void setBottomMargin(float f) {
        this.e = f;
    }

    public final void setTopMargin(float f) {
        this.d = f;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            ObjectAnimator objectAnimator = this.b;
            if (objectAnimator != null && (objectAnimator.isPaused() || !objectAnimator.isStarted())) {
                objectAnimator.start();
            }
            if (this.b == null) {
                postDelayed(new ep0(this, 12), 100L);
            }
        }
    }
}
