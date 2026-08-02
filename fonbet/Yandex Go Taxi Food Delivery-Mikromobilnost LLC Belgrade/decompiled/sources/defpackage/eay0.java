package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class eay0 implements m1j {
    public final obm a;
    public final CharSequence b;
    public final CharSequence c;
    public final String d;
    public final k911 e;
    public final String f;
    public final String g;
    public final h911 h;
    public final String i;

    public eay0(obm obmVar, CharSequence charSequence, CharSequence charSequence2, String str, k911 k911Var, String str2, String str3, h911 h911Var, String str4) {
        this.a = obmVar;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = str;
        this.e = k911Var;
        this.f = str2;
        this.g = str3;
        this.h = h911Var;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eay0)) {
            return false;
        }
        eay0 eay0Var = (eay0) obj;
        return jl40.l(this.a, eay0Var.a) && jl40.l(this.b, eay0Var.b) && this.c.equals(eay0Var.c) && jl40.l(this.d, eay0Var.d) && this.e.equals(eay0Var.e) && this.f.equals(eay0Var.f) && jl40.l(this.g, eay0Var.g) && this.h.equals(eay0Var.h) && jl40.l(this.i, eay0Var.i);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.i;
    }

    public final int hashCode() {
        obm obmVar = this.a;
        int b = unr0.b(smw0.e(this.e, unr0.b(smw0.b(smw0.b((obmVar == null ? 0 : obmVar.a.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f);
        String str = this.g;
        return this.i.hashCode() + ((this.h.hashCode() + ((b + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxiSection(icon=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append((Object) this.b);
        sb.append(", subtitle=");
        sb.append((Object) this.c);
        sb.append(", time=");
        sb.append(this.d);
        sb.append(", prevTransportType=");
        sb.append(this.e);
        sb.append(", contentDescription=");
        sb.append(this.f);
        sb.append(", durationText=");
        sb.append(this.g);
        sb.append(", transportType=");
        sb.append(this.h);
        sb.append(", id=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
