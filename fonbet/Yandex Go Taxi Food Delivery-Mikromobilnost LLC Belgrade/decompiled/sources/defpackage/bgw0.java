package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bgw0 {
    public final float a;
    public final float b;

    public bgw0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bgw0)) {
            return false;
        }
        bgw0 bgw0Var = (bgw0) obj;
        return Float.compare(this.a, bgw0Var.a) == 0 && Float.compare(this.b, bgw0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("OffsetPercent(x=", this.a, ", y=", this.b, Extension.C_BRAKE);
    }
}
