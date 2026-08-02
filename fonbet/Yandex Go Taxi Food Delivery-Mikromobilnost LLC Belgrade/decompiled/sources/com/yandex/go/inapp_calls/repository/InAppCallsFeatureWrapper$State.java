package com.yandex.go.inapp_calls.repository;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/yandex/go/inapp_calls/repository/InAppCallsFeatureWrapper$State", "", "Lcom/yandex/go/inapp_calls/repository/InAppCallsFeatureWrapper$State;", "NOT_LOADED", "READY", "LOADING", "ERROR", "UNAVAILABLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InAppCallsFeatureWrapper$State {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InAppCallsFeatureWrapper$State[] $VALUES;
    public static final InAppCallsFeatureWrapper$State ERROR;
    public static final InAppCallsFeatureWrapper$State LOADING;
    public static final InAppCallsFeatureWrapper$State NOT_LOADED;
    public static final InAppCallsFeatureWrapper$State READY;
    public static final InAppCallsFeatureWrapper$State UNAVAILABLE;

    static {
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State = new InAppCallsFeatureWrapper$State("NOT_LOADED", 0);
        NOT_LOADED = inAppCallsFeatureWrapper$State;
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State2 = new InAppCallsFeatureWrapper$State("READY", 1);
        READY = inAppCallsFeatureWrapper$State2;
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State3 = new InAppCallsFeatureWrapper$State("LOADING", 2);
        LOADING = inAppCallsFeatureWrapper$State3;
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State4 = new InAppCallsFeatureWrapper$State("ERROR", 3);
        ERROR = inAppCallsFeatureWrapper$State4;
        InAppCallsFeatureWrapper$State inAppCallsFeatureWrapper$State5 = new InAppCallsFeatureWrapper$State("UNAVAILABLE", 4);
        UNAVAILABLE = inAppCallsFeatureWrapper$State5;
        InAppCallsFeatureWrapper$State[] inAppCallsFeatureWrapper$StateArr = {inAppCallsFeatureWrapper$State, inAppCallsFeatureWrapper$State2, inAppCallsFeatureWrapper$State3, inAppCallsFeatureWrapper$State4, inAppCallsFeatureWrapper$State5};
        $VALUES = inAppCallsFeatureWrapper$StateArr;
        $ENTRIES = kotlin.enums.a.a(inAppCallsFeatureWrapper$StateArr);
    }

    public static InAppCallsFeatureWrapper$State valueOf(String str) {
        return (InAppCallsFeatureWrapper$State) Enum.valueOf(InAppCallsFeatureWrapper$State.class, str);
    }

    public static InAppCallsFeatureWrapper$State[] values() {
        return (InAppCallsFeatureWrapper$State[]) $VALUES.clone();
    }
}
