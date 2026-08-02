package com.yandex.go.shortcuts.ui.interactors;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/yandex/go/shortcuts/ui/interactors/ShortcutViewSourceType;", "", "ORDER", "PRODUCTS", "SHORTCUT_SCREEN", "WIDGETS", "CITY_MODE", "SCOOTERS_DISCOVERY", "SCOOTERS_FINISH_INFO_RIDE_FINISH", "INTERCITY", "MASSTRANSIT", "CHARGERS_DISCOVERY", "RIDA_LOCAL_SOURCE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ShortcutViewSourceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ShortcutViewSourceType[] $VALUES;
    public static final ShortcutViewSourceType CHARGERS_DISCOVERY;
    public static final ShortcutViewSourceType CITY_MODE;
    public static final ShortcutViewSourceType INTERCITY;
    public static final ShortcutViewSourceType MASSTRANSIT;
    public static final ShortcutViewSourceType ORDER;
    public static final ShortcutViewSourceType PRODUCTS;
    public static final ShortcutViewSourceType RIDA_LOCAL_SOURCE;
    public static final ShortcutViewSourceType SCOOTERS_DISCOVERY;
    public static final ShortcutViewSourceType SCOOTERS_FINISH_INFO_RIDE_FINISH;
    public static final ShortcutViewSourceType SHORTCUT_SCREEN;
    public static final ShortcutViewSourceType WIDGETS;

    static {
        ShortcutViewSourceType shortcutViewSourceType = new ShortcutViewSourceType("ORDER", 0);
        ORDER = shortcutViewSourceType;
        ShortcutViewSourceType shortcutViewSourceType2 = new ShortcutViewSourceType("PRODUCTS", 1);
        PRODUCTS = shortcutViewSourceType2;
        ShortcutViewSourceType shortcutViewSourceType3 = new ShortcutViewSourceType("SHORTCUT_SCREEN", 2);
        SHORTCUT_SCREEN = shortcutViewSourceType3;
        ShortcutViewSourceType shortcutViewSourceType4 = new ShortcutViewSourceType("WIDGETS", 3);
        WIDGETS = shortcutViewSourceType4;
        ShortcutViewSourceType shortcutViewSourceType5 = new ShortcutViewSourceType("CITY_MODE", 4);
        CITY_MODE = shortcutViewSourceType5;
        ShortcutViewSourceType shortcutViewSourceType6 = new ShortcutViewSourceType("SCOOTERS_DISCOVERY", 5);
        SCOOTERS_DISCOVERY = shortcutViewSourceType6;
        ShortcutViewSourceType shortcutViewSourceType7 = new ShortcutViewSourceType("SCOOTERS_FINISH_INFO_RIDE_FINISH", 6);
        SCOOTERS_FINISH_INFO_RIDE_FINISH = shortcutViewSourceType7;
        ShortcutViewSourceType shortcutViewSourceType8 = new ShortcutViewSourceType("INTERCITY", 7);
        INTERCITY = shortcutViewSourceType8;
        ShortcutViewSourceType shortcutViewSourceType9 = new ShortcutViewSourceType("MASSTRANSIT", 8);
        MASSTRANSIT = shortcutViewSourceType9;
        ShortcutViewSourceType shortcutViewSourceType10 = new ShortcutViewSourceType("CHARGERS_DISCOVERY", 9);
        CHARGERS_DISCOVERY = shortcutViewSourceType10;
        ShortcutViewSourceType shortcutViewSourceType11 = new ShortcutViewSourceType("RIDA_LOCAL_SOURCE", 10);
        RIDA_LOCAL_SOURCE = shortcutViewSourceType11;
        ShortcutViewSourceType[] shortcutViewSourceTypeArr = {shortcutViewSourceType, shortcutViewSourceType2, shortcutViewSourceType3, shortcutViewSourceType4, shortcutViewSourceType5, shortcutViewSourceType6, shortcutViewSourceType7, shortcutViewSourceType8, shortcutViewSourceType9, shortcutViewSourceType10, shortcutViewSourceType11};
        $VALUES = shortcutViewSourceTypeArr;
        $ENTRIES = a.a(shortcutViewSourceTypeArr);
    }

    public static ShortcutViewSourceType valueOf(String str) {
        return (ShortcutViewSourceType) Enum.valueOf(ShortcutViewSourceType.class, str);
    }

    public static ShortcutViewSourceType[] values() {
        return (ShortcutViewSourceType[]) $VALUES.clone();
    }
}
