package defpackage;

import androidx.fragment.app.Fragment;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.checkout.CheckoutFragment;

/* loaded from: classes2.dex */
public final class ftb {
    public final ufl0 a;

    public ftb(ufl0 ufl0Var) {
        this.a = ufl0Var;
    }

    public final void a() {
        alc[] alcVarArr = {new ff4(), new zd4()};
        jlc jlcVar = this.a.a;
        jlcVar.c.post(new l7a(15, jlcVar, alcVarArr));
    }

    public final void b() {
        c(new CheckoutFragment(), "Checkout");
    }

    public final void c(Fragment fragment, String str) {
        alc[] alcVarArr = {new y0j0(new tis0(str, (a9f) new e48(26, fragment), true))};
        jlc jlcVar = this.a.a;
        jlcVar.c.post(new l7a(15, jlcVar, alcVarArr));
    }
}
