package xsna;

import androidx.compose.animation.EnterExitState;

/* compiled from: EnterExitTransition.kt */
/* loaded from: classes11.dex */
final class ymp extends d730<aop> {
    public final wlp0<EnterExitState> a;
    public final wlp0<EnterExitState>.a<q9x, tq2> b;
    public final wlp0<EnterExitState>.a<h9x, tq2> c;
    public final wlp0<EnterExitState>.a<h9x, tq2> d;
    public final qpp e;
    public final d5q f;
    public final gzs<Boolean> g;
    public final ndu h;

    public ymp(wlp0<EnterExitState> wlp0Var, wlp0<EnterExitState>.a<q9x, tq2> aVar, wlp0<EnterExitState>.a<h9x, tq2> aVar2, wlp0<EnterExitState>.a<h9x, tq2> aVar3, qpp qppVar, d5q d5qVar, gzs<Boolean> gzsVar, ndu nduVar) {
        this.a = wlp0Var;
        this.b = aVar;
        this.c = aVar2;
        this.d = aVar3;
        this.e = qppVar;
        this.f = d5qVar;
        this.g = gzsVar;
        this.h = nduVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ymp)) {
            return false;
        }
        ymp ympVar = (ymp) obj;
        return epx.f(ympVar.a, this.a) && epx.f(ympVar.b, this.b) && epx.f(ympVar.c, this.c) && epx.f(ympVar.d, this.d) && epx.f(ympVar.e, this.e) && epx.f(ympVar.f, this.f) && ympVar.g == this.g && epx.f(ympVar.h, this.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        wlp0<EnterExitState>.a<q9x, tq2> aVar = this.b;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        wlp0<EnterExitState>.a<h9x, tq2> aVar2 = this.c;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        wlp0<EnterExitState>.a<h9x, tq2> aVar3 = this.d;
        return this.h.hashCode() + sf3.a((this.f.hashCode() + ((this.e.hashCode() + ((hashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.g);
    }

    @Override // xsna.d730
    public final aop r() {
        return new aop(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // xsna.d730
    public final void s(aop aopVar) {
        aop aopVar2 = aopVar;
        aopVar2.p = this.a;
        aopVar2.q = this.b;
        aopVar2.r = this.c;
        aopVar2.s = this.d;
        aopVar2.t = this.e;
        aopVar2.u = this.f;
        aopVar2.v = this.g;
        aopVar2.w = this.h;
    }
}
