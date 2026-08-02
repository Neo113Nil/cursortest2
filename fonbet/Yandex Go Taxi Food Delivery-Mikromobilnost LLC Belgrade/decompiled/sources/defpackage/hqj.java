package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.entities.list.DiscountsListItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hqj extends fqj {
    public final String a;
    public final String b;
    public final String c;
    public final CharSequence d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final boolean h;

    public hqj(String str, String str2, String str3, CharSequence charSequence, boolean z, String str4, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = charSequence;
        this.e = z;
        this.f = str4;
        this.g = z2;
        this.h = z3;
    }

    @Override // defpackage.fqj
    public final DiscountsListItemType a() {
        return DiscountsListItemType.PROMO_CODE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hqj)) {
            return false;
        }
        hqj hqjVar = (hqj) obj;
        return jl40.l(this.a, hqjVar.a) && jl40.l(this.b, hqjVar.b) && jl40.l(this.c, hqjVar.c) && jl40.l(this.d, hqjVar.d) && this.e == hqjVar.e && jl40.l(this.f, hqjVar.f) && this.g == hqjVar.g && this.h == hqjVar.h;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        CharSequence charSequence = this.d;
        int e = unr0.e((b + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.h) + unr0.e((e + (str != null ? str.hashCode() : 0)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder v = b64.v("DiscountsListItemPromoCode(value=", this.a, ", title=", this.b, ", subtitle=");
        v.append(this.c);
        v.append(", additionalDiscountInfo=");
        v.append((Object) this.d);
        v.append(", isSelected=");
        unr0.A(", iconUrl=", this.f, ", hasError=", v, this.e);
        return smw0.k(", editModeEnabled=", Extension.C_BRAKE, v, this.g, this.h);
    }
}
