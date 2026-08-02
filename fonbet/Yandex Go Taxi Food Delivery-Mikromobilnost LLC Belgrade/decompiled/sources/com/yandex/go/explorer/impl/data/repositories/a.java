package com.yandex.go.explorer.impl.data.repositories;

import defpackage.ato;
import defpackage.dai0;
import defpackage.j10;
import defpackage.kto;
import defpackage.l0o;
import defpackage.lto;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xuo;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

/* loaded from: classes12.dex */
public final class a {
    public final kto a;
    public final ato b;
    public final xuo c;
    public final lto d;
    public final tt2 e;

    public a(kto ktoVar, ato atoVar, xuo xuoVar, lto ltoVar, tt2 tt2Var) {
        this.a = ktoVar;
        this.b = atoVar;
        this.c = xuoVar;
        this.d = ltoVar;
        this.e = tt2Var;
    }

    public final Object a(List list, Continuation continuation) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ExplorerDiscoveredCellRepositoryImpl$addCellsOrIgnore$2(this, list, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object b(ArrayList arrayList, Continuation continuation) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ExplorerDiscoveredCellRepositoryImpl$addCellsOrReplace$2(this, arrayList, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final Object c(SuspendLambda suspendLambda) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new ExplorerDiscoveredCellRepositoryImpl$getUnviewedCells$2(this, null), suspendLambda);
    }

    public final Object d(Continuation continuation) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ExplorerDiscoveredCellRepositoryImpl$markAllCellsAsViewed$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }

    public final tpr e() {
        j10 j = dai0.j(this.a.a, new String[]{"explorer_discovered_hex"}, new l0o(17));
        this.e.getClass();
        sjh sjhVar = uyj.a;
        return e.F(j, mdh.b);
    }

    public final Object f(Continuation continuation) {
        this.e.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(mdh.b, new ExplorerDiscoveredCellRepositoryImpl$syncCellsWithRemote$2(this, null), continuation);
        return k0 == CoroutineSingletons.COROUTINE_SUSPENDED ? k0 : zy11.a;
    }
}
