package com.yandex.go.yb.domain.model;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/yb/domain/model/YbSdkEnvironment;", "", "DEV", "PROD", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class YbSdkEnvironment {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YbSdkEnvironment[] $VALUES;
    public static final YbSdkEnvironment DEV;
    public static final YbSdkEnvironment PROD;

    static {
        YbSdkEnvironment ybSdkEnvironment = new YbSdkEnvironment("DEV", 0);
        DEV = ybSdkEnvironment;
        YbSdkEnvironment ybSdkEnvironment2 = new YbSdkEnvironment("PROD", 1);
        PROD = ybSdkEnvironment2;
        YbSdkEnvironment[] ybSdkEnvironmentArr = {ybSdkEnvironment, ybSdkEnvironment2};
        $VALUES = ybSdkEnvironmentArr;
        $ENTRIES = kotlin.enums.a.a(ybSdkEnvironmentArr);
    }

    public static YbSdkEnvironment valueOf(String str) {
        return (YbSdkEnvironment) Enum.valueOf(YbSdkEnvironment.class, str);
    }

    public static YbSdkEnvironment[] values() {
        return (YbSdkEnvironment[]) $VALUES.clone();
    }
}
