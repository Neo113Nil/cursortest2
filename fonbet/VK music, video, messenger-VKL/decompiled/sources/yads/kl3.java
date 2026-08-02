package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class kl3 {
    public final il3 a;

    public kl3(il3 il3Var) {
        this.a = il3Var;
    }

    public final boolean a() {
        View view = this.a.getView();
        return (view == null || om3.b(view) || om3.a(view) < 50) ? false : true;
    }
}
