package com.yandex.go.superapp.unified_polling.data.dto;

import defpackage.gsq0;
import defpackage.qje;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/superapp/unified_polling/data/dto/SuperAppOrdersMetaDto;", "", "Companion", "$serializer", "com/yandex/go/superapp/unified_polling/data/dto/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class SuperAppOrdersMetaDto {
    public static final f Companion = new f();
    public final Integer a;

    public /* synthetic */ SuperAppOrdersMetaDto(int i, Integer num) {
        if (1 == (i & 1)) {
            this.a = num;
        } else {
            qje.Z(i, 1, SuperAppOrdersMetaDto$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
