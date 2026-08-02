package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

/* loaded from: classes8.dex */
public final class c4r0 {
    public final k a;
    public final b8r b;

    public c4r0(b8r b8rVar, k kVar) {
        this.a = kVar;
        this.b = b8rVar;
    }

    public static /* synthetic */ pzt0 e(c4r0 c4r0Var, SelectionOrigin selectionOrigin, String str, String str2, int i) {
        if ((i & 4) != 0) {
            str2 = "";
        }
        return c4r0Var.b(selectionOrigin, str, str2, (i & 8) == 0);
    }

    public static /* synthetic */ void g(c4r0 c4r0Var, SelectionOrigin selectionOrigin, sgx0 sgx0Var, String str, int i) {
        if ((i & 4) != 0) {
            str = "";
        }
        c4r0Var.d(selectionOrigin, sgx0Var, str, false);
    }

    public final pzt0 a(gnx0 gnx0Var) {
        fnx0 fnx0Var = gnx0Var.a;
        if (this.b.b(fnx0Var.c.J0, fnx0Var.d) == null) {
            return null;
        }
        return this.a.o(gnx0Var);
    }

    public final pzt0 b(SelectionOrigin selectionOrigin, String str, String str2, boolean z) {
        mi31 d = b8r.d(this.b, str, str2, 4);
        if (d == null) {
            return null;
        }
        return this.a.o(new gnx0(new fnx0(d.a, d.b, selectionOrigin), z));
    }

    public final void c(SelectionOrigin selectionOrigin, pex0 pex0Var, boolean z) {
        k kVar = this.a;
        if (z) {
            kVar.o(new gnx0(new fnx0(pex0Var, "", selectionOrigin), false));
            return;
        }
        mi31 b = this.b.b(pex0Var.J0, "");
        if (b == null) {
            return;
        }
        kVar.o(new gnx0(new fnx0(b, selectionOrigin), true));
    }

    public final void d(SelectionOrigin selectionOrigin, sgx0 sgx0Var, String str, boolean z) {
        mi31 b = this.b.b(sgx0Var, str);
        if (b == null) {
            return;
        }
        a(new gnx0(new fnx0(b.a, str, selectionOrigin), z));
    }
}
