package com.yandex.go.masstransit.sdk.order.impl.orders;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/sdk/order/impl/orders/TransportPassDto$QrCodePassDto", "Lcom/yandex/go/masstransit/sdk/order/impl/orders/x;", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/v", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TransportPassDto$QrCodePassDto extends x {
    public static final v Companion = new v();
    public final String a;
    public final String b;
    public final String c;
    public final AnimationGradientDto d;

    public TransportPassDto$QrCodePassDto(int i, String str, String str2, String str3, AnimationGradientDto animationGradientDto) {
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
            this.d = animationGradientDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public TransportPassDto$QrCodePassDto() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
