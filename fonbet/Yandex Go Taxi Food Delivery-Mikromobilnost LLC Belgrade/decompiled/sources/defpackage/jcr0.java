package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jcr0 extends scr0 {
    public final pcr0 a;
    public final rcr0 b;
    public final mcr0 c;

    public jcr0(pcr0 pcr0Var, rcr0 rcr0Var, mcr0 mcr0Var) {
        this.a = pcr0Var;
        this.b = rcr0Var;
        this.c = mcr0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jcr0)) {
            return false;
        }
        jcr0 jcr0Var = (jcr0) obj;
        return this.a.equals(jcr0Var.a) && this.b.equals(jcr0Var.b) && this.c.equals(jcr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "Data(nameState=" + this.a + ", phoneState=" + this.b + ", emailState=" + this.c + Extension.C_BRAKE;
    }
}
