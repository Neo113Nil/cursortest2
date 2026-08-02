package com.ybsdk.widgets.tooltip;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/widgets/tooltip/TooltipCommon$PreferredPosition", "", "Lcom/ybsdk/widgets/tooltip/TooltipCommon$PreferredPosition;", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "AUTO", "widgets-tooltip_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TooltipCommon$PreferredPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TooltipCommon$PreferredPosition[] $VALUES;
    public static final TooltipCommon$PreferredPosition TOP = new TooltipCommon$PreferredPosition("TOP", 0);
    public static final TooltipCommon$PreferredPosition BOTTOM = new TooltipCommon$PreferredPosition("BOTTOM", 1);
    public static final TooltipCommon$PreferredPosition AUTO = new TooltipCommon$PreferredPosition("AUTO", 2);

    private static final /* synthetic */ TooltipCommon$PreferredPosition[] $values() {
        return new TooltipCommon$PreferredPosition[]{TOP, BOTTOM, AUTO};
    }

    static {
        TooltipCommon$PreferredPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private TooltipCommon$PreferredPosition(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static TooltipCommon$PreferredPosition valueOf(String str) {
        return (TooltipCommon$PreferredPosition) Enum.valueOf(TooltipCommon$PreferredPosition.class, str);
    }

    public static TooltipCommon$PreferredPosition[] values() {
        return (TooltipCommon$PreferredPosition[]) $VALUES.clone();
    }
}
