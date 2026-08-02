package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class cy20 {
    public final String a;
    public final String b;
    public final w4v c;
    public final w4v d;

    public cy20(String str, String str2, mvi0 mvi0Var, mvi0 mvi0Var2) {
        this.a = str;
        this.b = str2;
        this.c = mvi0Var;
        this.d = mvi0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy20)) {
            return false;
        }
        cy20 cy20Var = (cy20) obj;
        return jl40.l(this.a, cy20Var.a) && jl40.l(this.b, cy20Var.b) && jl40.l(this.c, cy20Var.c) && jl40.l(this.d, cy20Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        w4v w4vVar = this.c;
        int hashCode3 = (hashCode2 + (w4vVar == null ? 0 : w4vVar.hashCode())) * 31;
        w4v w4vVar2 = this.d;
        return hashCode3 + (w4vVar2 != null ? w4vVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ModalContentItem(title=", this.a, ", subtitle=", this.b, ", leadIcon=");
        v.append(this.c);
        v.append(", trailIcon=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
