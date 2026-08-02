package yads;

import android.view.View;

/* loaded from: classes10.dex */
public final class jl3 {
    public final il3 a;

    public jl3(il3 il3Var) {
        this.a = il3Var;
    }

    public final boolean a() {
        View view = this.a.getView();
        return (view == null || om3.b(view) || om3.a.a(view).a < 1) ? false : true;
    }
}
