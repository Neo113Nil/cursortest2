package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hn00 implements in00 {
    public final String a;
    public final Point b;
    public final double c;
    public final fr d;
    public final fr e;
    public final boolean f;
    public final fo00 g;
    public final fo00 h;
    public final fo00 i;

    public hn00(String str, Point point, double d, fr frVar, fr frVar2, boolean z, fo00 fo00Var, fo00 fo00Var2, fo00 fo00Var3) {
        this.a = str;
        this.b = point;
        this.c = d;
        this.d = frVar;
        this.e = frVar2;
        this.f = z;
        this.g = fo00Var;
        this.h = fo00Var2;
        this.i = fo00Var3;
    }

    @Override // defpackage.kn00
    public final double a() {
        return this.c;
    }

    @Override // defpackage.in00
    public final boolean b() {
        return this.i != null;
    }

    @Override // defpackage.kn00
    public final fr c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn00)) {
            return false;
        }
        hn00 hn00Var = (hn00) obj;
        return jl40.l(this.a, hn00Var.a) && jl40.l(this.b, hn00Var.b) && Double.compare(this.c, hn00Var.c) == 0 && jl40.l(this.d, hn00Var.d) && jl40.l(this.e, hn00Var.e) && this.f == hn00Var.f && jl40.l(this.g, hn00Var.g) && jl40.l(this.h, hn00Var.h) && jl40.l(this.i, hn00Var.i);
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
        int e = unr0.e((hashCode + (frVar2 == null ? 0 : frVar2.hashCode())) * 31, 31, this.f);
        fo00 fo00Var = this.g;
        int hashCode2 = (this.h.hashCode() + ((e + (fo00Var == null ? 0 : fo00Var.hashCode())) * 31)) * 31;
        fo00 fo00Var2 = this.i;
        return hashCode2 + (fo00Var2 != null ? fo00Var2.hashCode() : 0);
    }

    public final String toString() {
        return "UniversalPin(id=" + this.a + ", geometry=" + this.b + ", priority=" + this.c + ", action=" + this.d + ", showAction=" + this.e + ", isFavorite=" + this.f + ", dustStyle=" + this.g + ", defaultStyle=" + this.h + ", selectedStyle=" + this.i + Extension.C_BRAKE;
    }
}
