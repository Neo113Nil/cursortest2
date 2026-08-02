package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class jzd {
    public final float a;
    public final boolean b;

    public jzd(float f, boolean z) {
        this.a = f;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzd)) {
            return false;
        }
        jzd jzdVar = (jzd) obj;
        return Float.compare(this.a, jzdVar.a) == 0 && this.b == jzdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ExposureConfig(correction=" + this.a + ", spotMetering=" + this.b + Extension.C_BRAKE;
    }

    public jzd() {
        this(0.0f, false);
    }
}
