package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jze0 implements kze0 {
    public final wp2 a;
    public final Float b;

    public jze0(wp2 wp2Var, Float f) {
        this.a = wp2Var;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jze0)) {
            return false;
        }
        jze0 jze0Var = (jze0) obj;
        return jl40.l(this.a, jze0Var.a) && jl40.l(this.b, jze0Var.b);
    }

    public final int hashCode() {
        wp2 wp2Var = this.a;
        int hashCode = (wp2Var == null ? 0 : wp2Var.hashCode()) * 31;
        Float f = this.b;
        return hashCode + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "EmptyLoadingUiState(contentColor=" + this.a + ", contentColorAlpha=" + this.b + Extension.C_BRAKE;
    }
}
