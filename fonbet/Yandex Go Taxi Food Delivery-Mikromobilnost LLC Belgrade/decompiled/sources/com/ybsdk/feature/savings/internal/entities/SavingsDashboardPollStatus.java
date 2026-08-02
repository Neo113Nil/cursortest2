package com.ybsdk.feature.savings.internal.entities;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/feature/savings/internal/entities/SavingsDashboardPollStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NO_POLLING", "OPENING_ACCOUNT_POLLING", "CLOSING_ACCOUNT_POLLING", "DATA_POLLING", "feature-savings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsDashboardPollStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsDashboardPollStatus[] $VALUES;
    public static final SavingsDashboardPollStatus NO_POLLING = new SavingsDashboardPollStatus("NO_POLLING", 0);
    public static final SavingsDashboardPollStatus OPENING_ACCOUNT_POLLING = new SavingsDashboardPollStatus("OPENING_ACCOUNT_POLLING", 1);
    public static final SavingsDashboardPollStatus CLOSING_ACCOUNT_POLLING = new SavingsDashboardPollStatus("CLOSING_ACCOUNT_POLLING", 2);
    public static final SavingsDashboardPollStatus DATA_POLLING = new SavingsDashboardPollStatus("DATA_POLLING", 3);

    private static final /* synthetic */ SavingsDashboardPollStatus[] $values() {
        return new SavingsDashboardPollStatus[]{NO_POLLING, OPENING_ACCOUNT_POLLING, CLOSING_ACCOUNT_POLLING, DATA_POLLING};
    }

    static {
        SavingsDashboardPollStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private SavingsDashboardPollStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsDashboardPollStatus valueOf(String str) {
        return (SavingsDashboardPollStatus) Enum.valueOf(SavingsDashboardPollStatus.class, str);
    }

    public static SavingsDashboardPollStatus[] values() {
        return (SavingsDashboardPollStatus[]) $VALUES.clone();
    }
}
