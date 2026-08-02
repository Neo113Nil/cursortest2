package com.ybsdk.navigation;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"com/ybsdk/navigation/ScenarioResultReceiver$ChangePhoneResult", "", "Lcom/ybsdk/navigation/ScenarioResultReceiver$ChangePhoneResult;", "<init>", "(Ljava/lang/String;I)V", "FAIL", "SUCCESS", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ScenarioResultReceiver$ChangePhoneResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScenarioResultReceiver$ChangePhoneResult[] $VALUES;
    public static final ScenarioResultReceiver$ChangePhoneResult FAIL = new ScenarioResultReceiver$ChangePhoneResult("FAIL", 0);
    public static final ScenarioResultReceiver$ChangePhoneResult SUCCESS = new ScenarioResultReceiver$ChangePhoneResult("SUCCESS", 1);

    private static final /* synthetic */ ScenarioResultReceiver$ChangePhoneResult[] $values() {
        return new ScenarioResultReceiver$ChangePhoneResult[]{FAIL, SUCCESS};
    }

    static {
        ScenarioResultReceiver$ChangePhoneResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private ScenarioResultReceiver$ChangePhoneResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ScenarioResultReceiver$ChangePhoneResult valueOf(String str) {
        return (ScenarioResultReceiver$ChangePhoneResult) Enum.valueOf(ScenarioResultReceiver$ChangePhoneResult.class, str);
    }

    public static ScenarioResultReceiver$ChangePhoneResult[] values() {
        return (ScenarioResultReceiver$ChangePhoneResult[]) $VALUES.clone();
    }
}
