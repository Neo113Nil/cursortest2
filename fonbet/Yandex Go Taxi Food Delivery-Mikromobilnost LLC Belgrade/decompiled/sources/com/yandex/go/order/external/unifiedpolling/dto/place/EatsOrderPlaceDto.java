package com.yandex.go.order.external.unifiedpolling.dto.place;

import defpackage.gsq0;
import defpackage.v6z;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/place/EatsOrderPlaceDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/place/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderPlaceDto {
    public static final a Companion = new a();
    public final String a;
    public final v6z b;

    public /* synthetic */ EatsOrderPlaceDto(int i, String str, v6z v6zVar) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = v6zVar;
        }
    }

    /* renamed from: a, reason: from getter */
    public final v6z getB() {
        return this.b;
    }

    public EatsOrderPlaceDto() {
        this.a = null;
        this.b = null;
    }
}
