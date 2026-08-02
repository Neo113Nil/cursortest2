package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jq80 {
    public final boolean a;
    public final float b;
    public final int c;

    public jq80(int i) {
        int i2 = (i & 4) != 0 ? 50 : 200;
        this.a = true;
        this.b = 0.8f;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq80)) {
            return false;
        }
        jq80 jq80Var = (jq80) obj;
        return this.a == jq80Var.a && Float.compare(this.b, jq80Var.b) == 0 && this.c == jq80Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + g8e.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrientationConfig(enableLowPassFilter=");
        sb.append(this.a);
        sb.append(", filterAlpha=");
        sb.append(this.b);
        sb.append(", updateIntervalMs=");
        return oyr.m(this.c, Extension.C_BRAKE, sb);
    }

    public jq80() {
        this(7);
    }
}
