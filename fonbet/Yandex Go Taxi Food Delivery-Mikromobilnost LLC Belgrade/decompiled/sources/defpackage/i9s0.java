package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes2.dex */
public final class i9s0 {
    public static final h9s0 Companion = new h9s0();
    public final String a;
    public final String b;

    public /* synthetic */ i9s0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, g9s0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i9s0)) {
            return false;
        }
        i9s0 i9s0Var = (i9s0) obj;
        return jl40.l(this.a, i9s0Var.a) && jl40.l(this.b, i9s0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShowStatusBarData(callToTitle=", this.a, ", subtitle=", this.b, Extension.C_BRAKE);
    }
}
