package com.yandex.go.shortcuts.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/shortcuts/analytic/MainScreenAnalytics$Action", "", "Lcom/yandex/go/shortcuts/analytic/MainScreenAnalytics$Action;", "", "key", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "PULL", "TAP", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MainScreenAnalytics$Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MainScreenAnalytics$Action[] $VALUES;
    public static final MainScreenAnalytics$Action PULL;
    public static final MainScreenAnalytics$Action TAP;
    private final String key;

    static {
        MainScreenAnalytics$Action mainScreenAnalytics$Action = new MainScreenAnalytics$Action("PULL", 0, "pull");
        PULL = mainScreenAnalytics$Action;
        MainScreenAnalytics$Action mainScreenAnalytics$Action2 = new MainScreenAnalytics$Action("TAP", 1, "tap");
        TAP = mainScreenAnalytics$Action2;
        MainScreenAnalytics$Action[] mainScreenAnalytics$ActionArr = {mainScreenAnalytics$Action, mainScreenAnalytics$Action2};
        $VALUES = mainScreenAnalytics$ActionArr;
        $ENTRIES = a.a(mainScreenAnalytics$ActionArr);
    }

    public MainScreenAnalytics$Action(String str, int i, String str2) {
        this.key = str2;
    }

    public static MainScreenAnalytics$Action valueOf(String str) {
        return (MainScreenAnalytics$Action) Enum.valueOf(MainScreenAnalytics$Action.class, str);
    }

    public static MainScreenAnalytics$Action[] values() {
        return (MainScreenAnalytics$Action[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getKey() {
        return this.key;
    }
}
