package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes6.dex */
public final class n41 implements si00 {
    public final /* synthetic */ o41 a;

    public n41(o41 o41Var) {
        this.a = o41Var;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        this.a.r(new yd0(address, 2));
    }

    @Override // defpackage.si00
    public final void d() {
        this.a.r(new qu(9));
    }

    @Override // defpackage.si00
    public final void e() {
        tls tlsVar = this.a.J;
        if (tlsVar != null) {
            tlsVar.invoke(h41.a);
        }
    }

    @Override // defpackage.si00
    public final void g() {
        tls tlsVar = this.a.J;
        if (tlsVar != null) {
            tlsVar.invoke(g41.a);
        }
    }

    @Override // defpackage.si00
    public final void i() {
        tls tlsVar = this.a.J;
        if (tlsVar != null) {
            tlsVar.invoke(i41.a);
        }
    }

    @Override // defpackage.si00
    public final void j(pv0 pv0Var) {
        tls tlsVar = this.a.J;
        if (tlsVar != null) {
            tlsVar.invoke(new f41(pv0Var));
        }
    }
}
