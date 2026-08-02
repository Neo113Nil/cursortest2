package com.ybsdk.screens.changephone.push;

import defpackage.ce9;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/screens/changephone/push/ChangePhoneApplicationSilentPushParser$Companion$Statuses", "", "Lcom/ybsdk/screens/changephone/push/ChangePhoneApplicationSilentPushParser$Companion$Statuses;", "<init>", "(Ljava/lang/String;I)V", "Companion", "ce9", "CREATED", "READY_FOR_CONFIRMATION", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangePhoneApplicationSilentPushParser$Companion$Statuses {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ChangePhoneApplicationSilentPushParser$Companion$Statuses[] $VALUES;
    public static final ce9 Companion;
    public static final ChangePhoneApplicationSilentPushParser$Companion$Statuses CREATED = new ChangePhoneApplicationSilentPushParser$Companion$Statuses("CREATED", 0);
    public static final ChangePhoneApplicationSilentPushParser$Companion$Statuses READY_FOR_CONFIRMATION = new ChangePhoneApplicationSilentPushParser$Companion$Statuses("READY_FOR_CONFIRMATION", 1);

    private static final /* synthetic */ ChangePhoneApplicationSilentPushParser$Companion$Statuses[] $values() {
        return new ChangePhoneApplicationSilentPushParser$Companion$Statuses[]{CREATED, READY_FOR_CONFIRMATION};
    }

    static {
        ChangePhoneApplicationSilentPushParser$Companion$Statuses[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new ce9();
    }

    private ChangePhoneApplicationSilentPushParser$Companion$Statuses(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ChangePhoneApplicationSilentPushParser$Companion$Statuses valueOf(String str) {
        return (ChangePhoneApplicationSilentPushParser$Companion$Statuses) Enum.valueOf(ChangePhoneApplicationSilentPushParser$Companion$Statuses.class, str);
    }

    public static ChangePhoneApplicationSilentPushParser$Companion$Statuses[] values() {
        return (ChangePhoneApplicationSilentPushParser$Companion$Statuses[]) $VALUES.clone();
    }
}
