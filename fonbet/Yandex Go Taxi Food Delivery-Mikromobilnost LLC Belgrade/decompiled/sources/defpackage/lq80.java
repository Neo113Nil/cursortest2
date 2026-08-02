package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.c0;
import androidx.recyclerview.widget.d0;

/* loaded from: classes9.dex */
public final class lq80 {
    public c0 a;
    public b0 b;

    public final d0 a(RecyclerView.e eVar) {
        b0 b0Var = this.b;
        if (b0Var == null || b0Var.a != eVar) {
            this.b = new b0(eVar);
        }
        b0 b0Var2 = this.b;
        if (b0Var2 != null) {
            return b0Var2;
        }
        ny61.g("Required value was null.");
        return null;
    }

    public final d0 b(RecyclerView.e eVar) {
        if (eVar.I()) {
            return a(eVar);
        }
        if (eVar.J()) {
            return c(eVar);
        }
        return null;
    }

    public final d0 c(RecyclerView.e eVar) {
        c0 c0Var = this.a;
        if (c0Var == null || c0Var.a != eVar) {
            this.a = new c0(eVar);
        }
        c0 c0Var2 = this.a;
        if (c0Var2 != null) {
            return c0Var2;
        }
        ny61.g("Required value was null.");
        return null;
    }
}
