package com.yandex.go.order.external.unifiedpolling.dto.card;

import com.yandex.go.order.external.unifiedpolling.dto.card.header.EatsOrderCardHeaderDto;
import com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline.EatsOrderCardTimelineDto;
import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/card/EatsOrderCardDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/card/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderCardDto {
    public static final a Companion = new a();
    public final EatsOrderCardHeaderDto a;
    public final EatsOrderCardTimelineDto b;

    public /* synthetic */ EatsOrderCardDto(int i, EatsOrderCardHeaderDto eatsOrderCardHeaderDto, EatsOrderCardTimelineDto eatsOrderCardTimelineDto) {
        this.a = (i & 1) == 0 ? new EatsOrderCardHeaderDto(0) : eatsOrderCardHeaderDto;
        if ((i & 2) == 0) {
            this.b = new EatsOrderCardTimelineDto(0);
        } else {
            this.b = eatsOrderCardTimelineDto;
        }
    }

    /* renamed from: a, reason: from getter */
    public final EatsOrderCardHeaderDto getA() {
        return this.a;
    }

    /* renamed from: b, reason: from getter */
    public final EatsOrderCardTimelineDto getB() {
        return this.b;
    }

    public EatsOrderCardDto() {
        this(0);
    }

    public EatsOrderCardDto(int i) {
        EatsOrderCardHeaderDto eatsOrderCardHeaderDto = new EatsOrderCardHeaderDto(0);
        EatsOrderCardTimelineDto eatsOrderCardTimelineDto = new EatsOrderCardTimelineDto(0);
        this.a = eatsOrderCardHeaderDto;
        this.b = eatsOrderCardTimelineDto;
    }
}
