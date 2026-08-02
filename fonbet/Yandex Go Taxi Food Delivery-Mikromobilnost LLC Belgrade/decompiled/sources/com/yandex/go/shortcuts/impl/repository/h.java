package com.yandex.go.shortcuts.impl.repository;

import defpackage.o2y0;
import defpackage.o400;
import defpackage.q6y0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class h implements vpr {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        i iVar = this.a;
        iVar.getClass();
        o2y0 o2y0Var = ((q6y0) obj).c;
        iVar.a.getClass();
        sjh sjhVar = uyj.a;
        Object k0 = tje.k0(o400.a, new FeedOrderStatusNotificationRepositoryImpl$showTaxiOnTheWayNotification$2(iVar, o2y0Var, null), continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        zy11 zy11Var = zy11.a;
        if (k0 != coroutineSingletons) {
            k0 = zy11Var;
        }
        return k0 == coroutineSingletons ? k0 : zy11Var;
    }
}
