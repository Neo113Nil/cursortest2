package com.ybsdk.feature.transfer.version2.internal.screens.dashboard.presentation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardSlideableView$State$Loading$SkeletonType", "", "Lcom/ybsdk/feature/transfer/version2/internal/screens/dashboard/presentation/TransfersDashboardSlideableView$State$Loading$SkeletonType;", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "WITH_WIDGET", "feature-transfer-version2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransfersDashboardSlideableView$State$Loading$SkeletonType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransfersDashboardSlideableView$State$Loading$SkeletonType[] $VALUES;
    public static final TransfersDashboardSlideableView$State$Loading$SkeletonType DEFAULT = new TransfersDashboardSlideableView$State$Loading$SkeletonType("DEFAULT", 0);
    public static final TransfersDashboardSlideableView$State$Loading$SkeletonType WITH_WIDGET = new TransfersDashboardSlideableView$State$Loading$SkeletonType("WITH_WIDGET", 1);

    private static final /* synthetic */ TransfersDashboardSlideableView$State$Loading$SkeletonType[] $values() {
        return new TransfersDashboardSlideableView$State$Loading$SkeletonType[]{DEFAULT, WITH_WIDGET};
    }

    static {
        TransfersDashboardSlideableView$State$Loading$SkeletonType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TransfersDashboardSlideableView$State$Loading$SkeletonType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TransfersDashboardSlideableView$State$Loading$SkeletonType valueOf(String str) {
        return (TransfersDashboardSlideableView$State$Loading$SkeletonType) Enum.valueOf(TransfersDashboardSlideableView$State$Loading$SkeletonType.class, str);
    }

    public static TransfersDashboardSlideableView$State$Loading$SkeletonType[] values() {
        return (TransfersDashboardSlideableView$State$Loading$SkeletonType[]) $VALUES.clone();
    }
}
