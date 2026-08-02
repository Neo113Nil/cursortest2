package androidx.appcompat.app;

import android.view.View;
import defpackage.bx60;
import defpackage.ege;
import defpackage.n751;

/* loaded from: classes.dex */
public final class d implements bx60, ege {
    public final /* synthetic */ AppCompatDelegateImpl a;

    public void a() {
        this.a.dismissPopups();
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        int d = n751Var.d();
        int updateStatusGuard = this.a.updateStatusGuard(n751Var, null);
        if (d != updateStatusGuard) {
            n751Var = n751Var.f(n751Var.b(), updateStatusGuard, n751Var.c(), n751Var.a());
        }
        return androidx.core.view.b.k(view, n751Var);
    }
}
