package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class if61 {
    public final float a;
    public final float b;

    public if61(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final float a() {
        return this.a;
    }

    public final float b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if61)) {
            return false;
        }
        if61 if61Var = (if61) obj;
        return Float.compare(this.a, if61Var.a) == 0 && Float.compare(this.b, if61Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("ZoomRange(from=", this.a, ", to=", this.b, Extension.C_BRAKE);
    }
}
