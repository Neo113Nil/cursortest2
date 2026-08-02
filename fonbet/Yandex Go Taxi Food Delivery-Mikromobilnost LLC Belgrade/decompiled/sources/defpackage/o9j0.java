package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;

/* loaded from: classes9.dex */
public final class o9j0 {
    public final z7l0 a;
    public final zzs b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final xr0 i;
    public final PositionInitAction j;
    public final List k;

    public o9j0(z7l0 z7l0Var, zzs zzsVar, String str, boolean z, boolean z2, String str2, String str3, String str4, xr0 xr0Var, PositionInitAction positionInitAction, List list, int i) {
        str = (i & 4) != 0 ? null : str;
        z = (i & 8) != 0 ? false : z;
        z2 = (i & 16) != 0 ? false : z2;
        str2 = (i & 32) != 0 ? null : str2;
        str3 = (i & 64) != 0 ? null : str3;
        str4 = (i & 128) != 0 ? null : str4;
        xr0Var = (i & 512) != 0 ? null : xr0Var;
        positionInitAction = (i & 1024) != 0 ? null : positionInitAction;
        list = (i & 2048) != 0 ? null : list;
        this.a = z7l0Var;
        this.b = zzsVar;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = xr0Var;
        this.j = positionInitAction;
        this.k = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9j0)) {
            return false;
        }
        o9j0 o9j0Var = (o9j0) obj;
        return jl40.l(this.a, o9j0Var.a) && jl40.l(this.b, o9j0Var.b) && jl40.l(this.c, o9j0Var.c) && this.d == o9j0Var.d && this.e == o9j0Var.e && jl40.l(this.f, o9j0Var.f) && jl40.l(this.g, o9j0Var.g) && jl40.l(this.h, o9j0Var.h) && jl40.l(this.i, o9j0Var.i) && this.j == o9j0Var.j && jl40.l(this.k, o9j0Var.k);
    }

    public final int hashCode() {
        int b = nnm.b(this.b, this.a.hashCode() * 31, 31);
        String str = this.c;
        int e = unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        int hashCode = (e + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.h;
        int hashCode3 = (hashCode2 + (str4 == null ? 0 : str4.hashCode())) * 961;
        xr0 xr0Var = this.i;
        int hashCode4 = (hashCode3 + (xr0Var == null ? 0 : xr0Var.hashCode())) * 31;
        PositionInitAction positionInitAction = this.j;
        int hashCode5 = (hashCode4 + (positionInitAction == null ? 0 : positionInitAction.hashCode())) * 31;
        List list = this.k;
        return hashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequestedPointInfo(pointType=");
        sb.append(this.a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", entrance=");
        tse0.y(this.c, ", isSticky=", ", isGeoTap=", sb, this.d);
        unr0.A(", layersLog=", this.f, ", organizationNameUri=", sb, this.e);
        g8e.D(sb, this.g, ", forcedCurrentMode=", this.h, ", additionalData=null, addressCorrection=");
        sb.append(this.i);
        sb.append(", positionInitAction=");
        sb.append(this.j);
        sb.append(", photoCoordinates=");
        return ly3.s(sb, this.k, Extension.C_BRAKE);
    }
}
