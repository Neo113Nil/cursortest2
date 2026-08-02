package ru.ok.android.api.core;

import xsna.asp;
import xsna.swe0;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiScope.kt */
/* loaded from: classes9.dex */
public final class ApiScope {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ApiScope[] $VALUES;
    public static final ApiScope NONE = new ApiScope("NONE", 0);
    public static final ApiScope APPLICATION = new ApiScope("APPLICATION", 1);
    public static final ApiScope OPT_SESSION = new ApiScope("OPT_SESSION", 2);
    public static final ApiScope SESSION = new ApiScope("SESSION", 3);

    private static final /* synthetic */ ApiScope[] $values() {
        return new ApiScope[]{NONE, APPLICATION, OPT_SESSION, SESSION};
    }

    static {
        ApiScope[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private ApiScope(String str, int i) {
    }

    public static zrp<ApiScope> getEntries() {
        return $ENTRIES;
    }

    public static ApiScope valueOf(String str) {
        return (ApiScope) Enum.valueOf(ApiScope.class, str);
    }

    public static ApiScope[] values() {
        return (ApiScope[]) $VALUES.clone();
    }

    public final ApiScope requireAtLeast(ApiScope apiScope) {
        return (ApiScope) swe0.c(this, apiScope);
    }
}
