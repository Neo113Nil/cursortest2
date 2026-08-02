package defpackage;

import com.yandex.go.promocodes.base.impl.discounts.presentation.entities.list.DiscountsListItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jqj extends fqj {
    public final String a;
    public final String b;

    public jqj(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fqj
    public final DiscountsListItemType a() {
        return DiscountsListItemType.REFERRAL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqj)) {
            return false;
        }
        jqj jqjVar = (jqj) obj;
        return jl40.l(this.a, jqjVar.a) && jl40.l(this.b, jqjVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("DiscountsListItemReferral(title=", this.a, ", imageUrl=", this.b, Extension.C_BRAKE);
    }
}
