package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bl21 {
    public final String a;
    public final boolean b;

    public /* synthetic */ bl21(String str, int i) {
        this((i & 1) != 0 ? "" : str, false);
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
        if (!(obj instanceof bl21)) {
            return false;
        }
        bl21 bl21Var = (bl21) obj;
        return jl40.l(this.a, bl21Var.a) && this.b == bl21Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("UserComment(text=", this.a, ", isValidated=", this.b, Extension.C_BRAKE);
    }

    public bl21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public bl21() {
        this((String) null, 3);
    }
}
