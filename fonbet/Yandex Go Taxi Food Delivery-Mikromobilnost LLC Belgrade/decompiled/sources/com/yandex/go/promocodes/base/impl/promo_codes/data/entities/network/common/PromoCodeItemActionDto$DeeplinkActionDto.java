package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeItemActionDto$DeeplinkActionDto", "Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/i;", "Companion", "$serializer", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/e", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoCodeItemActionDto$DeeplinkActionDto extends i {
    public static final e Companion = new e();
    public final String a;
    public final String b;
    public final String c;

    public PromoCodeItemActionDto$DeeplinkActionDto(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeItemActionDto$DeeplinkActionDto)) {
            return false;
        }
        PromoCodeItemActionDto$DeeplinkActionDto promoCodeItemActionDto$DeeplinkActionDto = (PromoCodeItemActionDto$DeeplinkActionDto) obj;
        return jl40.l(this.a, promoCodeItemActionDto$DeeplinkActionDto.a) && jl40.l(this.b, promoCodeItemActionDto$DeeplinkActionDto.b) && jl40.l(this.c, promoCodeItemActionDto$DeeplinkActionDto.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("DeeplinkActionDto(deeplink=", this.a, ", title=", this.b, ", subtitle="), this.c, Extension.C_BRAKE);
    }

    public PromoCodeItemActionDto$DeeplinkActionDto() {
        this.a = "";
        this.b = "";
        this.c = "";
    }
}
