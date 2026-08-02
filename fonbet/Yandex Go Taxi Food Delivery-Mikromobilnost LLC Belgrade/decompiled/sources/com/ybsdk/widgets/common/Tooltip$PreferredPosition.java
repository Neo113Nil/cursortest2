package com.ybsdk.widgets.common;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/widgets/common/Tooltip$PreferredPosition", "", "Lcom/ybsdk/widgets/common/Tooltip$PreferredPosition;", "<init>", "(Ljava/lang/String;I)V", "TOP", "BOTTOM", "AUTO", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Tooltip$PreferredPosition {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Tooltip$PreferredPosition[] $VALUES;
    public static final Tooltip$PreferredPosition TOP = new Tooltip$PreferredPosition("TOP", 0);
    public static final Tooltip$PreferredPosition BOTTOM = new Tooltip$PreferredPosition("BOTTOM", 1);
    public static final Tooltip$PreferredPosition AUTO = new Tooltip$PreferredPosition("AUTO", 2);

    private static final /* synthetic */ Tooltip$PreferredPosition[] $values() {
        return new Tooltip$PreferredPosition[]{TOP, BOTTOM, AUTO};
    }

    static {
        Tooltip$PreferredPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private Tooltip$PreferredPosition(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Tooltip$PreferredPosition valueOf(String str) {
        return (Tooltip$PreferredPosition) Enum.valueOf(Tooltip$PreferredPosition.class, str);
    }

    public static Tooltip$PreferredPosition[] values() {
        return (Tooltip$PreferredPosition[]) $VALUES.clone();
    }
}
