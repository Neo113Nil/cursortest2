package xsna;

import java.util.ArrayList;
import xsna.pnb0;

/* compiled from: PollEditorApplier.kt */
/* loaded from: classes4.dex */
public final class aob0 implements bob0 {
    public final izs<pnb0, s3q0> a;
    public final gzs<yrb0> b;
    public final izs<yrb0, s3q0> c;
    public final gzs<bpw<qv2, iv2>> d;
    public final izs<bpw<qv2, iv2>, s3q0> e;
    public final gzs<wow<qv2>> f;
    public final izs<wow<qv2>, s3q0> g;
    public final gzs<wow<qv2>> h;
    public final izs<wow<qv2>, s3q0> i;
    public final gzs<gob0> j;
    public final izs<gob0, s3q0> k;

    /* JADX WARN: Multi-variable type inference failed */
    public aob0(izs<? super pnb0, s3q0> izsVar, gzs<yrb0> gzsVar, izs<? super yrb0, s3q0> izsVar2, gzs<bpw<qv2, iv2>> gzsVar2, izs<? super bpw<qv2, iv2>, s3q0> izsVar3, gzs<wow<qv2>> gzsVar3, izs<? super wow<qv2>, s3q0> izsVar4, gzs<wow<qv2>> gzsVar4, izs<? super wow<qv2>, s3q0> izsVar5, gzs<gob0> gzsVar5, izs<? super gob0, s3q0> izsVar6) {
        this.a = izsVar;
        this.b = gzsVar;
        this.c = izsVar2;
        this.d = gzsVar2;
        this.e = izsVar3;
        this.f = gzsVar3;
        this.g = izsVar4;
        this.h = gzsVar4;
        this.i = izsVar5;
        this.j = gzsVar5;
        this.k = izsVar6;
        new ArrayList();
    }

    @Override // xsna.bob0
    public final void a(boolean z) {
        yrb0 a = yrb0.a(this.b.invoke(), null, false, false, z, false, 0L, 55);
        this.c.invoke(a);
        this.a.invoke(new pnb0.a.c(a, this.f.invoke().b, this.h.invoke().b, this.d.invoke().b));
    }

    @Override // xsna.bob0
    public final void b(boolean z) {
        yrb0 a = yrb0.a(this.b.invoke(), null, false, false, false, z, 0L, 47);
        this.c.invoke(a);
        this.a.invoke(new pnb0.a.c(a, this.f.invoke().b, this.h.invoke().b, this.d.invoke().b));
    }

    @Override // xsna.bob0
    public final void c(String str) {
        yrb0 a = yrb0.a(this.b.invoke(), str, false, false, false, false, 0L, 62);
        this.c.invoke(a);
        this.a.invoke(new pnb0.a.c(a, this.f.invoke().b, this.h.invoke().b, this.d.invoke().b));
    }

    @Override // xsna.bob0
    public final void d(boolean z) {
        yrb0 a = yrb0.a(this.b.invoke(), null, false, z, false, false, 0L, 59);
        this.c.invoke(a);
        this.a.invoke(new pnb0.a.c(a, this.f.invoke().b, this.h.invoke().b, this.d.invoke().b));
    }

    @Override // xsna.bob0
    public final void e(boolean z) {
        yrb0 a = yrb0.a(this.b.invoke(), null, z, false, false, false, 0L, 61);
        this.c.invoke(a);
        this.a.invoke(new pnb0.a.c(a, this.f.invoke().b, this.h.invoke().b, this.d.invoke().b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aob0)) {
            return false;
        }
        aob0 aob0Var = (aob0) obj;
        return epx.f(this.a, aob0Var.a) && epx.f(this.b, aob0Var.b) && epx.f(this.c, aob0Var.c) && epx.f(this.d, aob0Var.d) && epx.f(this.e, aob0Var.e) && epx.f(this.f, aob0Var.f) && epx.f(this.g, aob0Var.g) && epx.f(this.h, aob0Var.h) && epx.f(this.i, aob0Var.i) && epx.f(this.j, aob0Var.j) && epx.f(this.k, aob0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + sf3.a(dq.c(sf3.a(dq.c(sf3.a(dq.c(sf3.a(dq.c(sf3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PollEditorApplier(sendAction=");
        sb.append(this.a);
        sb.append(", getter=");
        sb.append(this.b);
        sb.append(", setter=");
        sb.append(this.c);
        sb.append(", getterAnswers=");
        sb.append(this.d);
        sb.append(", setterAnswers=");
        sb.append(this.e);
        sb.append(", getterItems=");
        sb.append(this.f);
        sb.append(", setterItems=");
        sb.append(this.g);
        sb.append(", getterVisible=");
        sb.append(this.h);
        sb.append(", setterVisible=");
        sb.append(this.i);
        sb.append(", getterChanges=");
        sb.append(this.j);
        sb.append(", setterChanges=");
        return up.c(sb, this.k, ')');
    }
}
