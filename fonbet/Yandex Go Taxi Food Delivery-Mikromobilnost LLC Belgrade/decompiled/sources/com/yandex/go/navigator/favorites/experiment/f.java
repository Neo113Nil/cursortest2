package com.yandex.go.navigator.favorites.experiment;

import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class f {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[NavigatorFavoritesConfigDto.PlaceTypeDto.values().length];
        try {
            iArr[NavigatorFavoritesConfigDto.PlaceTypeDto.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NavigatorFavoritesConfigDto.PlaceTypeDto.WORK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NavigatorFavoritesConfigDto.PlaceTypeDto.FAVORITE_ORGANIZATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
