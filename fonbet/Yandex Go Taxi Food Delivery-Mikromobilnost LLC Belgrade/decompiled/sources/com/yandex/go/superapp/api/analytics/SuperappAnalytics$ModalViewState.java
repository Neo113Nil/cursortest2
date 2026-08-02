package com.yandex.go.superapp.api.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/superapp/api/analytics/SuperappAnalytics$ModalViewState", "", "Lcom/yandex/go/superapp/api/analytics/SuperappAnalytics$ModalViewState;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Expanded", "Collapsed", "Settling", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SuperappAnalytics$ModalViewState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappAnalytics$ModalViewState[] $VALUES;
    public static final SuperappAnalytics$ModalViewState Collapsed;
    public static final SuperappAnalytics$ModalViewState Expanded;
    public static final SuperappAnalytics$ModalViewState Settling;
    private final String eventValue;

    static {
        SuperappAnalytics$ModalViewState superappAnalytics$ModalViewState = new SuperappAnalytics$ModalViewState("Expanded", 0, "expanded");
        Expanded = superappAnalytics$ModalViewState;
        SuperappAnalytics$ModalViewState superappAnalytics$ModalViewState2 = new SuperappAnalytics$ModalViewState("Collapsed", 1, "collapsed");
        Collapsed = superappAnalytics$ModalViewState2;
        SuperappAnalytics$ModalViewState superappAnalytics$ModalViewState3 = new SuperappAnalytics$ModalViewState("Settling", 2, "settling");
        Settling = superappAnalytics$ModalViewState3;
        SuperappAnalytics$ModalViewState[] superappAnalytics$ModalViewStateArr = {superappAnalytics$ModalViewState, superappAnalytics$ModalViewState2, superappAnalytics$ModalViewState3};
        $VALUES = superappAnalytics$ModalViewStateArr;
        $ENTRIES = a.a(superappAnalytics$ModalViewStateArr);
    }

    public SuperappAnalytics$ModalViewState(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappAnalytics$ModalViewState valueOf(String str) {
        return (SuperappAnalytics$ModalViewState) Enum.valueOf(SuperappAnalytics$ModalViewState.class, str);
    }

    public static SuperappAnalytics$ModalViewState[] values() {
        return (SuperappAnalytics$ModalViewState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
