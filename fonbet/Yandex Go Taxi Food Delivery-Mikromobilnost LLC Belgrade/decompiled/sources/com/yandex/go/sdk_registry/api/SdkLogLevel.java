package com.yandex.go.sdk_registry.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/sdk_registry/api/SdkLogLevel;", "", "DEBUG", "INFO", "ERROR", "CRITICAL", "go-client-android.libs.sdk_registry:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SdkLogLevel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SdkLogLevel[] $VALUES;
    public static final SdkLogLevel CRITICAL;
    public static final SdkLogLevel DEBUG;
    public static final SdkLogLevel ERROR;
    public static final SdkLogLevel INFO;

    static {
        SdkLogLevel sdkLogLevel = new SdkLogLevel("DEBUG", 0);
        DEBUG = sdkLogLevel;
        SdkLogLevel sdkLogLevel2 = new SdkLogLevel("INFO", 1);
        INFO = sdkLogLevel2;
        SdkLogLevel sdkLogLevel3 = new SdkLogLevel("ERROR", 2);
        ERROR = sdkLogLevel3;
        SdkLogLevel sdkLogLevel4 = new SdkLogLevel("CRITICAL", 3);
        CRITICAL = sdkLogLevel4;
        SdkLogLevel[] sdkLogLevelArr = {sdkLogLevel, sdkLogLevel2, sdkLogLevel3, sdkLogLevel4};
        $VALUES = sdkLogLevelArr;
        $ENTRIES = a.a(sdkLogLevelArr);
    }

    public static SdkLogLevel valueOf(String str) {
        return (SdkLogLevel) Enum.valueOf(SdkLogLevel.class, str);
    }

    public static SdkLogLevel[] values() {
        return (SdkLogLevel[]) $VALUES.clone();
    }
}
