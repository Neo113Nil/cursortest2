package com.yandex.go.due_timetable.data.api.dto;

import com.yandex.go.due.data.api.dto.DuePricingDataParam;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.vnm0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderSeatsAvailableRequest;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/data/api/dto/f", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderSeatsAvailableRequest {
    public static final f Companion = new f();
    public static final i3y[] d = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new vnm0(3)), null, null};
    public final List a;
    public final DuePricingDataParam b;
    public final String c;

    public /* synthetic */ ScheduledOrderSeatsAvailableRequest(int i, List list, DuePricingDataParam duePricingDataParam, String str) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ScheduledOrderSeatsAvailableRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = duePricingDataParam;
        this.c = str;
    }

    public ScheduledOrderSeatsAvailableRequest(List list, DuePricingDataParam duePricingDataParam, String str) {
        this.a = list;
        this.b = duePricingDataParam;
        this.c = str;
    }
}
