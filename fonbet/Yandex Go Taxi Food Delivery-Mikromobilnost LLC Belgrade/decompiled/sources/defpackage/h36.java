package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h36 {
    public final String a;
    public final wp2 b;

    public h36(String str, wp2 wp2Var) {
        this.a = str;
        this.b = wp2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h36)) {
            return false;
        }
        h36 h36Var = (h36) obj;
        return jl40.l(this.a, h36Var.a) && jl40.l(this.b, h36Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BlizzardTextUiState(text=" + this.a + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
