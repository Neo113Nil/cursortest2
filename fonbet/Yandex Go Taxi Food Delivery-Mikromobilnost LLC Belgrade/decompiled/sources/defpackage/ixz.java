package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class ixz implements jxz {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final gxz f;

    public ixz(String str, String str2, String str3, String str4, boolean z, gxz gxzVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = gxzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixz)) {
            return false;
        }
        ixz ixzVar = (ixz) obj;
        return jl40.l(this.a, ixzVar.a) && jl40.l(this.b, ixzVar.b) && jl40.l(this.c, ixzVar.c) && jl40.l(this.d, ixzVar.d) && this.e == ixzVar.e && jl40.l(this.f, ixzVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.e(unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("LoyaltyProgramUiModel(programName=", this.a, ", header=", this.b, ", icon=");
        g8e.D(v, this.c, ", text=", this.d, ", selected=");
        v.append(this.e);
        v.append(", selectorState=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
