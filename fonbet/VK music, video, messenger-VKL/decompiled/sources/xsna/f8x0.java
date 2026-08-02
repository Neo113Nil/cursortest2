package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes7.dex */
public final class f8x0 implements Runnable {
    public final /* synthetic */ View b;
    public final /* synthetic */ float c;
    public final /* synthetic */ g8x0 d;

    public f8x0(View view, float f, g8x0 g8x0Var) {
        this.b = view;
        this.c = f;
        this.d = g8x0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.c;
        g8x0 g8x0Var = this.d;
        View view = this.b;
        if (f == 270.0f) {
            view.setTranslationX((-g8x0Var.f.getWidth()) / 3.0f);
        } else if (f == 90.0f) {
            view.setTranslationX(g8x0Var.f.getWidth() / 3.0f);
        }
    }
}
