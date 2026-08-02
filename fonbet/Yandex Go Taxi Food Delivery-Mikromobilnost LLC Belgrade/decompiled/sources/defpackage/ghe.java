package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ghe {
    public final float a;
    public final float b;

    public ghe(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghe)) {
            return false;
        }
        ghe gheVar = (ghe) obj;
        return Float.compare(this.a, gheVar.a) == 0 && Float.compare(this.b, gheVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("ContentPadding(top=", this.a, ", bottom=", this.b, Extension.C_BRAKE);
    }

    public ghe() {
        this(0);
    }

    public /* synthetic */ ghe(int i) {
        this(0.0f, 0.0f);
    }
}
