package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mqf0 implements qqf0 {
    public final int a;
    public final int b;

    public mqf0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mqf0)) {
            return false;
        }
        mqf0 mqf0Var = (mqf0) obj;
        return this.a == mqf0Var.a && this.b == mqf0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "CircleProgressUiState(current=", ", total=", Extension.C_BRAKE);
    }
}
