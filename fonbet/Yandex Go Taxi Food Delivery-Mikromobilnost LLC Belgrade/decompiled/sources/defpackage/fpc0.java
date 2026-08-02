package defpackage;

import com.yandex.plus.core.graphql.type.COMMON_PREDICATE_TYPE;

/* loaded from: classes8.dex */
public final class fpc0 {
    public final COMMON_PREDICATE_TYPE a;
    public final yoc0 b;
    public final zoc0 c;
    public final dpc0 d;
    public final epc0 e;
    public final apc0 f;
    public final bpc0 g;
    public final cpc0 h;

    public fpc0(COMMON_PREDICATE_TYPE common_predicate_type, yoc0 yoc0Var, zoc0 zoc0Var, dpc0 dpc0Var, epc0 epc0Var, apc0 apc0Var, bpc0 bpc0Var, cpc0 cpc0Var) {
        this.a = common_predicate_type;
        this.b = yoc0Var;
        this.c = zoc0Var;
        this.d = dpc0Var;
        this.e = epc0Var;
        this.f = apc0Var;
        this.g = bpc0Var;
        this.h = cpc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpc0)) {
            return false;
        }
        fpc0 fpc0Var = (fpc0) obj;
        return this.a == fpc0Var.a && jl40.l(this.b, fpc0Var.b) && jl40.l(this.c, fpc0Var.c) && jl40.l(this.d, fpc0Var.d) && jl40.l(this.e, fpc0Var.e) && jl40.l(this.f, fpc0Var.f) && jl40.l(this.g, fpc0Var.g) && jl40.l(this.h, fpc0Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        yoc0 yoc0Var = this.b;
        int hashCode2 = (hashCode + (yoc0Var == null ? 0 : yoc0Var.hashCode())) * 31;
        zoc0 zoc0Var = this.c;
        int hashCode3 = (hashCode2 + (zoc0Var == null ? 0 : zoc0Var.hashCode())) * 31;
        dpc0 dpc0Var = this.d;
        int hashCode4 = (hashCode3 + (dpc0Var == null ? 0 : dpc0Var.hashCode())) * 31;
        epc0 epc0Var = this.e;
        int hashCode5 = (hashCode4 + (epc0Var == null ? 0 : epc0Var.hashCode())) * 31;
        apc0 apc0Var = this.f;
        int hashCode6 = (hashCode5 + (apc0Var == null ? 0 : apc0Var.hashCode())) * 31;
        bpc0 bpc0Var = this.g;
        int hashCode7 = (hashCode6 + (bpc0Var == null ? 0 : bpc0Var.hashCode())) * 31;
        cpc0 cpc0Var = this.h;
        return hashCode7 + (cpc0Var != null ? cpc0Var.hashCode() : 0);
    }

    public final String toString() {
        return "PlaquePredicate(type=" + this.a + ", argCheckingPredicate=" + this.b + ", booleanLiteralPredicate=" + this.c + ", notPredicate=" + this.d + ", unifyingPredicate=" + this.e + ", comparisonPredicate=" + this.f + ", containsPredicate=" + this.g + ", inSetPredicate=" + this.h + ')';
    }
}
