package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class b6j extends f6j {
    public final CharSequence a;
    public final CharSequence b;
    public final String c;
    public final x5j d;
    public final mb4 e;
    public final a6j f;
    public final boolean g;

    public b6j(CharSequence charSequence, CharSequence charSequence2, String str, x5j x5jVar, mb4 mb4Var, a6j a6jVar, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = str;
        this.d = x5jVar;
        this.e = mb4Var;
        this.f = a6jVar;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6j)) {
            return false;
        }
        b6j b6jVar = (b6j) obj;
        return jl40.l(this.a, b6jVar.a) && jl40.l(this.b, b6jVar.b) && this.c.equals(b6jVar.c) && jl40.l(this.d, b6jVar.d) && jl40.l(this.e, b6jVar.e) && jl40.l(this.f, b6jVar.f) && this.g == b6jVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + unr0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Driver(title=", ", subtitle=", ", driverDescription=");
        r.append(this.c);
        r.append(", carIconState=");
        r.append(this.d);
        r.append(", avatarState=");
        r.append(this.e);
        r.append(", carPlateState=");
        r.append(this.f);
        r.append(", playDriverFoundAnimation=");
        return x4e.i(r, this.g, Extension.C_BRAKE);
    }
}
