package com.yandex.go.superapp.tracking.api.domain.models;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Details$State", "", "Lcom/yandex/go/superapp/tracking/api/domain/models/LogisticsOrderTracking$Details$State;", "Expanded", "Anchored", "Collapsed", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LogisticsOrderTracking$Details$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ LogisticsOrderTracking$Details$State[] $VALUES;
    public static final LogisticsOrderTracking$Details$State Anchored;
    public static final LogisticsOrderTracking$Details$State Collapsed;
    public static final LogisticsOrderTracking$Details$State Expanded;

    static {
        LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State = new LogisticsOrderTracking$Details$State("Expanded", 0);
        Expanded = logisticsOrderTracking$Details$State;
        LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State2 = new LogisticsOrderTracking$Details$State("Anchored", 1);
        Anchored = logisticsOrderTracking$Details$State2;
        LogisticsOrderTracking$Details$State logisticsOrderTracking$Details$State3 = new LogisticsOrderTracking$Details$State("Collapsed", 2);
        Collapsed = logisticsOrderTracking$Details$State3;
        LogisticsOrderTracking$Details$State[] logisticsOrderTracking$Details$StateArr = {logisticsOrderTracking$Details$State, logisticsOrderTracking$Details$State2, logisticsOrderTracking$Details$State3};
        $VALUES = logisticsOrderTracking$Details$StateArr;
        $ENTRIES = a.a(logisticsOrderTracking$Details$StateArr);
    }

    public static LogisticsOrderTracking$Details$State valueOf(String str) {
        return (LogisticsOrderTracking$Details$State) Enum.valueOf(LogisticsOrderTracking$Details$State.class, str);
    }

    public static LogisticsOrderTracking$Details$State[] values() {
        return (LogisticsOrderTracking$Details$State[]) $VALUES.clone();
    }
}
