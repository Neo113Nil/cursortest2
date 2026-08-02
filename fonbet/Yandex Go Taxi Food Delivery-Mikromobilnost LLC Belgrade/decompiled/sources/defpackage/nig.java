package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class nig {
    public final rr51 a;
    public final String b;

    public nig(rr51 rr51Var, String str) {
        this.a = rr51Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nig)) {
            return false;
        }
        nig nigVar = (nig) obj;
        return jl40.l(this.a, nigVar.a) && jl40.l(this.b, nigVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DashboardDivKitItemEntity(divData=" + this.a + ", itemType=" + this.b + Extension.C_BRAKE;
    }
}
