package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class kbe0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public kbe0(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbe0)) {
            return false;
        }
        kbe0 kbe0Var = (kbe0) obj;
        return jl40.l(this.a, kbe0Var.a) && jl40.l(this.b, kbe0Var.b) && this.c.equals(kbe0Var.c) && this.d == kbe0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return nnm.i(this.c, ", isLetterEnabled=", Extension.C_BRAKE, b64.v("PorchNumberInputPaneV2UiState(title=", this.a, ", buttonText=", this.b, ", initialPorchNumber="), this.d);
    }
}
