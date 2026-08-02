package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class nk31 implements hz30 {
    public final String a;
    public final String b;
    public final int c;
    public final Point d;
    public final int e;

    public nk31(String str, String str2, int i, Point point, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = point;
        this.e = i2;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nk31)) {
            return false;
        }
        nk31 nk31Var = (nk31) obj;
        return jl40.l(this.a, nk31Var.a) && jl40.l(this.b, nk31Var.b) && this.c == nk31Var.c && jl40.l(this.d, nk31Var.d) && this.e == nk31Var.e;
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return 0.0d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + ((this.d.hashCode() + oyr.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("ViaPointSection(address=", this.a, ", arrivalTime=", this.b, ", index=");
        v.append(this.c);
        v.append(", point=");
        v.append(this.d);
        v.append(", sectionId=");
        return oyr.m(this.e, Extension.C_BRAKE, v);
    }
}
