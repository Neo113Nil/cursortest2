package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class e95 {
    public final String a;
    public final String b;
    public final lr c;
    public final o7v d;
    public final String e;
    public final String f;
    public final o7v g;
    public final boolean h;
    public final String i;

    public e95(String str, String str2, lr lrVar, o7v o7vVar, String str3, String str4, o7v o7vVar2, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = lrVar;
        this.d = o7vVar;
        this.e = str3;
        this.f = str4;
        this.g = o7vVar2;
        this.h = z;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e95)) {
            return false;
        }
        e95 e95Var = (e95) obj;
        return jl40.l(this.a, e95Var.a) && jl40.l(this.b, e95Var.b) && jl40.l(this.c, e95Var.c) && jl40.l(this.d, e95Var.d) && jl40.l(this.e, e95Var.e) && jl40.l(this.f, e95Var.f) && jl40.l(this.g, e95Var.g) && this.h == e95Var.h && jl40.l(this.i, e95Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        lr lrVar = this.c;
        int hashCode3 = (hashCode2 + (lrVar == null ? 0 : lrVar.hashCode())) * 31;
        o7v o7vVar = this.d;
        int hashCode4 = (hashCode3 + (o7vVar == null ? 0 : o7vVar.hashCode())) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        o7v o7vVar2 = this.g;
        int e = unr0.e((hashCode6 + (o7vVar2 == null ? 0 : o7vVar2.hashCode())) * 31, 31, this.h);
        String str4 = this.i;
        return e + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("BaseRequirementUiState(title=", this.a, ", subtitle=", this.b, ", action=");
        v.append(this.c);
        v.append(", image=");
        v.append(this.d);
        v.append(", trailTitle=");
        g8e.D(v, this.e, ", trailSubtitle=", this.f, ", trailImage=");
        v.append(this.g);
        v.append(", isShimmering=");
        v.append(this.h);
        v.append(", metricaLabel=");
        return oyr.t(v, this.i, Extension.C_BRAKE);
    }

    public /* synthetic */ e95(String str, String str2, lr lrVar, o7v o7vVar, String str3, g7v g7vVar) {
        this(str, str2, lrVar, o7vVar, str3, null, g7vVar, false, null);
    }
}
