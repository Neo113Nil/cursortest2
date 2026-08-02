package defpackage;

import com.yandex.go.chargers.discounts.data.models.ChargersPromoDetailsDto;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nu9 implements tu9 {
    public final ir9 a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final ChargersPromoDetailsDto f;

    public nu9(ir9 ir9Var, String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, ChargersPromoDetailsDto chargersPromoDetailsDto) {
        this.a = ir9Var;
        this.b = str;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = charSequence3;
        this.f = chargersPromoDetailsDto;
    }

    @Override // defpackage.tu9
    public final as9 a() {
        return this.f;
    }

    @Override // defpackage.tu9
    public final ir9 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nu9)) {
            return false;
        }
        nu9 nu9Var = (nu9) obj;
        return jl40.l(this.a, nu9Var.a) && jl40.l(this.b, nu9Var.b) && jl40.l(this.c, nu9Var.c) && jl40.l(this.d, nu9Var.d) && jl40.l(this.e, nu9Var.e) && jl40.l(this.f, nu9Var.f);
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(smw0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        ChargersPromoDetailsDto chargersPromoDetailsDto = this.f;
        return b + (chargersPromoDetailsDto == null ? 0 : chargersPromoDetailsDto.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerPromoItem(discount=");
        sb.append(this.a);
        sb.append(", imageTag=");
        sb.append(this.b);
        sb.append(", body=");
        vfc.A(sb, this.c, ", description=", this.d, ", rightBody=");
        sb.append((Object) this.e);
        sb.append(", details=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
