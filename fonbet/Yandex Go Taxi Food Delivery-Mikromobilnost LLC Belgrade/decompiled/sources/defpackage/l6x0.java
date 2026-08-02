package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l6x0 {
    public final String a;
    public final ldc b;
    public final ldc c;
    public final v4v d;
    public final qj4 e;
    public final x2s f;
    public final x9x0 g;
    public final String h;
    public final boolean i;

    public l6x0(String str, ldc ldcVar, ldc ldcVar2, lvi0 lvi0Var, qj4 qj4Var, x2s x2sVar, x9x0 x9x0Var, String str2, boolean z) {
        this.a = str;
        this.b = ldcVar;
        this.c = ldcVar2;
        this.d = lvi0Var;
        this.e = qj4Var;
        this.f = x2sVar;
        this.g = x9x0Var;
        this.h = str2;
        this.i = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6x0)) {
            return false;
        }
        l6x0 l6x0Var = (l6x0) obj;
        return jl40.l(this.a, l6x0Var.a) && jl40.l(this.b, l6x0Var.b) && jl40.l(this.c, l6x0Var.c) && jl40.l(this.d, l6x0Var.d) && jl40.l(this.e, l6x0Var.e) && this.f.equals(l6x0Var.f) && this.g.equals(l6x0Var.g) && jl40.l(this.h, l6x0Var.h) && this.i == l6x0Var.i;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.c;
        int hashCode3 = (hashCode2 + (ldcVar2 == null ? 0 : Long.hashCode(ldcVar2.a))) * 31;
        v4v v4vVar = this.d;
        int hashCode4 = (hashCode3 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31;
        qj4 qj4Var = this.e;
        int hashCode5 = (this.g.hashCode() + tse0.a(this.f, (hashCode4 + (qj4Var == null ? 0 : qj4Var.hashCode())) * 31, 31)) * 31;
        String str = this.h;
        return Boolean.hashCode(this.i) + ((hashCode5 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(text=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", textColor=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", badge=");
        sb.append(this.e);
        sb.append(", onShownAnalyticsData=");
        sb.append(this.f);
        sb.append(", widgetAction=");
        sb.append(this.g);
        sb.append(", contentDescription=");
        sb.append(this.h);
        sb.append(", isIconLead=");
        return x4e.i(sb, this.i, Extension.C_BRAKE);
    }
}
