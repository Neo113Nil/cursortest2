package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jgk0 implements kgk0 {
    public final int a;
    public final int b;

    public jgk0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgk0)) {
            return false;
        }
        jgk0 jgk0Var = (jgk0) obj;
        return this.a == jgk0Var.a && this.b == jgk0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "LinearGradient(startColor=", ", endColor=", Extension.C_BRAKE);
    }
}
