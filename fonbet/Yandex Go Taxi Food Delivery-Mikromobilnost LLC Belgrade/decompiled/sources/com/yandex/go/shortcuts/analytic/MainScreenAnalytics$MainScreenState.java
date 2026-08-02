package com.yandex.go.shortcuts.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/shortcuts/analytic/MainScreenAnalytics$MainScreenState", "", "Lcom/yandex/go/shortcuts/analytic/MainScreenAnalytics$MainScreenState;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "MINIMIZED", "COLLAPSED", "EXPANDED", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MainScreenAnalytics$MainScreenState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenAnalytics$MainScreenState[] $VALUES;
    public static final MainScreenAnalytics$MainScreenState COLLAPSED;
    public static final MainScreenAnalytics$MainScreenState EXPANDED;
    public static final MainScreenAnalytics$MainScreenState MINIMIZED;
    private final String value;

    static {
        MainScreenAnalytics$MainScreenState mainScreenAnalytics$MainScreenState = new MainScreenAnalytics$MainScreenState("MINIMIZED", 0, "mini");
        MINIMIZED = mainScreenAnalytics$MainScreenState;
        MainScreenAnalytics$MainScreenState mainScreenAnalytics$MainScreenState2 = new MainScreenAnalytics$MainScreenState("COLLAPSED", 1, "center");
        COLLAPSED = mainScreenAnalytics$MainScreenState2;
        MainScreenAnalytics$MainScreenState mainScreenAnalytics$MainScreenState3 = new MainScreenAnalytics$MainScreenState("EXPANDED", 2, "fullscreen");
        EXPANDED = mainScreenAnalytics$MainScreenState3;
        MainScreenAnalytics$MainScreenState[] mainScreenAnalytics$MainScreenStateArr = {mainScreenAnalytics$MainScreenState, mainScreenAnalytics$MainScreenState2, mainScreenAnalytics$MainScreenState3};
        $VALUES = mainScreenAnalytics$MainScreenStateArr;
        $ENTRIES = a.a(mainScreenAnalytics$MainScreenStateArr);
    }

    public MainScreenAnalytics$MainScreenState(String str, int i, String str2) {
        this.value = str2;
    }

    public static MainScreenAnalytics$MainScreenState valueOf(String str) {
        return (MainScreenAnalytics$MainScreenState) Enum.valueOf(MainScreenAnalytics$MainScreenState.class, str);
    }

    public static MainScreenAnalytics$MainScreenState[] values() {
        return (MainScreenAnalytics$MainScreenState[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
