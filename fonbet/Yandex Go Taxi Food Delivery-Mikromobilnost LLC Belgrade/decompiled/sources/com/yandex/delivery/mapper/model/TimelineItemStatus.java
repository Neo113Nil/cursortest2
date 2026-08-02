package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/delivery/mapper/model/TimelineItemStatus;", "", "PENDING", "PASSED", "UNKNOWN", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimelineItemStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimelineItemStatus[] $VALUES;
    public static final TimelineItemStatus PASSED;
    public static final TimelineItemStatus PENDING;
    public static final TimelineItemStatus UNKNOWN;

    static {
        TimelineItemStatus timelineItemStatus = new TimelineItemStatus("PENDING", 0);
        PENDING = timelineItemStatus;
        TimelineItemStatus timelineItemStatus2 = new TimelineItemStatus("PASSED", 1);
        PASSED = timelineItemStatus2;
        TimelineItemStatus timelineItemStatus3 = new TimelineItemStatus("UNKNOWN", 2);
        UNKNOWN = timelineItemStatus3;
        TimelineItemStatus[] timelineItemStatusArr = {timelineItemStatus, timelineItemStatus2, timelineItemStatus3};
        $VALUES = timelineItemStatusArr;
        $ENTRIES = a.a(timelineItemStatusArr);
    }

    public static TimelineItemStatus valueOf(String str) {
        return (TimelineItemStatus) Enum.valueOf(TimelineItemStatus.class, str);
    }

    public static TimelineItemStatus[] values() {
        return (TimelineItemStatus[]) $VALUES.clone();
    }
}
