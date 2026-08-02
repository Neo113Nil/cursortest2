package com.ybsdk.feature.savings.internal.screens.dashboard.v4;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/feature/savings/internal/screens/dashboard/v4/SavingsDashboardStateV4$Status", "", "Lcom/ybsdk/feature/savings/internal/screens/dashboard/v4/SavingsDashboardStateV4$Status;", "<init>", "(Ljava/lang/String;I)V", "Loading", "Error", "Content", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsDashboardStateV4$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsDashboardStateV4$Status[] $VALUES;
    public static final SavingsDashboardStateV4$Status Loading = new SavingsDashboardStateV4$Status("Loading", 0);
    public static final SavingsDashboardStateV4$Status Error = new SavingsDashboardStateV4$Status("Error", 1);
    public static final SavingsDashboardStateV4$Status Content = new SavingsDashboardStateV4$Status("Content", 2);

    private static final /* synthetic */ SavingsDashboardStateV4$Status[] $values() {
        return new SavingsDashboardStateV4$Status[]{Loading, Error, Content};
    }

    static {
        SavingsDashboardStateV4$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SavingsDashboardStateV4$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsDashboardStateV4$Status valueOf(String str) {
        return (SavingsDashboardStateV4$Status) Enum.valueOf(SavingsDashboardStateV4$Status.class, str);
    }

    public static SavingsDashboardStateV4$Status[] values() {
        return (SavingsDashboardStateV4$Status[]) $VALUES.clone();
    }
}
