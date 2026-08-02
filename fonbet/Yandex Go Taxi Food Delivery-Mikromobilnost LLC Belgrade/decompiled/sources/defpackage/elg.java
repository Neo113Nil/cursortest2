package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class elg {
    public final rr51 a;
    public final String b;

    public elg(rr51 rr51Var, String str) {
        this.a = rr51Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elg)) {
            return false;
        }
        elg elgVar = (elg) obj;
        return jl40.l(this.a, elgVar.a) && jl40.l(this.b, elgVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DashboardScreenItem(divData=" + this.a + ", itemType=" + this.b + Extension.C_BRAKE;
    }
}
