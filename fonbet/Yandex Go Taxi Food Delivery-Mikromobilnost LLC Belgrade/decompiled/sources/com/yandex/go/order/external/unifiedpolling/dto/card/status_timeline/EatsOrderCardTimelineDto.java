package com.yandex.go.order.external.unifiedpolling.dto.card.status_timeline;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.ktm;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/order/external/unifiedpolling/dto/card/status_timeline/EatsOrderCardTimelineDto;", "", "Companion", "$serializer", "com/yandex/go/order/external/unifiedpolling/dto/card/status_timeline/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class EatsOrderCardTimelineDto {
    public static final a Companion = new a();
    public static final i3y[] e = {null, null, null, kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new ktm(20))};
    public final int a;
    public final String b;
    public final String c;
    public final List d;

    public /* synthetic */ EatsOrderCardTimelineDto(int i, int i2, String str, String str2, List list) {
        this.a = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = EmptyList.a;
        } else {
            this.d = list;
        }
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: b, reason: from getter */
    public final int getA() {
        return this.a;
    }

    /* renamed from: c, reason: from getter */
    public final String getC() {
        return this.c;
    }

    /* renamed from: d, reason: from getter */
    public final List getD() {
        return this.d;
    }

    public EatsOrderCardTimelineDto(int i) {
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = EmptyList.a;
    }

    public EatsOrderCardTimelineDto() {
        this(0);
    }
}
