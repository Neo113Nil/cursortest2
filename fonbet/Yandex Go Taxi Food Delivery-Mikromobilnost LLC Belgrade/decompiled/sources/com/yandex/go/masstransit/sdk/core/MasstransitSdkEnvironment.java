package com.yandex.go.masstransit.sdk.core;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/masstransit/sdk/core/MasstransitSdkEnvironment;", "", "TESTING", "PRODUCTION", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MasstransitSdkEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitSdkEnvironment[] $VALUES;
    public static final MasstransitSdkEnvironment PRODUCTION;
    public static final MasstransitSdkEnvironment TESTING;

    static {
        MasstransitSdkEnvironment masstransitSdkEnvironment = new MasstransitSdkEnvironment("TESTING", 0);
        TESTING = masstransitSdkEnvironment;
        MasstransitSdkEnvironment masstransitSdkEnvironment2 = new MasstransitSdkEnvironment("PRODUCTION", 1);
        PRODUCTION = masstransitSdkEnvironment2;
        MasstransitSdkEnvironment[] masstransitSdkEnvironmentArr = {masstransitSdkEnvironment, masstransitSdkEnvironment2};
        $VALUES = masstransitSdkEnvironmentArr;
        $ENTRIES = a.a(masstransitSdkEnvironmentArr);
    }

    public static MasstransitSdkEnvironment valueOf(String str) {
        return (MasstransitSdkEnvironment) Enum.valueOf(MasstransitSdkEnvironment.class, str);
    }

    public static MasstransitSdkEnvironment[] values() {
        return (MasstransitSdkEnvironment[]) $VALUES.clone();
    }
}
