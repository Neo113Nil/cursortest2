package com.yandex.go.suggest.impl.data.flex.network;

import defpackage.ab3;
import defpackage.i3y;
import defpackage.i7x0;
import defpackage.kq90;
import defpackage.m0m;
import defpackage.ny61;
import defpackage.p73;
import defpackage.q370;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tzl;
import defpackage.u1m;
import defpackage.wbe0;
import defpackage.wzl;
import defpackage.ya3;
import defpackage.ywl;
import defpackage.za3;
import flex.core.loader.network.e;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a implements m0m {
    public final tse a;
    public final e b;
    public qoh c;
    public final ConcurrentLinkedQueue w = new ConcurrentLinkedQueue();
    public final i3y x = kotlin.a.a(new p73(5));

    public a(tse tseVar, e eVar) {
        this.a = tseVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, ContinuationImpl continuationImpl) {
        AsyncReloadingDocumentLoader$fetchDocumentInternal$1 asyncReloadingDocumentLoader$fetchDocumentInternal$1;
        int i;
        try {
            if (continuationImpl instanceof AsyncReloadingDocumentLoader$fetchDocumentInternal$1) {
                asyncReloadingDocumentLoader$fetchDocumentInternal$1 = (AsyncReloadingDocumentLoader$fetchDocumentInternal$1) continuationImpl;
                int i2 = asyncReloadingDocumentLoader$fetchDocumentInternal$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    asyncReloadingDocumentLoader$fetchDocumentInternal$1.label = i2 - Integer.MIN_VALUE;
                    AsyncReloadingDocumentLoader$fetchDocumentInternal$1 asyncReloadingDocumentLoader$fetchDocumentInternal$12 = asyncReloadingDocumentLoader$fetchDocumentInternal$1;
                    Object obj = asyncReloadingDocumentLoader$fetchDocumentInternal$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = asyncReloadingDocumentLoader$fetchDocumentInternal$12.label;
                    if (i != 0) {
                        b.b(obj);
                        qoh qohVar = this.c;
                        if (qohVar != null) {
                            qohVar.a(null);
                        }
                        Iterator it = this.w.iterator();
                        while (it.hasNext()) {
                            ((ya3) it.next()).b.a(null);
                        }
                        qoh h = tje.h(this.a, null, null, new AsyncReloadingDocumentLoader$fetchDocumentInternal$newDocumentRequest$1(this, u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, null), 3);
                        this.c = h;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.L$0 = null;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.L$1 = null;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.L$2 = null;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.L$3 = null;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.Z$0 = z;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.Z$1 = z2;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.Z$2 = z3;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.Z$3 = z4;
                        asyncReloadingDocumentLoader$fetchDocumentInternal$12.label = 1;
                        obj = h.s(asyncReloadingDocumentLoader$fetchDocumentInternal$12);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        b.b(obj);
                    }
                    return (wzl) obj;
                }
            }
            if (i != 0) {
            }
            return (wzl) obj;
        } catch (CancellationException e) {
            return new tzl(e);
        } finally {
            this.c = null;
        }
        asyncReloadingDocumentLoader$fetchDocumentInternal$1 = new AsyncReloadingDocumentLoader$fetchDocumentInternal$1(this, continuationImpl);
        AsyncReloadingDocumentLoader$fetchDocumentInternal$1 asyncReloadingDocumentLoader$fetchDocumentInternal$122 = asyncReloadingDocumentLoader$fetchDocumentInternal$1;
        Object obj2 = asyncReloadingDocumentLoader$fetchDocumentInternal$122.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncReloadingDocumentLoader$fetchDocumentInternal$122.label;
    }

    @Override // defpackage.m0m
    public final Object b(u1m u1mVar, i7x0 i7x0Var, boolean z, ContinuationImpl continuationImpl) {
        return this.b.b(u1mVar, i7x0Var, z, continuationImpl);
    }

    @Override // defpackage.m0m
    public final Object c(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, boolean z3, i7x0 i7x0Var, boolean z4, ContinuationImpl continuationImpl) {
        return a(u1mVar, ywlVar, z, z2, z3, i7x0Var, z4, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    @Override // defpackage.m0m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, Continuation continuation) {
        AsyncReloadingDocumentLoader$fetchPortion$1 asyncReloadingDocumentLoader$fetchPortion$1;
        int i;
        ConcurrentLinkedQueue concurrentLinkedQueue;
        za3 za3Var;
        ya3 ya3Var;
        try {
            if (continuation instanceof AsyncReloadingDocumentLoader$fetchPortion$1) {
                asyncReloadingDocumentLoader$fetchPortion$1 = (AsyncReloadingDocumentLoader$fetchPortion$1) continuation;
                int i2 = asyncReloadingDocumentLoader$fetchPortion$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    asyncReloadingDocumentLoader$fetchPortion$1.label = i2 - Integer.MIN_VALUE;
                    AsyncReloadingDocumentLoader$fetchPortion$1 asyncReloadingDocumentLoader$fetchPortion$12 = asyncReloadingDocumentLoader$fetchPortion$1;
                    Object obj = asyncReloadingDocumentLoader$fetchPortion$12.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = asyncReloadingDocumentLoader$fetchPortion$12.label;
                    concurrentLinkedQueue = this.w;
                    if (i != 0) {
                        b.b(obj);
                        ((ab3) this.x.getValue()).getClass();
                        try {
                            Map map = (Map) kotlin.collections.b.g("search_context", (Map) kotlin.collections.b.g("request", wbe0Var.b));
                            za3Var = new za3((String) kotlin.collections.b.g("text", map), (String) kotlin.collections.b.g("search_session_id", map));
                        } catch (Exception unused) {
                            za3Var = za3.c;
                        }
                        za3 za3Var2 = za3Var;
                        Iterator it = concurrentLinkedQueue.iterator();
                        while (it.hasNext()) {
                            ya3 ya3Var2 = (ya3) it.next();
                            if (!ya3Var2.a.equals(za3Var2)) {
                                ya3Var2.b.a(null);
                                concurrentLinkedQueue.remove(ya3Var2);
                            }
                        }
                        qoh h = tje.h(this.a, null, null, new AsyncReloadingDocumentLoader$fetchPortion$portionRequest$1(this, u1mVar, wbe0Var, q370Var, kq90Var, null), 3);
                        ya3Var = new ya3(za3Var2, h);
                        concurrentLinkedQueue.add(ya3Var);
                        asyncReloadingDocumentLoader$fetchPortion$12.L$0 = null;
                        asyncReloadingDocumentLoader$fetchPortion$12.L$1 = null;
                        asyncReloadingDocumentLoader$fetchPortion$12.L$2 = null;
                        asyncReloadingDocumentLoader$fetchPortion$12.L$3 = null;
                        asyncReloadingDocumentLoader$fetchPortion$12.L$4 = null;
                        asyncReloadingDocumentLoader$fetchPortion$12.L$5 = null;
                        asyncReloadingDocumentLoader$fetchPortion$12.L$6 = ya3Var;
                        asyncReloadingDocumentLoader$fetchPortion$12.label = 1;
                        obj = h.s(asyncReloadingDocumentLoader$fetchPortion$12);
                        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ya3Var = (ya3) asyncReloadingDocumentLoader$fetchPortion$12.L$6;
                        b.b(obj);
                    }
                    return (wzl) obj;
                }
            }
            if (i != 0) {
            }
            return (wzl) obj;
        } catch (CancellationException e) {
            return new tzl(e);
        } finally {
            concurrentLinkedQueue.remove(ya3Var);
        }
        asyncReloadingDocumentLoader$fetchPortion$1 = new AsyncReloadingDocumentLoader$fetchPortion$1(this, (ContinuationImpl) continuation);
        AsyncReloadingDocumentLoader$fetchPortion$1 asyncReloadingDocumentLoader$fetchPortion$122 = asyncReloadingDocumentLoader$fetchPortion$1;
        Object obj2 = asyncReloadingDocumentLoader$fetchPortion$122.result;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = asyncReloadingDocumentLoader$fetchPortion$122.label;
        concurrentLinkedQueue = this.w;
    }

    @Override // defpackage.m0m
    public final Object e(u1m u1mVar, ywl ywlVar, boolean z, boolean z2, i7x0 i7x0Var, ContinuationImpl continuationImpl) {
        return a(u1mVar, ywlVar, z, z2, false, i7x0Var, false, continuationImpl);
    }
}
