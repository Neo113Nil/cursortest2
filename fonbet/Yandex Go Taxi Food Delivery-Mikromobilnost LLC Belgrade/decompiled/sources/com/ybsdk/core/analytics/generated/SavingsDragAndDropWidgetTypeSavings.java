package com.ybsdk.core.analytics.generated;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/core/analytics/generated/SavingsDragAndDropWidgetTypeSavings;", "", "originalValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalValue", "()Ljava/lang/String;", "SHELF", "ACCOUNT", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SavingsDragAndDropWidgetTypeSavings {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SavingsDragAndDropWidgetTypeSavings[] $VALUES;
    private final String originalValue;
    public static final SavingsDragAndDropWidgetTypeSavings SHELF = new SavingsDragAndDropWidgetTypeSavings("SHELF", 0, "shelf");
    public static final SavingsDragAndDropWidgetTypeSavings ACCOUNT = new SavingsDragAndDropWidgetTypeSavings("ACCOUNT", 1, "account");

    private static final /* synthetic */ SavingsDragAndDropWidgetTypeSavings[] $values() {
        return new SavingsDragAndDropWidgetTypeSavings[]{SHELF, ACCOUNT};
    }

    static {
        SavingsDragAndDropWidgetTypeSavings[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private SavingsDragAndDropWidgetTypeSavings(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static SavingsDragAndDropWidgetTypeSavings valueOf(String str) {
        return (SavingsDragAndDropWidgetTypeSavings) Enum.valueOf(SavingsDragAndDropWidgetTypeSavings.class, str);
    }

    public static SavingsDragAndDropWidgetTypeSavings[] values() {
        return (SavingsDragAndDropWidgetTypeSavings[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
