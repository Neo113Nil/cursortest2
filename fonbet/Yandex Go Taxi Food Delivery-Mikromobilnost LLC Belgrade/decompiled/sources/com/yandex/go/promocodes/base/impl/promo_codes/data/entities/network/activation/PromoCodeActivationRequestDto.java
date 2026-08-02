package com.yandex.go.promocodes.base.impl.promo_codes.data.entities.network.activation;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.rfa0;
import defpackage.unr0;
import defpackage.x4e;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/activation/PromoCodeActivationRequestDto;", "", "Companion", "$serializer", "com/yandex/go/promocodes/base/impl/promo_codes/data/entities/network/activation/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PromoCodeActivationRequestDto {
    public static final a Companion = new a();
    public final String a;
    public final String b;
    public final String c;
    public final rfa0 d;
    public final boolean e;

    public /* synthetic */ PromoCodeActivationRequestDto(int i, String str, String str2, String str3, rfa0 rfa0Var, boolean z) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, PromoCodeActivationRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rfa0Var;
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromoCodeActivationRequestDto)) {
            return false;
        }
        PromoCodeActivationRequestDto promoCodeActivationRequestDto = (PromoCodeActivationRequestDto) obj;
        return jl40.l(this.a, promoCodeActivationRequestDto.a) && jl40.l(this.b, promoCodeActivationRequestDto.b) && jl40.l(this.c, promoCodeActivationRequestDto.c) && jl40.l(this.d, promoCodeActivationRequestDto.d) && this.e == promoCodeActivationRequestDto.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder v = b64.v("PromoCodeActivationRequestDto(id=", this.a, ", zoneName=", this.b, ", promoCode=");
        v.append(this.c);
        v.append(", paymentParam=");
        v.append(this.d);
        v.append(", formatCurrency=");
        return x4e.i(v, this.e, Extension.C_BRAKE);
    }

    public PromoCodeActivationRequestDto(String str, String str2, String str3, rfa0 rfa0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = rfa0Var;
        this.e = true;
    }
}
