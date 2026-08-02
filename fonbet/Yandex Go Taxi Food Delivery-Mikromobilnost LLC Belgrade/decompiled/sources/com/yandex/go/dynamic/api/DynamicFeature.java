package com.yandex.go.dynamic.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/go/dynamic/api/DynamicFeature;", "", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "targetClass", "a", "AR_SAMPLE", "INAPP_CALLS", "CARTECH", "LITERT", "QUARK", "go-client-android.features.dynamic:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DynamicFeature {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DynamicFeature[] $VALUES;
    public static final DynamicFeature AR_SAMPLE;
    public static final DynamicFeature CARTECH;
    public static final DynamicFeature INAPP_CALLS;
    public static final DynamicFeature LITERT;
    public static final DynamicFeature QUARK;
    private final String id;
    private final String targetClass;

    static {
        DynamicFeature dynamicFeature = new DynamicFeature("AR_SAMPLE", 0, "ar_sample", "com.yandex.go.ar.sample.dynamic.ArSampleDynamicApiImpl");
        AR_SAMPLE = dynamicFeature;
        DynamicFeature dynamicFeature2 = new DynamicFeature("INAPP_CALLS", 1, "inapp_calls", "com.yandex.go.inapp_calls.dynamic.InAppCallsDynamicApiImpl");
        INAPP_CALLS = dynamicFeature2;
        DynamicFeature dynamicFeature3 = new DynamicFeature("CARTECH", 2, "cartech", "com.yandex.go.cartech.dynamic.CartechDynamicApiImpl");
        CARTECH = dynamicFeature3;
        DynamicFeature dynamicFeature4 = new DynamicFeature("LITERT", 3, "litert", "com.yandex.go.litert.dynamic.LiteRtDynamicApiImpl");
        LITERT = dynamicFeature4;
        DynamicFeature dynamicFeature5 = new DynamicFeature("QUARK", 4, "quark", "com.yandex.go.quark.dynamic.QuarkDynamicFeatureApiImpl");
        QUARK = dynamicFeature5;
        DynamicFeature[] dynamicFeatureArr = {dynamicFeature, dynamicFeature2, dynamicFeature3, dynamicFeature4, dynamicFeature5};
        $VALUES = dynamicFeatureArr;
        $ENTRIES = a.a(dynamicFeatureArr);
    }

    public DynamicFeature(String str, int i, String str2, String str3) {
        this.id = str2;
        this.targetClass = str3;
    }

    public static DynamicFeature valueOf(String str) {
        return (DynamicFeature) Enum.valueOf(DynamicFeature.class, str);
    }

    public static DynamicFeature[] values() {
        return (DynamicFeature[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getTargetClass() {
        return this.targetClass;
    }

    public final String getId() {
        return this.id;
    }
}
