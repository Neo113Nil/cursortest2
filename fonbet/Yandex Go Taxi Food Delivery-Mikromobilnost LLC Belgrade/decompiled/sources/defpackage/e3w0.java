package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class e3w0 {
    public static final e3w0 c = new e3w0(null, false);
    public final String a;
    public final boolean b;

    public e3w0(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e3w0)) {
            return false;
        }
        e3w0 e3w0Var = (e3w0) obj;
        return jl40.l(this.a, e3w0Var.a) && this.b == e3w0Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("ElementState(text=", this.a, ", isVisible=", this.b, Extension.C_BRAKE);
    }
}
