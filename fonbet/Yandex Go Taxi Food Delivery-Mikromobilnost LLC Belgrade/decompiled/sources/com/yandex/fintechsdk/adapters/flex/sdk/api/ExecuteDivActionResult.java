package com.yandex.fintechsdk.adapters.flex.sdk.api;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/api/ExecuteDivActionResult;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "WIDGET_NOT_FOUND", "FAILURE", "api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ExecuteDivActionResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ExecuteDivActionResult[] $VALUES;
    public static final ExecuteDivActionResult SUCCESS = new ExecuteDivActionResult("SUCCESS", 0);
    public static final ExecuteDivActionResult WIDGET_NOT_FOUND = new ExecuteDivActionResult("WIDGET_NOT_FOUND", 1);
    public static final ExecuteDivActionResult FAILURE = new ExecuteDivActionResult("FAILURE", 2);

    private static final /* synthetic */ ExecuteDivActionResult[] $values() {
        return new ExecuteDivActionResult[]{SUCCESS, WIDGET_NOT_FOUND, FAILURE};
    }

    static {
        ExecuteDivActionResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private ExecuteDivActionResult(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static ExecuteDivActionResult valueOf(String str) {
        return (ExecuteDivActionResult) Enum.valueOf(ExecuteDivActionResult.class, str);
    }

    public static ExecuteDivActionResult[] values() {
        return (ExecuteDivActionResult[]) $VALUES.clone();
    }
}
