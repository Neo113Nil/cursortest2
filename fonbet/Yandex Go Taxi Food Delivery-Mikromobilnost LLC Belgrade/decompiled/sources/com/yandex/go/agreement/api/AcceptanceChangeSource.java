package com.yandex.go.agreement.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/agreement/api/AcceptanceChangeSource;", "", "LAUNCH", "ZONE_INFO", "USER_ACTION", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AcceptanceChangeSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AcceptanceChangeSource[] $VALUES;
    public static final AcceptanceChangeSource LAUNCH;
    public static final AcceptanceChangeSource USER_ACTION;
    public static final AcceptanceChangeSource ZONE_INFO;

    static {
        AcceptanceChangeSource acceptanceChangeSource = new AcceptanceChangeSource("LAUNCH", 0);
        LAUNCH = acceptanceChangeSource;
        AcceptanceChangeSource acceptanceChangeSource2 = new AcceptanceChangeSource("ZONE_INFO", 1);
        ZONE_INFO = acceptanceChangeSource2;
        AcceptanceChangeSource acceptanceChangeSource3 = new AcceptanceChangeSource("USER_ACTION", 2);
        USER_ACTION = acceptanceChangeSource3;
        AcceptanceChangeSource[] acceptanceChangeSourceArr = {acceptanceChangeSource, acceptanceChangeSource2, acceptanceChangeSource3};
        $VALUES = acceptanceChangeSourceArr;
        $ENTRIES = a.a(acceptanceChangeSourceArr);
    }

    public static AcceptanceChangeSource valueOf(String str) {
        return (AcceptanceChangeSource) Enum.valueOf(AcceptanceChangeSource.class, str);
    }

    public static AcceptanceChangeSource[] values() {
        return (AcceptanceChangeSource[]) $VALUES.clone();
    }
}
