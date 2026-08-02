package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bz4 extends fz4 {
    public final String a;
    public final String b;

    public bz4(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fz4
    public final String a() {
        return g8e.o("AddContactItem-", this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz4)) {
            return false;
        }
        bz4 bz4Var = (bz4) obj;
        return jl40.l(this.a, bz4Var.a) && jl40.l(this.b, bz4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("AddContactItem(title=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
