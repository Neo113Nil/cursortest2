package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class odg0 implements qdg0 {
    public final String a;
    public final String b;
    public final sls c;

    public odg0(String str, String str2, sls slsVar) {
        this.a = str;
        this.b = str2;
        this.c = slsVar;
    }

    @Override // defpackage.qdg0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odg0)) {
            return false;
        }
        odg0 odg0Var = (odg0) obj;
        return jl40.l(this.a, odg0Var.a) && jl40.l(this.b, odg0Var.b) && this.c.equals(odg0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return ly3.r(b64.v("Handled(qrCategory=", this.a, ", deeplink=", this.b, ", navigationCallback="), this.c, Extension.C_BRAKE);
    }
}
