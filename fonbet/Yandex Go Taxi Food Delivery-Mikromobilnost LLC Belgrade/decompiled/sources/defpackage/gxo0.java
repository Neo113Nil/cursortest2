package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gxo0 {
    public final wwo0 a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final cxo0 e;
    public final fxo0 f;

    public gxo0(wwo0 wwo0Var, String str, CharSequence charSequence, CharSequence charSequence2, cxo0 cxo0Var, fxo0 fxo0Var) {
        this.a = wwo0Var;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = cxo0Var;
        this.f = fxo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxo0)) {
            return false;
        }
        gxo0 gxo0Var = (gxo0) obj;
        return jl40.l(this.a, gxo0Var.a) && jl40.l(this.b, gxo0Var.b) && jl40.l(this.c, gxo0Var.c) && jl40.l(this.d, gxo0Var.d) && jl40.l(this.e, gxo0Var.e) && jl40.l(this.f, gxo0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = smw0.b(smw0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        cxo0 cxo0Var = this.e;
        int hashCode2 = (b + (cxo0Var == null ? 0 : cxo0Var.hashCode())) * 31;
        fxo0 fxo0Var = this.f;
        return hashCode2 + (fxo0Var != null ? fxo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersSubscriptionPromoblock(deeplink=");
        sb.append(this.a);
        sb.append(", imageTag=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", badge=");
        sb.append(this.e);
        sb.append(", toggle=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
