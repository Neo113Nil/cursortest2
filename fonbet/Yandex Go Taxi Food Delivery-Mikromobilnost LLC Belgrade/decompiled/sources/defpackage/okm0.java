package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class okm0 {
    public final CharSequence a;
    public final CharSequence b;
    public final qj4 c;
    public final boolean d;
    public final boolean e;
    public final x9x0 f;
    public final x2s g;

    public okm0(CharSequence charSequence, CharSequence charSequence2, qj4 qj4Var, boolean z, boolean z2, x9x0 x9x0Var, x2s x2sVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = qj4Var;
        this.d = z;
        this.e = z2;
        this.f = x9x0Var;
        this.g = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof okm0)) {
            return false;
        }
        okm0 okm0Var = (okm0) obj;
        return jl40.l(this.a, okm0Var.a) && jl40.l(this.b, okm0Var.b) && jl40.l(this.c, okm0Var.c) && this.d == okm0Var.d && this.e == okm0Var.e && this.f.equals(okm0Var.f) && jl40.l(this.g, okm0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        qj4 qj4Var = this.c;
        int hashCode3 = (this.f.hashCode() + unr0.e(unr0.e((hashCode2 + (qj4Var == null ? 0 : qj4Var.hashCode())) * 31, 31, this.d), 31, this.e)) * 31;
        x2s x2sVar = this.g;
        return hashCode3 + (x2sVar != null ? x2sVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScalableSelectorOptionModel(text1=", ", text2=", ", badge=");
        r.append(this.c);
        r.append(", isSelected=");
        r.append(this.d);
        r.append(", isEnabled=");
        r.append(this.e);
        r.append(", action=");
        r.append(this.f);
        r.append(", onShownAnalyticsData=");
        r.append(this.g);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
