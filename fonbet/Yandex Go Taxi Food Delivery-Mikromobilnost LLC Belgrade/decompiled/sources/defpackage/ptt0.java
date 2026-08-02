package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ptt0 {
    public final a9u0 a;
    public final a9u0 b;
    public final a9u0 c;
    public final a9u0 d;

    public ptt0(a9u0 a9u0Var, a9u0 a9u0Var2, a9u0 a9u0Var3, a9u0 a9u0Var4) {
        this.a = a9u0Var;
        this.b = a9u0Var2;
        this.c = a9u0Var3;
        this.d = a9u0Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptt0)) {
            return false;
        }
        ptt0 ptt0Var = (ptt0) obj;
        return this.a.equals(ptt0Var.a) && this.b.equals(ptt0Var.b) && this.c.equals(ptt0Var.c) && this.d.equals(ptt0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StatusScreen(pending=" + this.a + ", fail=" + this.b + ", timeout=" + this.c + ", success=" + this.d + Extension.C_BRAKE;
    }
}
