package com.yandex.go.proxyprovision.api;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.kk00;
import defpackage.t5z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/proxyprovision/api/MapKitDefaultHost;", "", "Companion", "kk00", "YANDEX_NET", "YANDEX_COM_NET", "YANGO_COM", "EU_YANGO_TECH", "YANGO_TECH", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class MapKitDefaultHost {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MapKitDefaultHost[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final kk00 Companion;
    public static final MapKitDefaultHost EU_YANGO_TECH;
    public static final MapKitDefaultHost YANDEX_COM_NET;
    public static final MapKitDefaultHost YANDEX_NET;
    public static final MapKitDefaultHost YANGO_COM;
    public static final MapKitDefaultHost YANGO_TECH;

    static {
        MapKitDefaultHost mapKitDefaultHost = new MapKitDefaultHost("YANDEX_NET", 0);
        YANDEX_NET = mapKitDefaultHost;
        MapKitDefaultHost mapKitDefaultHost2 = new MapKitDefaultHost("YANDEX_COM_NET", 1);
        YANDEX_COM_NET = mapKitDefaultHost2;
        MapKitDefaultHost mapKitDefaultHost3 = new MapKitDefaultHost("YANGO_COM", 2);
        YANGO_COM = mapKitDefaultHost3;
        MapKitDefaultHost mapKitDefaultHost4 = new MapKitDefaultHost("EU_YANGO_TECH", 3);
        EU_YANGO_TECH = mapKitDefaultHost4;
        MapKitDefaultHost mapKitDefaultHost5 = new MapKitDefaultHost("YANGO_TECH", 4);
        YANGO_TECH = mapKitDefaultHost5;
        MapKitDefaultHost[] mapKitDefaultHostArr = {mapKitDefaultHost, mapKitDefaultHost2, mapKitDefaultHost3, mapKitDefaultHost4, mapKitDefaultHost5};
        $VALUES = mapKitDefaultHostArr;
        $ENTRIES = a.a(mapKitDefaultHostArr);
        Companion = new kk00();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new t5z(13));
    }

    public static MapKitDefaultHost valueOf(String str) {
        return (MapKitDefaultHost) Enum.valueOf(MapKitDefaultHost.class, str);
    }

    public static MapKitDefaultHost[] values() {
        return (MapKitDefaultHost[]) $VALUES.clone();
    }
}
