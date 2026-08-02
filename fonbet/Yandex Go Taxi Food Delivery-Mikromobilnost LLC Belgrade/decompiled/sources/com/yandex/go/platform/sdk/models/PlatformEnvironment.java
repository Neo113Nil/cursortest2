package com.yandex.go.platform.sdk.models;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/platform/sdk/models/PlatformEnvironment;", "", "DEBUG", "PRODUCTION", "com.yandex.go.platform.core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PlatformEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlatformEnvironment[] $VALUES;
    public static final PlatformEnvironment DEBUG;
    public static final PlatformEnvironment PRODUCTION;

    static {
        PlatformEnvironment platformEnvironment = new PlatformEnvironment("DEBUG", 0);
        DEBUG = platformEnvironment;
        PlatformEnvironment platformEnvironment2 = new PlatformEnvironment("PRODUCTION", 1);
        PRODUCTION = platformEnvironment2;
        PlatformEnvironment[] platformEnvironmentArr = {platformEnvironment, platformEnvironment2};
        $VALUES = platformEnvironmentArr;
        $ENTRIES = kotlin.enums.a.a(platformEnvironmentArr);
    }

    public static PlatformEnvironment valueOf(String str) {
        return (PlatformEnvironment) Enum.valueOf(PlatformEnvironment.class, str);
    }

    public static PlatformEnvironment[] values() {
        return (PlatformEnvironment[]) $VALUES.clone();
    }
}
