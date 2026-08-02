package com.yandex.fintechsdk.adapters.yb.sdk.api.upgradesplit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/yandex/fintechsdk/adapters/yb/sdk/api/upgradesplit/UpgradeSplitResult$Status", "", "Lcom/yandex/fintechsdk/adapters/yb/sdk/api/upgradesplit/UpgradeSplitResult$Status;", "SUCCESS", "CANCELED", "FAILURE", "INVALID_DEEPLINK", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class UpgradeSplitResult$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpgradeSplitResult$Status[] $VALUES;
    public static final UpgradeSplitResult$Status CANCELED;
    public static final UpgradeSplitResult$Status FAILURE;
    public static final UpgradeSplitResult$Status INVALID_DEEPLINK;
    public static final UpgradeSplitResult$Status SUCCESS;

    static {
        UpgradeSplitResult$Status upgradeSplitResult$Status = new UpgradeSplitResult$Status("SUCCESS", 0);
        SUCCESS = upgradeSplitResult$Status;
        UpgradeSplitResult$Status upgradeSplitResult$Status2 = new UpgradeSplitResult$Status("CANCELED", 1);
        CANCELED = upgradeSplitResult$Status2;
        UpgradeSplitResult$Status upgradeSplitResult$Status3 = new UpgradeSplitResult$Status("FAILURE", 2);
        FAILURE = upgradeSplitResult$Status3;
        UpgradeSplitResult$Status upgradeSplitResult$Status4 = new UpgradeSplitResult$Status("INVALID_DEEPLINK", 3);
        INVALID_DEEPLINK = upgradeSplitResult$Status4;
        UpgradeSplitResult$Status[] upgradeSplitResult$StatusArr = {upgradeSplitResult$Status, upgradeSplitResult$Status2, upgradeSplitResult$Status3, upgradeSplitResult$Status4};
        $VALUES = upgradeSplitResult$StatusArr;
        $ENTRIES = a.a(upgradeSplitResult$StatusArr);
    }

    public static UpgradeSplitResult$Status valueOf(String str) {
        return (UpgradeSplitResult$Status) Enum.valueOf(UpgradeSplitResult$Status.class, str);
    }

    public static UpgradeSplitResult$Status[] values() {
        return (UpgradeSplitResult$Status[]) $VALUES.clone();
    }
}
