package com.yandex.go.taxi.order.models.api.response;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.gsq0;
import defpackage.jl40;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/taxi/order/models/api/response/HeaderAccordionDto;", "", "Companion", "$serializer", "com/yandex/go/taxi/order/models/api/response/o0", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class HeaderAccordionDto {
    public static final o0 Companion = new o0();
    public final SlotItemDto a;

    public /* synthetic */ HeaderAccordionDto(int i, SlotItemDto slotItemDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = slotItemDto;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HeaderAccordionDto) && jl40.l(this.a, ((HeaderAccordionDto) obj).a);
    }

    public final int hashCode() {
        SlotItemDto slotItemDto = this.a;
        if (slotItemDto == null) {
            return 0;
        }
        return slotItemDto.hashCode();
    }

    public final String toString() {
        return "HeaderAccordionDto(slot=" + this.a + Extension.C_BRAKE;
    }

    public HeaderAccordionDto(int i) {
        this.a = null;
    }

    public HeaderAccordionDto() {
        this(0);
    }
}
