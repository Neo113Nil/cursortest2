package com.yandex.go.sdk_registry.api.metrics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/go/sdk_registry/api/metrics/SdkMetricResult;", "", "", "wireName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SUCCESS", "FAILURE", "TIMEOUT", "CANCELLED", "SKIPPED", "go-client-android.libs.sdk_registry:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SdkMetricResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkMetricResult[] $VALUES;
    public static final SdkMetricResult CANCELLED;
    public static final SdkMetricResult FAILURE;
    public static final SdkMetricResult SKIPPED;
    public static final SdkMetricResult SUCCESS;
    public static final SdkMetricResult TIMEOUT;
    private final String wireName;

    static {
        SdkMetricResult sdkMetricResult = new SdkMetricResult("SUCCESS", 0, "SUCCESS");
        SUCCESS = sdkMetricResult;
        SdkMetricResult sdkMetricResult2 = new SdkMetricResult("FAILURE", 1, "FAILURE");
        FAILURE = sdkMetricResult2;
        SdkMetricResult sdkMetricResult3 = new SdkMetricResult("TIMEOUT", 2, "TIMEOUT");
        TIMEOUT = sdkMetricResult3;
        SdkMetricResult sdkMetricResult4 = new SdkMetricResult("CANCELLED", 3, "CANCELLED");
        CANCELLED = sdkMetricResult4;
        SdkMetricResult sdkMetricResult5 = new SdkMetricResult("SKIPPED", 4, "SKIPPED");
        SKIPPED = sdkMetricResult5;
        SdkMetricResult[] sdkMetricResultArr = {sdkMetricResult, sdkMetricResult2, sdkMetricResult3, sdkMetricResult4, sdkMetricResult5};
        $VALUES = sdkMetricResultArr;
        $ENTRIES = a.a(sdkMetricResultArr);
    }

    public SdkMetricResult(String str, int i, String str2) {
        this.wireName = str2;
    }

    public static SdkMetricResult valueOf(String str) {
        return (SdkMetricResult) Enum.valueOf(SdkMetricResult.class, str);
    }

    public static SdkMetricResult[] values() {
        return (SdkMetricResult[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getWireName() {
        return this.wireName;
    }
}
