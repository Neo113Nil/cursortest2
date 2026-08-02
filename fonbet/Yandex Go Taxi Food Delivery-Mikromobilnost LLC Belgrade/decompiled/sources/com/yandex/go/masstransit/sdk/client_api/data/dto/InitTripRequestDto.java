package com.yandex.go.masstransit.sdk.client_api.data.dto;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.smv;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/client_api/data/dto/InitTripRequestDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/client_api/data/dto/p", "client_api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InitTripRequestDto {
    public static final p Companion = new p();
    public static final i3y[] c = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new smv(22)), null};
    public final Map a;
    public final PaymentMethodDto b;

    public /* synthetic */ InitTripRequestDto(int i, Map map, PaymentMethodDto paymentMethodDto) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, InitTripRequestDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = map;
        this.b = paymentMethodDto;
    }

    public InitTripRequestDto(Map map, PaymentMethodDto paymentMethodDto) {
        this.a = map;
        this.b = paymentMethodDto;
    }
}
