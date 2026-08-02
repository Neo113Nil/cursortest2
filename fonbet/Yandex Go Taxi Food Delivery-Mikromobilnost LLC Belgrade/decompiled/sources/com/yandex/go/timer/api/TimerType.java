package com.yandex.go.timer.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/timer/api/TimerType;", "", "From", "Until", "go-client-android.features.timer:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class TimerType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimerType[] $VALUES;
    public static final TimerType From;
    public static final TimerType Until;

    static {
        TimerType timerType = new TimerType("From", 0);
        From = timerType;
        TimerType timerType2 = new TimerType("Until", 1);
        Until = timerType2;
        TimerType[] timerTypeArr = {timerType, timerType2};
        $VALUES = timerTypeArr;
        $ENTRIES = a.a(timerTypeArr);
    }

    public static TimerType valueOf(String str) {
        return (TimerType) Enum.valueOf(TimerType.class, str);
    }

    public static TimerType[] values() {
        return (TimerType[]) $VALUES.clone();
    }
}
