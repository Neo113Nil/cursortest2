package com.yandex.go.location.user.overlay;

import defpackage.po21;
import kotlinx.coroutines.flow.n;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public abstract class d {
    public static final o a(po21 po21Var) {
        e eVar = (e) po21Var;
        return new o(new c(new n(eVar.n(), new UserLocationExtensionsKt$requestLocationUpdatesWithFallback$1(eVar, null))), new UserLocationExtensionsKt$requestLocationUpdatesWithFallback$3(3, null));
    }
}
