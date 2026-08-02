package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class fto {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public fto(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public static fto a(fto ftoVar, boolean z, boolean z2, int i) {
        String str = ftoVar.a;
        String str2 = ftoVar.b;
        String str3 = ftoVar.c;
        boolean z3 = ftoVar.d;
        if ((i & 16) != 0) {
            z = ftoVar.e;
        }
        boolean z4 = z;
        if ((i & 32) != 0) {
            z2 = ftoVar.f;
        }
        return new fto(str, str2, str3, z3, z4, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fto)) {
            return false;
        }
        fto ftoVar = (fto) obj;
        return this.a.equals(ftoVar.a) && this.b.equals(ftoVar.b) && jl40.l(this.c, ftoVar.c) && this.d == ftoVar.d && this.e == ftoVar.e && this.f == ftoVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + unr0.e(unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder v = b64.v("ExplorerButtonState(title=", this.a, ", subtitle=", this.b, ", iconUrl=");
        tse0.y(this.c, ", hasBackgroundLocationPermission=", ", isToggleEnabled=", v, this.d);
        return smw0.k(", areNewHexesAvailable=", Extension.C_BRAKE, v, this.e, this.f);
    }
}
