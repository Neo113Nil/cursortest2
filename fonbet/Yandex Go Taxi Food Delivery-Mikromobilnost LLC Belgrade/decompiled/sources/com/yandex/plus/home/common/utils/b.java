package com.yandex.plus.home.common.utils;

import defpackage.cvw;
import defpackage.dse;
import defpackage.ese;
import defpackage.eyc;
import defpackage.ffx;
import defpackage.fse;
import defpackage.fyc;
import defpackage.hpb;
import defpackage.m1k;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qrq0;
import defpackage.seu;
import defpackage.tls;
import defpackage.wls;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements noh {
    public final /* synthetic */ fyc a;
    public final /* synthetic */ fyc b;
    public final /* synthetic */ AtomicBoolean c;
    public final /* synthetic */ tls w;

    public b(fyc fycVar, AtomicBoolean atomicBoolean, tls tlsVar) {
        this.b = fycVar;
        this.c = atomicBoolean;
        this.w = tlsVar;
        this.a = fycVar;
    }

    @Override // defpackage.l8x
    public final m1k D(tls tlsVar, boolean z, boolean z2) {
        return this.a.D(tlsVar, z, z2);
    }

    @Override // defpackage.l8x
    public final CancellationException I() {
        return this.a.I();
    }

    @Override // defpackage.l8x
    public final void a(CancellationException cancellationException) {
        this.a.a(cancellationException);
    }

    @Override // defpackage.l8x
    public final hpb b0(kotlinx.coroutines.c cVar) {
        return this.a.b0(cVar);
    }

    @Override // defpackage.noh
    public final Object c() {
        return this.a.E();
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this.a);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this.a, eseVar);
    }

    @Override // defpackage.l8x
    public final qrq0 getChildren() {
        return this.a.getChildren();
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return seu.C;
    }

    @Override // defpackage.l8x
    public final boolean isActive() {
        return this.a.isActive();
    }

    @Override // defpackage.l8x
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.noh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Continuation continuation) {
        DeferredUtilsKt$deferredLazy$1$await$1 deferredUtilsKt$deferredLazy$1$await$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        eyc eycVar;
        if (continuation instanceof DeferredUtilsKt$deferredLazy$1$await$1) {
            deferredUtilsKt$deferredLazy$1$await$1 = (DeferredUtilsKt$deferredLazy$1$await$1) continuation;
            int i2 = deferredUtilsKt$deferredLazy$1$await$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                deferredUtilsKt$deferredLazy$1$await$1.label = i2 - Integer.MIN_VALUE;
                Object obj = deferredUtilsKt$deferredLazy$1$await$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = deferredUtilsKt$deferredLazy$1$await$1.label;
                fyc fycVar = this.b;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!this.c.getAndSet(true)) {
                        deferredUtilsKt$deferredLazy$1$await$1.L$0 = fycVar;
                        deferredUtilsKt$deferredLazy$1$await$1.label = 1;
                        obj = this.w.invoke(deferredUtilsKt$deferredLazy$1$await$1);
                        if (obj != coroutineSingletons) {
                            eycVar = fycVar;
                        }
                    }
                    deferredUtilsKt$deferredLazy$1$await$1.L$0 = null;
                    deferredUtilsKt$deferredLazy$1$await$1.label = 2;
                    Object s = fycVar.s(deferredUtilsKt$deferredLazy$1$await$1);
                    return s == coroutineSingletons ? coroutineSingletons : s;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return obj;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                eycVar = (eyc) deferredUtilsKt$deferredLazy$1$await$1.L$0;
                kotlin.b.b(obj);
                ((fyc) eycVar).T(obj);
                deferredUtilsKt$deferredLazy$1$await$1.L$0 = null;
                deferredUtilsKt$deferredLazy$1$await$1.label = 2;
                Object s2 = fycVar.s(deferredUtilsKt$deferredLazy$1$await$1);
                if (s2 == coroutineSingletons) {
                }
            }
        }
        deferredUtilsKt$deferredLazy$1$await$1 = new DeferredUtilsKt$deferredLazy$1$await$1(this, continuation);
        Object obj2 = deferredUtilsKt$deferredLazy$1$await$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = deferredUtilsKt$deferredLazy$1$await$1.label;
        fyc fycVar2 = this.b;
        if (i != 0) {
        }
        ((fyc) eycVar).T(obj2);
        deferredUtilsKt$deferredLazy$1$await$1.L$0 = null;
        deferredUtilsKt$deferredLazy$1$await$1.label = 2;
        Object s22 = fycVar2.s(deferredUtilsKt$deferredLazy$1$await$1);
        if (s22 == coroutineSingletons) {
        }
    }

    @Override // defpackage.l8x
    public final boolean k0() {
        return this.a.k0();
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this.a, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this.a, fseVar);
    }

    @Override // defpackage.l8x
    public final boolean start() {
        return this.a.start();
    }

    @Override // defpackage.l8x
    public final Object u0(Continuation continuation) {
        return this.a.u0(continuation);
    }

    @Override // defpackage.l8x
    public final m1k w(tls tlsVar) {
        return this.a.w(tlsVar);
    }
}
