package com.yandex.go.places.models.data.entities.network;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.k59;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/yandex/go/places/models/data/entities/network/CategoryFilterType;", "", "Companion", "k59", "SEARCH", "FAVOURITES", "CATEGORY", "UNKNOWN", "models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CategoryFilterType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CategoryFilterType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final CategoryFilterType CATEGORY;
    public static final k59 Companion;
    public static final CategoryFilterType FAVOURITES;
    public static final CategoryFilterType SEARCH;
    public static final CategoryFilterType UNKNOWN;

    static {
        CategoryFilterType categoryFilterType = new CategoryFilterType("SEARCH", 0);
        SEARCH = categoryFilterType;
        CategoryFilterType categoryFilterType2 = new CategoryFilterType("FAVOURITES", 1);
        FAVOURITES = categoryFilterType2;
        CategoryFilterType categoryFilterType3 = new CategoryFilterType("CATEGORY", 2);
        CATEGORY = categoryFilterType3;
        CategoryFilterType categoryFilterType4 = new CategoryFilterType("UNKNOWN", 3);
        UNKNOWN = categoryFilterType4;
        CategoryFilterType[] categoryFilterTypeArr = {categoryFilterType, categoryFilterType2, categoryFilterType3, categoryFilterType4};
        $VALUES = categoryFilterTypeArr;
        $ENTRIES = kotlin.enums.a.a(categoryFilterTypeArr);
        Companion = new k59();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(29));
    }

    public static CategoryFilterType valueOf(String str) {
        return (CategoryFilterType) Enum.valueOf(CategoryFilterType.class, str);
    }

    public static CategoryFilterType[] values() {
        return (CategoryFilterType[]) $VALUES.clone();
    }
}
