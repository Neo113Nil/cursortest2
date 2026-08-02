package com.ybsdk.core.analytics.generated.delegates;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/ybsdk/core/analytics/generated/delegates/DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton", "", "Lcom/ybsdk/core/analytics/generated/delegates/DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton;", "", "originalValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getOriginalValue", "()Ljava/lang/String;", "DATE", "core-analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton[] $VALUES;
    public static final DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton DATE = new DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton("DATE", 0, MetaDataField.DATE_FIELD);
    private final String originalValue;

    private static final /* synthetic */ DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton[] $values() {
        return new DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton[]{DATE};
    }

    static {
        DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton(String str, int i, String str2) {
        this.originalValue = str2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton valueOf(String str) {
        return (DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton) Enum.valueOf(DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton.class, str);
    }

    public static DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton[] values() {
        return (DiffRateEvents$BottomsheetDiffRateCalendarButtonClickButton[]) $VALUES.clone();
    }

    public final String getOriginalValue() {
        return this.originalValue;
    }
}
