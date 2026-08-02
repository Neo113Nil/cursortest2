package xsna;

import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.graphics.Rect;
import com.vk.core.view.components.search.ExpandableActionVkSearchView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class y7q implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y7q(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                ExpandableActionVkSearchView.l5((ValueAnimator) this.c, (ExpandableActionVkSearchView) this.d);
                break;
            case 1:
                no00 no00Var = (no00) this.c;
                Rect rect = (Rect) this.d;
                if (no00Var.isAttachedToWindow()) {
                    rect.set(0, 0, an10.b(((Float) valueAnimator.getAnimatedValue()).floatValue() * no00Var.getWidth()), no00Var.getHeight());
                    no00Var.setClipBounds(rect);
                    break;
                }
                break;
            default:
                Paint paint = (Paint) this.c;
                pim0 pim0Var = (pim0) this.d;
                paint.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                pim0Var.a.invalidate();
                break;
        }
    }
}
