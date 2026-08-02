package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class m0y0 implements p0y0 {
    public final String a;

    public m0y0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        boolean l;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0y0)) {
            return false;
        }
        String str = ((m0y0) obj).a;
        String str2 = this.a;
        if (str2 == null) {
            if (str == null) {
                l = true;
            }
            l = false;
        } else {
            if (str != null) {
                l = jl40.l(str2, str);
            }
            l = false;
        }
        return l;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str = this.a;
        return oyr.p("Failure(taxiMainFallback=", str == null ? "null" : oyr.p("Fallback(reason=", str, Extension.C_BRAKE), Extension.C_BRAKE);
    }

    public /* synthetic */ m0y0() {
        this(null);
    }
}
