package com.ybsdk.api;

import defpackage.jxi;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@jxi
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/api/YBSdkScenarioResultReceiver$CreditResult", "", "Lcom/ybsdk/api/YBSdkScenarioResultReceiver$CreditResult;", "<init>", "(Ljava/lang/String;I)V", "FAIL", "SUCCESS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBSdkScenarioResultReceiver$CreditResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBSdkScenarioResultReceiver$CreditResult[] $VALUES;
    public static final YBSdkScenarioResultReceiver$CreditResult FAIL = new YBSdkScenarioResultReceiver$CreditResult("FAIL", 0);
    public static final YBSdkScenarioResultReceiver$CreditResult SUCCESS = new YBSdkScenarioResultReceiver$CreditResult("SUCCESS", 1);

    private static final /* synthetic */ YBSdkScenarioResultReceiver$CreditResult[] $values() {
        return new YBSdkScenarioResultReceiver$CreditResult[]{FAIL, SUCCESS};
    }

    static {
        YBSdkScenarioResultReceiver$CreditResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private YBSdkScenarioResultReceiver$CreditResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBSdkScenarioResultReceiver$CreditResult valueOf(String str) {
        return (YBSdkScenarioResultReceiver$CreditResult) Enum.valueOf(YBSdkScenarioResultReceiver$CreditResult.class, str);
    }

    public static YBSdkScenarioResultReceiver$CreditResult[] values() {
        return (YBSdkScenarioResultReceiver$CreditResult[]) $VALUES.clone();
    }
}
