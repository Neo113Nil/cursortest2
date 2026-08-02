package com.yandex.plus.home.state;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/plus/home/state/UpdateTargetEvent;", "", "ALL", "PLUS_AMOUNT", "PAY_BUTTON", "FINTECH", "FAMILY", "PLAQUE", "DAILY", "APPWIDGET_DAILY", "plus-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class UpdateTargetEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpdateTargetEvent[] $VALUES;
    public static final UpdateTargetEvent ALL;
    public static final UpdateTargetEvent APPWIDGET_DAILY;
    public static final UpdateTargetEvent DAILY;
    public static final UpdateTargetEvent FAMILY;
    public static final UpdateTargetEvent FINTECH;
    public static final UpdateTargetEvent PAY_BUTTON;
    public static final UpdateTargetEvent PLAQUE;
    public static final UpdateTargetEvent PLUS_AMOUNT;

    static {
        UpdateTargetEvent updateTargetEvent = new UpdateTargetEvent("ALL", 0);
        ALL = updateTargetEvent;
        UpdateTargetEvent updateTargetEvent2 = new UpdateTargetEvent("PLUS_AMOUNT", 1);
        PLUS_AMOUNT = updateTargetEvent2;
        UpdateTargetEvent updateTargetEvent3 = new UpdateTargetEvent("PAY_BUTTON", 2);
        PAY_BUTTON = updateTargetEvent3;
        UpdateTargetEvent updateTargetEvent4 = new UpdateTargetEvent("FINTECH", 3);
        FINTECH = updateTargetEvent4;
        UpdateTargetEvent updateTargetEvent5 = new UpdateTargetEvent("FAMILY", 4);
        FAMILY = updateTargetEvent5;
        UpdateTargetEvent updateTargetEvent6 = new UpdateTargetEvent("PLAQUE", 5);
        PLAQUE = updateTargetEvent6;
        UpdateTargetEvent updateTargetEvent7 = new UpdateTargetEvent("DAILY", 6);
        DAILY = updateTargetEvent7;
        UpdateTargetEvent updateTargetEvent8 = new UpdateTargetEvent("APPWIDGET_DAILY", 7);
        APPWIDGET_DAILY = updateTargetEvent8;
        UpdateTargetEvent[] updateTargetEventArr = {updateTargetEvent, updateTargetEvent2, updateTargetEvent3, updateTargetEvent4, updateTargetEvent5, updateTargetEvent6, updateTargetEvent7, updateTargetEvent8};
        $VALUES = updateTargetEventArr;
        $ENTRIES = a.a(updateTargetEventArr);
    }

    public static UpdateTargetEvent valueOf(String str) {
        return (UpdateTargetEvent) Enum.valueOf(UpdateTargetEvent.class, str);
    }

    public static UpdateTargetEvent[] values() {
        return (UpdateTargetEvent[]) $VALUES.clone();
    }
}
