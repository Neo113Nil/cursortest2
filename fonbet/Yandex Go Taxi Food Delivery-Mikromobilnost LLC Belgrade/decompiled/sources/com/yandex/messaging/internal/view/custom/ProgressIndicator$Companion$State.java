package com.yandex.messaging.internal.view.custom;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/messaging/internal/view/custom/ProgressIndicator$Companion$State", "", "Lcom/yandex/messaging/internal/view/custom/ProgressIndicator$Companion$State;", "Initial", "Loading", "Retry", "Error", "Loaded", "messaging-core-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProgressIndicator$Companion$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ProgressIndicator$Companion$State[] $VALUES;
    public static final ProgressIndicator$Companion$State Error;
    public static final ProgressIndicator$Companion$State Initial;
    public static final ProgressIndicator$Companion$State Loaded;
    public static final ProgressIndicator$Companion$State Loading;
    public static final ProgressIndicator$Companion$State Retry;

    static {
        ProgressIndicator$Companion$State progressIndicator$Companion$State = new ProgressIndicator$Companion$State("Initial", 0);
        Initial = progressIndicator$Companion$State;
        ProgressIndicator$Companion$State progressIndicator$Companion$State2 = new ProgressIndicator$Companion$State("Loading", 1);
        Loading = progressIndicator$Companion$State2;
        ProgressIndicator$Companion$State progressIndicator$Companion$State3 = new ProgressIndicator$Companion$State("Retry", 2);
        Retry = progressIndicator$Companion$State3;
        ProgressIndicator$Companion$State progressIndicator$Companion$State4 = new ProgressIndicator$Companion$State("Error", 3);
        Error = progressIndicator$Companion$State4;
        ProgressIndicator$Companion$State progressIndicator$Companion$State5 = new ProgressIndicator$Companion$State("Loaded", 4);
        Loaded = progressIndicator$Companion$State5;
        ProgressIndicator$Companion$State[] progressIndicator$Companion$StateArr = {progressIndicator$Companion$State, progressIndicator$Companion$State2, progressIndicator$Companion$State3, progressIndicator$Companion$State4, progressIndicator$Companion$State5};
        $VALUES = progressIndicator$Companion$StateArr;
        $ENTRIES = a.a(progressIndicator$Companion$StateArr);
    }

    public static ProgressIndicator$Companion$State valueOf(String str) {
        return (ProgressIndicator$Companion$State) Enum.valueOf(ProgressIndicator$Companion$State.class, str);
    }

    public static ProgressIndicator$Companion$State[] values() {
        return (ProgressIndicator$Companion$State[]) $VALUES.clone();
    }
}
