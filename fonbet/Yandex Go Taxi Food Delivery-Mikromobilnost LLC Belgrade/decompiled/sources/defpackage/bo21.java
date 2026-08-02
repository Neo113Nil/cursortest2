package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class bo21 implements eo21 {
    public final String a;
    public final int b;

    public bo21(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.eo21
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo21)) {
            return false;
        }
        bo21 bo21Var = (bo21) obj;
        return jl40.l(this.a, bo21Var.a) && this.b == bo21Var.b;
    }

    public final int hashCode() {
        String str = this.a;
        return Integer.hashCode(this.b) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "Integer(propertyName=", this.a, ", value=", Extension.C_BRAKE);
    }
}
