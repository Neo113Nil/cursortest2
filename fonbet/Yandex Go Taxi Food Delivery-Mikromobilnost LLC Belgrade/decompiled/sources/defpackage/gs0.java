package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gs0 {
    public final kud0 a;
    public final kud0 b;
    public final qkb0 c;
    public final mmc d;
    public final String e;
    public final boolean f;

    public gs0(kud0 kud0Var, kud0 kud0Var2, qkb0 qkb0Var, mmc mmcVar, String str, boolean z) {
        this.a = kud0Var;
        this.b = kud0Var2;
        this.c = qkb0Var;
        this.d = mmcVar;
        this.e = str;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gs0)) {
            return false;
        }
        gs0 gs0Var = (gs0) obj;
        return this.a.equals(gs0Var.a) && this.b.equals(gs0Var.b) && jl40.l(this.c, gs0Var.c) && jl40.l(this.d, gs0Var.d) && this.e.equals(gs0Var.e) && this.f == gs0Var.f;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        qkb0 qkb0Var = this.c;
        int hashCode2 = (hashCode + (qkb0Var == null ? 0 : qkb0Var.hashCode())) * 31;
        mmc mmcVar = this.d;
        return Boolean.hashCode(this.f) + unr0.b((hashCode2 + (mmcVar != null ? mmcVar.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddressDetailsConfig(source=");
        sb.append(this.a);
        sb.append(", destination=");
        sb.append(this.b);
        sb.append(", photocomments=");
        sb.append(this.c);
        sb.append(", commentPopup=");
        sb.append(this.d);
        sb.append(", buttonText=");
        return nnm.i(this.e, ", enableDeleteDestination=", Extension.C_BRAKE, sb, this.f);
    }
}
