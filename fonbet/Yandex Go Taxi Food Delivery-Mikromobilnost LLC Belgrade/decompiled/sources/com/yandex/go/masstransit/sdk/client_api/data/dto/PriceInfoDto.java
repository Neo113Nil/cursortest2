package com.yandex.go.masstransit.sdk.client_api.data.dto;

import com.yandex.go.masstransit.sdk.core.dto.CurrencyRulesDto;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/PriceInfoDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/t", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PriceInfoDto {
    public static final t Companion = new t();
    public final String a;
    public final String b;
    public final CurrencyRulesDto c;

    public /* synthetic */ PriceInfoDto(int i, String str, String str2, CurrencyRulesDto currencyRulesDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = currencyRulesDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceInfoDto)) {
            return false;
        }
        PriceInfoDto priceInfoDto = (PriceInfoDto) obj;
        return jl40.l(this.a, priceInfoDto.a) && jl40.l(this.b, priceInfoDto.b) && jl40.l(this.c, priceInfoDto.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CurrencyRulesDto currencyRulesDto = this.c;
        return hashCode2 + (currencyRulesDto != null ? currencyRulesDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PriceInfoDto(price=", this.a, ", discountedPrice=", this.b, ", currencyRules=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public PriceInfoDto() {
        this.a = null;
        this.b = null;
        this.c = null;
    }
}
