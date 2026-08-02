package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class eed0 {
    public final String a;
    public final String b;
    public final udd0 c;

    public eed0(String str, String str2, udd0 udd0Var) {
        this.a = str;
        this.b = str2;
        this.c = udd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eed0)) {
            return false;
        }
        eed0 eed0Var = (eed0) obj;
        return jl40.l(this.a, eed0Var.a) && jl40.l(this.b, eed0Var.b) && this.c.equals(eed0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PlusPayParams(serviceName=", this.a, ", serviceChannel=", this.b, ", offerParams=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
