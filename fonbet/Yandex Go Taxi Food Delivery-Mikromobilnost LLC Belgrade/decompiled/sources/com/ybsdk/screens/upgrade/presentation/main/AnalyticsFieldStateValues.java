package com.ybsdk.screens.upgrade.presentation.main;

import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.k4o;
import kotlin.Metadata;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/ybsdk/screens/upgrade/presentation/main/AnalyticsFieldStateValues;", "", "", "originalValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "NOT_FOUND", "FOUND", "IN_PROGRESS", JCP.RAW_PREFIX, "DISABLED", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AnalyticsFieldStateValues {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AnalyticsFieldStateValues[] $VALUES;
    public static final AnalyticsFieldStateValues DISABLED;
    public static final AnalyticsFieldStateValues FOUND;
    public static final AnalyticsFieldStateValues IN_PROGRESS;
    public static final AnalyticsFieldStateValues NONE;
    public static final AnalyticsFieldStateValues NOT_FOUND;
    private final String originalValue;

    static {
        AnalyticsFieldStateValues analyticsFieldStateValues = new AnalyticsFieldStateValues("NOT_FOUND", 0, "not found");
        NOT_FOUND = analyticsFieldStateValues;
        AnalyticsFieldStateValues analyticsFieldStateValues2 = new AnalyticsFieldStateValues("FOUND", 1, "found");
        FOUND = analyticsFieldStateValues2;
        AnalyticsFieldStateValues analyticsFieldStateValues3 = new AnalyticsFieldStateValues("IN_PROGRESS", 2, "in progress");
        IN_PROGRESS = analyticsFieldStateValues3;
        AnalyticsFieldStateValues analyticsFieldStateValues4 = new AnalyticsFieldStateValues(JCP.RAW_PREFIX, 3, "none");
        NONE = analyticsFieldStateValues4;
        AnalyticsFieldStateValues analyticsFieldStateValues5 = new AnalyticsFieldStateValues("DISABLED", 4, BackendConfig.Restrictions.DISABLED);
        DISABLED = analyticsFieldStateValues5;
        AnalyticsFieldStateValues[] analyticsFieldStateValuesArr = {analyticsFieldStateValues, analyticsFieldStateValues2, analyticsFieldStateValues3, analyticsFieldStateValues4, analyticsFieldStateValues5};
        $VALUES = analyticsFieldStateValuesArr;
        $ENTRIES = kotlin.enums.a.a(analyticsFieldStateValuesArr);
    }

    public AnalyticsFieldStateValues(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static AnalyticsFieldStateValues valueOf(String str) {
        return (AnalyticsFieldStateValues) Enum.valueOf(AnalyticsFieldStateValues.class, str);
    }

    public static AnalyticsFieldStateValues[] values() {
        return (AnalyticsFieldStateValues[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getOriginalValue() {
        return this.originalValue;
    }
}
