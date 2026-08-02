package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class j69 {
    public final String a;
    public final String b;
    public final float c;
    public final boolean d;
    public final String e;
    public final boolean f;

    public j69(String str, String str2, float f, boolean z, String str3, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = f;
        this.d = z;
        this.e = str3;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j69)) {
            return false;
        }
        j69 j69Var = (j69) obj;
        return jl40.l(this.a, j69Var.a) && jl40.l(this.b, j69Var.b) && Float.compare(this.c, j69Var.c) == 0 && this.d == j69Var.d && jl40.l(this.e, j69Var.e) && this.f == j69Var.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int e = unr0.e(g8e.c(this.c, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.d);
        String str2 = this.e;
        return Boolean.hashCode(this.f) + ((e + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("CellVisibility(tariffClass=", this.a, ", verticalId=", this.b, ", visibility=");
        v.append(this.c);
        v.append(", isSelected=");
        v.append(this.d);
        v.append(", modifier=");
        return nnm.i(this.e, ", isAvailable=", Extension.C_BRAKE, v, this.f);
    }
}
