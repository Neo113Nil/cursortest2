package xsna;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: PipetteColorPicker.kt */
/* loaded from: classes6.dex */
public final class upa0 extends Animation {
    public final /* synthetic */ View b;

    public upa0(View view) {
        this.b = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        f4m.q((int) (cn70.b(20) * f), this.b);
    }
}
