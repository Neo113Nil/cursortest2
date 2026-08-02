package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class fso {
    public final String a;
    public final dso b;
    public final boolean c;
    public final a131 d;

    public fso(String str, dso dsoVar, boolean z, a131 a131Var) {
        this.a = str;
        this.b = dsoVar;
        this.c = z;
        this.d = a131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fso)) {
            return false;
        }
        fso fsoVar = (fso) obj;
        return this.a.equals(fsoVar.a) && this.b.equals(fsoVar.b) && this.c == fsoVar.c && this.d.equals(fsoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ExpiryDateField(rawExpiryDate=" + this.a + ", expiryDate=" + this.b + ", showValidationStatus=" + this.c + ", validationStatus=" + this.d + Extension.C_BRAKE;
    }
}
