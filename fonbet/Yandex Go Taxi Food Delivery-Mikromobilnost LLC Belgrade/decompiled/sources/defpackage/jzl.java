package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class jzl extends lzl {
    public final int a;

    public jzl(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jzl) {
            return this.a == ((jzl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return oyr.j(this.a, "OnScrollStateChanged(newState=", Extension.C_BRAKE);
    }
}
