package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class jrp0 extends jnl {
    public final String c;
    public final String d;

    public jrp0(String str, String str2) {
        super("TransferDone", (Object) str2);
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jrp0)) {
            return false;
        }
        jrp0 jrp0Var = (jrp0) obj;
        return this.c.equals(jrp0Var.c) && jl40.l(this.d, jrp0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TransferDone(amount=", this.c, ", partner=", this.d, Extension.C_BRAKE);
    }
}
