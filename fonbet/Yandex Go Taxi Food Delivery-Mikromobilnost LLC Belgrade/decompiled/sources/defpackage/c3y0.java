package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.x0;

/* loaded from: classes14.dex */
public class c3y0 extends vw4 {
    public boolean y = true;

    public c3y0() {
        this.g = false;
        this.c = this.e;
    }

    @Override // defpackage.vw4
    public final ViewPropertyAnimator B(x0 x0Var) {
        return x0Var.a.animate().translationY(0.0f).alpha(1.0f).setDuration(this.c);
    }

    @Override // defpackage.vw4
    public final ViewPropertyAnimator C(x0 x0Var) {
        return x0Var.a.animate().alpha(0.0f).setDuration(this.d);
    }

    @Override // defpackage.vw4
    public final void D(x0 x0Var) {
        View view = x0Var.a;
        view.setTranslationY(0.0f);
        view.setAlpha(1.0f);
    }

    @Override // defpackage.vw4
    public final void E(x0 x0Var) {
        View view = x0Var.a;
        view.setAlpha(0.0f);
        view.setTranslationY(view.getHeight());
    }

    @Override // defpackage.vw4
    public final boolean G(x0 x0Var) {
        return this.y && x0Var.G() == 0;
    }

    @Override // defpackage.vw4
    public final boolean H(x0 x0Var) {
        return false;
    }
}
