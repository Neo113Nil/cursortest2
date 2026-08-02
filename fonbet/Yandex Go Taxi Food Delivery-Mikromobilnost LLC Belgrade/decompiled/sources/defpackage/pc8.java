package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class pc8 {
    public final String a;
    public final String b;

    public pc8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pc8)) {
            return false;
        }
        pc8 pc8Var = (pc8) obj;
        return this.a.equals(pc8Var.a) && this.b.equals(pc8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CardData(cardNumber=", this.a, ", expireDate=", this.b, Extension.C_BRAKE);
    }
}
