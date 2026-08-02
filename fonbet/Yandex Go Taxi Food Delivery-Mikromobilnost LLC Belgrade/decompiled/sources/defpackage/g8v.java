package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class g8v {
    public final float a;
    public final float b;

    public g8v(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8v)) {
            return false;
        }
        g8v g8vVar = (g8v) obj;
        return Float.compare(this.a, g8vVar.a) == 0 && Float.compare(this.b, g8vVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("ImageAnchor(x=", this.a, ", y=", this.b, Extension.C_BRAKE);
    }

    public g8v() {
        this(0);
    }

    public /* synthetic */ g8v(int i) {
        this(0.5f, 0.5f);
    }
}
