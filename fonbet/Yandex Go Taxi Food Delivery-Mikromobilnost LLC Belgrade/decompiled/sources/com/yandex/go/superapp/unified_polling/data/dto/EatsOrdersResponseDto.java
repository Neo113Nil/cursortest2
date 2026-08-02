package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/dto/EatsOrdersResponseDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/unified_polling/data/dto/d", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class EatsOrdersResponseDto {
    public static final d Companion = new d();
    public final EatsOrdersPayloadDto a;
    public final EatsOrdersMetaDto b;

    public /* synthetic */ EatsOrdersResponseDto(int i, EatsOrdersPayloadDto eatsOrdersPayloadDto, EatsOrdersMetaDto eatsOrdersMetaDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = eatsOrdersPayloadDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = eatsOrdersMetaDto;
        }
    }

    public EatsOrdersResponseDto() {
        this.a = null;
        this.b = null;
    }
}
