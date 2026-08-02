package com.yandex.go.superapp.biometrics.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"com/yandex/go/superapp/biometrics/analytics/BiometricsAnalytics$BiometricsFlowResult", "", "Lcom/yandex/go/superapp/biometrics/analytics/BiometricsAnalytics$BiometricsFlowResult;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Success", "Failed", "go-client-android.features.superapp.biometrics:analytics"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BiometricsAnalytics$BiometricsFlowResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BiometricsAnalytics$BiometricsFlowResult[] $VALUES;
    public static final BiometricsAnalytics$BiometricsFlowResult Failed;
    public static final BiometricsAnalytics$BiometricsFlowResult Success;
    private final String eventValue;

    static {
        BiometricsAnalytics$BiometricsFlowResult biometricsAnalytics$BiometricsFlowResult = new BiometricsAnalytics$BiometricsFlowResult("Success", 0, "success");
        Success = biometricsAnalytics$BiometricsFlowResult;
        BiometricsAnalytics$BiometricsFlowResult biometricsAnalytics$BiometricsFlowResult2 = new BiometricsAnalytics$BiometricsFlowResult("Failed", 1, "failed");
        Failed = biometricsAnalytics$BiometricsFlowResult2;
        BiometricsAnalytics$BiometricsFlowResult[] biometricsAnalytics$BiometricsFlowResultArr = {biometricsAnalytics$BiometricsFlowResult, biometricsAnalytics$BiometricsFlowResult2};
        $VALUES = biometricsAnalytics$BiometricsFlowResultArr;
        $ENTRIES = a.a(biometricsAnalytics$BiometricsFlowResultArr);
    }

    public BiometricsAnalytics$BiometricsFlowResult(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static BiometricsAnalytics$BiometricsFlowResult valueOf(String str) {
        return (BiometricsAnalytics$BiometricsFlowResult) Enum.valueOf(BiometricsAnalytics$BiometricsFlowResult.class, str);
    }

    public static BiometricsAnalytics$BiometricsFlowResult[] values() {
        return (BiometricsAnalytics$BiometricsFlowResult[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
