package xsna;

import android.view.View;
import android.widget.ImageView;

/* compiled from: View.kt */
/* loaded from: classes17.dex */
public final class k5s0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ j5s0 b;
    public final /* synthetic */ float c;

    public k5s0(j5s0 j5s0Var, float f) {
        this.b = j5s0Var;
        this.c = f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        float f = this.c;
        j5s0 j5s0Var = this.b;
        j5s0Var.a.c().setScaleType(j5s0.a(j5s0Var, f) ? ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_CENTER);
    }
}
