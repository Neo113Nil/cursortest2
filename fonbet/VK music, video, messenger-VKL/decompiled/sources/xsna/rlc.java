package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.ExpandableTextViewGroup;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rlc implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rlc(View view, int i) {
        this.b = i;
        this.c = view;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ?? r1 = (FunctionReferenceImpl) obj;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                if (num != null) {
                    r1.invoke(num);
                    break;
                }
                break;
            case 1:
                ExpandableTextViewGroup expandableTextViewGroup = (ExpandableTextViewGroup) obj;
                int i2 = ExpandableTextViewGroup.i;
                ViewGroup.LayoutParams layoutParams = expandableTextViewGroup.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                }
                expandableTextViewGroup.requestLayout();
                break;
            default:
                ((View) obj).setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ rlc(izs izsVar) {
        this.b = 0;
        this.c = (FunctionReferenceImpl) izsVar;
    }
}
