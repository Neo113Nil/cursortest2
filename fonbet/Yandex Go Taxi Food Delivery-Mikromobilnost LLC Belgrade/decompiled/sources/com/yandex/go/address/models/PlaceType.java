package com.yandex.go.address.models;

import defpackage.fvb0;
import defpackage.gsq0;
import defpackage.i3c0;
import defpackage.i3y;
import defpackage.k4o;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/go/address/models/PlaceType;", "", "Companion", "i3c0", "WORK", "HOME", "OTHER", "go-client-android.features.address.dto:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PlaceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PlaceType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final i3c0 Companion;
    public static final PlaceType HOME;
    public static final PlaceType OTHER;
    public static final PlaceType WORK;

    static {
        PlaceType placeType = new PlaceType("WORK", 0);
        WORK = placeType;
        PlaceType placeType2 = new PlaceType("HOME", 1);
        HOME = placeType2;
        PlaceType placeType3 = new PlaceType("OTHER", 2);
        OTHER = placeType3;
        PlaceType[] placeTypeArr = {placeType, placeType2, placeType3};
        $VALUES = placeTypeArr;
        $ENTRIES = kotlin.enums.a.a(placeTypeArr);
        Companion = new i3c0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new fvb0(13));
    }

    public static PlaceType valueOf(String str) {
        return (PlaceType) Enum.valueOf(PlaceType.class, str);
    }

    public static PlaceType[] values() {
        return (PlaceType[]) $VALUES.clone();
    }
}
