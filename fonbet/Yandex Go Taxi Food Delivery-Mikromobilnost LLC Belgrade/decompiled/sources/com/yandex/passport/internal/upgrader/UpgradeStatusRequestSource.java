package com.yandex.passport.internal.upgrader;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/passport/internal/upgrader/UpgradeStatusRequestSource;", "", "REGULAR", "RELEVANCE", "REQUEST", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class UpgradeStatusRequestSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpgradeStatusRequestSource[] $VALUES;
    public static final UpgradeStatusRequestSource REGULAR;
    public static final UpgradeStatusRequestSource RELEVANCE;
    public static final UpgradeStatusRequestSource REQUEST;

    static {
        UpgradeStatusRequestSource upgradeStatusRequestSource = new UpgradeStatusRequestSource("REGULAR", 0);
        REGULAR = upgradeStatusRequestSource;
        UpgradeStatusRequestSource upgradeStatusRequestSource2 = new UpgradeStatusRequestSource("RELEVANCE", 1);
        RELEVANCE = upgradeStatusRequestSource2;
        UpgradeStatusRequestSource upgradeStatusRequestSource3 = new UpgradeStatusRequestSource("REQUEST", 2);
        REQUEST = upgradeStatusRequestSource3;
        UpgradeStatusRequestSource[] upgradeStatusRequestSourceArr = {upgradeStatusRequestSource, upgradeStatusRequestSource2, upgradeStatusRequestSource3};
        $VALUES = upgradeStatusRequestSourceArr;
        $ENTRIES = kotlin.enums.a.a(upgradeStatusRequestSourceArr);
    }

    public static UpgradeStatusRequestSource valueOf(String str) {
        return (UpgradeStatusRequestSource) Enum.valueOf(UpgradeStatusRequestSource.class, str);
    }

    public static UpgradeStatusRequestSource[] values() {
        return (UpgradeStatusRequestSource[]) $VALUES.clone();
    }
}
