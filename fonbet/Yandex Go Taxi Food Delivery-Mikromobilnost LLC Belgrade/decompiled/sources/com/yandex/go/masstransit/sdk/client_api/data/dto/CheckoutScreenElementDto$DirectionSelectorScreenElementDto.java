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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenElementDto$DirectionSelectorScreenElementDto", "Lcom/yandex/go/masstransit/sdk/client_api/data/dto/i;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/c", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutScreenElementDto$DirectionSelectorScreenElementDto extends i {
    public static final c Companion = new c();
    public static final i3y[] i = {null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(7)), null, null, null, null, null, null};
    public final RequiredPropertyInfoDto a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Boolean g;
    public final DirectionDto h;

    public CheckoutScreenElementDto$DirectionSelectorScreenElementDto(int i2, RequiredPropertyInfoDto requiredPropertyInfoDto, List list, String str, String str2, String str3, String str4, Boolean bool, DirectionDto directionDto) {
        if (32 != (i2 & 32)) {
            qje.Z(i2, 32, CheckoutScreenElementDto$DirectionSelectorScreenElementDto$$serializer.INSTANCE.getDescriptor());
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
            this.b = list;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        this.f = str4;
        if ((i2 & 64) == 0) {
            this.g = Boolean.FALSE;
        } else {
            this.g = bool;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = directionDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutScreenElementDto$DirectionSelectorScreenElementDto)) {
            return false;
        }
        CheckoutScreenElementDto$DirectionSelectorScreenElementDto checkoutScreenElementDto$DirectionSelectorScreenElementDto = (CheckoutScreenElementDto$DirectionSelectorScreenElementDto) obj;
        return jl40.l(this.a, checkoutScreenElementDto$DirectionSelectorScreenElementDto.a) && jl40.l(this.b, checkoutScreenElementDto$DirectionSelectorScreenElementDto.b) && jl40.l(this.c, checkoutScreenElementDto$DirectionSelectorScreenElementDto.c) && jl40.l(this.d, checkoutScreenElementDto$DirectionSelectorScreenElementDto.d) && jl40.l(this.e, checkoutScreenElementDto$DirectionSelectorScreenElementDto.e) && jl40.l(this.f, checkoutScreenElementDto$DirectionSelectorScreenElementDto.f) && jl40.l(this.g, checkoutScreenElementDto$DirectionSelectorScreenElementDto.g) && jl40.l(this.h, checkoutScreenElementDto$DirectionSelectorScreenElementDto.h);
    }

    public final int hashCode() {
        RequiredPropertyInfoDto requiredPropertyInfoDto = this.a;
        int hashCode = (requiredPropertyInfoDto == null ? 0 : requiredPropertyInfoDto.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int b = unr0.b((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f);
        Boolean bool = this.g;
        int hashCode5 = (b + (bool == null ? 0 : bool.hashCode())) * 31;
        DirectionDto directionDto = this.h;
        return hashCode5 + (directionDto != null ? directionDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DirectionSelectorScreenElementDto(requiredPropertyInfo=");
        sb.append(this.a);
        sb.append(", directions=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", placeholder=", this.d, ", selectorTitle=");
        g8e.D(sb, this.e, ", property=", this.f, ", isReadonly=");
        sb.append(this.g);
        sb.append(", value=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
