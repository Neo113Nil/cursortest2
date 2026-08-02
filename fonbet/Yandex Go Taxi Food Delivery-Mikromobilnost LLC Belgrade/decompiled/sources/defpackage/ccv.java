package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class ccv implements dcv {
    public final int a;

    public ccv(int i) {
        this.a = i;
        v4b1.f(i);
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ccv) && this.a == ((ccv) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "ImageResource(resId=", Extension.C_BRAKE);
    }
}
