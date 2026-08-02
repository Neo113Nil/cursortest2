package com.yandex.go.superapp.tracking.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Status", "", "Lcom/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Status;", CA20Status.STATUS_USER_DESCRIPTION_A, "Cancelling", "Completed", "Stub", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LogisticsOrderTracking$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogisticsOrderTracking$Status[] $VALUES;
    public static final LogisticsOrderTracking$Status Active;
    public static final LogisticsOrderTracking$Status Cancelling;
    public static final LogisticsOrderTracking$Status Completed;
    public static final LogisticsOrderTracking$Status Stub;

    static {
        LogisticsOrderTracking$Status logisticsOrderTracking$Status = new LogisticsOrderTracking$Status(CA20Status.STATUS_USER_DESCRIPTION_A, 0);
        Active = logisticsOrderTracking$Status;
        LogisticsOrderTracking$Status logisticsOrderTracking$Status2 = new LogisticsOrderTracking$Status("Cancelling", 1);
        Cancelling = logisticsOrderTracking$Status2;
        LogisticsOrderTracking$Status logisticsOrderTracking$Status3 = new LogisticsOrderTracking$Status("Completed", 2);
        Completed = logisticsOrderTracking$Status3;
        LogisticsOrderTracking$Status logisticsOrderTracking$Status4 = new LogisticsOrderTracking$Status("Stub", 3);
        Stub = logisticsOrderTracking$Status4;
        LogisticsOrderTracking$Status[] logisticsOrderTracking$StatusArr = {logisticsOrderTracking$Status, logisticsOrderTracking$Status2, logisticsOrderTracking$Status3, logisticsOrderTracking$Status4};
        $VALUES = logisticsOrderTracking$StatusArr;
        $ENTRIES = a.a(logisticsOrderTracking$StatusArr);
    }

    public static LogisticsOrderTracking$Status valueOf(String str) {
        return (LogisticsOrderTracking$Status) Enum.valueOf(LogisticsOrderTracking$Status.class, str);
    }

    public static LogisticsOrderTracking$Status[] values() {
        return (LogisticsOrderTracking$Status[]) $VALUES.clone();
    }
}
