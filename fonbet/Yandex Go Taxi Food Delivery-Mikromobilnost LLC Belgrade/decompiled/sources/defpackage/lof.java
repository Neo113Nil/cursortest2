package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class lof {
    public final String a;
    public final boolean b;
    public final a131 c;

    public lof(String str, boolean z, a131 a131Var) {
        this.a = str;
        this.b = z;
        this.c = a131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lof)) {
            return false;
        }
        lof lofVar = (lof) obj;
        return this.a.equals(lofVar.a) && this.b == lofVar.b && this.c.equals(lofVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder l = oo31.l("CvvField(cvv=", oyr.p("Cvv(value=", this.a, Extension.C_BRAKE), ", showValidationStatus=", ", validationStatus=", this.b);
        l.append(this.c);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
