package yads;

import android.content.Context;
import android.view.TextureView;
import android.widget.FrameLayout;

/* loaded from: classes10.dex */
public final class g82 extends FrameLayout {
    public final ij3 a;
    public final TextureView b;
    public final o62 c;
    public k72 d;
    public jk1 e;

    public g82(Context context, ij3 ij3Var, TextureView textureView, o62 o62Var) {
        super(context);
        this.a = ij3Var;
        this.b = textureView;
        this.c = o62Var;
        this.e = new g03();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        k72 k72Var = this.d;
        if (k72Var != null) {
            c72 c72Var = (c72) k72Var;
            c72Var.a.a(c72Var.b.b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        k72 k72Var = this.d;
        if (k72Var != null) {
            c72 c72Var = (c72) k72Var;
            c72Var.b.a.a.clearAnimation();
            c72Var.a.a((TextureView) null);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        ik1 a = this.e.a(i, i2);
        super.onMeasure(a.a, a.b);
    }

    public final void setAspectRatio(float f) {
        this.e = new pl2(f);
    }

    public final void setOnAttachStateChangeListener(k72 k72Var) {
        this.d = k72Var;
    }
}
