package com.yandex.go.sdk_registry.api.metrics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/sdk_registry/api/metrics/SdkInitMetric$Phase", "", "Lcom/yandex/go/sdk_registry/api/metrics/SdkInitMetric$Phase;", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LIGHTWEIGHT", "FULL", "go-client-android.libs.sdk_registry:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SdkInitMetric$Phase {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkInitMetric$Phase[] $VALUES;
    public static final SdkInitMetric$Phase FULL;
    public static final SdkInitMetric$Phase LIGHTWEIGHT;
    private final String value;

    static {
        SdkInitMetric$Phase sdkInitMetric$Phase = new SdkInitMetric$Phase("LIGHTWEIGHT", 0, "lightweight");
        LIGHTWEIGHT = sdkInitMetric$Phase;
        SdkInitMetric$Phase sdkInitMetric$Phase2 = new SdkInitMetric$Phase("FULL", 1, "full");
        FULL = sdkInitMetric$Phase2;
        SdkInitMetric$Phase[] sdkInitMetric$PhaseArr = {sdkInitMetric$Phase, sdkInitMetric$Phase2};
        $VALUES = sdkInitMetric$PhaseArr;
        $ENTRIES = a.a(sdkInitMetric$PhaseArr);
    }

    public SdkInitMetric$Phase(String str, int i, String str2) {
        this.value = str2;
    }

    public static SdkInitMetric$Phase valueOf(String str) {
        return (SdkInitMetric$Phase) Enum.valueOf(SdkInitMetric$Phase.class, str);
    }

    public static SdkInitMetric$Phase[] values() {
        return (SdkInitMetric$Phase[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
