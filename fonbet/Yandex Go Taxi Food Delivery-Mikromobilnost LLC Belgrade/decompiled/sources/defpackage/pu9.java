package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersProgressDiscountDetailsDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pu9 implements tu9 {
    public final ir9 a;
    public final CharSequence b;
    public final CharSequence c;
    public final lna d;
    public final lna e;
    public final int f;
    public final int g;
    public final tn9 h;
    public final kdc i;
    public final ou9 j;
    public final ChargersProgressDiscountDetailsDto k;

    public pu9(ir9 ir9Var, CharSequence charSequence, CharSequence charSequence2, lna lnaVar, lna lnaVar2, int i, int i2, tn9 tn9Var, kdc kdcVar, ou9 ou9Var, ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto) {
        this.a = ir9Var;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = lnaVar;
        this.e = lnaVar2;
        this.f = i;
        this.g = i2;
        this.h = tn9Var;
        this.i = kdcVar;
        this.j = ou9Var;
        this.k = chargersProgressDiscountDetailsDto;
    }

    @Override // defpackage.tu9
    public final as9 a() {
        return this.k;
    }

    @Override // defpackage.tu9
    public final ir9 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pu9)) {
            return false;
        }
        pu9 pu9Var = (pu9) obj;
        return jl40.l(this.a, pu9Var.a) && jl40.l(this.b, pu9Var.b) && jl40.l(this.c, pu9Var.c) && jl40.l(this.d, pu9Var.d) && jl40.l(this.e, pu9Var.e) && this.f == pu9Var.f && this.g == pu9Var.g && jl40.l(this.h, pu9Var.h) && jl40.l(this.i, pu9Var.i) && jl40.l(this.j, pu9Var.j) && jl40.l(this.k, pu9Var.k);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        lna lnaVar = this.d;
        int hashCode = (b + (lnaVar == null ? 0 : lnaVar.hashCode())) * 31;
        lna lnaVar2 = this.e;
        int b2 = oyr.b(this.g, oyr.b(this.f, (hashCode + (lnaVar2 == null ? 0 : lnaVar2.hashCode())) * 31, 31), 31);
        tn9 tn9Var = this.h;
        int hashCode2 = (b2 + (tn9Var == null ? 0 : tn9Var.hashCode())) * 31;
        kdc kdcVar = this.i;
        int hashCode3 = (hashCode2 + (kdcVar == null ? 0 : kdcVar.hashCode())) * 31;
        ou9 ou9Var = this.j;
        int hashCode4 = (hashCode3 + (ou9Var == null ? 0 : ou9Var.hashCode())) * 31;
        ChargersProgressDiscountDetailsDto chargersProgressDiscountDetailsDto = this.k;
        return hashCode4 + (chargersProgressDiscountDetailsDto != null ? chargersProgressDiscountDetailsDto.hashCode() : 0);
    }

    public final String toString() {
        return "ProgressDiscountItem(discount=" + this.a + ", title=" + ((Object) this.b) + ", description=" + ((Object) this.c) + ", leadProgressImageParams=" + this.d + ", trailProgressImageParams=" + this.e + ", stepsCount=" + this.f + ", currentStep=" + this.g + ", attribute=" + this.h + ", backgroundColor=" + this.i + ", attention=" + this.j + ", details=" + this.k + Extension.C_BRAKE;
    }
}
