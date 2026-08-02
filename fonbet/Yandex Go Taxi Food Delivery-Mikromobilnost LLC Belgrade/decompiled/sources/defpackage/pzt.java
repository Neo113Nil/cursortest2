package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class pzt {
    public final wp2 a;
    public final wp2 b;
    public final float c;

    public pzt(wp2 wp2Var, wp2 wp2Var2, float f) {
        this.a = wp2Var;
        this.b = wp2Var2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pzt)) {
            return false;
        }
        pzt pztVar = (pzt) obj;
        return jl40.l(this.a, pztVar.a) && jl40.l(this.b, pztVar.b) && Float.compare(this.c, pztVar.c) == 0;
    }

    public final int hashCode() {
        wp2 wp2Var = this.a;
        int hashCode = (wp2Var == null ? 0 : wp2Var.hashCode()) * 31;
        wp2 wp2Var2 = this.b;
        return Float.hashCode(this.c) + ((hashCode + (wp2Var2 != null ? wp2Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientUiState(startColor=");
        sb.append(this.a);
        sb.append(", endColor=");
        sb.append(this.b);
        sb.append(", endLocation=");
        return uw51.i(sb, this.c, Extension.C_BRAKE);
    }
}
