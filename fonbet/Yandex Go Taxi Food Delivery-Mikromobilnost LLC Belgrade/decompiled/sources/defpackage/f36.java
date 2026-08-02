package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f36 {
    public final String a;
    public final wp2 b;
    public final wp2 c;

    public f36(String str, wp2 wp2Var, wp2 wp2Var2) {
        this.a = str;
        this.b = wp2Var;
        this.c = wp2Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f36)) {
            return false;
        }
        f36 f36Var = (f36) obj;
        return jl40.l(this.a, f36Var.a) && jl40.l(this.b, f36Var.b) && jl40.l(this.c, f36Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + n.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BlizzardButtonUiState(buttonTitle=" + this.a + ", buttonTitleColor=" + this.b + ", buttonBackgroundColor=" + this.c + Extension.C_BRAKE;
    }
}
