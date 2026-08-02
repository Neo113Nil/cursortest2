package com.yandex.fintechsdk.features.bdui.internal.presentation.action.deeplink;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/action/deeplink/DeeplinkResult;", "", "SUCCESS", "FAILURE", "NO_APP_FOUND", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeeplinkResult {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DeeplinkResult[] $VALUES;
    public static final DeeplinkResult FAILURE;
    public static final DeeplinkResult NO_APP_FOUND;
    public static final DeeplinkResult SUCCESS;

    static {
        DeeplinkResult deeplinkResult = new DeeplinkResult("SUCCESS", 0);
        SUCCESS = deeplinkResult;
        DeeplinkResult deeplinkResult2 = new DeeplinkResult("FAILURE", 1);
        FAILURE = deeplinkResult2;
        DeeplinkResult deeplinkResult3 = new DeeplinkResult("NO_APP_FOUND", 2);
        NO_APP_FOUND = deeplinkResult3;
        DeeplinkResult[] deeplinkResultArr = {deeplinkResult, deeplinkResult2, deeplinkResult3};
        $VALUES = deeplinkResultArr;
        $ENTRIES = a.a(deeplinkResultArr);
    }

    public static DeeplinkResult valueOf(String str) {
        return (DeeplinkResult) Enum.valueOf(DeeplinkResult.class, str);
    }

    public static DeeplinkResult[] values() {
        return (DeeplinkResult[]) $VALUES.clone();
    }
}
