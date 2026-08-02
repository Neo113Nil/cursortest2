package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hob {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final nvo g;

    public hob(String str, String str2, String str3, boolean z, boolean z2, String str4, nvo nvoVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = nvoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hob) {
            hob hobVar = (hob) obj;
            return jl40.l(this.a, hobVar.a) && jl40.l(this.b, hobVar.b) && jl40.l(this.c, hobVar.c) && this.d == hobVar.d && this.e == hobVar.e && this.f.equals(hobVar.f) && this.g == hobVar.g;
        }
        return false;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.g.hashCode() + unr0.b(unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("ChildCompoundOptionItem(id=", this.a, ", title=", this.b, ", subtitle=");
        tse0.y(this.c, ", checked=", ", enabled=", v, this.d);
        unr0.A(", imageTag=", this.f, ", action=", v, this.e);
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
