package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$NumericInputScreenElementDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/i;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/e", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutScreenElementDto$NumericInputScreenElementDto extends i {
    public static final e Companion = new e();
    public final RequiredPropertyInfoDto a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final Long g;

    public CheckoutScreenElementDto$NumericInputScreenElementDto(int i, RequiredPropertyInfoDto requiredPropertyInfoDto, Integer num, Integer num2, String str, String str2, String str3, Long l) {
        if (32 != (i & 32)) {
            qje.Z(i, 32, CheckoutScreenElementDto$NumericInputScreenElementDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = requiredPropertyInfoDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        this.f = str3;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutScreenElementDto$NumericInputScreenElementDto)) {
            return false;
        }
        CheckoutScreenElementDto$NumericInputScreenElementDto checkoutScreenElementDto$NumericInputScreenElementDto = (CheckoutScreenElementDto$NumericInputScreenElementDto) obj;
        return jl40.l(this.a, checkoutScreenElementDto$NumericInputScreenElementDto.a) && jl40.l(this.b, checkoutScreenElementDto$NumericInputScreenElementDto.b) && jl40.l(this.c, checkoutScreenElementDto$NumericInputScreenElementDto.c) && jl40.l(this.d, checkoutScreenElementDto$NumericInputScreenElementDto.d) && jl40.l(this.e, checkoutScreenElementDto$NumericInputScreenElementDto.e) && jl40.l(this.f, checkoutScreenElementDto$NumericInputScreenElementDto.f) && jl40.l(this.g, checkoutScreenElementDto$NumericInputScreenElementDto.g);
    }

    public final int hashCode() {
        RequiredPropertyInfoDto requiredPropertyInfoDto = this.a;
        int hashCode = (requiredPropertyInfoDto == null ? 0 : requiredPropertyInfoDto.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int b = unr0.b((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
        Long l = this.g;
        return b + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NumericInputScreenElementDto(requiredPropertyInfo=");
        sb.append(this.a);
        sb.append(", minValue=");
        sb.append(this.b);
        sb.append(", maxValue=");
        tse0.w(this.c, ", title=", this.d, ", subtitle=", sb);
        g8e.D(sb, this.e, ", property=", this.f, ", value=");
        sb.append(this.g);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
