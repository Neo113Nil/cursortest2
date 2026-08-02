package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nc3 {
    public final vr60 a;
    public final float b;

    public nc3(vr60 vr60Var, float f) {
        this.a = vr60Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nc3)) {
            return false;
        }
        nc3 nc3Var = (nc3) obj;
        return jl40.l(this.a, nc3Var.a) && y7m.b(this.b, nc3Var.b);
    }

    public final int hashCode() {
        vr60 vr60Var = this.a;
        return Float.hashCode(this.b) + ((vr60Var == null ? 0 : vr60Var.hashCode()) * 31);
    }

    public final String toString() {
        return "AttentionHeaderState(displayedAttention=" + this.a + ", contentTopPadding=" + y7m.c(this.b) + Extension.C_BRAKE;
    }
}
