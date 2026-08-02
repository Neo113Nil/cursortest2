package xsna;

import android.animation.ValueAnimator;
import com.vk.core.tips.TipAnchorView;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class i4p0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i4p0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                com.vk.core.tips.c cVar = (com.vk.core.tips.c) this.c;
                TipAnchorView tipAnchorView = (TipAnchorView) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.b = floatValue;
                cVar.invalidateSelf();
                tipAnchorView.setTipScale(floatValue);
                break;
            default:
                r6y0 r6y0Var = (r6y0) this.c;
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.d;
                float f = r6y0.k;
                float b = u11.b(r6y0.l, f, valueAnimator.getAnimatedFraction(), f);
                r6y0Var.b.invoke(Float.valueOf(b / ref$FloatRef.element));
                ref$FloatRef.element = b;
                break;
        }
    }
}
