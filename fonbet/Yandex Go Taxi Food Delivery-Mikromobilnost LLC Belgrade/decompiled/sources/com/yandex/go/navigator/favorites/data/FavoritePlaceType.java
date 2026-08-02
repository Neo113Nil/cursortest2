package com.yandex.go.navigator.favorites.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/navigator/favorites/data/FavoritePlaceType;", "", "HOME", "WORK", "FAVORITE_ORGANIZATION", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FavoritePlaceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritePlaceType[] $VALUES;
    public static final FavoritePlaceType FAVORITE_ORGANIZATION;
    public static final FavoritePlaceType HOME;
    public static final FavoritePlaceType WORK;

    static {
        FavoritePlaceType favoritePlaceType = new FavoritePlaceType("HOME", 0);
        HOME = favoritePlaceType;
        FavoritePlaceType favoritePlaceType2 = new FavoritePlaceType("WORK", 1);
        WORK = favoritePlaceType2;
        FavoritePlaceType favoritePlaceType3 = new FavoritePlaceType("FAVORITE_ORGANIZATION", 2);
        FAVORITE_ORGANIZATION = favoritePlaceType3;
        FavoritePlaceType[] favoritePlaceTypeArr = {favoritePlaceType, favoritePlaceType2, favoritePlaceType3};
        $VALUES = favoritePlaceTypeArr;
        $ENTRIES = a.a(favoritePlaceTypeArr);
    }

    public static FavoritePlaceType valueOf(String str) {
        return (FavoritePlaceType) Enum.valueOf(FavoritePlaceType.class, str);
    }

    public static FavoritePlaceType[] values() {
        return (FavoritePlaceType[]) $VALUES.clone();
    }
}
