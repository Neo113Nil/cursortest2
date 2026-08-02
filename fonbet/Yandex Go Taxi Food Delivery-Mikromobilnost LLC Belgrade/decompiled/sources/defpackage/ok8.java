package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class ok8 {
    public final String a;
    public final boolean b;
    public final a131 c;

    public ok8(String str, boolean z, a131 a131Var) {
        this.a = str;
        this.b = z;
        this.c = a131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ok8)) {
            return false;
        }
        ok8 ok8Var = (ok8) obj;
        return jl40.l(this.a, ok8Var.a) && this.b == ok8Var.b && this.c.equals(ok8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("CardNumberField(cardNumber=", oyr.p("CardNumber(value=", this.a, Extension.C_BRAKE), ", showValidationStatus=", ", validationStatus=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
