package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h31 implements i31 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final qb90 i;
    public final String j;

    public h31(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, qb90 qb90Var, String str9) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = qb90Var;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h31)) {
            return false;
        }
        h31 h31Var = (h31) obj;
        return this.a.equals(h31Var.a) && this.b.equals(h31Var.b) && jl40.l(this.c, h31Var.c) && this.d.equals(h31Var.d) && jl40.l(this.e, h31Var.e) && jl40.l(this.f, h31Var.f) && this.g.equals(h31Var.g) && jl40.l(this.h, h31Var.h) && jl40.l(this.i, h31Var.i) && this.j.equals(h31Var.j);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int b2 = unr0.b(unr0.b(unr0.b((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        qb90 qb90Var = this.i;
        return this.j.hashCode() + ((b2 + (qb90Var != null ? qb90Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("RecognitionSuccess(title=", this.a, ", retakeButtonTitle=", this.b, ", doneButtonTitle=");
        g8e.D(v, this.c, ", aiLabel=", this.d, ", aiIconUrl=");
        g8e.D(v, this.e, ", addressTitle=", this.f, ", addressSubtitle=");
        g8e.D(v, this.g, ", porchButtonTitle=", this.h, ", panoramaButtonState=");
        v.append(this.i);
        v.append(", panoramaButtonContentDescription=");
        v.append(this.j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
