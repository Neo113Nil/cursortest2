package com.yandex.passport.internal.upgrader;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/upgrader/UpgradeStatusRequestType;", "", "CACHED", "ACTUAL", "RELEVANCE_CHECK", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpgradeStatusRequestType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpgradeStatusRequestType[] $VALUES;
    public static final UpgradeStatusRequestType ACTUAL;
    public static final UpgradeStatusRequestType CACHED;
    public static final UpgradeStatusRequestType RELEVANCE_CHECK;

    static {
        UpgradeStatusRequestType upgradeStatusRequestType = new UpgradeStatusRequestType("CACHED", 0);
        CACHED = upgradeStatusRequestType;
        UpgradeStatusRequestType upgradeStatusRequestType2 = new UpgradeStatusRequestType("ACTUAL", 1);
        ACTUAL = upgradeStatusRequestType2;
        UpgradeStatusRequestType upgradeStatusRequestType3 = new UpgradeStatusRequestType("RELEVANCE_CHECK", 2);
        RELEVANCE_CHECK = upgradeStatusRequestType3;
        UpgradeStatusRequestType[] upgradeStatusRequestTypeArr = {upgradeStatusRequestType, upgradeStatusRequestType2, upgradeStatusRequestType3};
        $VALUES = upgradeStatusRequestTypeArr;
        $ENTRIES = kotlin.enums.a.a(upgradeStatusRequestTypeArr);
    }

    public static UpgradeStatusRequestType valueOf(String str) {
        return (UpgradeStatusRequestType) Enum.valueOf(UpgradeStatusRequestType.class, str);
    }

    public static UpgradeStatusRequestType[] values() {
        return (UpgradeStatusRequestType[]) $VALUES.clone();
    }
}
