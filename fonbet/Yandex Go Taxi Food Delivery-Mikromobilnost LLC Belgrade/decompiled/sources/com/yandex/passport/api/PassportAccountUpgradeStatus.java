package com.yandex.passport.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/passport/api/PassportAccountUpgradeStatus;", "", "NOT_NEEDED", "NEEDED", "SKIPPED", "REQUIRED", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PassportAccountUpgradeStatus {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PassportAccountUpgradeStatus[] $VALUES;
    public static final PassportAccountUpgradeStatus NEEDED;
    public static final PassportAccountUpgradeStatus NOT_NEEDED;
    public static final PassportAccountUpgradeStatus REQUIRED;
    public static final PassportAccountUpgradeStatus SKIPPED;

    static {
        PassportAccountUpgradeStatus passportAccountUpgradeStatus = new PassportAccountUpgradeStatus("NOT_NEEDED", 0);
        NOT_NEEDED = passportAccountUpgradeStatus;
        PassportAccountUpgradeStatus passportAccountUpgradeStatus2 = new PassportAccountUpgradeStatus("NEEDED", 1);
        NEEDED = passportAccountUpgradeStatus2;
        PassportAccountUpgradeStatus passportAccountUpgradeStatus3 = new PassportAccountUpgradeStatus("SKIPPED", 2);
        SKIPPED = passportAccountUpgradeStatus3;
        PassportAccountUpgradeStatus passportAccountUpgradeStatus4 = new PassportAccountUpgradeStatus("REQUIRED", 3);
        REQUIRED = passportAccountUpgradeStatus4;
        PassportAccountUpgradeStatus[] passportAccountUpgradeStatusArr = {passportAccountUpgradeStatus, passportAccountUpgradeStatus2, passportAccountUpgradeStatus3, passportAccountUpgradeStatus4};
        $VALUES = passportAccountUpgradeStatusArr;
        $ENTRIES = kotlin.enums.a.a(passportAccountUpgradeStatusArr);
    }

    public static PassportAccountUpgradeStatus valueOf(String str) {
        return (PassportAccountUpgradeStatus) Enum.valueOf(PassportAccountUpgradeStatus.class, str);
    }

    public static PassportAccountUpgradeStatus[] values() {
        return (PassportAccountUpgradeStatus[]) $VALUES.clone();
    }
}
