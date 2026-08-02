package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class okz0 extends rqb1 {
    public final float a;

    public okz0(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof okz0) && Float.compare(this.a, ((okz0) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return x4e.f("TextSize(size=", Extension.C_BRAKE, this.a);
    }
}
