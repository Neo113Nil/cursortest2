package com.yandex.go.sdk;

import defpackage.fyc;
import defpackage.gwk0;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.locationsdk.core.input_controller.internal.b;
import ru.yandex.taxi.locationsdk.core.processor_controller.internal.d;

/* loaded from: classes8.dex */
public final class a {
    public final ru.yandex.taxi.locationsdk.core.location_bus.internal.a a;
    public final b b;
    public final d c;
    public final tt2 d;
    public final fyc e = gwk0.b();
    public volatile boolean f;

    public a(ru.yandex.taxi.locationsdk.core.location_bus.internal.a aVar, b bVar, d dVar, tt2 tt2Var) {
        this.a = aVar;
        this.b = bVar;
        this.c = dVar;
        this.d = tt2Var;
    }

    public final Object a(boolean z, Continuation continuation) {
        this.d.getClass();
        Object k0 = tje.k0(uyj.a, new LocationSdk$start$2(z, this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
