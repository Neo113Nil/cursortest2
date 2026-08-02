package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class c510 implements h510 {
    public final g510 a;
    public final g510 b;

    public c510(g510 g510Var, g510 g510Var2) {
        this.a = g510Var;
        this.b = g510Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c510)) {
            return false;
        }
        c510 c510Var = (c510) obj;
        return this.a.equals(c510Var.a) && this.b.equals(c510Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DoubleColumn(firstColumn=" + this.a + ", secondColumn=" + this.b + Extension.C_BRAKE;
    }
}
