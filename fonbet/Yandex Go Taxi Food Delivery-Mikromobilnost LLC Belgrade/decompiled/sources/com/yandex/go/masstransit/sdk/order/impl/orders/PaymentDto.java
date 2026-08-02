package com.yandex.go.masstransit.sdk.order.impl.orders;

import com.yandex.go.masstransit.sdk.core.design.slot.dto.MasstransitSlotItemDto;
import com.yandex.go.masstransit.sdk.core.dto.PaymentMethodDto;
import defpackage.gsq0;
import kotlin.Metadata;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/orders/PaymentDto;", "", "Companion", "$serializer", "com/yandex/go/masstransit/sdk/order/impl/orders/q", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PaymentDto {
    public static final q Companion = new q();
    public final FormattedText a;
    public final MasstransitSlotItemDto b;
    public final PaymentMethodDto c;

    public /* synthetic */ PaymentDto(int i, FormattedText formattedText, MasstransitSlotItemDto masstransitSlotItemDto, PaymentMethodDto paymentMethodDto) {
        this.a = (i & 1) == 0 ? new FormattedText(0) : formattedText;
        if ((i & 2) == 0) {
            this.b = new MasstransitSlotItemDto(0);
        } else {
            this.b = masstransitSlotItemDto;
        }
        if ((i & 4) == 0) {
            this.c = new PaymentMethodDto(0);
        } else {
            this.c = paymentMethodDto;
        }
    }

    public PaymentDto() {
        this(0);
    }

    public PaymentDto(int i) {
        FormattedText formattedText = new FormattedText(0);
        MasstransitSlotItemDto masstransitSlotItemDto = new MasstransitSlotItemDto(0);
        PaymentMethodDto paymentMethodDto = new PaymentMethodDto(0);
        this.a = formattedText;
        this.b = masstransitSlotItemDto;
        this.c = paymentMethodDto;
    }
}
