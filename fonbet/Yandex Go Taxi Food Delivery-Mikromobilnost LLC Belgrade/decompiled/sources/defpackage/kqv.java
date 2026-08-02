package defpackage;

import kotlinx.datetime.format.AmPmMarker;

/* loaded from: classes4.dex */
public final class kqv implements wqg, g6z0, fpe {
    public final jqv a;
    public final lqv b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ kqv(int i) {
        this(new jqv(r0), new lqv(r0));
        int i2 = 0;
    }

    @Override // defpackage.wqg
    public final Integer B() {
        return this.a.d;
    }

    @Override // defpackage.lb61
    public final void C(Integer num) {
        this.a.a.a = num;
    }

    @Override // defpackage.g6z0
    public final void E(Integer num) {
        this.b.a = num;
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
        return new kqv(this.a.copy(), this.b.copy());
    }

    @Override // defpackage.g6z0
    public final Integer d() {
        return this.b.b;
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

    public kqv(jqv jqvVar, lqv lqvVar) {
        this.a = jqvVar;
        this.b = lqvVar;
    }

    public kqv() {
        this(0);
    }
}
