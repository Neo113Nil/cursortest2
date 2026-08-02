package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class mf51 {
    public final String a;
    public final String b;
    public final String c;
    public final df51 d;

    public mf51(String str, String str2, String str3, df51 df51Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = df51Var;
    }

    public final df51 a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mf51)) {
            return false;
        }
        mf51 mf51Var = (mf51) obj;
        return jl40.l(this.a, mf51Var.a) && jl40.l(this.b, mf51Var.b) && this.c.equals(mf51Var.c) && this.d.equals(mf51Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder v = b64.v("YBCompactHorizontalWidgetData(title=", this.a, ", subtitle=", this.b, ", contentDescription=");
        v.append(this.c);
        v.append(", badgeState=");
        v.append(this.d);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
