package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class bi0 implements View.OnClickListener {
    public final ai0 a;
    public final di0 b;

    public bi0(ai0 ai0Var, di0 di0Var) {
        this.a = ai0Var;
        this.b = di0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view != null) {
            this.a.a(this.b.a, view);
        }
    }
}
