package com.ybsdk.api.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/ybsdk/api/entities/YBSdkEvent$Result$CreditLimitPaymentMethod$Status", "", "Lcom/ybsdk/api/entities/YBSdkEvent$Result$CreditLimitPaymentMethod$Status;", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "CANCELED", "UNKNOWN", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBSdkEvent$Result$CreditLimitPaymentMethod$Status {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBSdkEvent$Result$CreditLimitPaymentMethod$Status[] $VALUES;
    public static final YBSdkEvent$Result$CreditLimitPaymentMethod$Status SUCCESS = new YBSdkEvent$Result$CreditLimitPaymentMethod$Status("SUCCESS", 0);
    public static final YBSdkEvent$Result$CreditLimitPaymentMethod$Status FAIL = new YBSdkEvent$Result$CreditLimitPaymentMethod$Status("FAIL", 1);
    public static final YBSdkEvent$Result$CreditLimitPaymentMethod$Status CANCELED = new YBSdkEvent$Result$CreditLimitPaymentMethod$Status("CANCELED", 2);
    public static final YBSdkEvent$Result$CreditLimitPaymentMethod$Status UNKNOWN = new YBSdkEvent$Result$CreditLimitPaymentMethod$Status("UNKNOWN", 3);

    private static final /* synthetic */ YBSdkEvent$Result$CreditLimitPaymentMethod$Status[] $values() {
        return new YBSdkEvent$Result$CreditLimitPaymentMethod$Status[]{SUCCESS, FAIL, CANCELED, UNKNOWN};
    }

    static {
        YBSdkEvent$Result$CreditLimitPaymentMethod$Status[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBSdkEvent$Result$CreditLimitPaymentMethod$Status(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBSdkEvent$Result$CreditLimitPaymentMethod$Status valueOf(String str) {
        return (YBSdkEvent$Result$CreditLimitPaymentMethod$Status) Enum.valueOf(YBSdkEvent$Result$CreditLimitPaymentMethod$Status.class, str);
    }

    public static YBSdkEvent$Result$CreditLimitPaymentMethod$Status[] values() {
        return (YBSdkEvent$Result$CreditLimitPaymentMethod$Status[]) $VALUES.clone();
    }
}
