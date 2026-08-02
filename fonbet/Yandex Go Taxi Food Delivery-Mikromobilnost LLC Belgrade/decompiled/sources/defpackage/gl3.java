package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class gl3 implements hl3 {
    public final boolean a;

    public gl3(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gl3) && this.a == ((gl3) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("Unauthorized(isAccountChanged=", Extension.C_BRAKE, this.a);
    }

    public gl3() {
        this(false);
    }
}
