package com.yandex.go.masstransit.sdk.client_api.data.dto;

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
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/CheckoutScreenStateDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/j", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CheckoutScreenStateDto {
    public static final j Companion = new j();
    public static final i3y[] k = {null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new qlb(11)), null, null, null, null, null, null, null};
    public final String a;
    public final Integer b;
    public final List c;
    public final NotificationDto d;
    public final String e;
    public final RouteDisplayDataDto f;
    public final ButtonFooterDto g;
    public final FormattedText h;
    public final PriceInfoDto i;
    public final PaymentMethodsInfoDto j;

    public /* synthetic */ CheckoutScreenStateDto(int i, String str, Integer num, List list, NotificationDto notificationDto, String str2, RouteDisplayDataDto routeDisplayDataDto, ButtonFooterDto buttonFooterDto, FormattedText formattedText, PriceInfoDto priceInfoDto, PaymentMethodsInfoDto paymentMethodsInfoDto) {
        if (517 != (i & 517)) {
            qje.Z(i, 517, CheckoutScreenStateDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        this.c = list;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = notificationDto;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = routeDisplayDataDto;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = buttonFooterDto;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = formattedText;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = priceInfoDto;
        }
        this.j = paymentMethodsInfoDto;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutScreenStateDto)) {
            return false;
        }
        CheckoutScreenStateDto checkoutScreenStateDto = (CheckoutScreenStateDto) obj;
        return jl40.l(this.a, checkoutScreenStateDto.a) && jl40.l(this.b, checkoutScreenStateDto.b) && jl40.l(this.c, checkoutScreenStateDto.c) && jl40.l(this.d, checkoutScreenStateDto.d) && jl40.l(this.e, checkoutScreenStateDto.e) && jl40.l(this.f, checkoutScreenStateDto.f) && jl40.l(this.g, checkoutScreenStateDto.g) && jl40.l(this.h, checkoutScreenStateDto.h) && jl40.l(this.i, checkoutScreenStateDto.i) && jl40.l(this.j, checkoutScreenStateDto.j);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int c = unr0.c((hashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c);
        NotificationDto notificationDto = this.d;
        int hashCode2 = (c + (notificationDto == null ? 0 : notificationDto.hashCode())) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        RouteDisplayDataDto routeDisplayDataDto = this.f;
        int hashCode4 = (hashCode3 + (routeDisplayDataDto == null ? 0 : routeDisplayDataDto.hashCode())) * 31;
        ButtonFooterDto buttonFooterDto = this.g;
        int hashCode5 = (hashCode4 + (buttonFooterDto == null ? 0 : buttonFooterDto.hashCode())) * 31;
        FormattedText formattedText = this.h;
        int hashCode6 = (hashCode5 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        PriceInfoDto priceInfoDto = this.i;
        return this.j.hashCode() + ((hashCode6 + (priceInfoDto != null ? priceInfoDto.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder q = defpackage.n.q("CheckoutScreenStateDto(tripId=", this.b, this.a, ", debounceDelayMs=", ", elements=");
        q.append(this.c);
        q.append(", informationMessage=");
        q.append(this.d);
        q.append(", checkoutLockedUntil=");
        q.append(this.e);
        q.append(", routeDisplayData=");
        q.append(this.f);
        q.append(", footer=");
        q.append(this.g);
        q.append(", userAgreement=");
        q.append(this.h);
        q.append(", priceInfo=");
        q.append(this.i);
        q.append(", paymentMethodsInfo=");
        q.append(this.j);
        q.append(Extension.C_BRAKE);
        return q.toString();
    }
}
