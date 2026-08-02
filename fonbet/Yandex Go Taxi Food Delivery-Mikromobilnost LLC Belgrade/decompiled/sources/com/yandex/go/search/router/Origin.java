package com.yandex.go.search.router;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/yandex/go/search/router/Origin;", "", "ORDER", "DELIVERY", "MENU", "SUGGEST", "NAVIGATOR", "INTERCITY", "MOBILITY_HUB", "DRIVE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Origin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Origin[] $VALUES;
    public static final Origin DELIVERY;
    public static final Origin DRIVE;
    public static final Origin INTERCITY;
    public static final Origin MENU;
    public static final Origin MOBILITY_HUB;
    public static final Origin NAVIGATOR;
    public static final Origin ORDER;
    public static final Origin SUGGEST;

    static {
        Origin origin = new Origin("ORDER", 0);
        ORDER = origin;
        Origin origin2 = new Origin("DELIVERY", 1);
        DELIVERY = origin2;
        Origin origin3 = new Origin("MENU", 2);
        MENU = origin3;
        Origin origin4 = new Origin("SUGGEST", 3);
        SUGGEST = origin4;
        Origin origin5 = new Origin("NAVIGATOR", 4);
        NAVIGATOR = origin5;
        Origin origin6 = new Origin("INTERCITY", 5);
        INTERCITY = origin6;
        Origin origin7 = new Origin("MOBILITY_HUB", 6);
        MOBILITY_HUB = origin7;
        Origin origin8 = new Origin("DRIVE", 7);
        DRIVE = origin8;
        Origin[] originArr = {origin, origin2, origin3, origin4, origin5, origin6, origin7, origin8};
        $VALUES = originArr;
        $ENTRIES = a.a(originArr);
    }

    public static Origin valueOf(String str) {
        return (Origin) Enum.valueOf(Origin.class, str);
    }

    public static Origin[] values() {
        return (Origin[]) $VALUES.clone();
    }
}
