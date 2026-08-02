package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class aak0 implements ibk0 {
    public final String a;
    public final String b;

    public aak0(String str, String str2) {
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
        if (!(obj instanceof aak0)) {
            return false;
        }
        aak0 aak0Var = (aak0) obj;
        return jl40.l(this.a, aak0Var.a) && jl40.l(this.b, aak0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OpenDetailedPriceModal(analyticsName=", this.a, ", buttonTitle=", this.b, Extension.C_BRAKE);
    }
}
