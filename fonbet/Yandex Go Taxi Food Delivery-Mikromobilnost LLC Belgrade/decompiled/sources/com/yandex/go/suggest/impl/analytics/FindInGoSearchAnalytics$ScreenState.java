package com.yandex.go.suggest.impl.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/suggest/impl/analytics/FindInGoSearchAnalytics$ScreenState", "", "Lcom/yandex/go/suggest/impl/analytics/FindInGoSearchAnalytics$ScreenState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Loading", "Loaded", "Failed", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FindInGoSearchAnalytics$ScreenState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FindInGoSearchAnalytics$ScreenState[] $VALUES;
    public static final FindInGoSearchAnalytics$ScreenState Failed;
    public static final FindInGoSearchAnalytics$ScreenState Loaded;
    public static final FindInGoSearchAnalytics$ScreenState Loading;
    private final String eventValue;

    static {
        FindInGoSearchAnalytics$ScreenState findInGoSearchAnalytics$ScreenState = new FindInGoSearchAnalytics$ScreenState("Loading", 0, ResultType.RESULT_TYPE_LOADING);
        Loading = findInGoSearchAnalytics$ScreenState;
        FindInGoSearchAnalytics$ScreenState findInGoSearchAnalytics$ScreenState2 = new FindInGoSearchAnalytics$ScreenState("Loaded", 1, "loaded");
        Loaded = findInGoSearchAnalytics$ScreenState2;
        FindInGoSearchAnalytics$ScreenState findInGoSearchAnalytics$ScreenState3 = new FindInGoSearchAnalytics$ScreenState("Failed", 2, "failed");
        Failed = findInGoSearchAnalytics$ScreenState3;
        FindInGoSearchAnalytics$ScreenState[] findInGoSearchAnalytics$ScreenStateArr = {findInGoSearchAnalytics$ScreenState, findInGoSearchAnalytics$ScreenState2, findInGoSearchAnalytics$ScreenState3};
        $VALUES = findInGoSearchAnalytics$ScreenStateArr;
        $ENTRIES = a.a(findInGoSearchAnalytics$ScreenStateArr);
    }

    public FindInGoSearchAnalytics$ScreenState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static FindInGoSearchAnalytics$ScreenState valueOf(String str) {
        return (FindInGoSearchAnalytics$ScreenState) Enum.valueOf(FindInGoSearchAnalytics$ScreenState.class, str);
    }

    public static FindInGoSearchAnalytics$ScreenState[] values() {
        return (FindInGoSearchAnalytics$ScreenState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
