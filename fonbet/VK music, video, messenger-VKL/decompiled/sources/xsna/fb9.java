package xsna;

import android.animation.ValueAnimator;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import xsna.gb9;

/* compiled from: CallZoomHelper.kt */
/* loaded from: classes7.dex */
public final class fb9 implements ValueAnimator.AnimatorUpdateListener {
    public float b;
    public float c;
    public final /* synthetic */ gb9 d;

    public fb9(gb9.a aVar, gb9 gb9Var) {
        this.d = gb9Var;
        this.b = aVar.a;
        this.c = aVar.b;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float[] fArr = (float[]) valueAnimator.getAnimatedValue();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = this.b;
        if (f3 == f && this.c == f2) {
            return;
        }
        gb9 gb9Var = this.d;
        gb9Var.u.postTranslate(f - f3, f2 - this.c);
        this.b = f;
        this.c = f2;
        TextureViewRenderer textureViewRenderer = gb9Var.i;
        if (textureViewRenderer != null) {
            textureViewRenderer.setTransform(gb9Var.u);
            textureViewRenderer.invalidate();
        }
    }
}
