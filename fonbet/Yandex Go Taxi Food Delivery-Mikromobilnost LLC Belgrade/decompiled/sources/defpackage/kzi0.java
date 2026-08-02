package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class kzi0 {
    public final int a;
    public final String b;

    public kzi0(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kzi0)) {
            return false;
        }
        kzi0 kzi0Var = (kzi0) obj;
        return this.a == kzi0Var.a && jl40.l(this.b, kzi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "RentalDurationValueModel(duration=", ", label=", this.b, Extension.C_BRAKE);
    }
}
