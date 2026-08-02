package com.yandex.go.superapp_favorites.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"com/yandex/go/superapp_favorites/analytics/SuperappFavoritesAnalytics$FavoritesTapActionType", "", "Lcom/yandex/go/superapp_favorites/analytics/SuperappFavoritesAnalytics$FavoritesTapActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Reload", "Similar", "Update", "Clear", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SuperappFavoritesAnalytics$FavoritesTapActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SuperappFavoritesAnalytics$FavoritesTapActionType[] $VALUES;
    public static final SuperappFavoritesAnalytics$FavoritesTapActionType Back;
    public static final SuperappFavoritesAnalytics$FavoritesTapActionType Clear;
    public static final SuperappFavoritesAnalytics$FavoritesTapActionType Reload;
    public static final SuperappFavoritesAnalytics$FavoritesTapActionType Similar;
    public static final SuperappFavoritesAnalytics$FavoritesTapActionType Update;
    private final String eventValue;

    static {
        SuperappFavoritesAnalytics$FavoritesTapActionType superappFavoritesAnalytics$FavoritesTapActionType = new SuperappFavoritesAnalytics$FavoritesTapActionType("Back", 0, "back");
        Back = superappFavoritesAnalytics$FavoritesTapActionType;
        SuperappFavoritesAnalytics$FavoritesTapActionType superappFavoritesAnalytics$FavoritesTapActionType2 = new SuperappFavoritesAnalytics$FavoritesTapActionType("Reload", 1, "reload");
        Reload = superappFavoritesAnalytics$FavoritesTapActionType2;
        SuperappFavoritesAnalytics$FavoritesTapActionType superappFavoritesAnalytics$FavoritesTapActionType3 = new SuperappFavoritesAnalytics$FavoritesTapActionType("Similar", 2, "similar");
        Similar = superappFavoritesAnalytics$FavoritesTapActionType3;
        SuperappFavoritesAnalytics$FavoritesTapActionType superappFavoritesAnalytics$FavoritesTapActionType4 = new SuperappFavoritesAnalytics$FavoritesTapActionType("Update", 3, "update");
        Update = superappFavoritesAnalytics$FavoritesTapActionType4;
        SuperappFavoritesAnalytics$FavoritesTapActionType superappFavoritesAnalytics$FavoritesTapActionType5 = new SuperappFavoritesAnalytics$FavoritesTapActionType("Clear", 4, "clear");
        Clear = superappFavoritesAnalytics$FavoritesTapActionType5;
        SuperappFavoritesAnalytics$FavoritesTapActionType[] superappFavoritesAnalytics$FavoritesTapActionTypeArr = {superappFavoritesAnalytics$FavoritesTapActionType, superappFavoritesAnalytics$FavoritesTapActionType2, superappFavoritesAnalytics$FavoritesTapActionType3, superappFavoritesAnalytics$FavoritesTapActionType4, superappFavoritesAnalytics$FavoritesTapActionType5};
        $VALUES = superappFavoritesAnalytics$FavoritesTapActionTypeArr;
        $ENTRIES = a.a(superappFavoritesAnalytics$FavoritesTapActionTypeArr);
    }

    public SuperappFavoritesAnalytics$FavoritesTapActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static SuperappFavoritesAnalytics$FavoritesTapActionType valueOf(String str) {
        return (SuperappFavoritesAnalytics$FavoritesTapActionType) Enum.valueOf(SuperappFavoritesAnalytics$FavoritesTapActionType.class, str);
    }

    public static SuperappFavoritesAnalytics$FavoritesTapActionType[] values() {
        return (SuperappFavoritesAnalytics$FavoritesTapActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
