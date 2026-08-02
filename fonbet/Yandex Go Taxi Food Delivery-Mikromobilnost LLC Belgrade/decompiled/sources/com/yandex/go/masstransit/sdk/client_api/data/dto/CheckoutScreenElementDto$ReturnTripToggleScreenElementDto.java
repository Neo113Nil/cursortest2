package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.nzs;
import defpackage.qje;
import defpackage.tse0;
import defpackage.unr0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@jxi
@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$ReturnTripToggleScreenElementDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/i;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/f", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutScreenElementDto$ReturnTripToggleScreenElementDto extends i {
    public static final f Companion = new f();
    public final RequiredPropertyInfoDto a;
    public final String b;
    public final String c;
    public final boolean d;
    public final Boolean e;

    public CheckoutScreenElementDto$ReturnTripToggleScreenElementDto(int i, RequiredPropertyInfoDto requiredPropertyInfoDto, String str, String str2, boolean z, Boolean bool) {
        if (12 != (i & 12)) {
            qje.Z(i, 12, CheckoutScreenElementDto$ReturnTripToggleScreenElementDto$$serializer.INSTANCE.getDescriptor());
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
            this.b = str;
        }
        this.c = str2;
        this.d = z;
        if ((i & 16) == 0) {
            this.e = Boolean.FALSE;
        } else {
            this.e = bool;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutScreenElementDto$ReturnTripToggleScreenElementDto)) {
            return false;
        }
        CheckoutScreenElementDto$ReturnTripToggleScreenElementDto checkoutScreenElementDto$ReturnTripToggleScreenElementDto = (CheckoutScreenElementDto$ReturnTripToggleScreenElementDto) obj;
        return jl40.l(this.a, checkoutScreenElementDto$ReturnTripToggleScreenElementDto.a) && jl40.l(this.b, checkoutScreenElementDto$ReturnTripToggleScreenElementDto.b) && jl40.l(this.c, checkoutScreenElementDto$ReturnTripToggleScreenElementDto.c) && this.d == checkoutScreenElementDto$ReturnTripToggleScreenElementDto.d && jl40.l(this.e, checkoutScreenElementDto$ReturnTripToggleScreenElementDto.e);
    }

    public final int hashCode() {
        RequiredPropertyInfoDto requiredPropertyInfoDto = this.a;
        int hashCode = (requiredPropertyInfoDto == null ? 0 : requiredPropertyInfoDto.hashCode()) * 31;
        String str = this.b;
        int e = unr0.e(unr0.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        Boolean bool = this.e;
        return e + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReturnTripToggleScreenElementDto(requiredPropertyInfo=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", property=");
        tse0.y(this.c, ", value=", ", isReadonly=", sb, this.d);
        return nzs.d(sb, this.e, Extension.C_BRAKE);
    }
}
