package xsna;

import xsna.jsm;

/* compiled from: DialogsListDependenciesImpl.kt */
/* loaded from: classes18.dex */
public final class ksm implements jsm {
    public final a1w a;
    public final mxv b;
    public final zdw c;
    public final x9g0 d;
    public final b25 e;
    public final bpn0 f = new bpn0(new cwg(this, 10));
    public final bpn0 g = new bpn0(new z3i(this, 4));
    public final bpn0 h = new bpn0(new z4f(this, 17));
    public final bpn0 i = new bpn0(new yqf(this, 12));

    public ksm(a1w a1wVar, mxv mxvVar, zdw zdwVar, x9g0 x9g0Var, b25 b25Var) {
        this.a = a1wVar;
        this.b = mxvVar;
        this.c = zdwVar;
        this.d = x9g0Var;
        this.e = b25Var;
    }

    @Override // xsna.jsm
    public final jsm.c a() {
        return (jsm.c) this.h.getValue();
    }

    @Override // xsna.jsm
    public final jsm.b b() {
        return (jsm.b) this.i.getValue();
    }

    @Override // xsna.jsm
    public final jsm.d c() {
        return (jsm.d) this.g.getValue();
    }

    @Override // xsna.jsm
    public final jsm.a d() {
        return (jsm.a) this.f.getValue();
    }
}
