package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jfs implements kfs {
    public final float a;

    public jfs(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jfs) && y7m.b(this.a, ((jfs) obj).a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return oyr.p("Shimmering(height=", y7m.c(this.a), Extension.C_BRAKE);
    }
}
