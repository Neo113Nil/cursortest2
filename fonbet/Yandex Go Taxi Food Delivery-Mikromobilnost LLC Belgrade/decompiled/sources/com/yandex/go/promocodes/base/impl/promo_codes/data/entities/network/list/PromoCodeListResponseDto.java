package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.list;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.pmf0;
import defpackage.xvz;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/PromoCodeListResponseDto;", "", "Companion", "$serializer", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/list/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PromoCodeListResponseDto {
    public static final b Companion = new b();
    public static final i3y[] c;
    public final List a;
    public final List b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        c = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new pmf0(1)), kotlin.a.b(lazyThreadSafetyMode, new pmf0(2))};
    }

    public /* synthetic */ PromoCodeListResponseDto(List list, List list2, int i) {
        int i2 = i & 1;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.a = emptyList;
        } else {
            this.a = list;
        }
        if ((i & 2) == 0) {
            this.b = emptyList;
        } else {
            this.b = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeListResponseDto)) {
            return false;
        }
        PromoCodeListResponseDto promoCodeListResponseDto = (PromoCodeListResponseDto) obj;
        return jl40.l(this.a, promoCodeListResponseDto.a) && jl40.l(this.b, promoCodeListResponseDto.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.l("PromoCodeListResponseDto(promoCodes=", this.a, ", sections=", this.b, Extension.C_BRAKE);
    }

    public PromoCodeListResponseDto() {
        EmptyList emptyList = EmptyList.a;
        this.a = emptyList;
        this.b = emptyList;
    }
}
