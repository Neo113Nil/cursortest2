package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mmo {
    public final String a;
    public final String b;
    public final dv3 c;
    public final dv3 d;

    public mmo(String str, String str2, dv3 dv3Var, dv3 dv3Var2) {
        this.a = str;
        this.b = str2;
        this.c = dv3Var;
        this.d = dv3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmo)) {
            return false;
        }
        mmo mmoVar = (mmo) obj;
        return jl40.l(this.a, mmoVar.a) && jl40.l(this.b, mmoVar.b) && this.c.equals(mmoVar.c) && jl40.l(this.d, mmoVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        dv3 dv3Var = this.d;
        return hashCode2 + (dv3Var != null ? dv3Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ExitBottomSheetEntity(title=", this.a, ", subtitle=", this.b, ", primaryButton=");
        v.append(this.c);
        v.append(", secondaryButton=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
