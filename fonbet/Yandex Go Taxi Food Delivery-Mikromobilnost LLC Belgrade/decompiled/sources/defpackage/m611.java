package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class m611 implements h711 {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final k911 d;
    public final String e;
    public final String f;
    public final k911 g;
    public final String h;

    public m611(CharSequence charSequence, CharSequence charSequence2, String str, k911 k911Var, String str2, String str3, k911 k911Var2, String str4) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = k911Var;
        this.e = str2;
        this.f = str3;
        this.g = k911Var2;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m611)) {
            return false;
        }
        m611 m611Var = (m611) obj;
        return jl40.l(this.a, m611Var.a) && jl40.l(this.b, m611Var.b) && jl40.l(this.c, m611Var.c) && jl40.l(this.d, m611Var.d) && jl40.l(this.e, m611Var.e) && jl40.l(this.f, m611Var.f) && jl40.l(this.g, m611Var.g) && this.h.equals(m611Var.h);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int b = unr0.b(smw0.e(this.d, unr0.b((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.c), 31), 31, this.e);
        String str = this.f;
        return this.h.hashCode() + smw0.e(this.g, (b + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.h711
    public final k911 j() {
        return this.g;
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "EndTransportSection(title=", ", subtitle=", ", time=");
        r.append(this.c);
        r.append(", nextTransportType=");
        r.append(this.d);
        r.append(", contentDescription=");
        g8e.D(r, this.e, ", exitName=", this.f, ", transportType=");
        r.append(this.g);
        r.append(", id=");
        r.append(this.h);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
