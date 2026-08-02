package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes11.dex */
public final class fjr0 {
    public static final ejr0 Companion = new ejr0();
    public final String a;
    public final String b;

    public /* synthetic */ fjr0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, djr0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fjr0)) {
            return false;
        }
        fjr0 fjr0Var = (fjr0) obj;
        return jl40.l(this.a, fjr0Var.a) && jl40.l(this.b, fjr0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShareData(type=", this.a, ", data=", this.b, Extension.C_BRAKE);
    }
}
