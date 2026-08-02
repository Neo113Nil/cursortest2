package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/SavingsEvents$SavingsAccountWidgetShownType", "", "Lcom/ybsdk/core/analytics/generated/delegates/SavingsEvents$SavingsAccountWidgetShownType;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "SAVER", "DEPOSIT", "FUND", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsEvents$SavingsAccountWidgetShownType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsEvents$SavingsAccountWidgetShownType[] $VALUES;
    private final String originalValue;
    public static final SavingsEvents$SavingsAccountWidgetShownType SAVER = new SavingsEvents$SavingsAccountWidgetShownType("SAVER", 0, "saver");
    public static final SavingsEvents$SavingsAccountWidgetShownType DEPOSIT = new SavingsEvents$SavingsAccountWidgetShownType("DEPOSIT", 1, "deposit");
    public static final SavingsEvents$SavingsAccountWidgetShownType FUND = new SavingsEvents$SavingsAccountWidgetShownType("FUND", 2, "fund");

    private static final /* synthetic */ SavingsEvents$SavingsAccountWidgetShownType[] $values() {
        return new SavingsEvents$SavingsAccountWidgetShownType[]{SAVER, DEPOSIT, FUND};
    }

    static {
        SavingsEvents$SavingsAccountWidgetShownType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SavingsEvents$SavingsAccountWidgetShownType(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsEvents$SavingsAccountWidgetShownType valueOf(String str) {
        return (SavingsEvents$SavingsAccountWidgetShownType) Enum.valueOf(SavingsEvents$SavingsAccountWidgetShownType.class, str);
    }

    public static SavingsEvents$SavingsAccountWidgetShownType[] values() {
        return (SavingsEvents$SavingsAccountWidgetShownType[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
