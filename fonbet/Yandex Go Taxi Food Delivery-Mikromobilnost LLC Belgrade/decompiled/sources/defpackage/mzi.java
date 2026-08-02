package defpackage;

import com.yandex.go.address.models.Address;

/* loaded from: classes5.dex */
public final class mzi implements fzi {
    public final /* synthetic */ fzi a;
    public final /* synthetic */ fzi b;
    public final /* synthetic */ j02 c;

    public mzi(fzi fziVar, j02 j02Var) {
        this.b = fziVar;
        this.c = j02Var;
        this.a = fziVar;
    }

    @Override // defpackage.si00
    public final void a(Address address) {
        this.c.i();
        this.b.a(address);
    }

    @Override // defpackage.fzi
    public final boolean b(pv0 pv0Var) {
        return this.a.b(pv0Var);
    }

    @Override // defpackage.si00
    public final void c(pv0 pv0Var) {
        if (this.a.b(pv0Var)) {
            this.c.i();
            this.b.c(pv0Var);
        }
    }

    @Override // defpackage.si00
    public final void d() {
        this.c.i();
        this.b.d();
    }

    @Override // defpackage.si00
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.fzi
    public final boolean f(Address address) {
        return this.a.f(address);
    }

    @Override // defpackage.si00
    public final void g() {
        this.a.g();
    }

    @Override // defpackage.si00
    public final void h(String str) {
        this.a.h(str);
    }

    @Override // defpackage.si00
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.si00
    public final void j(pv0 pv0Var) {
        this.a.j(pv0Var);
    }
}
