package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class i2r0 implements k2r0 {
    public final rr51 a;
    public final String b;

    public i2r0(rr51 rr51Var, String str) {
        this.a = rr51Var;
        this.b = str;
    }

    @Override // defpackage.k2r0
    public final String a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2r0)) {
            return false;
        }
        i2r0 i2r0Var = (i2r0) obj;
        return this.a.equals(i2r0Var.a) && jl40.l(this.b, i2r0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DivKit(divData=" + this.a + ", closeAction=" + this.b + Extension.C_BRAKE;
    }
}
