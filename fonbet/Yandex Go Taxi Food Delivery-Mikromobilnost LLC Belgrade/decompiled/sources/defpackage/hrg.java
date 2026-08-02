package defpackage;

import kotlinx.datetime.format.AmPmMarker;

/* loaded from: classes9.dex */
public final class hrg implements wqg, g6z0, aw21, fpe {
    public final jqv a;
    public final lqv b;
    public final nqv c;
    public String d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ hrg(int i) {
        this(new jqv(r0), new lqv(r0), new nqv(null, null, null, null), null);
        int i2 = 0;
    }

    @Override // defpackage.aw21
    public final void A(Boolean bool) {
        this.c.a = bool;
    }

    @Override // defpackage.wqg
    public final Integer B() {
        return this.a.d;
    }

    @Override // defpackage.lb61
    public final void C(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.aw21
    public final Integer D() {
        return this.c.c;
    }

    @Override // defpackage.g6z0
    public final void E(Integer num) {
        this.b.a = num;
    }

    @Override // defpackage.aw21
    public final Boolean F() {
        return this.c.a;
    }

    @Override // defpackage.aw21
    public final void a(Integer num) {
        this.c.c = num;
    }

    @Override // defpackage.wqg
    public final Integer b() {
        return this.a.c;
    }

    @Override // defpackage.g6z0
    public final Integer c() {
        return this.b.f;
    }

    @Override // defpackage.fpe
    public final Object copy() {
        jqv copy = this.a.copy();
        lqv copy2 = this.b.copy();
        nqv nqvVar = this.c;
        return new hrg(copy, copy2, new nqv(nqvVar.a, nqvVar.b, nqvVar.c, nqvVar.d), this.d);
    }

    @Override // defpackage.g6z0
    public final Integer d() {
        return this.b.b;
    }

    @Override // defpackage.aw21
    public final Integer e() {
        return this.c.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hrg)) {
            return false;
        }
        hrg hrgVar = (hrg) obj;
        return jl40.l(hrgVar.a, this.a) && jl40.l(hrgVar.b, this.b) && jl40.l(hrgVar.c, this.c) && jl40.l(hrgVar.d, this.d);
    }

    @Override // defpackage.g6z0
    public final void f(Integer num) {
        this.b.e = num;
    }

    @Override // defpackage.g6z0
    public final void g(qxg qxgVar) {
        this.b.g(qxgVar);
    }

    @Override // defpackage.g6z0
    public final AmPmMarker h() {
        return this.b.c;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ this.b.hashCode()) ^ this.c.hashCode();
        String str = this.d;
        return (str != null ? str.hashCode() : 0) ^ hashCode;
    }

    @Override // defpackage.aw21
    public final void i(Integer num) {
        this.c.d = num;
    }

    @Override // defpackage.g6z0
    public final void j(Integer num) {
        this.b.b = num;
    }

    @Override // defpackage.g6z0
    public final void k(Integer num) {
        this.b.f = num;
    }

    @Override // defpackage.lb61
    public final Integer l() {
        return this.a.a.a;
    }

    @Override // defpackage.wqg
    public final Integer m() {
        return this.a.b;
    }

    @Override // defpackage.lb61
    public final Integer n() {
        return this.a.a.b;
    }

    @Override // defpackage.g6z0
    public final Integer o() {
        return this.b.a;
    }

    @Override // defpackage.g6z0
    public final void p(AmPmMarker amPmMarker) {
        this.b.c = amPmMarker;
    }

    @Override // defpackage.aw21
    public final Integer q() {
        return this.c.d;
    }

    @Override // defpackage.aw21
    public final void r(Integer num) {
        this.c.b = num;
    }

    @Override // defpackage.wqg
    public final void s(Integer num) {
        this.a.b = num;
    }

    @Override // defpackage.wqg
    public final void t(Integer num) {
        this.a.c = num;
    }

    @Override // defpackage.g6z0
    public final Integer u() {
        return this.b.e;
    }

    @Override // defpackage.wqg
    public final void v(Integer num) {
        this.a.d = num;
    }

    @Override // defpackage.lb61
    public final void w(Integer num) {
        this.a.a.b = num;
    }

    @Override // defpackage.g6z0
    public final Integer x() {
        return this.b.d;
    }

    @Override // defpackage.g6z0
    public final void y(Integer num) {
        this.b.d = num;
    }

    @Override // defpackage.g6z0
    public final qxg z() {
        return this.b.z();
    }

    public hrg(jqv jqvVar, lqv lqvVar, nqv nqvVar, String str) {
        this.a = jqvVar;
        this.b = lqvVar;
        this.c = nqvVar;
        this.d = str;
    }

    public hrg() {
        this(0);
    }
}
