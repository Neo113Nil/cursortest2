package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o9r0 implements p9r0 {
    public final String a;
    public final String b;

    public o9r0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.nqs0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9r0)) {
            return false;
        }
        o9r0 o9r0Var = (o9r0) obj;
        return jl40.l(this.a, o9r0Var.a) && jl40.l(this.b, o9r0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ShareRide(analyticsName=", this.a, ", sharedText=", this.b, Extension.C_BRAKE);
    }
}
