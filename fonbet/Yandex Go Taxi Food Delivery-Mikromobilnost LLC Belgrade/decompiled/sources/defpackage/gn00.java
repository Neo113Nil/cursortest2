package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gn00 implements in00 {
    public final String a;
    public final Point b;
    public final double c;
    public final fr d;
    public final fr e;
    public final fo00 f;
    public final fo00 g;
    public final zwy0 h;

    public gn00(String str, Point point, double d, fr frVar, fr frVar2, fo00 fo00Var, fo00 fo00Var2, zwy0 zwy0Var) {
        this.a = str;
        this.b = point;
        this.c = d;
        this.d = frVar;
        this.e = frVar2;
        this.f = fo00Var;
        this.g = fo00Var2;
        this.h = zwy0Var;
    }

    @Override // defpackage.kn00
    public final double a() {
        return this.c;
    }

    @Override // defpackage.kn00
    public final fr c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gn00)) {
            return false;
        }
        gn00 gn00Var = (gn00) obj;
        return jl40.l(this.a, gn00Var.a) && jl40.l(this.b, gn00Var.b) && Double.compare(this.c, gn00Var.c) == 0 && jl40.l(this.d, gn00Var.d) && jl40.l(this.e, gn00Var.e) && jl40.l(this.f, gn00Var.f) && jl40.l(this.g, gn00Var.g) && jl40.l(this.h, gn00Var.h);
    }

    @Override // defpackage.kn00
    public final fr getAction() {
        return this.d;
    }

    @Override // defpackage.kn00
    public final Point getGeometry() {
        return this.b;
    }

    @Override // defpackage.kn00
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int a = unr0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        fr frVar = this.d;
        int hashCode = (a + (frVar == null ? 0 : frVar.hashCode())) * 31;
        fr frVar2 = this.e;
        int hashCode2 = (hashCode + (frVar2 == null ? 0 : frVar2.hashCode())) * 31;
        fo00 fo00Var = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (fo00Var == null ? 0 : fo00Var.hashCode())) * 31)) * 31;
        zwy0 zwy0Var = this.h;
        return hashCode3 + (zwy0Var != null ? zwy0Var.hashCode() : 0);
    }

    public final String toString() {
        return "OrganizationPreviewPin(id=" + this.a + ", geometry=" + this.b + ", priority=" + this.c + ", action=" + this.d + ", showAction=" + this.e + ", iconLabelSelected=" + this.f + ", defaultStyle=" + this.g + ", pinAssetThemedBitmap=" + this.h + Extension.C_BRAKE;
    }
}
