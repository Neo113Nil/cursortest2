package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bwe {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public bwe(String str, String str2, String str3, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwe)) {
            return false;
        }
        bwe bweVar = (bwe) obj;
        return jl40.l(this.a, bweVar.a) && jl40.l(this.b, bweVar.b) && jl40.l(this.c, bweVar.c) && this.d == bweVar.d;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return nnm.i(this.c, ", isRequired=", Extension.C_BRAKE, b64.v("CostCenter(id=", this.a, ", title=", this.b, ", value="), this.d);
    }
}
