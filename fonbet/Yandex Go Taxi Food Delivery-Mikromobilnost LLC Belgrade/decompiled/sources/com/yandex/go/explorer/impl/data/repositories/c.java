package com.yandex.go.explorer.impl.data.repositories;

import android.location.Location;
import defpackage.ato;
import defpackage.duo;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class c {
    public final com.yandex.go.explorer.impl.data.storage.a a;
    public final duo b;
    public final tt2 c;
    public final ato d;

    public c(com.yandex.go.explorer.impl.data.storage.a aVar, duo duoVar, tt2 tt2Var, ato atoVar) {
        this.a = aVar;
        this.b = duoVar;
        this.c = tt2Var;
        this.d = atoVar;
    }

    public final Object a(Location location, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ExplorerRepository$saveLocation$2(this, location, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object b(Location location, double d, double d2, long j, Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ExplorerRepository$saveLocationAt$2(this, location, d, d2, j, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object c(Continuation continuation) {
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ExplorerRepository$uploadUserLocations$2(this, null), continuation);
    }
}
