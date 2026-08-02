package com.yandex.go.superapp.tracking.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Cancellation$Type", "", "Lcom/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Cancellation$Type;", "Free", "Paid", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LogisticsOrderTracking$Cancellation$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogisticsOrderTracking$Cancellation$Type[] $VALUES;
    public static final LogisticsOrderTracking$Cancellation$Type Free;
    public static final LogisticsOrderTracking$Cancellation$Type Paid;

    static {
        LogisticsOrderTracking$Cancellation$Type logisticsOrderTracking$Cancellation$Type = new LogisticsOrderTracking$Cancellation$Type("Free", 0);
        Free = logisticsOrderTracking$Cancellation$Type;
        LogisticsOrderTracking$Cancellation$Type logisticsOrderTracking$Cancellation$Type2 = new LogisticsOrderTracking$Cancellation$Type("Paid", 1);
        Paid = logisticsOrderTracking$Cancellation$Type2;
        LogisticsOrderTracking$Cancellation$Type[] logisticsOrderTracking$Cancellation$TypeArr = {logisticsOrderTracking$Cancellation$Type, logisticsOrderTracking$Cancellation$Type2};
        $VALUES = logisticsOrderTracking$Cancellation$TypeArr;
        $ENTRIES = a.a(logisticsOrderTracking$Cancellation$TypeArr);
    }

    public static LogisticsOrderTracking$Cancellation$Type valueOf(String str) {
        return (LogisticsOrderTracking$Cancellation$Type) Enum.valueOf(LogisticsOrderTracking$Cancellation$Type.class, str);
    }

    public static LogisticsOrderTracking$Cancellation$Type[] values() {
        return (LogisticsOrderTracking$Cancellation$Type[]) $VALUES.clone();
    }
}
