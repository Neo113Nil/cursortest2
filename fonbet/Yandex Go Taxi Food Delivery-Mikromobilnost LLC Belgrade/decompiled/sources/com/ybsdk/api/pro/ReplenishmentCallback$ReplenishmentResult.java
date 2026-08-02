package com.ybsdk.api.pro;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/api/pro/ReplenishmentCallback$ReplenishmentResult", "", "Lcom/ybsdk/api/pro/ReplenishmentCallback$ReplenishmentResult;", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "FAIL", "PENDING", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ReplenishmentCallback$ReplenishmentResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ReplenishmentCallback$ReplenishmentResult[] $VALUES;
    public static final ReplenishmentCallback$ReplenishmentResult SUCCESS = new ReplenishmentCallback$ReplenishmentResult("SUCCESS", 0);
    public static final ReplenishmentCallback$ReplenishmentResult FAIL = new ReplenishmentCallback$ReplenishmentResult("FAIL", 1);
    public static final ReplenishmentCallback$ReplenishmentResult PENDING = new ReplenishmentCallback$ReplenishmentResult("PENDING", 2);

    private static final /* synthetic */ ReplenishmentCallback$ReplenishmentResult[] $values() {
        return new ReplenishmentCallback$ReplenishmentResult[]{SUCCESS, FAIL, PENDING};
    }

    static {
        ReplenishmentCallback$ReplenishmentResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ReplenishmentCallback$ReplenishmentResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ReplenishmentCallback$ReplenishmentResult valueOf(String str) {
        return (ReplenishmentCallback$ReplenishmentResult) Enum.valueOf(ReplenishmentCallback$ReplenishmentResult.class, str);
    }

    public static ReplenishmentCallback$ReplenishmentResult[] values() {
        return (ReplenishmentCallback$ReplenishmentResult[]) $VALUES.clone();
    }
}
