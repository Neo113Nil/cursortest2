package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class h471 {
    public final String a;
    public final int b;

    public h471(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h471)) {
            return false;
        }
        h471 h471Var = (h471) obj;
        return jl40.l(this.a, h471Var.a) && this.b == h471Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "ViewSizeKey(adUnitId=", this.a, ", screenOrientation=", Extension.C_BRAKE);
    }
}
