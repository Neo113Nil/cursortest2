package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersResponseDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/unified_polling/data/dto/h", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppOrdersResponseDto {
    public static final h Companion = new h();
    public final SuperAppOrdersPayloadDto a;
    public final SuperAppOrdersMetaDto b;

    public /* synthetic */ SuperAppOrdersResponseDto(int i, SuperAppOrdersPayloadDto superAppOrdersPayloadDto, SuperAppOrdersMetaDto superAppOrdersMetaDto) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = superAppOrdersPayloadDto;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = superAppOrdersMetaDto;
        }
    }

    public SuperAppOrdersResponseDto() {
        this.a = null;
        this.b = null;
    }
}
