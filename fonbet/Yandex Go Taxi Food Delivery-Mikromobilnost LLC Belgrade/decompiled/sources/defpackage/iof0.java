package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iof0 extends s151 {
    public final rry0 a;
    public final rry0 b;
    public final qfc c;
    public final qfc d;
    public final hhg e;
    public final boolean f;
    public final w4v g;
    public final lrb1 h;
    public final u3b1 i;
    public final boolean j;
    public final Object k;
    public final String l;

    public iof0(rry0 rry0Var, rry0 rry0Var2, qfc qfcVar, qfc qfcVar2, hhg hhgVar, boolean z, w4v w4vVar, lrb1 lrb1Var, u3b1 u3b1Var, boolean z2, Object obj, String str) {
        this.a = rry0Var;
        this.b = rry0Var2;
        this.c = qfcVar;
        this.d = qfcVar2;
        this.e = hhgVar;
        this.f = z;
        this.g = w4vVar;
        this.h = lrb1Var;
        this.i = u3b1Var;
        this.j = z2;
        this.k = obj;
        this.l = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iof0)) {
            return false;
        }
        iof0 iof0Var = (iof0) obj;
        return jl40.l(this.a, iof0Var.a) && jl40.l(this.b, iof0Var.b) && jl40.l(this.c, iof0Var.c) && jl40.l(this.d, iof0Var.d) && jl40.l(this.e, iof0Var.e) && this.f == iof0Var.f && jl40.l(this.g, iof0Var.g) && jl40.l(this.h, iof0Var.h) && jl40.l(this.i, iof0Var.i) && this.j == iof0Var.j && jl40.l(this.k, iof0Var.k) && jl40.l(this.l, iof0Var.l);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        rry0 rry0Var = this.b;
        int hashCode2 = (hashCode + (rry0Var == null ? 0 : rry0Var.hashCode())) * 31;
        qfc qfcVar = this.c;
        int hashCode3 = (hashCode2 + (qfcVar == null ? 0 : qfcVar.hashCode())) * 31;
        qfc qfcVar2 = this.d;
        int e = unr0.e((this.e.hashCode() + ((hashCode3 + (qfcVar2 == null ? 0 : qfcVar2.hashCode())) * 31)) * 31, 31, this.f);
        w4v w4vVar = this.g;
        int hashCode4 = (e + (w4vVar == null ? 0 : w4vVar.hashCode())) * 31;
        lrb1 lrb1Var = this.h;
        int hashCode5 = (hashCode4 + (lrb1Var == null ? 0 : lrb1Var.hashCode())) * 31;
        u3b1 u3b1Var = this.i;
        int e2 = unr0.e((hashCode5 + (u3b1Var == null ? 0 : u3b1Var.hashCode())) * 961, 31, this.j);
        Object obj = this.k;
        int hashCode6 = (e2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str = this.l;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PromoModel(title=" + this.a + ", subtitle=" + this.b + ", titleColor=" + this.c + ", subtitleColor=" + this.d + ", action=" + this.e + ", new=" + this.f + ", leadIcon=" + this.g + ", trailElement=" + this.h + ", backgroundModel=" + this.i + ", accessibilityLabel=null, showWhenSectionCollapsed=" + this.j + ", meta=" + this.k + ", metricaLabel=" + this.l + Extension.C_BRAKE;
    }
}
