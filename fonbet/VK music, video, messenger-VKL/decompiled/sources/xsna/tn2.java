package xsna;

import android.animation.ValueAnimator;
import kotlin.Pair;
import xsna.mje;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class tn2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tn2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                xn2 xn2Var = (xn2) this.c;
                float[] fArr = (float[]) valueAnimator.getAnimatedValue();
                float f = fArr[0];
                float f2 = fArr[1];
                float f3 = fArr[2];
                float f4 = fArr[3];
                xn2Var.b.setTranslationY(f);
                xn2Var.e.setTranslationY(f3);
                xn2Var.d.setTranslationY(f2);
                f4m.y((int) f4, xn2Var.f);
                break;
            case 1:
                mje mjeVar = (mje) this.c;
                mje.a aVar = mjeVar.c;
                if (aVar != null) {
                    Pair<Float, Float> pair = aVar.b;
                    Pair<Float, Float> pair2 = aVar.a;
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    mjeVar.b.invoke(Float.valueOf(((pair.i().floatValue() - pair2.i().floatValue()) * floatValue) + pair2.i().floatValue()), Float.valueOf(((pair.j().floatValue() - pair2.j().floatValue()) * floatValue) + pair2.j().floatValue()));
                    break;
                }
                break;
            default:
                ra00 ra00Var = (ra00) this.c;
                ra00Var.l6(((Integer) valueAnimator.getAnimatedValue()).intValue());
                ra00Var.itemView.requestLayout();
                break;
        }
    }
}
