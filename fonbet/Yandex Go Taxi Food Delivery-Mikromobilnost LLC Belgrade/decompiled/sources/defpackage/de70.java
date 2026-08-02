package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class de70 {
    public final String a;
    public final String b;

    public de70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof de70)) {
            return false;
        }
        de70 de70Var = (de70) obj;
        return jl40.l(this.a, de70Var.a) && jl40.l(this.b, de70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("OptionDisabledLabels(maxWeight=", this.a, ", maxCount=", this.b, Extension.C_BRAKE);
    }
}
