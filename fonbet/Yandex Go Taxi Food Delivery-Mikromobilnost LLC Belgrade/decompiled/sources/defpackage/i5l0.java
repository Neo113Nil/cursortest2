package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class i5l0 {
    public final String a;
    public final o68 b;

    public i5l0(String str, o68 o68Var) {
        this.a = str;
        this.b = o68Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5l0)) {
            return false;
        }
        i5l0 i5l0Var = (i5l0) obj;
        return jl40.l(this.a, i5l0Var.a) && jl40.l(this.b, i5l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Car(tariffClass=" + this.a + ", position=" + this.b + Extension.C_BRAKE;
    }
}
