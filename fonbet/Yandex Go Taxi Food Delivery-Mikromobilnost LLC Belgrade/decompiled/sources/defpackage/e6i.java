package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class e6i {
    public final boolean a;
    public final n7v b;
    public final String c;
    public final String d;
    public final String e;
    public final wdv0 f;

    public e6i(boolean z, n7v n7vVar, String str, String str2, String str3, wdv0 wdv0Var) {
        this.a = z;
        this.b = n7vVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = wdv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6i)) {
            return false;
        }
        e6i e6iVar = (e6i) obj;
        return this.a == e6iVar.a && jl40.l(this.b, e6iVar.b) && jl40.l(this.c, e6iVar.c) && jl40.l(this.d, e6iVar.d) && jl40.l(this.e, e6iVar.e) && jl40.l(this.f, e6iVar.f);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        n7v n7vVar = this.b;
        int b = unr0.b((hashCode + (n7vVar == null ? 0 : n7vVar.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int hashCode2 = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        wdv0 wdv0Var = this.f;
        return hashCode3 + (wdv0Var != null ? wdv0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryDoorToDoorDetails(default=");
        sb.append(this.a);
        sb.append(", leadImage=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", selectedSubtitle=", this.d, ", unselectedSubtitle=");
        sb.append(this.e);
        sb.append(", summaryBubble=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
