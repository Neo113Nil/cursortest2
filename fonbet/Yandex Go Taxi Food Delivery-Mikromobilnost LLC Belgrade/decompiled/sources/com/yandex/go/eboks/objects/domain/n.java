package com.yandex.go.eboks.objects.domain;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.ah00;
import defpackage.bin;
import defpackage.dib1;
import defpackage.fhn;
import defpackage.g6u;
import defpackage.gh00;
import defpackage.ghn;
import defpackage.hin;
import defpackage.jst;
import defpackage.ky2;
import defpackage.mth;
import defpackage.ny61;
import defpackage.o400;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.shn;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uc4;
import defpackage.uyj;
import defpackage.w511;
import defpackage.ygn;
import defpackage.zzs;
import java.io.Serializable;
import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class n {
    public final ah00 a;
    public final tt2 b;
    public final ky2 c;
    public final pwy0 d;
    public final com.yandex.go.eboks.objects.data.mapper.a e;
    public final bin f;
    public final com.yandex.go.eboks.objects.data.c g;
    public final com.yandex.go.eboks.objects.data.a h;
    public final hin i;
    public final ghn j;

    public n(ah00 ah00Var, tt2 tt2Var, ky2 ky2Var, pwy0 pwy0Var, com.yandex.go.eboks.objects.data.mapper.a aVar, bin binVar, com.yandex.go.eboks.objects.data.c cVar, com.yandex.go.eboks.objects.data.a aVar2, hin hinVar, ghn ghnVar) {
        this.a = ah00Var;
        this.b = tt2Var;
        this.c = ky2Var;
        this.d = pwy0Var;
        this.e = aVar;
        this.f = binVar;
        this.g = cVar;
        this.h = aVar2;
        this.i = hinVar;
        this.j = ghnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(n nVar, ygn ygnVar, com.yandex.go.eboks.objects.domain.model.a aVar, ContinuationImpl continuationImpl) {
        EboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1 eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1;
        int i;
        ah00 ah00Var = nVar.a;
        if (continuationImpl instanceof EboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1) {
            eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1 = (EboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1) continuationImpl;
            int i2 = eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ygnVar instanceof ygn)) {
                        w511.b();
                        return null;
                    }
                    eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.L$0 = ygnVar;
                    eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.L$1 = aVar;
                    eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.label = 2;
                    zzs b = ((gh00) ah00Var).e.b();
                    if (fhn.a(ah00Var, new Point(b.a, b.b), eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i == 1) {
                        com.yandex.go.eboks.objects.domain.model.a aVar2 = (com.yandex.go.eboks.objects.domain.model.a) eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.L$1;
                        kotlin.b.b(obj);
                        return new shn(((gh00) ah00Var).e.f(), aVar2, 4);
                    }
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (com.yandex.go.eboks.objects.domain.model.a) eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.L$1;
                    ygnVar = (ygn) eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.L$0;
                    kotlin.b.b(obj);
                }
                return new shn(((gh00) ah00Var).e.f(), true, Arrays.asList(ygnVar.a), aVar);
            }
        }
        eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1 = new EboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1(nVar, continuationImpl);
        Object obj2 = eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$mapClientEventToRequestTrigger$1.label;
        if (i != 0) {
        }
        return new shn(((gh00) ah00Var).e.f(), true, Arrays.asList(ygnVar.a), aVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable b(n nVar, shn shnVar, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1 eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Exception exc;
        com.yandex.go.eboks.objects.domain.model.a aVar;
        shn shnVar2;
        VisibleRegion visibleRegion;
        nVar.getClass();
        try {
            try {
                if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1) {
                    eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1 = (EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1) continuation;
                    int i2 = eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.label;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.label = i2 - Integer.MIN_VALUE;
                        obj = eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.result;
                        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.label;
                        if (i != 0) {
                            kotlin.b.b(obj);
                            VisibleRegion visibleRegion2 = shnVar.a;
                            nVar.b.getClass();
                            sjh sjhVar = uyj.a;
                            g6u g6uVar = o400.a;
                            EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1 eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1 = new EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1(nVar, visibleRegion2, null);
                            eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$0 = shnVar;
                            eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$1 = visibleRegion2;
                            eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.label = 1;
                            Object k0 = tje.k0(g6uVar, eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$bbox$1, eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1);
                            if (k0 != coroutineSingletons) {
                                shnVar2 = shnVar;
                                visibleRegion = visibleRegion2;
                                obj = k0;
                            }
                            return coroutineSingletons;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            shnVar = (shn) eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$0;
                            kotlin.b.b(obj);
                            return (Pair) obj;
                        }
                        VisibleRegion visibleRegion3 = (VisibleRegion) eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$1;
                        shn shnVar3 = (shn) eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$0;
                        try {
                            kotlin.b.b(obj);
                            visibleRegion = visibleRegion3;
                            shnVar2 = shnVar3;
                        } catch (Exception e) {
                            exc = e;
                            shnVar = shnVar3;
                            aVar = shnVar.d;
                            if (aVar != null) {
                            }
                            if (!(exc instanceof CancellationException)) {
                            }
                        }
                        EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2 eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2 = new EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2(nVar, (uc4) obj, shnVar2, visibleRegion, null);
                        eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$0 = shnVar2;
                        eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$1 = null;
                        eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$2 = null;
                        eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.label = 2;
                        obj = kotlinx.coroutines.flow.e.y(new mth(kotlinx.coroutines.flow.e.I(nVar.c.i(), new EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2(eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2, null)), 6), eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1);
                        if (obj != coroutineSingletons) {
                            shnVar = shnVar2;
                            return (Pair) obj;
                        }
                        return coroutineSingletons;
                    }
                }
                EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2 eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$22 = new EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$2(nVar, (uc4) obj, shnVar2, visibleRegion, null);
                eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$0 = shnVar2;
                eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$1 = null;
                eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.L$2 = null;
                eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.label = 2;
                obj = kotlinx.coroutines.flow.e.y(new mth(kotlinx.coroutines.flow.e.I(nVar.c.i(), new EboksObjectsObjectsCollectionsInteractor$executeWhileResumed$2(eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$22, null)), 6), eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            } catch (Exception e2) {
                exc = e2;
                shnVar = shnVar2;
                aVar = shnVar.d;
                if (aVar != null) {
                    Result.Failure failure = new Result.Failure(exc);
                    r0 r0Var = aVar.a;
                    Result result = new Result(failure);
                    r0Var.getClass();
                    r0Var.m(null, result);
                }
                if (!(exc instanceof CancellationException)) {
                    throw exc;
                }
                jst.e.getClass();
                return new Pair(shnVar, null);
            }
            if (i != 0) {
            }
        } catch (Exception e3) {
            exc = e3;
        }
        eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1 = new EboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1(nVar, continuation);
        obj = eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$requestEboksCollections$1.label;
    }

    public final m0 c() {
        kotlinx.coroutines.flow.internal.h K = kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{kotlinx.coroutines.flow.e.o(new i(new kotlinx.coroutines.flow.n(new k(new rol0(new EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$throttleFirstIf$1(new g(dib1.c(this.a)), this.f.a().d, null)), this), new EboksObjectsObjectsCollectionsInteractor$withStartValue$1(this, null)), this)), new m(this.h.a, this)}, 2));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        int i = 6;
        return new m0(new mth(new e(kotlinx.coroutines.flow.e.I(kotlinx.coroutines.flow.e.B(new mth(new j0(null, kotlinx.coroutines.flow.e.F(K, o400.a), new EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$withPreviousEmit$1(3, null)), i), new EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$flatMapConcat$1(this, null)), new EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$2(2, this, n.class, "requestEboksCollections", "requestEboksCollections(Lcom/yandex/go/eboks/objects/domain/EboksObjectsObjectsCollectionsInteractor$RequestTrigger;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0)), this), i), this.d.a(), new EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$4(this, null));
    }
}
