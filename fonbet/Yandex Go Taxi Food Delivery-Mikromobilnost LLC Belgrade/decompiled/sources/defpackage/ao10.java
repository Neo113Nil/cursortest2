package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ao10 {
    public final boolean a;
    public final kao b;
    public final stz0 c;
    public final rr51 d;
    public final rr51 e;
    public final eal f;
    public final List g;
    public final z1x0 h;

    public ao10(boolean z, kao kaoVar, stz0 stz0Var, rr51 rr51Var, rr51 rr51Var2, eal ealVar, List list, z1x0 z1x0Var) {
        this.a = z;
        this.b = kaoVar;
        this.c = stz0Var;
        this.d = rr51Var;
        this.e = rr51Var2;
        this.f = ealVar;
        this.g = list;
        this.h = z1x0Var;
    }

    public final rr51 a() {
        return this.e;
    }

    public final List b() {
        return this.g;
    }

    public final eal c() {
        return this.f;
    }

    public final kao d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao10)) {
            return false;
        }
        ao10 ao10Var = (ao10) obj;
        return this.a == ao10Var.a && jl40.l(this.b, ao10Var.b) && this.c.equals(ao10Var.c) && jl40.l(this.d, ao10Var.d) && jl40.l(this.e, ao10Var.e) && jl40.l(this.f, ao10Var.f) && this.g.equals(ao10Var.g) && this.h.equals(ao10Var.h);
    }

    public final z1x0 f() {
        return this.h;
    }

    public final stz0 g() {
        return this.c;
    }

    public final rr51 h() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        kao kaoVar = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (kaoVar == null ? 0 : kaoVar.hashCode())) * 31)) * 31;
        rr51 rr51Var = this.d;
        int hashCode3 = (hashCode2 + (rr51Var == null ? 0 : rr51Var.hashCode())) * 31;
        rr51 rr51Var2 = this.e;
        int hashCode4 = (hashCode3 + (rr51Var2 == null ? 0 : rr51Var2.hashCode())) * 31;
        eal ealVar = this.f;
        return this.h.hashCode() + unr0.c((hashCode4 + (ealVar != null ? ealVar.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        return "MenuViewState(showProgress=" + this.a + ", errorState=" + this.b + ", toolbar=" + this.c + ", toolbarDivData=" + this.d + ", divData=" + this.e + ", divSkeleton=" + this.f + ", divLocalVariables=" + this.g + ", statusBarColor=" + this.h + Extension.C_BRAKE;
    }
}
