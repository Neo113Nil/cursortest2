package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ih00 {
    public final float a;
    public final float b;

    public ih00(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih00)) {
            return false;
        }
        ih00 ih00Var = (ih00) obj;
        return Float.compare(this.a, ih00Var.a) == 0 && Float.compare(this.b, ih00Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("Point(x=", this.a, ", y=", this.b, Extension.C_BRAKE);
    }
}
