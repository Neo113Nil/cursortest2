package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class el8 {
    public final boolean a;
    public final String b;

    public el8(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof el8)) {
            return false;
        }
        el8 el8Var = (el8) obj;
        return this.a == el8Var.a && jl40.l(this.b, el8Var.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return xvz.m("Family(isOwner=", this.a, ", iconTag=", this.b, Extension.C_BRAKE);
    }

    public el8() {
        this(false, null);
    }
}
