package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gso {
    public final String a;
    public final eso b;
    public final boolean c;
    public final b131 d;

    public gso(String str, eso esoVar, boolean z, b131 b131Var) {
        this.a = str;
        this.b = esoVar;
        this.c = z;
        this.d = b131Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gso)) {
            return false;
        }
        gso gsoVar = (gso) obj;
        return this.a.equals(gsoVar.a) && this.b.equals(gsoVar.b) && this.c == gsoVar.c && this.d.equals(gsoVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ExpiryDateField(rawExpiryDate=" + this.a + ", expiryDate=" + this.b + ", showValidationStatus=" + this.c + ", validationStatus=" + this.d + Extension.C_BRAKE;
    }
}
