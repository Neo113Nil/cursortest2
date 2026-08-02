package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/delivery/mapper/model/DisplayTarget;", "", "DELIVERY_DASHBOARD", "MULTIORDER", "SUMMARY_TRAP", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DisplayTarget {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ DisplayTarget[] $VALUES;
    public static final DisplayTarget DELIVERY_DASHBOARD;
    public static final DisplayTarget MULTIORDER;
    public static final DisplayTarget SUMMARY_TRAP;

    static {
        DisplayTarget displayTarget = new DisplayTarget("DELIVERY_DASHBOARD", 0);
        DELIVERY_DASHBOARD = displayTarget;
        DisplayTarget displayTarget2 = new DisplayTarget("MULTIORDER", 1);
        MULTIORDER = displayTarget2;
        DisplayTarget displayTarget3 = new DisplayTarget("SUMMARY_TRAP", 2);
        SUMMARY_TRAP = displayTarget3;
        DisplayTarget[] displayTargetArr = {displayTarget, displayTarget2, displayTarget3};
        $VALUES = displayTargetArr;
        $ENTRIES = a.a(displayTargetArr);
    }

    public static DisplayTarget valueOf(String str) {
        return (DisplayTarget) Enum.valueOf(DisplayTarget.class, str);
    }

    public static DisplayTarget[] values() {
        return (DisplayTarget[]) $VALUES.clone();
    }
}
