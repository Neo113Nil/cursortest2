package com.ybsdk.feature.dashboard.internal.ui.dashboard3;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardCollapsedAnimation$CollapsedState", "", "Lcom/ybsdk/feature/dashboard/internal/ui/dashboard3/DashboardCollapsedAnimation$CollapsedState;", "<init>", "(Ljava/lang/String;I)V", "EXPANDED", "COLLAPSED", "SCROLL", "feature-dashboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DashboardCollapsedAnimation$CollapsedState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DashboardCollapsedAnimation$CollapsedState[] $VALUES;
    public static final DashboardCollapsedAnimation$CollapsedState EXPANDED = new DashboardCollapsedAnimation$CollapsedState("EXPANDED", 0);
    public static final DashboardCollapsedAnimation$CollapsedState COLLAPSED = new DashboardCollapsedAnimation$CollapsedState("COLLAPSED", 1);
    public static final DashboardCollapsedAnimation$CollapsedState SCROLL = new DashboardCollapsedAnimation$CollapsedState("SCROLL", 2);

    private static final /* synthetic */ DashboardCollapsedAnimation$CollapsedState[] $values() {
        return new DashboardCollapsedAnimation$CollapsedState[]{EXPANDED, COLLAPSED, SCROLL};
    }

    static {
        DashboardCollapsedAnimation$CollapsedState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DashboardCollapsedAnimation$CollapsedState(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DashboardCollapsedAnimation$CollapsedState valueOf(String str) {
        return (DashboardCollapsedAnimation$CollapsedState) Enum.valueOf(DashboardCollapsedAnimation$CollapsedState.class, str);
    }

    public static DashboardCollapsedAnimation$CollapsedState[] values() {
        return (DashboardCollapsedAnimation$CollapsedState[]) $VALUES.clone();
    }
}
