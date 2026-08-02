package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.g8e;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qlb;
import defpackage.unr0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$StopSelectorScreenElementDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/i;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/g", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutScreenElementDto$StopSelectorScreenElementDto extends i {
    public static final g Companion = new g();
    public static final i3y[] i = {null, null, null, null, null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(9))};
    public final RequiredPropertyInfoDto a;
    public final String b;
    public final String c;
    public final String d;
    public final Boolean e;
    public final String f;
    public final StopDto g;
    public final List h;

    public CheckoutScreenElementDto$StopSelectorScreenElementDto(int i2, RequiredPropertyInfoDto requiredPropertyInfoDto, String str, String str2, String str3, Boolean bool, String str4, StopDto stopDto, List list) {
        if (160 != (i2 & 160)) {
            qje.Z(i2, 160, CheckoutScreenElementDto$StopSelectorScreenElementDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i2 & 1) == 0) {
            this.a = null;
        } else {
            this.a = requiredPropertyInfoDto;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = bool;
        }
        this.f = str4;
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = stopDto;
        }
        this.h = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutScreenElementDto$StopSelectorScreenElementDto)) {
            return false;
        }
        CheckoutScreenElementDto$StopSelectorScreenElementDto checkoutScreenElementDto$StopSelectorScreenElementDto = (CheckoutScreenElementDto$StopSelectorScreenElementDto) obj;
        return jl40.l(this.a, checkoutScreenElementDto$StopSelectorScreenElementDto.a) && jl40.l(this.b, checkoutScreenElementDto$StopSelectorScreenElementDto.b) && jl40.l(this.c, checkoutScreenElementDto$StopSelectorScreenElementDto.c) && jl40.l(this.d, checkoutScreenElementDto$StopSelectorScreenElementDto.d) && jl40.l(this.e, checkoutScreenElementDto$StopSelectorScreenElementDto.e) && jl40.l(this.f, checkoutScreenElementDto$StopSelectorScreenElementDto.f) && jl40.l(this.g, checkoutScreenElementDto$StopSelectorScreenElementDto.g) && jl40.l(this.h, checkoutScreenElementDto$StopSelectorScreenElementDto.h);
    }

    public final int hashCode() {
        RequiredPropertyInfoDto requiredPropertyInfoDto = this.a;
        int hashCode = (requiredPropertyInfoDto == null ? 0 : requiredPropertyInfoDto.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.e;
        int b = unr0.b((hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f);
        StopDto stopDto = this.g;
        return this.h.hashCode() + ((b + (stopDto != null ? stopDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StopSelectorScreenElementDto(requiredPropertyInfo=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", placeholder=");
        g8e.D(sb, this.c, ", selectorTitle=", this.d, ", isReadonly=");
        sb.append(this.e);
        sb.append(", property=");
        sb.append(this.f);
        sb.append(", value=");
        sb.append(this.g);
        sb.append(", stops=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
