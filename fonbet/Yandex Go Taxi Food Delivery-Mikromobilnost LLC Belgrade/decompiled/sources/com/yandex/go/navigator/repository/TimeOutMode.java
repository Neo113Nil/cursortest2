package com.yandex.go.navigator.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/navigator/repository/TimeOutMode;", "", "", "timerTimeoutMs", "J", "a", "()J", "SHORT_TIMEOUT", "LONG_TIMEOUT", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class TimeOutMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TimeOutMode[] $VALUES;
    public static final TimeOutMode LONG_TIMEOUT;
    public static final TimeOutMode SHORT_TIMEOUT;
    private final long timerTimeoutMs;

    static {
        TimeOutMode timeOutMode = new TimeOutMode("SHORT_TIMEOUT", 0, 1000L);
        SHORT_TIMEOUT = timeOutMode;
        TimeOutMode timeOutMode2 = new TimeOutMode("LONG_TIMEOUT", 1, 6000L);
        LONG_TIMEOUT = timeOutMode2;
        TimeOutMode[] timeOutModeArr = {timeOutMode, timeOutMode2};
        $VALUES = timeOutModeArr;
        $ENTRIES = kotlin.enums.a.a(timeOutModeArr);
    }

    public TimeOutMode(String str, int i, long j) {
        this.timerTimeoutMs = j;
    }

    public static TimeOutMode valueOf(String str) {
        return (TimeOutMode) Enum.valueOf(TimeOutMode.class, str);
    }

    public static TimeOutMode[] values() {
        return (TimeOutMode[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final long getTimerTimeoutMs() {
        return this.timerTimeoutMs;
    }
}
