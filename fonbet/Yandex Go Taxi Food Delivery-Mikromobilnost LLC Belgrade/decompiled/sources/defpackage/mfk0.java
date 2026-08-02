package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mfk0 {
    public final String a;
    public final String b;

    public mfk0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mfk0)) {
            return false;
        }
        mfk0 mfk0Var = (mfk0) obj;
        return this.a.equals(mfk0Var.a) && jl40.l(this.b, mfk0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CostBreakdownItem(costName=", this.a, ", price=", this.b, Extension.C_BRAKE);
    }
}
