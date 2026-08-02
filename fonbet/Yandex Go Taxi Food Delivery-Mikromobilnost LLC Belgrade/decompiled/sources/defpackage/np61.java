package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes7.dex */
public final class np61 {
    public static final am61 Companion = new am61();
    public final String a;
    public final nm71 b;
    public final em61 c;
    public final ql81 d;
    public final String e;

    public np61(int i, String str, nm71 nm71Var, em61 em61Var, ql81 ql81Var, String str2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, vh61.b);
            throw null;
        }
        this.a = str;
        this.b = nm71Var;
        this.c = em61Var;
        this.d = ql81Var;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np61)) {
            return false;
        }
        np61 np61Var = (np61) obj;
        return jl40.l(this.a, np61Var.a) && jl40.l(this.b, np61Var.b) && jl40.l(this.c, np61Var.c) && jl40.l(this.d, np61Var.d) && jl40.l(this.e, np61Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        nm71 nm71Var = this.b;
        int hashCode2 = (hashCode + (nm71Var == null ? 0 : nm71Var.hashCode())) * 31;
        em61 em61Var = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (em61Var == null ? 0 : Double.hashCode(em61Var.a))) * 31)) * 31;
        String str = this.e;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrefetchedMediationInfo(adapter=");
        sb.append(this.a);
        sb.append(", networkWinner=");
        sb.append(this.b);
        sb.append(", revenue=");
        sb.append(this.c);
        sb.append(", result=");
        sb.append(this.d);
        sb.append(", networkAdInfo=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }

    public np61(String str, ql81 ql81Var) {
        this.a = str;
        this.b = null;
        this.c = null;
        this.d = ql81Var;
        this.e = null;
    }
}
