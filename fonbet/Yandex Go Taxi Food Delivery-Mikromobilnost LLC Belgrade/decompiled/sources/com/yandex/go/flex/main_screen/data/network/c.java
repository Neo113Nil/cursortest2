package com.yandex.go.flex.main_screen.data.network;

import com.yandex.go.flex.main_screen.experiments.SuperAppMainScreenDocumentLoaderExperiment;
import com.yandex.go.flex.main_screen.experiments.f;
import defpackage.bvf0;
import defpackage.bvu0;
import defpackage.cot;
import defpackage.i7x0;
import defpackage.ike;
import defpackage.jl40;
import defpackage.jmr;
import defpackage.jst;
import defpackage.kq90;
import defpackage.m0m;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.oa00;
import defpackage.q370;
import defpackage.sjh;
import defpackage.thb1;
import defpackage.tt2;
import defpackage.tzl;
import defpackage.u1m;
import defpackage.uyj;
import defpackage.uzl;
import defpackage.v800;
import defpackage.vzl;
import defpackage.w511;
import defpackage.wbe0;
import defpackage.wzl;
import defpackage.xsq0;
import defpackage.xzl;
import defpackage.ywl;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class c implements m0m {
    public static final AtomicReference z = new AtomicReference(MainScreenDocumentLoader$Companion$State.BEFORE_FIRST_HEAD_REQUEST);
    public final tt2 a;
    public final flex.core.loader.network.e b;
    public final cot c;
    public final f w;
    public final AtomicReference x = new AtomicReference();
    public final AtomicReference y = new AtomicReference(a());

    public c(tt2 tt2Var, flex.core.loader.network.e eVar, cot cotVar, f fVar) {
        this.a = tt2Var;
        this.b = eVar;
        this.c = cotVar;
        this.w = fVar;
    }

    public final v800 a() {
        m0m oa00Var;
        this.a.getClass();
        sjh sjhVar = uyj.a;
        ike a = bvf0.a(mdh.b.plus(jl40.a()));
        int i = b.b[((SuperAppMainScreenDocumentLoaderExperiment) this.w.a.c()).b.ordinal()];
        flex.core.loader.network.e eVar = this.b;
        if (i == 1) {
            oa00Var = new oa00(a, eVar);
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            oa00Var = new flex.core.loader.network.a(a, eVar);
        }
        return new v800(a, oa00Var);
    }

    @Override // defpackage.m0m
    public final Object b(u1m u1mVar, i7x0 i7x0Var, boolean z2, ContinuationImpl continuationImpl) {
        jst.e.getClass();
        this.x.set(u1mVar);
        return ((v800) this.y.get()).b.b(u1mVar, i7x0Var, z2, continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // defpackage.m0m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(u1m u1mVar, ywl ywlVar, boolean z2, boolean z3, boolean z4, i7x0 i7x0Var, boolean z5, ContinuationImpl continuationImpl) {
        MainScreenDocumentLoader$fetchDocument$2 mainScreenDocumentLoader$fetchDocument$2;
        int i;
        AtomicReference atomicReference;
        boolean z6;
        AtomicReference atomicReference2;
        wzl wzlVar;
        MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State;
        MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State2;
        if (continuationImpl instanceof MainScreenDocumentLoader$fetchDocument$2) {
            mainScreenDocumentLoader$fetchDocument$2 = (MainScreenDocumentLoader$fetchDocument$2) continuationImpl;
            int i2 = mainScreenDocumentLoader$fetchDocument$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mainScreenDocumentLoader$fetchDocument$2.label = i2 - Integer.MIN_VALUE;
                MainScreenDocumentLoader$fetchDocument$2 mainScreenDocumentLoader$fetchDocument$22 = mainScreenDocumentLoader$fetchDocument$2;
                Object obj = mainScreenDocumentLoader$fetchDocument$22.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainScreenDocumentLoader$fetchDocument$22.label;
                atomicReference = z;
                if (i != 0) {
                    kotlin.b.b(obj);
                    MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State3 = MainScreenDocumentLoader$Companion$State.BEFORE_FIRST_HEAD_REQUEST;
                    MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State4 = MainScreenDocumentLoader$Companion$State.BEFORE_FIRST_HEAD_RESPONSE;
                    while (!atomicReference.compareAndSet(mainScreenDocumentLoader$Companion$State3, mainScreenDocumentLoader$Companion$State4) && atomicReference.get() == mainScreenDocumentLoader$Companion$State3) {
                    }
                    m0m m0mVar = ((v800) this.y.get()).b;
                    u1m d = this.c.d(u1mVar);
                    if (z3) {
                        do {
                            atomicReference2 = this.x;
                            if (atomicReference2.compareAndSet(u1mVar, null)) {
                            }
                        } while (atomicReference2.get() == u1mVar);
                        z6 = true;
                        mainScreenDocumentLoader$fetchDocument$22.L$0 = null;
                        mainScreenDocumentLoader$fetchDocument$22.L$1 = null;
                        mainScreenDocumentLoader$fetchDocument$22.L$2 = null;
                        mainScreenDocumentLoader$fetchDocument$22.Z$0 = z2;
                        mainScreenDocumentLoader$fetchDocument$22.Z$1 = z3;
                        mainScreenDocumentLoader$fetchDocument$22.Z$2 = z4;
                        mainScreenDocumentLoader$fetchDocument$22.Z$3 = z5;
                        mainScreenDocumentLoader$fetchDocument$22.label = 1;
                        obj = m0mVar.c(d, ywlVar, z2, z6, z4, i7x0Var, z5, mainScreenDocumentLoader$fetchDocument$22);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    z6 = false;
                    mainScreenDocumentLoader$fetchDocument$22.L$0 = null;
                    mainScreenDocumentLoader$fetchDocument$22.L$1 = null;
                    mainScreenDocumentLoader$fetchDocument$22.L$2 = null;
                    mainScreenDocumentLoader$fetchDocument$22.Z$0 = z2;
                    mainScreenDocumentLoader$fetchDocument$22.Z$1 = z3;
                    mainScreenDocumentLoader$fetchDocument$22.Z$2 = z4;
                    mainScreenDocumentLoader$fetchDocument$22.Z$3 = z5;
                    mainScreenDocumentLoader$fetchDocument$22.label = 1;
                    obj = m0mVar.c(d, ywlVar, z2, z6, z4, i7x0Var, z5, mainScreenDocumentLoader$fetchDocument$22);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                wzlVar = (wzl) obj;
                if (!(wzlVar instanceof xzl) || (wzlVar instanceof vzl)) {
                    mainScreenDocumentLoader$Companion$State = MainScreenDocumentLoader$Companion$State.BEFORE_FIRST_HEAD_RESPONSE;
                    mainScreenDocumentLoader$Companion$State2 = MainScreenDocumentLoader$Companion$State.AFTER_FIRST_HEAD_RESPONSE;
                    while (!atomicReference.compareAndSet(mainScreenDocumentLoader$Companion$State, mainScreenDocumentLoader$Companion$State2) && atomicReference.get() == mainScreenDocumentLoader$Companion$State) {
                    }
                } else if (!(wzlVar instanceof uzl) && !(wzlVar instanceof tzl)) {
                    w511.b();
                    return null;
                }
                return wzlVar;
            }
        }
        mainScreenDocumentLoader$fetchDocument$2 = new MainScreenDocumentLoader$fetchDocument$2(this, continuationImpl);
        MainScreenDocumentLoader$fetchDocument$2 mainScreenDocumentLoader$fetchDocument$222 = mainScreenDocumentLoader$fetchDocument$2;
        Object obj2 = mainScreenDocumentLoader$fetchDocument$222.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainScreenDocumentLoader$fetchDocument$222.label;
        atomicReference = z;
        if (i != 0) {
        }
        wzlVar = (wzl) obj2;
        if (wzlVar instanceof xzl) {
        }
        mainScreenDocumentLoader$Companion$State = MainScreenDocumentLoader$Companion$State.BEFORE_FIRST_HEAD_RESPONSE;
        mainScreenDocumentLoader$Companion$State2 = MainScreenDocumentLoader$Companion$State.AFTER_FIRST_HEAD_RESPONSE;
        while (!atomicReference.compareAndSet(mainScreenDocumentLoader$Companion$State, mainScreenDocumentLoader$Companion$State2)) {
        }
        return wzlVar;
    }

    @Override // defpackage.m0m
    public final Object d(u1m u1mVar, wbe0 wbe0Var, q370 q370Var, kq90 kq90Var, Continuation continuation) {
        Integer l;
        int intValue;
        kotlinx.serialization.json.b bVar;
        Object d;
        MainScreenDocumentLoader$Companion$State mainScreenDocumentLoader$Companion$State = (MainScreenDocumentLoader$Companion$State) z.get();
        int i = mainScreenDocumentLoader$Companion$State == null ? -1 : b.a[mainScreenDocumentLoader$Companion$State.ordinal()];
        String str = null;
        if (i != 1) {
            if (i == 2) {
                jst.e.s(new IllegalStateException("PART request before HEAD request, patchParams=".concat(thb1.d(kq90Var))));
            } else {
                if (i != 3) {
                    w511.b();
                    return null;
                }
                if (thb1.b(kq90Var) || thb1.a(kq90Var)) {
                    jst.e.s(new IllegalStateException("PART request before HEAD response, patchParams=".concat(thb1.d(kq90Var))));
                }
            }
        }
        m0m m0mVar = ((v800) this.y.get()).b;
        u1m d2 = this.c.d(u1mVar);
        Object obj = wbe0Var.b.get("sections");
        List list = obj instanceof List ? (List) obj : null;
        Object R = list != null ? kotlin.collections.a.R(list) : null;
        kotlinx.serialization.json.c cVar = R instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) R : null;
        kotlinx.serialization.json.b bVar2 = cVar != null ? (kotlinx.serialization.json.b) kotlin.collections.b.g("refreshParams", cVar) : null;
        kotlinx.serialization.json.c cVar2 = bVar2 instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar2 : null;
        if (cVar2 != null && (bVar = (kotlinx.serialization.json.b) kotlin.collections.b.g("pagination_token", cVar2)) != null && (d = xsq0.d(bVar)) != null) {
            str = d.toString();
        }
        if (str != null && (l = bvu0.l(10, str)) != null && (intValue = l.intValue()) <= 2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(wbe0Var.a);
            linkedHashMap.put("pageToken", Collections.singletonList(String.valueOf(intValue)));
            wbe0Var = new wbe0(linkedHashMap, wbe0Var.b);
        }
        return m0mVar.d(d2, wbe0Var, q370Var, kq90Var, continuation);
    }

    @Override // defpackage.m0m
    public final Object e(u1m u1mVar, ywl ywlVar, boolean z2, boolean z3, i7x0 i7x0Var, ContinuationImpl continuationImpl) {
        return c(u1mVar, ywlVar, z2, z3, false, i7x0Var, jl40.l(jmr.a.get(), Boolean.TRUE), continuationImpl);
    }
}
