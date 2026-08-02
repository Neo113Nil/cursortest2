package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dn8 {
    public final yqj0 a;
    public final yqj0 b;
    public final yqj0 c;

    public dn8(yqj0 yqj0Var, yqj0 yqj0Var2, yqj0 yqj0Var3) {
        this.a = yqj0Var;
        this.b = yqj0Var2;
        this.c = yqj0Var3;
    }

    public final yqj0 a() {
        return this.c;
    }

    public final yqj0 b() {
        return this.a;
    }

    public final yqj0 c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn8)) {
            return false;
        }
        dn8 dn8Var = (dn8) obj;
        return this.a.equals(dn8Var.a) && this.b.equals(dn8Var.b) && this.c.equals(dn8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardRequisites(cvv=" + this.a + ", expireDate=" + this.b + ", cardNumber=" + this.c + Extension.C_BRAKE;
    }
}
