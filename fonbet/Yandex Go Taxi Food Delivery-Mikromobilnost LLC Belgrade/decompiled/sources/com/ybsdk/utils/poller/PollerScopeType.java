package com.ybsdk.utils.poller;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/utils/poller/PollerScopeType;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENT", "SDK", "HOST_ACTIVITY", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PollerScopeType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PollerScopeType[] $VALUES;
    public static final PollerScopeType CURRENT = new PollerScopeType("CURRENT", 0);
    public static final PollerScopeType SDK = new PollerScopeType("SDK", 1);
    public static final PollerScopeType HOST_ACTIVITY = new PollerScopeType("HOST_ACTIVITY", 2);

    private static final /* synthetic */ PollerScopeType[] $values() {
        return new PollerScopeType[]{CURRENT, SDK, HOST_ACTIVITY};
    }

    static {
        PollerScopeType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PollerScopeType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PollerScopeType valueOf(String str) {
        return (PollerScopeType) Enum.valueOf(PollerScopeType.class, str);
    }

    public static PollerScopeType[] values() {
        return (PollerScopeType[]) $VALUES.clone();
    }
}
