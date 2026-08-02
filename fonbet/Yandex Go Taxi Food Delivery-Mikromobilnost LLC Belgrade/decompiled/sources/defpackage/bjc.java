package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.tariffcard.ui.recyclerview.animationmanager.CombinedValueAnimator;

/* loaded from: classes14.dex */
public final /* synthetic */ class bjc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bjc(float f, Object obj, int i) {
        this.a = i;
        this.b = f;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                CombinedValueAnimator.bindInnerAnimator$lambda$0(f, (ValueAnimator) obj, valueAnimator);
                break;
            case 1:
                CombinedValueAnimator.bindInnerAnimator$lambda$1(f, (ValueAnimator) obj, valueAnimator);
                break;
            default:
                zxv0 zxv0Var = (zxv0) obj;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f2 = animatedValue instanceof Float ? (Float) animatedValue : null;
                if (f2 != null) {
                    float floatValue = f2.floatValue() * f;
                    zxv0Var.a.setTranslationY(f - floatValue);
                    zxv0Var.c.invoke(Float.valueOf(floatValue));
                    break;
                }
                break;
        }
    }
}
