package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cj11 {
    public final long a;
    public final float b;
    public final float c;
    public final float d;

    public cj11(long j, float f, float f2, float f3) {
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cj11)) {
            return false;
        }
        cj11 cj11Var = (cj11) obj;
        return this.a == cj11Var.a && Float.compare(this.b, cj11Var.b) == 0 && Float.compare(this.c, cj11Var.c) == 0 && Float.compare(this.d, cj11Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "TsarButtonGradientAnimationSettings(duration=" + this.a + ", scaleFactor=" + this.b + ", finalOpacity=" + this.c + ", initialOpacity=" + this.d + Extension.C_BRAKE;
    }
}
