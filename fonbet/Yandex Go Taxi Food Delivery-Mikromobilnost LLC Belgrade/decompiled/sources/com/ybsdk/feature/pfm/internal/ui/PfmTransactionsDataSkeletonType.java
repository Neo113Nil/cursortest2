package com.ybsdk.feature.pfm.internal.ui;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/feature/pfm/internal/ui/PfmTransactionsDataSkeletonType;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "CUSTOM_FILTERS", "CATEGORY_CHANGED", "feature-pfm_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PfmTransactionsDataSkeletonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PfmTransactionsDataSkeletonType[] $VALUES;
    public static final PfmTransactionsDataSkeletonType IDLE = new PfmTransactionsDataSkeletonType("IDLE", 0);
    public static final PfmTransactionsDataSkeletonType CUSTOM_FILTERS = new PfmTransactionsDataSkeletonType("CUSTOM_FILTERS", 1);
    public static final PfmTransactionsDataSkeletonType CATEGORY_CHANGED = new PfmTransactionsDataSkeletonType("CATEGORY_CHANGED", 2);

    private static final /* synthetic */ PfmTransactionsDataSkeletonType[] $values() {
        return new PfmTransactionsDataSkeletonType[]{IDLE, CUSTOM_FILTERS, CATEGORY_CHANGED};
    }

    static {
        PfmTransactionsDataSkeletonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PfmTransactionsDataSkeletonType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PfmTransactionsDataSkeletonType valueOf(String str) {
        return (PfmTransactionsDataSkeletonType) Enum.valueOf(PfmTransactionsDataSkeletonType.class, str);
    }

    public static PfmTransactionsDataSkeletonType[] values() {
        return (PfmTransactionsDataSkeletonType[]) $VALUES.clone();
    }
}
