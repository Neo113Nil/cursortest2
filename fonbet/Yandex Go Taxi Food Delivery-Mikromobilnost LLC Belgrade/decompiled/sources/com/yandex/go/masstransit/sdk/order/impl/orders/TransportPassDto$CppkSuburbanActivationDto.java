package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.tse0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/order/impl/orders/TransportPassDto$CppkSuburbanActivationDto", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/x;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/t", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class TransportPassDto$CppkSuburbanActivationDto extends x {
    public static final t Companion = new t();
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final NeedActivationStateDto e;
    public final AnimationGradientDto f;

    public TransportPassDto$CppkSuburbanActivationDto(int i, String str, String str2, String str3, Boolean bool, NeedActivationStateDto needActivationStateDto, AnimationGradientDto animationGradientDto) {
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
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = needActivationStateDto;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = animationGradientDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final NeedActivationStateDto getE() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TransportPassDto$CppkSuburbanActivationDto)) {
            return false;
        }
        TransportPassDto$CppkSuburbanActivationDto transportPassDto$CppkSuburbanActivationDto = (TransportPassDto$CppkSuburbanActivationDto) obj;
        return jl40.l(this.a, transportPassDto$CppkSuburbanActivationDto.a) && jl40.l(this.b, transportPassDto$CppkSuburbanActivationDto.b) && jl40.l(this.c, transportPassDto$CppkSuburbanActivationDto.c) && jl40.l(this.d, transportPassDto$CppkSuburbanActivationDto.d) && jl40.l(this.e, transportPassDto$CppkSuburbanActivationDto.e) && jl40.l(this.f, transportPassDto$CppkSuburbanActivationDto.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        NeedActivationStateDto needActivationStateDto = this.e;
        int hashCode5 = (hashCode4 + (needActivationStateDto == null ? 0 : needActivationStateDto.hashCode())) * 31;
        AnimationGradientDto animationGradientDto = this.f;
        return hashCode5 + (animationGradientDto != null ? animationGradientDto.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("CppkSuburbanActivationDto(ticketBody=", this.a, ", activationCode=", this.b, ", passDescription=");
        tse0.A(v, this.c, ", nfcAvailable=", this.d, ", needActivationState=");
        v.append(this.e);
        v.append(", animationGradient=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public TransportPassDto$CppkSuburbanActivationDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
    }
}
