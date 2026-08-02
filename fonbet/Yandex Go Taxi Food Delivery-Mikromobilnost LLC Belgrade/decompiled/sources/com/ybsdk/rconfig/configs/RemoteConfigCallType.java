package com.ybsdk.rconfig.configs;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ybsdk/rconfig/configs/RemoteConfigCallType;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT_RESULT", "PLAIN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RemoteConfigCallType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RemoteConfigCallType[] $VALUES;
    public static final RemoteConfigCallType DEFAULT_RESULT = new RemoteConfigCallType("DEFAULT_RESULT", 0);
    public static final RemoteConfigCallType PLAIN = new RemoteConfigCallType("PLAIN", 1);

    private static final /* synthetic */ RemoteConfigCallType[] $values() {
        return new RemoteConfigCallType[]{DEFAULT_RESULT, PLAIN};
    }

    static {
        RemoteConfigCallType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private RemoteConfigCallType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static RemoteConfigCallType valueOf(String str) {
        return (RemoteConfigCallType) Enum.valueOf(RemoteConfigCallType.class, str);
    }

    public static RemoteConfigCallType[] values() {
        return (RemoteConfigCallType[]) $VALUES.clone();
    }
}
