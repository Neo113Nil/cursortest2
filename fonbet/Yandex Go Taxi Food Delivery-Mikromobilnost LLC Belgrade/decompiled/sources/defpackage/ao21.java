package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ao21 implements eo21 {
    public final String a;
    public final boolean b;

    public ao21(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.eo21
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao21)) {
            return false;
        }
        ao21 ao21Var = (ao21) obj;
        return jl40.l(this.a, ao21Var.a) && this.b == ao21Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return xvz.k("Bool(propertyName=", this.a, ", value=", this.b, Extension.C_BRAKE);
    }
}
