package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class c910 {
    public final fl1 a;
    public final b910 b;
    public final b910 c;

    public c910(fl1 fl1Var, b910 b910Var, b910 b910Var2) {
        this.a = fl1Var;
        this.b = b910Var;
        this.c = b910Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c910)) {
            return false;
        }
        c910 c910Var = (c910) obj;
        return this.a.equals(c910Var.a) && this.b.equals(c910Var.b) && this.c.equals(c910Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Me2MeDebitAutoPullScreenDataEntity(agreement=" + this.a + ", initialContent=" + this.b + ", successContent=" + this.c + Extension.C_BRAKE;
    }
}
