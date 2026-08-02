package com.yandex.go.due_timetable.data.api.dto;

import com.yandex.go.due.data.api.dto.DuePricingDataParam;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.qje;
import defpackage.uy40;
import defpackage.v4m0;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due_timetable/data/api/dto/ScheduledOrderCalculationsRequest;", "", "Companion", "$serializer", "com/yandex/go/due_timetable/data/api/dto/a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ScheduledOrderCalculationsRequest {
    public static final a Companion = new a();
    public static final i3y[] f = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new v4m0(25)), null, null, null, null};
    public final List a;
    public final Boolean b;
    public final DuePricingDataParam c;
    public final String d;
    public final Boolean e;

    public /* synthetic */ ScheduledOrderCalculationsRequest(int i, List list, Boolean bool, DuePricingDataParam duePricingDataParam, String str, Boolean bool2) {
        if (31 != (i & 31)) {
            qje.Z(i, 31, ScheduledOrderCalculationsRequest$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = bool;
        this.c = duePricingDataParam;
        this.d = str;
        this.e = bool2;
    }

    public ScheduledOrderCalculationsRequest(uy40 uy40Var, Boolean bool, DuePricingDataParam duePricingDataParam, String str, Boolean bool2) {
        this.a = uy40Var;
        this.b = bool;
        this.c = duePricingDataParam;
        this.d = str;
        this.e = bool2;
    }
}
