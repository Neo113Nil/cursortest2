package defpackage;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityTariffSelectorItemPriceInfo$PriceOrigin;

/* loaded from: classes14.dex */
public final class jpw {
    public final CharSequence a;
    public final String b;
    public final CharSequence c;
    public final String d;
    public final IntercityTariffSelectorItemPriceInfo$PriceOrigin e;

    public jpw(CharSequence charSequence, String str, CharSequence charSequence2, String str2, IntercityTariffSelectorItemPriceInfo$PriceOrigin intercityTariffSelectorItemPriceInfo$PriceOrigin) {
        this.a = charSequence;
        this.b = str;
        this.c = charSequence2;
        this.d = str2;
        this.e = intercityTariffSelectorItemPriceInfo$PriceOrigin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpw)) {
            return false;
        }
        jpw jpwVar = (jpw) obj;
        return jl40.l(this.a, jpwVar.a) && jl40.l(this.b, jpwVar.b) && jl40.l(this.c, jpwVar.c) && jl40.l(this.d, jpwVar.d) && this.e == jpwVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int b = smw0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        String str2 = this.d;
        return this.e.hashCode() + ((b + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
