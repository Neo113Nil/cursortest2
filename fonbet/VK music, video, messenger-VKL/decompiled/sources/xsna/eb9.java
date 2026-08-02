package xsna;

import android.animation.ValueAnimator;

/* compiled from: CallZoomHelper.kt */
/* loaded from: classes7.dex */
public final class eb9 implements ValueAnimator.AnimatorUpdateListener {
    public final float[] b = new float[9];
    public final float[] c;
    public final float[] d;
    public final /* synthetic */ gb9 e;

    public eb9(gb9 gb9Var) {
        this.e = gb9Var;
        float[] fArr = new float[9];
        this.c = fArr;
        float[] fArr2 = new float[9];
        this.d = fArr2;
        gb9Var.u.getValues(fArr);
        gb9Var.j.getValues(fArr2);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        int i = 0;
        while (true) {
            float[] fArr = this.b;
            if (i >= 9) {
                gb9 gb9Var = this.e;
                gb9Var.u.setValues(fArr);
                gb9Var.a();
                return;
            } else {
                float f = this.c[i];
                float f2 = this.d[i];
                fArr[i] = u11.b(f, f2, floatValue, f2);
                i++;
            }
        }
    }
}
