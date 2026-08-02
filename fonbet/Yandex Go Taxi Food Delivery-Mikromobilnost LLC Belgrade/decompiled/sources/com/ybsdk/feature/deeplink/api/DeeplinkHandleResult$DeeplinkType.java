package com.ybsdk.feature.deeplink.api;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/feature/deeplink/api/DeeplinkHandleResult$DeeplinkType", "", "Lcom/ybsdk/feature/deeplink/api/DeeplinkHandleResult$DeeplinkType;", "<init>", "(Ljava/lang/String;I)V", "ACTION", "SCREEN_OPEN", "feature-deeplink-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeeplinkHandleResult$DeeplinkType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeeplinkHandleResult$DeeplinkType[] $VALUES;
    public static final DeeplinkHandleResult$DeeplinkType ACTION = new DeeplinkHandleResult$DeeplinkType("ACTION", 0);
    public static final DeeplinkHandleResult$DeeplinkType SCREEN_OPEN = new DeeplinkHandleResult$DeeplinkType("SCREEN_OPEN", 1);

    private static final /* synthetic */ DeeplinkHandleResult$DeeplinkType[] $values() {
        return new DeeplinkHandleResult$DeeplinkType[]{ACTION, SCREEN_OPEN};
    }

    static {
        DeeplinkHandleResult$DeeplinkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private DeeplinkHandleResult$DeeplinkType(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DeeplinkHandleResult$DeeplinkType valueOf(String str) {
        return (DeeplinkHandleResult$DeeplinkType) Enum.valueOf(DeeplinkHandleResult$DeeplinkType.class, str);
    }

    public static DeeplinkHandleResult$DeeplinkType[] values() {
        return (DeeplinkHandleResult$DeeplinkType[]) $VALUES.clone();
    }
}
