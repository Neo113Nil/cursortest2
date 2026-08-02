package xsna;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import xsna.xn6;

/* compiled from: IndeterminateSpinnerDrawable.kt */
/* loaded from: classes.dex */
public final class rtw extends Animation {
    public final /* synthetic */ stw b;

    public rtw(stw stwVar) {
        this.b = stwVar;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        ilq ilqVar = stw.i;
        stw stwVar = this.b;
        xn6.a aVar = stwVar.b;
        float f2 = aVar.f;
        float f3 = aVar.e;
        float f4 = aVar.g;
        float radians = (float) Math.toRadians(aVar.d / 125.66370614359172d);
        if (f <= 0.5f) {
            aVar.a = (ilqVar.getInterpolation(f / 0.5f) * (0.8f - radians)) + f3;
        }
        if (f > 0.5f) {
            aVar.b = (ilqVar.getInterpolation((f - 0.5f) / 0.5f) * (0.8f - radians)) + f2;
        }
        aVar.c = (0.25f * f) + f4;
        stwVar.e = io.reactivex.rxjava3.internal.operators.observable.n0.b(stwVar.f, 5.0f, 1080.0f, f * 216.0f);
        stwVar.invalidateSelf();
    }
}
