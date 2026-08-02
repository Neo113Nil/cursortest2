package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class jl9 implements View.OnLayoutChangeListener {
    public final /* synthetic */ kl9 b;
    public final /* synthetic */ nov c;

    public jl9(kl9 kl9Var, nov novVar) {
        this.b = kl9Var;
        this.c = novVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        kl9 kl9Var = this.b;
        kl9.c(kl9Var);
        kl9.a(kl9Var, this.c);
        kl9.b(kl9Var);
    }
}
