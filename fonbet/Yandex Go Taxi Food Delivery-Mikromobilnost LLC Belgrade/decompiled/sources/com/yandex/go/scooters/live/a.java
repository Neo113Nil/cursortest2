package com.yandex.go.scooters.live;

import android.content.Intent;
import com.yandex.go.scooters.live.domain.model.ScootersLiveAction;
import defpackage.h3y;
import defpackage.hgn0;
import defpackage.hxx;
import defpackage.jvn0;
import defpackage.m5u;
import defpackage.m950;
import defpackage.n5u;
import defpackage.ny61;
import defpackage.o2b1;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.qxm0;
import defpackage.v0b1;
import defpackage.vwn0;
import defpackage.wwn0;
import defpackage.x7w;
import defpackage.yvf0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.scooters.domain.q;

/* loaded from: classes8.dex */
public final class a implements x7w {
    public final oep0 a;
    public final h3y b;
    public final yvf0 c;
    public final h3y d;
    public final h3y e;
    public final h3y f;
    public final h3y g;

    public a(oep0 oep0Var, h3y h3yVar, yvf0 yvf0Var, h3y h3yVar2, h3y h3yVar3, h3y h3yVar4, h3y h3yVar5) {
        this.a = oep0Var;
        this.b = h3yVar;
        this.c = yvf0Var;
        this.d = h3yVar2;
        this.e = h3yVar3;
        this.f = h3yVar4;
        this.g = h3yVar5;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.x7w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oep0 oep0Var, Intent intent, Continuation continuation) {
        ScootersLiveIntentHandler$processIntent$1 scootersLiveIntentHandler$processIntent$1;
        int i;
        wwn0 a;
        if (continuation instanceof ScootersLiveIntentHandler$processIntent$1) {
            scootersLiveIntentHandler$processIntent$1 = (ScootersLiveIntentHandler$processIntent$1) continuation;
            int i2 = scootersLiveIntentHandler$processIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersLiveIntentHandler$processIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersLiveIntentHandler$processIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersLiveIntentHandler$processIntent$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a = ((vwn0) this.f.get()).a(intent);
                    if (a != null) {
                        ((qxm0) this.b.get()).d(o2b1.f(a.a()));
                        hgn0 hgn0Var = (hgn0) this.g.get();
                        ScootersLiveAction a2 = a.a();
                        boolean a3 = hgn0Var.a(a.b().getSessionId(), a2 != null ? a2.getOnTheWayAction() : null);
                        if (a3) {
                            com.yandex.go.lifecycle.a aVar = (com.yandex.go.lifecycle.a) this.d.get();
                            scootersLiveIntentHandler$processIntent$1.L$0 = null;
                            scootersLiveIntentHandler$processIntent$1.L$1 = null;
                            scootersLiveIntentHandler$processIntent$1.L$2 = a;
                            scootersLiveIntentHandler$processIntent$1.Z$0 = a3;
                            scootersLiveIntentHandler$processIntent$1.label = 1;
                            if (aVar.a(scootersLiveIntentHandler$processIntent$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    return n5u.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a = (wwn0) scootersLiveIntentHandler$processIntent$1.L$2;
                kotlin.b.b(obj);
                ((pep0) this.a).f((m950) this.c.get(), new jvn0(v0b1.b(), ((q) this.e.get()).a(a.b().getSessionId())), hxx.a);
                return new m5u(false, false);
            }
        }
        scootersLiveIntentHandler$processIntent$1 = new ScootersLiveIntentHandler$processIntent$1(this, (ContinuationImpl) continuation);
        Object obj2 = scootersLiveIntentHandler$processIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersLiveIntentHandler$processIntent$1.label;
        if (i != 0) {
        }
        ((pep0) this.a).f((m950) this.c.get(), new jvn0(v0b1.b(), ((q) this.e.get()).a(a.b().getSessionId())), hxx.a);
        return new m5u(false, false);
    }
}
