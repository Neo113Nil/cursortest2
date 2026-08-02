package com.ybsdk.api.pro.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ybsdk/api/pro/entities/YBProSdkTokenProvider;", "", "<init>", "(Ljava/lang/String;I)V", "APPLE", "GOOGLE", "UNDEFINED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YBProSdkTokenProvider {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ YBProSdkTokenProvider[] $VALUES;
    public static final YBProSdkTokenProvider APPLE = new YBProSdkTokenProvider("APPLE", 0);
    public static final YBProSdkTokenProvider GOOGLE = new YBProSdkTokenProvider("GOOGLE", 1);
    public static final YBProSdkTokenProvider UNDEFINED = new YBProSdkTokenProvider("UNDEFINED", 2);

    private static final /* synthetic */ YBProSdkTokenProvider[] $values() {
        return new YBProSdkTokenProvider[]{APPLE, GOOGLE, UNDEFINED};
    }

    static {
        YBProSdkTokenProvider[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private YBProSdkTokenProvider(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static YBProSdkTokenProvider valueOf(String str) {
        return (YBProSdkTokenProvider) Enum.valueOf(YBProSdkTokenProvider.class, str);
    }

    public static YBProSdkTokenProvider[] values() {
        return (YBProSdkTokenProvider[]) $VALUES.clone();
    }
}
