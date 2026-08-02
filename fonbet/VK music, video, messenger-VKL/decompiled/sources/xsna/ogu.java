package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import com.vk.sharing.core.view.b;
import one.video.transform.TransformController;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class ogu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ogu(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.b) {
            case 0:
                b.a aVar = (b.a) this.c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                View view = aVar.d;
                if (view != null) {
                    view.setScaleX(1.0f - ((float) Math.pow(1.0f - floatValue, 3)));
                }
                View view2 = aVar.d;
                if (view2 != null) {
                    view2.setScaleY(1.0f - ((float) Math.pow(1.0f - floatValue, 3)));
                    break;
                }
                break;
            default:
                TransformController transformController = (TransformController) this.c;
                vna0 vna0Var = (vna0) valueAnimator.getAnimatedValue();
                transformController.c().b(vna0Var.a, vna0Var.b, vna0Var.c);
                transformController.b();
                break;
        }
    }
}
