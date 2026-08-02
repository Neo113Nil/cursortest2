package androidx.constraintlayout.motion.widget;

import androidx.constraintlayout.motion.widget.MotionLayout;

/* loaded from: classes10.dex */
public final class b {
    public float a = Float.NaN;
    public float b = Float.NaN;
    public int c = -1;
    public int d = -1;
    public final /* synthetic */ MotionLayout e;

    public b(MotionLayout motionLayout) {
        this.e = motionLayout;
    }

    public final void a() {
        int i = this.c;
        MotionLayout motionLayout = this.e;
        if (i != -1 || this.d != -1) {
            int i2 = this.d;
            if (i == -1) {
                motionLayout.transitionToState(i2);
            } else if (i2 == -1) {
                motionLayout.setState(i, -1, -1);
            } else {
                motionLayout.setTransition(i, i2);
            }
            motionLayout.setState(MotionLayout.TransitionState.SETUP);
        }
        boolean isNaN = Float.isNaN(this.b);
        float f = this.a;
        if (isNaN) {
            if (Float.isNaN(f)) {
                return;
            }
            motionLayout.setProgress(this.a);
        } else {
            motionLayout.setProgress(f, this.b);
            this.a = Float.NaN;
            this.b = Float.NaN;
            this.c = -1;
            this.d = -1;
        }
    }
}
