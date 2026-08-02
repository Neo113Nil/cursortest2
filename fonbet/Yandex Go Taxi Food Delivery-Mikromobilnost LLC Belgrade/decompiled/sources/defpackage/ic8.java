package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ic8 extends kfb1 {
    public final String b;
    public final String c;

    public ic8(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic8)) {
            return false;
        }
        ic8 ic8Var = (ic8) obj;
        return jl40.l(this.b, ic8Var.b) && jl40.l(this.c, ic8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TwoButtons(instructionTitle=", this.b, ", checkInTitle=", this.c, Extension.C_BRAKE);
    }
}
