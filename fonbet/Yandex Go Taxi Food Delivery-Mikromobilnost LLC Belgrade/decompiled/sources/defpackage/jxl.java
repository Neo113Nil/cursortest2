package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class jxl extends nxl {
    public final boolean a;

    public jxl(boolean z) {
        this.a = z;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jxl) {
            return this.a == ((jxl) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return nzs.b("ReloadDocument(retryAfterError=", Extension.C_BRAKE, this.a);
    }

    public jxl() {
        this(false);
    }

    public /* synthetic */ jxl(int i) {
        this(false);
    }
}
