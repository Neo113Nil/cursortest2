package com.ybsdk.feature.split.deposit.internal.domain.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/split/deposit/internal/domain/model/SplitDepositPageData$AutoTopupData$AutoTopupStatus", "", "Lcom/ybsdk/feature/split/deposit/internal/domain/model/SplitDepositPageData$AutoTopupData$AutoTopupStatus;", "<init>", "(Ljava/lang/String;I)V", "ENABLED", "DISABLED", "feature-split-deposit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitDepositPageData$AutoTopupData$AutoTopupStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SplitDepositPageData$AutoTopupData$AutoTopupStatus[] $VALUES;
    public static final SplitDepositPageData$AutoTopupData$AutoTopupStatus ENABLED = new SplitDepositPageData$AutoTopupData$AutoTopupStatus("ENABLED", 0);
    public static final SplitDepositPageData$AutoTopupData$AutoTopupStatus DISABLED = new SplitDepositPageData$AutoTopupData$AutoTopupStatus("DISABLED", 1);

    private static final /* synthetic */ SplitDepositPageData$AutoTopupData$AutoTopupStatus[] $values() {
        return new SplitDepositPageData$AutoTopupData$AutoTopupStatus[]{ENABLED, DISABLED};
    }

    static {
        SplitDepositPageData$AutoTopupData$AutoTopupStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SplitDepositPageData$AutoTopupData$AutoTopupStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SplitDepositPageData$AutoTopupData$AutoTopupStatus valueOf(String str) {
        return (SplitDepositPageData$AutoTopupData$AutoTopupStatus) Enum.valueOf(SplitDepositPageData$AutoTopupData$AutoTopupStatus.class, str);
    }

    public static SplitDepositPageData$AutoTopupData$AutoTopupStatus[] values() {
        return (SplitDepositPageData$AutoTopupData$AutoTopupStatus[]) $VALUES.clone();
    }
}
