package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g201 {
    public final String a;
    public final j001 b;

    public g201(String str, j001 j001Var) {
        this.a = str;
        this.b = j001Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g201)) {
            return false;
        }
        g201 g201Var = (g201) obj;
        return jl40.l(this.a, g201Var.a) && jl40.l(this.b, g201Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "AnalyticsData(traceId=" + this.a + ", lastVisitedPoint=" + this.b + Extension.C_BRAKE;
    }
}
