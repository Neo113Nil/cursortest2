package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class ovk0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final fvk0 e;

    public ovk0(String str, String str2, String str3, String str4, fvk0 fvk0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = fvk0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovk0)) {
            return false;
        }
        ovk0 ovk0Var = (ovk0) obj;
        return jl40.l(this.a, ovk0Var.a) && jl40.l(this.b, ovk0Var.b) && jl40.l(this.c, ovk0Var.c) && this.d.equals(ovk0Var.d) && this.e.equals(ovk0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + unr0.b((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("Button(text=", this.a, ", textColor=", this.b, ", color=");
        g8e.D(v, this.c, ", analyticsEvent=", this.d, ", action=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
