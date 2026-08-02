package com.yandex.go.superapp_carts.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/superapp_carts/analytics/SuperappCartsAnalytics$ScreenState", "", "Lcom/yandex/go/superapp_carts/analytics/SuperappCartsAnalytics$ScreenState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Loading", "Error", "Carts", "Editing", "Empty", "go-client-android.features.superapp_carts:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappCartsAnalytics$ScreenState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappCartsAnalytics$ScreenState[] $VALUES;
    public static final SuperappCartsAnalytics$ScreenState Carts;
    public static final SuperappCartsAnalytics$ScreenState Editing;
    public static final SuperappCartsAnalytics$ScreenState Empty;
    public static final SuperappCartsAnalytics$ScreenState Error;
    public static final SuperappCartsAnalytics$ScreenState Loading;
    private final String eventValue;

    static {
        SuperappCartsAnalytics$ScreenState superappCartsAnalytics$ScreenState = new SuperappCartsAnalytics$ScreenState("Loading", 0, ResultType.RESULT_TYPE_LOADING);
        Loading = superappCartsAnalytics$ScreenState;
        SuperappCartsAnalytics$ScreenState superappCartsAnalytics$ScreenState2 = new SuperappCartsAnalytics$ScreenState("Error", 1, "error");
        Error = superappCartsAnalytics$ScreenState2;
        SuperappCartsAnalytics$ScreenState superappCartsAnalytics$ScreenState3 = new SuperappCartsAnalytics$ScreenState("Carts", 2, "carts");
        Carts = superappCartsAnalytics$ScreenState3;
        SuperappCartsAnalytics$ScreenState superappCartsAnalytics$ScreenState4 = new SuperappCartsAnalytics$ScreenState("Editing", 3, "editing");
        Editing = superappCartsAnalytics$ScreenState4;
        SuperappCartsAnalytics$ScreenState superappCartsAnalytics$ScreenState5 = new SuperappCartsAnalytics$ScreenState("Empty", 4, "empty");
        Empty = superappCartsAnalytics$ScreenState5;
        SuperappCartsAnalytics$ScreenState[] superappCartsAnalytics$ScreenStateArr = {superappCartsAnalytics$ScreenState, superappCartsAnalytics$ScreenState2, superappCartsAnalytics$ScreenState3, superappCartsAnalytics$ScreenState4, superappCartsAnalytics$ScreenState5};
        $VALUES = superappCartsAnalytics$ScreenStateArr;
        $ENTRIES = a.a(superappCartsAnalytics$ScreenStateArr);
    }

    public SuperappCartsAnalytics$ScreenState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappCartsAnalytics$ScreenState valueOf(String str) {
        return (SuperappCartsAnalytics$ScreenState) Enum.valueOf(SuperappCartsAnalytics$ScreenState.class, str);
    }

    public static SuperappCartsAnalytics$ScreenState[] values() {
        return (SuperappCartsAnalytics$ScreenState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
