package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.taxi.order.map.overlay.c;

/* loaded from: classes14.dex */
public final /* synthetic */ class j080 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ j080(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        c cVar = this.b;
        switch (i) {
            case 0:
                cVar.Og(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                f4c0 f4c0Var = cVar.r0;
                if (f4c0Var != null) {
                    f4c0Var.A(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
        }
    }
}
