package com.yandex.go.places.impl.ui.common.map.location;

import defpackage.po21;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes13.dex */
public abstract class d {
    public static final o a(po21 po21Var) {
        e eVar = (e) po21Var;
        return new o(new c(new n(eVar.n(), new PlacesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$1(eVar, null))), new PlacesUserLocationExtensionsKt$requestLocationUpdatesWithFallback$3(3, null));
    }
}
