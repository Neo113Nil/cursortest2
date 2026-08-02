package com.yandex.go.navigator.favorites.experiment;

import com.yandex.go.navigator.favorites.experiment.NavigatorFavoritesConfigDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = NavigatorFavoritesConfigDto.PlaceTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
