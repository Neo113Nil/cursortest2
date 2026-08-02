package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class l0f0 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0f0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                Iterator it = ((ArrayList) this.c).iterator();
                while (it.hasNext()) {
                    ((View) it.next()).setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
                break;
            default:
                ((b5y0) this.c).b7().setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
