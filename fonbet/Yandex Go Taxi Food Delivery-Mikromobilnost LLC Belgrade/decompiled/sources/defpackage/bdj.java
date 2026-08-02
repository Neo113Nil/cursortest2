package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bdj {
    public final String a;
    public final String b;
    public final ry6 c;
    public final ry6 d;

    public bdj(String str, String str2, ry6 ry6Var, ry6 ry6Var2) {
        this.a = str;
        this.b = str2;
        this.c = ry6Var;
        this.d = ry6Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdj)) {
            return false;
        }
        bdj bdjVar = (bdj) obj;
        return jl40.l(this.a, bdjVar.a) && jl40.l(this.b, bdjVar.b) && this.c.equals(bdjVar.c) && this.d.equals(bdjVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.a.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
    }

    public final String toString() {
        StringBuilder v = b64.v("Dialog(title=", this.a, ", bodyText=", this.b, ", closeButton=");
        v.append(this.c);
        v.append(", confirmButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
