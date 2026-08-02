package xsna;

import xsna.tlo0;

/* compiled from: VkCompositeActionButtonView.kt */
/* loaded from: classes18.dex */
public final class pmu0 {
    public final tlo0.h a;
    public final gzs<s3q0> b;
    public final int c;
    public final int d;
    public final boolean e;
    public final tlo0.h f;

    public pmu0() {
        throw null;
    }

    public pmu0(tlo0.h hVar, gzs gzsVar, int i, int i2, boolean z) {
        this.a = hVar;
        this.b = gzsVar;
        this.c = i;
        this.d = i2;
        this.e = z;
        this.f = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pmu0)) {
            return false;
        }
        pmu0 pmu0Var = (pmu0) obj;
        return epx.f(this.a, pmu0Var.a) && epx.f(this.b, pmu0Var.b) && this.c == pmu0Var.c && this.d == pmu0Var.d && this.e == pmu0Var.e && epx.f(this.f, pmu0Var.f);
    }

    public final int hashCode() {
        tlo0.h hVar = this.a;
        int b = qoy.b(shy.a(this.d, shy.a(this.c, sf3.a((hVar == null ? 0 : hVar.a.hashCode()) * 31, 31, this.b), 31), 31), 31, this.e);
        tlo0.h hVar2 = this.f;
        return b + (hVar2 != null ? hVar2.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActionButtonAnimated(text=");
        sb.append(this.a);
        sb.append(", onClick=");
        sb.append(this.b);
        sb.append(", backgroundColor=");
        sb.append(this.c);
        sb.append(", textColor=");
        sb.append(this.d);
        sb.append(", animateChangeColors=");
        sb.append(this.e);
        sb.append(", contentDescription=");
        return jq.c(sb, this.f, ')');
    }
}
