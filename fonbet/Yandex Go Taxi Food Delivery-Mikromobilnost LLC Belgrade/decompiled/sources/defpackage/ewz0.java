package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ewz0 {
    public final int a;
    public final int b;

    public ewz0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ewz0)) {
            return false;
        }
        ewz0 ewz0Var = (ewz0) obj;
        return this.a == ewz0Var.a && this.b == ewz0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "TopContentHeight(headerHeightPx=", ", boostButtonHeightPx=", Extension.C_BRAKE);
    }
}
