package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ctm0 {
    public final btm0 a;
    public final ysm0 b;
    public final zsm0 c;
    public final atm0 d;
    public final CharSequence e;
    public final CharSequence f;
    public final boolean g;

    public ctm0(btm0 btm0Var, ysm0 ysm0Var, zsm0 zsm0Var, atm0 atm0Var, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.a = btm0Var;
        this.b = ysm0Var;
        this.c = zsm0Var;
        this.d = atm0Var;
        this.e = charSequence;
        this.f = charSequence2;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ctm0)) {
            return false;
        }
        ctm0 ctm0Var = (ctm0) obj;
        return jl40.l(this.a, ctm0Var.a) && jl40.l(this.b, ctm0Var.b) && jl40.l(this.c, ctm0Var.c) && jl40.l(this.d, ctm0Var.d) && jl40.l(this.e, ctm0Var.e) && jl40.l(this.f, ctm0Var.f) && this.g == ctm0Var.g;
    }

    public final int hashCode() {
        int b = smw0.b((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
        CharSequence charSequence = this.f;
        return Boolean.hashCode(this.g) + ((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScootersActivePassesV3RenewMenuUiState(title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append(", paymentMethodItem=");
        sb.append(this.c);
        sb.append(", renewItem=");
        sb.append(this.d);
        sb.append(", closeButtonText=");
        vfc.A(sb, this.e, ", retryButtonText=", this.f, ", inProgress=");
        return x4e.i(sb, this.g, Extension.C_BRAKE);
    }
}
