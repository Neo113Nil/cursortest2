package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.common;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import defpackage.v8f0;
import defpackage.vfc;
import defpackage.xlf0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/PromoCodeActionDto;", "", "Companion", "$serializer", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/common/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class PromoCodeActionDto {
    public static final a Companion = new a();
    public static final i3y[] g;
    public final PromoCodeActionTypeDto a;
    public final String b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new i3y[]{kotlin.a.b(lazyThreadSafetyMode, new v8f0(26)), null, kotlin.a.b(lazyThreadSafetyMode, new v8f0(27)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(28)), kotlin.a.b(lazyThreadSafetyMode, new v8f0(29)), kotlin.a.b(lazyThreadSafetyMode, new xlf0(0))};
    }

    public /* synthetic */ PromoCodeActionDto(int i, PromoCodeActionTypeDto promoCodeActionTypeDto, String str, List list, List list2, List list3, List list4) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = promoCodeActionTypeDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        int i2 = i & 4;
        EmptyList emptyList = EmptyList.a;
        if (i2 == 0) {
            this.c = emptyList;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = emptyList;
        } else {
            this.d = list2;
        }
        if ((i & 16) == 0) {
            this.e = emptyList;
        } else {
            this.e = list3;
        }
        if ((i & 32) == 0) {
            this.f = emptyList;
        } else {
            this.f = list4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeActionDto)) {
            return false;
        }
        PromoCodeActionDto promoCodeActionDto = (PromoCodeActionDto) obj;
        return this.a == promoCodeActionDto.a && jl40.l(this.b, promoCodeActionDto.b) && jl40.l(this.c, promoCodeActionDto.c) && jl40.l(this.d, promoCodeActionDto.d) && jl40.l(this.e, promoCodeActionDto.e) && jl40.l(this.f, promoCodeActionDto.f);
    }

    public final int hashCode() {
        PromoCodeActionTypeDto promoCodeActionTypeDto = this.a;
        int hashCode = (promoCodeActionTypeDto == null ? 0 : promoCodeActionTypeDto.hashCode()) * 31;
        String str = this.b;
        return this.f.hashCode() + unr0.c(unr0.c(unr0.c((hashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromoCodeActionDto(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", descriptions=");
        nnm.w(sb, this.c, ", details=", this.d, ", decorations=");
        return vfc.p(sb, this.e, ", actions=", this.f, Extension.C_BRAKE);
    }

    public PromoCodeActionDto() {
        this.a = null;
        this.b = null;
        EmptyList emptyList = EmptyList.a;
        this.c = emptyList;
        this.d = emptyList;
        this.e = emptyList;
        this.f = emptyList;
    }
}
