package com.yandex.go.sdk_registry.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/sdk_registry/api/SdkLifecycleStage;", "", "APP_CONFIGURATION", "APP_CREATED", "ACTIVITY_CREATED", "FCP", "LCP", "ON_DEMAND", "go-client-android.libs.sdk_registry:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SdkLifecycleStage {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkLifecycleStage[] $VALUES;
    public static final SdkLifecycleStage ACTIVITY_CREATED;
    public static final SdkLifecycleStage APP_CONFIGURATION;
    public static final SdkLifecycleStage APP_CREATED;
    public static final SdkLifecycleStage FCP;
    public static final SdkLifecycleStage LCP;
    public static final SdkLifecycleStage ON_DEMAND;

    static {
        SdkLifecycleStage sdkLifecycleStage = new SdkLifecycleStage("APP_CONFIGURATION", 0);
        APP_CONFIGURATION = sdkLifecycleStage;
        SdkLifecycleStage sdkLifecycleStage2 = new SdkLifecycleStage("APP_CREATED", 1);
        APP_CREATED = sdkLifecycleStage2;
        SdkLifecycleStage sdkLifecycleStage3 = new SdkLifecycleStage("ACTIVITY_CREATED", 2);
        ACTIVITY_CREATED = sdkLifecycleStage3;
        SdkLifecycleStage sdkLifecycleStage4 = new SdkLifecycleStage("FCP", 3);
        FCP = sdkLifecycleStage4;
        SdkLifecycleStage sdkLifecycleStage5 = new SdkLifecycleStage("LCP", 4);
        LCP = sdkLifecycleStage5;
        SdkLifecycleStage sdkLifecycleStage6 = new SdkLifecycleStage("ON_DEMAND", 5);
        ON_DEMAND = sdkLifecycleStage6;
        SdkLifecycleStage[] sdkLifecycleStageArr = {sdkLifecycleStage, sdkLifecycleStage2, sdkLifecycleStage3, sdkLifecycleStage4, sdkLifecycleStage5, sdkLifecycleStage6};
        $VALUES = sdkLifecycleStageArr;
        $ENTRIES = a.a(sdkLifecycleStageArr);
    }

    public static SdkLifecycleStage valueOf(String str) {
        return (SdkLifecycleStage) Enum.valueOf(SdkLifecycleStage.class, str);
    }

    public static SdkLifecycleStage[] values() {
        return (SdkLifecycleStage[]) $VALUES.clone();
    }
}
