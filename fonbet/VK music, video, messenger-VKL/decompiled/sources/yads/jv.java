package yads;

import xsna.epx;

/* loaded from: classes10.dex */
public final class jv {
    public final String a;
    public final int b;

    public jv(int i, String str) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return epx.f(this.a, jvVar.a) && this.b == jvVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xsna.iq.a(this.b, "ClickQrcode(url=", this.a, ", sizeInPx=", ")");
    }
}
