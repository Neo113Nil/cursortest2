package com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/yandex/fintechsdk/features/bdui/internal/presentation/customview/cardinput/analytics/DynamicBinInfoAnalyticsErrorType;", "", "", "value", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NETWORK_ERROR", "HTTP_ERROR", "CARD_NETWORK_NOT_FOUND", "UNKNOWN", "features-bdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DynamicBinInfoAnalyticsErrorType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DynamicBinInfoAnalyticsErrorType[] $VALUES;
    public static final DynamicBinInfoAnalyticsErrorType CARD_NETWORK_NOT_FOUND;
    public static final DynamicBinInfoAnalyticsErrorType HTTP_ERROR;
    public static final DynamicBinInfoAnalyticsErrorType NETWORK_ERROR;
    public static final DynamicBinInfoAnalyticsErrorType UNKNOWN;
    private final String value;

    static {
        DynamicBinInfoAnalyticsErrorType dynamicBinInfoAnalyticsErrorType = new DynamicBinInfoAnalyticsErrorType("NETWORK_ERROR", 0, "network_error");
        NETWORK_ERROR = dynamicBinInfoAnalyticsErrorType;
        DynamicBinInfoAnalyticsErrorType dynamicBinInfoAnalyticsErrorType2 = new DynamicBinInfoAnalyticsErrorType("HTTP_ERROR", 1, "http_error");
        HTTP_ERROR = dynamicBinInfoAnalyticsErrorType2;
        DynamicBinInfoAnalyticsErrorType dynamicBinInfoAnalyticsErrorType3 = new DynamicBinInfoAnalyticsErrorType("CARD_NETWORK_NOT_FOUND", 2, "card_network_not_found");
        CARD_NETWORK_NOT_FOUND = dynamicBinInfoAnalyticsErrorType3;
        DynamicBinInfoAnalyticsErrorType dynamicBinInfoAnalyticsErrorType4 = new DynamicBinInfoAnalyticsErrorType("UNKNOWN", 3, "unknown");
        UNKNOWN = dynamicBinInfoAnalyticsErrorType4;
        DynamicBinInfoAnalyticsErrorType[] dynamicBinInfoAnalyticsErrorTypeArr = {dynamicBinInfoAnalyticsErrorType, dynamicBinInfoAnalyticsErrorType2, dynamicBinInfoAnalyticsErrorType3, dynamicBinInfoAnalyticsErrorType4};
        $VALUES = dynamicBinInfoAnalyticsErrorTypeArr;
        $ENTRIES = a.a(dynamicBinInfoAnalyticsErrorTypeArr);
    }

    public DynamicBinInfoAnalyticsErrorType(String str, int i, String str2) {
        this.value = str2;
    }

    public static DynamicBinInfoAnalyticsErrorType valueOf(String str) {
        return (DynamicBinInfoAnalyticsErrorType) Enum.valueOf(DynamicBinInfoAnalyticsErrorType.class, str);
    }

    public static DynamicBinInfoAnalyticsErrorType[] values() {
        return (DynamicBinInfoAnalyticsErrorType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
