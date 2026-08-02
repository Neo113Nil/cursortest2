package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeDecorationDto;", "", "Companion", "$serializer", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoCodeDecorationDto {
    public static final b Companion = new b();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(2)), null};
    public final PromoCodeDecorationIdDto a;
    public final String b;

    public /* synthetic */ PromoCodeDecorationDto(int i, PromoCodeDecorationIdDto promoCodeDecorationIdDto, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = promoCodeDecorationIdDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeDecorationDto)) {
            return false;
        }
        PromoCodeDecorationDto promoCodeDecorationDto = (PromoCodeDecorationDto) obj;
        return this.a == promoCodeDecorationDto.a && jl40.l(this.b, promoCodeDecorationDto.b);
    }

    public final int hashCode() {
        PromoCodeDecorationIdDto promoCodeDecorationIdDto = this.a;
        int hashCode = (promoCodeDecorationIdDto == null ? 0 : promoCodeDecorationIdDto.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "PromoCodeDecorationDto(id=" + this.a + ", imageTag=" + this.b + Extension.C_BRAKE;
    }

    public PromoCodeDecorationDto() {
        this.a = null;
        this.b = null;
    }
}
