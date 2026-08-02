package com.yandex.go.due.data.api.dto;

import defpackage.gsq0;
import java.util.Calendar;
import kotlin.Metadata;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/due/data/api/dto/TimeRange;", "", "Companion", "$serializer", "com/yandex/go/due/data/api/dto/u", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeRange {
    public static final u Companion = new u();
    public final Calendar a;
    public final Calendar b;

    public /* synthetic */ TimeRange(int i, Calendar calendar, Calendar calendar2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = calendar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = calendar2;
        }
    }

    public TimeRange() {
        this.a = null;
        this.b = null;
    }
}
