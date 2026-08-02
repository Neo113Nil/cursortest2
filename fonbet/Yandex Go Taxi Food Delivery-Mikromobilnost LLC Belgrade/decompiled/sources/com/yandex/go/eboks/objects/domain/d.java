package com.yandex.go.eboks.objects.domain;

import com.yandex.go.eboks.objects.data.model.EboksObjectsResponse;
import defpackage.ny61;
import defpackage.shn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar, n nVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1 eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1) {
            eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1 = (EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1) continuation;
            int i2 = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                Pair pair = (Pair) obj;
                shn shnVar = (shn) pair.getFirst();
                EboksObjectsResponse eboksObjectsResponse = (EboksObjectsResponse) pair.getSecond();
                com.yandex.go.eboks.objects.domain.model.a aVar = shnVar.d;
                if (aVar != null) {
                    r0 r0Var = aVar.a;
                    Result result = new Result(zy11Var);
                    r0Var.getClass();
                    r0Var.m(null, result);
                }
                eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.L$0 = null;
                eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.L$1 = null;
                eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.L$2 = null;
                eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.L$3 = null;
                eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.label = 1;
                return this.a.emit(eboksObjectsResponse, eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1 = new EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1(this, continuation);
        Object obj22 = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$2$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
