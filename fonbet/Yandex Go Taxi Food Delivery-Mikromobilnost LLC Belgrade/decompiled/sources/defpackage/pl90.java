package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pl90 extends w791 {
    public final int a;
    public final String b;

    public pl90(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.w791
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pl90)) {
            return false;
        }
        pl90 pl90Var = (pl90) obj;
        return this.a == pl90Var.a && jl40.l(this.b, pl90Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.l(this.a, "AnotherPassenger(imageRes=", ", text=", this.b, Extension.C_BRAKE);
    }
}
