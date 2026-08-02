package com.ybsdk.api.entities.creditlimit;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/api/entities/creditlimit/YBCreditLimitPlansEntity$UpgradeStatus", "", "Lcom/ybsdk/api/entities/creditlimit/YBCreditLimitPlansEntity$UpgradeStatus;", "<init>", "(Ljava/lang/String;I)V", "UPGRADED", "SHOW_UPGRADE", "DONT_SHOW_UPGRADE", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBCreditLimitPlansEntity$UpgradeStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBCreditLimitPlansEntity$UpgradeStatus[] $VALUES;
    public static final YBCreditLimitPlansEntity$UpgradeStatus UPGRADED = new YBCreditLimitPlansEntity$UpgradeStatus("UPGRADED", 0);
    public static final YBCreditLimitPlansEntity$UpgradeStatus SHOW_UPGRADE = new YBCreditLimitPlansEntity$UpgradeStatus("SHOW_UPGRADE", 1);
    public static final YBCreditLimitPlansEntity$UpgradeStatus DONT_SHOW_UPGRADE = new YBCreditLimitPlansEntity$UpgradeStatus("DONT_SHOW_UPGRADE", 2);

    private static final /* synthetic */ YBCreditLimitPlansEntity$UpgradeStatus[] $values() {
        return new YBCreditLimitPlansEntity$UpgradeStatus[]{UPGRADED, SHOW_UPGRADE, DONT_SHOW_UPGRADE};
    }

    static {
        YBCreditLimitPlansEntity$UpgradeStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBCreditLimitPlansEntity$UpgradeStatus(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBCreditLimitPlansEntity$UpgradeStatus valueOf(String str) {
        return (YBCreditLimitPlansEntity$UpgradeStatus) Enum.valueOf(YBCreditLimitPlansEntity$UpgradeStatus.class, str);
    }

    public static YBCreditLimitPlansEntity$UpgradeStatus[] values() {
        return (YBCreditLimitPlansEntity$UpgradeStatus[]) $VALUES.clone();
    }
}
