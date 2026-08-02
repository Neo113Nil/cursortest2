package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class mof {
    public final String a;
    public final boolean b;
    public final b131 c;

    public mof(String str, boolean z, b131 b131Var) {
        this.a = str;
        this.b = z;
        this.c = b131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mof)) {
            return false;
        }
        mof mofVar = (mof) obj;
        return this.a.equals(mofVar.a) && this.b == mofVar.b && this.c.equals(mofVar.c);
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
