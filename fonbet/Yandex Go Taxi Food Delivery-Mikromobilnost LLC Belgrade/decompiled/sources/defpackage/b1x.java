package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class b1x {
    public final float a;
    public final float b;

    public b1x(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1x)) {
            return false;
        }
        b1x b1xVar = (b1x) obj;
        return Float.compare(this.a, b1xVar.a) == 0 && Float.compare(this.b, b1xVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("ItemBounds(top=", this.a, ", height=", this.b, Extension.C_BRAKE);
    }
}
