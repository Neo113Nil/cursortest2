package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nok {
    public final String a;
    public final int b;
    public final int c;

    public nok(String str, int i, int i2) {
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nok)) {
            return false;
        }
        nok nokVar = (nok) obj;
        return jl40.l(this.a, nokVar.a) && this.b == nokVar.b && this.c == nokVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.u(this.b, "AnalyticsData(educationId=", this.a, ", slidesCnt=", ", currentSlide="));
    }
}
