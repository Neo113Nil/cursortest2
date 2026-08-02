package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class mm {
    public final boolean a;
    public final String b;
    public final String c;

    public mm(boolean z, String str, String str2) {
        this.a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        return this.a == mmVar.a && jl40.l(this.b, mmVar.b) && jl40.l(this.c, mmVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(ly3.v("State(isAuthorized=", ", name=", this.b, ", contacts=", this.a), this.c, Extension.C_BRAKE);
    }
}
