package com.yandex.go.scooters.domain;

import defpackage.iy11;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.ukn0;
import defpackage.uyj;
import defpackage.yw60;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a0 implements yw60 {
    public final tse a;
    public final tt2 b;
    public final ukn0 c;
    public final a d;
    public final com.yandex.go.scooters.live.domain.b e;
    public final iy11 f;
    public final ru.yandex.taxi.scooters.domain.e g;
    public final h0 h;
    public pzt0 i;
    public pzt0 j;

    public a0(tse tseVar, tt2 tt2Var, ukn0 ukn0Var, a aVar, com.yandex.go.scooters.live.domain.b bVar, iy11 iy11Var, ru.yandex.taxi.scooters.domain.e eVar, h0 h0Var) {
        this.a = tseVar;
        this.b = tt2Var;
        this.c = ukn0Var;
        this.d = aVar;
        this.e = bVar;
        this.f = iy11Var;
        this.g = eVar;
        this.h = h0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
    
        if (r0.b(r1) == r6) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a0 a0Var, ContinuationImpl continuationImpl) {
        ScootersStateInteractor$doActiveOrdersPolling$1 scootersStateInteractor$doActiveOrdersPolling$1;
        int i;
        ru.yandex.taxi.scooters.domain.e eVar = a0Var.g;
        if (continuationImpl instanceof ScootersStateInteractor$doActiveOrdersPolling$1) {
            scootersStateInteractor$doActiveOrdersPolling$1 = (ScootersStateInteractor$doActiveOrdersPolling$1) continuationImpl;
            int i2 = scootersStateInteractor$doActiveOrdersPolling$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersStateInteractor$doActiveOrdersPolling$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersStateInteractor$doActiveOrdersPolling$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersStateInteractor$doActiveOrdersPolling$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersStateInteractor$doActiveOrdersPolling$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            kotlin.b.b(obj);
                            return obj;
                        }
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                scootersStateInteractor$doActiveOrdersPolling$1.label = 2;
                Object c = eVar.c(scootersStateInteractor$doActiveOrdersPolling$1);
                return c != coroutineSingletons ? coroutineSingletons : c;
            }
        }
        scootersStateInteractor$doActiveOrdersPolling$1 = new ScootersStateInteractor$doActiveOrdersPolling$1(a0Var, continuationImpl);
        Object obj2 = scootersStateInteractor$doActiveOrdersPolling$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersStateInteractor$doActiveOrdersPolling$1.label;
        if (i != 0) {
        }
        scootersStateInteractor$doActiveOrdersPolling$1.label = 2;
        Object c2 = eVar.c(scootersStateInteractor$doActiveOrdersPolling$1);
        if (c2 != coroutineSingletons2) {
        }
    }

    @Override // defpackage.yw60
    public final void a(boolean z) {
        pzt0 pzt0Var = this.j;
        if (pzt0Var != null) {
            this.j = null;
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.i;
        if (pzt0Var2 == null || !pzt0Var2.isActive()) {
            this.b.getClass();
            sjh sjhVar = uyj.a;
            this.i = tje.N(this.a, mdh.b, null, new ScootersStateInteractor$onAppResumed$1(this, null), 2);
        }
    }

    @Override // defpackage.yw60
    public final void b() {
        this.j = tje.N(this.a, null, null, new ScootersStateInteractor$onAppPaused$1(this, null), 3);
    }

    @Override // defpackage.s150
    public final String getName() {
        return "ScootersStateInteractor";
    }
}
