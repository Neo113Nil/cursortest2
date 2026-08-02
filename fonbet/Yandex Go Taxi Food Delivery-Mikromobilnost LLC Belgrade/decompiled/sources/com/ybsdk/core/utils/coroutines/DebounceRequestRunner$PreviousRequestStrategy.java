package com.ybsdk.core.utils.coroutines;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/core/utils/coroutines/DebounceRequestRunner$PreviousRequestStrategy", "", "Lcom/ybsdk/core/utils/coroutines/DebounceRequestRunner$PreviousRequestStrategy;", "<init>", "(Ljava/lang/String;I)V", "CancelPrevious", "KeepRunning", "core-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DebounceRequestRunner$PreviousRequestStrategy {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DebounceRequestRunner$PreviousRequestStrategy[] $VALUES;
    public static final DebounceRequestRunner$PreviousRequestStrategy CancelPrevious = new DebounceRequestRunner$PreviousRequestStrategy("CancelPrevious", 0);
    public static final DebounceRequestRunner$PreviousRequestStrategy KeepRunning = new DebounceRequestRunner$PreviousRequestStrategy("KeepRunning", 1);

    private static final /* synthetic */ DebounceRequestRunner$PreviousRequestStrategy[] $values() {
        return new DebounceRequestRunner$PreviousRequestStrategy[]{CancelPrevious, KeepRunning};
    }

    static {
        DebounceRequestRunner$PreviousRequestStrategy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DebounceRequestRunner$PreviousRequestStrategy(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DebounceRequestRunner$PreviousRequestStrategy valueOf(String str) {
        return (DebounceRequestRunner$PreviousRequestStrategy) Enum.valueOf(DebounceRequestRunner$PreviousRequestStrategy.class, str);
    }

    public static DebounceRequestRunner$PreviousRequestStrategy[] values() {
        return (DebounceRequestRunner$PreviousRequestStrategy[]) $VALUES.clone();
    }
}
