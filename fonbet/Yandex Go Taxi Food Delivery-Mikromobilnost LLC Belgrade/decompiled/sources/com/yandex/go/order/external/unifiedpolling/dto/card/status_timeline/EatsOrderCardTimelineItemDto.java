package com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline;

import defpackage.gsq0;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/card/status_timeline/EatsOrderCardTimelineItemDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/card/status_timeline/b", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderCardTimelineItemDto {
    public static final b Companion = new b();
    public final String a;
    public final String b;

    public /* synthetic */ EatsOrderCardTimelineItemDto(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final String getA() {
        return this.a;
    }

    public EatsOrderCardTimelineItemDto() {
        this.a = "";
        this.b = "";
    }
}
