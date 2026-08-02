package yads;

import android.app.Dialog;
import android.view.View;

/* loaded from: classes10.dex */
public final class yc implements View.OnClickListener {
    public final Dialog a;
    public final ne1 b;

    public yc(Dialog dialog, ne1 ne1Var) {
        this.a = dialog;
        this.b = ne1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.getClass();
        ne1.a(view);
        ng0.a(this.a);
    }
}
