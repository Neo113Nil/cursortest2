package com.yandex.go.places.impl.domain.entities;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/places/impl/domain/entities/FavoritesState;", "", "SELECTED", "NOT_SELECTED", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FavoritesState {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FavoritesState[] $VALUES;
    public static final FavoritesState NOT_SELECTED;
    public static final FavoritesState SELECTED;

    static {
        FavoritesState favoritesState = new FavoritesState("SELECTED", 0);
        SELECTED = favoritesState;
        FavoritesState favoritesState2 = new FavoritesState("NOT_SELECTED", 1);
        NOT_SELECTED = favoritesState2;
        FavoritesState[] favoritesStateArr = {favoritesState, favoritesState2};
        $VALUES = favoritesStateArr;
        $ENTRIES = a.a(favoritesStateArr);
    }

    public static FavoritesState valueOf(String str) {
        return (FavoritesState) Enum.valueOf(FavoritesState.class, str);
    }

    public static FavoritesState[] values() {
        return (FavoritesState[]) $VALUES.clone();
    }
}
