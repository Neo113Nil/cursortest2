package com.yandex.go.lifecycle;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/lifecycle/ObtainType;", "", "DO_NOT_WAIT", "WAIT_WITHOUT_TIMEOUT", "WAIT_UNTIL_TIMEOUT", "go-client-android.features.app_lifecycle:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ObtainType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ObtainType[] $VALUES;
    public static final ObtainType DO_NOT_WAIT;
    public static final ObtainType WAIT_UNTIL_TIMEOUT;
    public static final ObtainType WAIT_WITHOUT_TIMEOUT;

    static {
        ObtainType obtainType = new ObtainType("DO_NOT_WAIT", 0);
        DO_NOT_WAIT = obtainType;
        ObtainType obtainType2 = new ObtainType("WAIT_WITHOUT_TIMEOUT", 1);
        WAIT_WITHOUT_TIMEOUT = obtainType2;
        ObtainType obtainType3 = new ObtainType("WAIT_UNTIL_TIMEOUT", 2);
        WAIT_UNTIL_TIMEOUT = obtainType3;
        ObtainType[] obtainTypeArr = {obtainType, obtainType2, obtainType3};
        $VALUES = obtainTypeArr;
        $ENTRIES = kotlin.enums.a.a(obtainTypeArr);
    }

    public static ObtainType valueOf(String str) {
        return (ObtainType) Enum.valueOf(ObtainType.class, str);
    }

    public static ObtainType[] values() {
        return (ObtainType[]) $VALUES.clone();
    }
}
