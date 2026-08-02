package com.yandex.go.drive.delegates;

import defpackage.dvw;
import defpackage.j18;
import defpackage.sls;
import defpackage.tem;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.um3;
import defpackage.un9;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.am.j;
import ru.yandex.taxi.analytics.Events$Zalogin$LoginContext;
import ru.yandex.taxi.zalogin.d;

/* loaded from: classes12.dex */
public final class a implements tem {
    public final d a;
    public final g b;
    public final b c;
    public final tse d;
    public final e e;
    public final j f;

    public a(d dVar, g gVar, b bVar, tse tseVar, e eVar, j jVar) {
        this.a = dVar;
        this.b = gVar;
        this.c = bVar;
        this.d = tseVar;
        this.e = eVar;
        this.f = jVar;
    }

    public final Object a(SuspendLambda suspendLambda) {
        j18 j18Var = new j18(1, dvw.b(suspendLambda));
        j18Var.u();
        Events$Zalogin$LoginContext events$Zalogin$LoginContext = Events$Zalogin$LoginContext.DRIVE;
        un9 un9Var = new un9(1, this, j18Var);
        e eVar = this.e;
        eVar.getClass();
        eVar.f(new um3(events$Zalogin$LoginContext, un9Var, false, false, 28));
        Object s = j18Var.s();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    public final void b(sls slsVar, tls tlsVar) {
        tje.N(this.d, null, null, new DrivePortalAuthorizationInteractorImpl$validateAuthConditions$1(this, tlsVar, slsVar, null), 3);
    }
}
