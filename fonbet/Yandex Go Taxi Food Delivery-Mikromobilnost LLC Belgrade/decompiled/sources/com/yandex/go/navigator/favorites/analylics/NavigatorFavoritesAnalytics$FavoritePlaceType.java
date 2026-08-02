package com.yandex.go.navigator.favorites.analylics;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"com/yandex/go/navigator/favorites/analylics/NavigatorFavoritesAnalytics$FavoritePlaceType", "", "Lcom/yandex/go/navigator/favorites/analylics/NavigatorFavoritesAnalytics$FavoritePlaceType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Home", "Work", "Organization", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigatorFavoritesAnalytics$FavoritePlaceType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NavigatorFavoritesAnalytics$FavoritePlaceType[] $VALUES;
    public static final NavigatorFavoritesAnalytics$FavoritePlaceType Home;
    public static final NavigatorFavoritesAnalytics$FavoritePlaceType Organization;
    public static final NavigatorFavoritesAnalytics$FavoritePlaceType Work;
    private final String eventValue;

    static {
        NavigatorFavoritesAnalytics$FavoritePlaceType navigatorFavoritesAnalytics$FavoritePlaceType = new NavigatorFavoritesAnalytics$FavoritePlaceType("Home", 0, "home");
        Home = navigatorFavoritesAnalytics$FavoritePlaceType;
        NavigatorFavoritesAnalytics$FavoritePlaceType navigatorFavoritesAnalytics$FavoritePlaceType2 = new NavigatorFavoritesAnalytics$FavoritePlaceType("Work", 1, "work");
        Work = navigatorFavoritesAnalytics$FavoritePlaceType2;
        NavigatorFavoritesAnalytics$FavoritePlaceType navigatorFavoritesAnalytics$FavoritePlaceType3 = new NavigatorFavoritesAnalytics$FavoritePlaceType("Organization", 2, "organization");
        Organization = navigatorFavoritesAnalytics$FavoritePlaceType3;
        NavigatorFavoritesAnalytics$FavoritePlaceType[] navigatorFavoritesAnalytics$FavoritePlaceTypeArr = {navigatorFavoritesAnalytics$FavoritePlaceType, navigatorFavoritesAnalytics$FavoritePlaceType2, navigatorFavoritesAnalytics$FavoritePlaceType3};
        $VALUES = navigatorFavoritesAnalytics$FavoritePlaceTypeArr;
        $ENTRIES = kotlin.enums.a.a(navigatorFavoritesAnalytics$FavoritePlaceTypeArr);
    }

    public NavigatorFavoritesAnalytics$FavoritePlaceType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static NavigatorFavoritesAnalytics$FavoritePlaceType valueOf(String str) {
        return (NavigatorFavoritesAnalytics$FavoritePlaceType) Enum.valueOf(NavigatorFavoritesAnalytics$FavoritePlaceType.class, str);
    }

    public static NavigatorFavoritesAnalytics$FavoritePlaceType[] values() {
        return (NavigatorFavoritesAnalytics$FavoritePlaceType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
