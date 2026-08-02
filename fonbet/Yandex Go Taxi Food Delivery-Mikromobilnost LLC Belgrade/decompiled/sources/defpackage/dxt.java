package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class dxt {
    public final String a;
    public final String b;
    public final float c;

    public dxt(String str, String str2, float f) {
        this.a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxt)) {
            return false;
        }
        dxt dxtVar = (dxt) obj;
        return jl40.l(this.a, dxtVar.a) && jl40.l(this.b, dxtVar.b) && Float.compare(this.c, dxtVar.c) == 0;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return Float.hashCode(this.c) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return uw51.i(b64.v("Gradient(startColor=", this.a, ", endColor=", this.b, ", endLocation="), this.c, Extension.C_BRAKE);
    }
}
