package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class e920 {
    public final String a;
    public final boolean b;

    public e920(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e920)) {
            return false;
        }
        e920 e920Var = (e920) obj;
        return this.a.equals(e920Var.a) && this.b == e920Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("MiniAppMetadata(url=", this.a, ", unsafeMode=", this.b, Extension.C_BRAKE);
    }
}
