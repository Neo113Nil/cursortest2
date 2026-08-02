package com.ybsdk.network;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/network/ApiCountryCode;", "", "isoAlpha2", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIsoAlpha2", "()Ljava/lang/String;", "UZ", "RU", "yb-sdk-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApiCountryCode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ApiCountryCode[] $VALUES;
    private final String isoAlpha2;
    public static final ApiCountryCode UZ = new ApiCountryCode("UZ", 0, "UZ");
    public static final ApiCountryCode RU = new ApiCountryCode("RU", 1, "RU");

    private static final /* synthetic */ ApiCountryCode[] $values() {
        return new ApiCountryCode[]{UZ, RU};
    }

    static {
        ApiCountryCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ApiCountryCode(String str, int i, String str2) {
        this.isoAlpha2 = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ApiCountryCode valueOf(String str) {
        return (ApiCountryCode) Enum.valueOf(ApiCountryCode.class, str);
    }

    public static ApiCountryCode[] values() {
        return (ApiCountryCode[]) $VALUES.clone();
    }

    public final String getIsoAlpha2() {
        return this.isoAlpha2;
    }
}
