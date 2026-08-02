package defpackage;

import android.animation.ValueAnimator;
import com.yandex.mapkit.geometry.Point;

/* loaded from: classes14.dex */
public final /* synthetic */ class mt00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f4c0 b;

    public /* synthetic */ mt00(f4c0 f4c0Var, int i) {
        this.a = i;
        this.b = f4c0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        f4c0 f4c0Var = this.b;
        switch (i) {
            case 0:
                f4c0Var.v(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                f4c0Var.o((Point) valueAnimator.getAnimatedValue());
                break;
            case 2:
                f4c0Var.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 3:
                f4c0Var.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                f4c0Var.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
