package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.motion.widget.MotionInterpolator;
import defpackage.fgu0;
import defpackage.ufu0;
import defpackage.uwt0;

/* loaded from: classes10.dex */
public class StopLogic extends MotionInterpolator {
    private ufu0 mEngine;
    private uwt0 mSpringStopEngine;
    private fgu0 mStopLogicEngine;

    public StopLogic() {
        fgu0 fgu0Var = new fgu0();
        this.mStopLogicEngine = fgu0Var;
        this.mEngine = fgu0Var;
    }

    public void config(float f, float f2, float f3, float f4, float f5, float f6) {
        fgu0 fgu0Var = this.mStopLogicEngine;
        this.mEngine = fgu0Var;
        fgu0Var.m = f;
        boolean z = f > f2;
        fgu0Var.l = z;
        if (z) {
            fgu0Var.d(-f3, f - f2, f5, f6, f4);
        } else {
            fgu0Var.d(f3, f2 - f, f5, f6, f4);
        }
    }

    public String debug(String str, float f) {
        return this.mEngine.c(str, f);
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float f) {
        return this.mEngine.getInterpolation(f);
    }

    public float getVelocity(float f) {
        return this.mEngine.a(f);
    }

    public boolean isStopped() {
        return this.mEngine.isStopped();
    }

    public void springConfig(float f, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        if (this.mSpringStopEngine == null) {
            this.mSpringStopEngine = new uwt0();
        }
        uwt0 uwt0Var = this.mSpringStopEngine;
        this.mEngine = uwt0Var;
        uwt0Var.c = f2;
        uwt0Var.a = f6;
        uwt0Var.e = f;
        uwt0Var.b = f5;
        uwt0Var.g = f4;
        uwt0Var.h = f7;
        uwt0Var.i = i;
        uwt0Var.d = 0.0f;
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
        return this.mEngine.b();
    }
}
