package com.ybsdk.screens.initial.deeplink;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/screens/initial/deeplink/PendingDeeplinkListConfig$DefaultScreenBehavior", "", "Lcom/ybsdk/screens/initial/deeplink/PendingDeeplinkListConfig$DefaultScreenBehavior;", "<init>", "(Ljava/lang/String;I)V", "INCLUDE", "SKIP", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PendingDeeplinkListConfig$DefaultScreenBehavior {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PendingDeeplinkListConfig$DefaultScreenBehavior[] $VALUES;
    public static final PendingDeeplinkListConfig$DefaultScreenBehavior INCLUDE = new PendingDeeplinkListConfig$DefaultScreenBehavior("INCLUDE", 0);
    public static final PendingDeeplinkListConfig$DefaultScreenBehavior SKIP = new PendingDeeplinkListConfig$DefaultScreenBehavior("SKIP", 1);

    private static final /* synthetic */ PendingDeeplinkListConfig$DefaultScreenBehavior[] $values() {
        return new PendingDeeplinkListConfig$DefaultScreenBehavior[]{INCLUDE, SKIP};
    }

    static {
        PendingDeeplinkListConfig$DefaultScreenBehavior[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private PendingDeeplinkListConfig$DefaultScreenBehavior(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static PendingDeeplinkListConfig$DefaultScreenBehavior valueOf(String str) {
        return (PendingDeeplinkListConfig$DefaultScreenBehavior) Enum.valueOf(PendingDeeplinkListConfig$DefaultScreenBehavior.class, str);
    }

    public static PendingDeeplinkListConfig$DefaultScreenBehavior[] values() {
        return (PendingDeeplinkListConfig$DefaultScreenBehavior[]) $VALUES.clone();
    }
}
