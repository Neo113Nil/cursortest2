package ru.ok.android.api.core;

import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ApiScope.kt */
/* loaded from: classes9.dex */
public final class ApiScopeAfter {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ ApiScopeAfter[] $VALUES;
    public static final ApiScopeAfter SAME = new ApiScopeAfter("SAME", 0);
    public static final ApiScopeAfter NO_SESSION = new ApiScopeAfter("NO_SESSION", 1);
    public static final ApiScopeAfter ANONYMOUS_SESSION = new ApiScopeAfter("ANONYMOUS_SESSION", 2);
    public static final ApiScopeAfter SESSION = new ApiScopeAfter("SESSION", 3);

    private static final /* synthetic */ ApiScopeAfter[] $values() {
        return new ApiScopeAfter[]{SAME, NO_SESSION, ANONYMOUS_SESSION, SESSION};
    }

    static {
        ApiScopeAfter[] $values = $values();
        $VALUES = $values;
        $ENTRIES = new asp($values);
    }

    private ApiScopeAfter(String str, int i) {
    }

    public static zrp<ApiScopeAfter> getEntries() {
        return $ENTRIES;
    }

    public static ApiScopeAfter valueOf(String str) {
        return (ApiScopeAfter) Enum.valueOf(ApiScopeAfter.class, str);
    }

    public static ApiScopeAfter[] values() {
        return (ApiScopeAfter[]) $VALUES.clone();
    }
}
