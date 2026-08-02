package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class og4 implements qg4 {
    public final String a;
    public final Float b;

    public og4(String str, Float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof og4)) {
            return false;
        }
        og4 og4Var = (og4) obj;
        return jl40.l(this.a, og4Var.a) && jl40.l(this.b, og4Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Float f = this.b;
        return hashCode + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        return "SolidBackground(color=" + this.a + ", alpha=" + this.b + Extension.C_BRAKE;
    }
}
