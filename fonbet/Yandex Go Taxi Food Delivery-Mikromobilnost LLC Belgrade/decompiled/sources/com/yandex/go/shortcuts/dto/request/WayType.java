package com.yandex.go.shortcuts.dto.request;

import defpackage.b931;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.s941;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/shortcuts/dto/request/WayType;", "", "Companion", "s941", "A", "MID", "B", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class WayType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ WayType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final WayType A;
    public static final WayType B;
    public static final s941 Companion;
    public static final WayType MID;

    static {
        WayType wayType = new WayType("A", 0);
        A = wayType;
        WayType wayType2 = new WayType("MID", 1);
        MID = wayType2;
        WayType wayType3 = new WayType("B", 2);
        B = wayType3;
        WayType[] wayTypeArr = {wayType, wayType2, wayType3};
        $VALUES = wayTypeArr;
        $ENTRIES = kotlin.enums.a.a(wayTypeArr);
        Companion = new s941();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new b931(22));
    }

    public static WayType valueOf(String str) {
        return (WayType) Enum.valueOf(WayType.class, str);
    }

    public static WayType[] values() {
        return (WayType[]) $VALUES.clone();
    }
}
