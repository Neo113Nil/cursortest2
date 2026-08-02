package com.yandex.go.safety.center.analytics;

import com.yandex.payment.common.result.ResultType;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/safety/center/analytics/SafetyCenterAnalytics$SafetyCenterLaunchResult", "", "Lcom/yandex/go/safety/center/analytics/SafetyCenterAnalytics$SafetyCenterLaunchResult;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Success", "Failure", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SafetyCenterAnalytics$SafetyCenterLaunchResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SafetyCenterAnalytics$SafetyCenterLaunchResult[] $VALUES;
    public static final SafetyCenterAnalytics$SafetyCenterLaunchResult Failure;
    public static final SafetyCenterAnalytics$SafetyCenterLaunchResult Success;
    private final String eventValue;

    static {
        SafetyCenterAnalytics$SafetyCenterLaunchResult safetyCenterAnalytics$SafetyCenterLaunchResult = new SafetyCenterAnalytics$SafetyCenterLaunchResult("Success", 0, "success");
        Success = safetyCenterAnalytics$SafetyCenterLaunchResult;
        SafetyCenterAnalytics$SafetyCenterLaunchResult safetyCenterAnalytics$SafetyCenterLaunchResult2 = new SafetyCenterAnalytics$SafetyCenterLaunchResult("Failure", 1, ResultType.RESULT_TYPE_FAILURE);
        Failure = safetyCenterAnalytics$SafetyCenterLaunchResult2;
        SafetyCenterAnalytics$SafetyCenterLaunchResult[] safetyCenterAnalytics$SafetyCenterLaunchResultArr = {safetyCenterAnalytics$SafetyCenterLaunchResult, safetyCenterAnalytics$SafetyCenterLaunchResult2};
        $VALUES = safetyCenterAnalytics$SafetyCenterLaunchResultArr;
        $ENTRIES = kotlin.enums.a.a(safetyCenterAnalytics$SafetyCenterLaunchResultArr);
    }

    public SafetyCenterAnalytics$SafetyCenterLaunchResult(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SafetyCenterAnalytics$SafetyCenterLaunchResult valueOf(String str) {
        return (SafetyCenterAnalytics$SafetyCenterLaunchResult) Enum.valueOf(SafetyCenterAnalytics$SafetyCenterLaunchResult.class, str);
    }

    public static SafetyCenterAnalytics$SafetyCenterLaunchResult[] values() {
        return (SafetyCenterAnalytics$SafetyCenterLaunchResult[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
