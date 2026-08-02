package com.yandex.go.eboks.objects.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class e implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ n b;

    public e(kotlinx.coroutines.flow.internal.g gVar, n nVar) {
        this.a = gVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1 eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1;
        int i;
        if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1) {
            eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1 = (EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1) continuation;
            int i2 = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.L$0 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.L$1 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.L$2 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1 = new EboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1(this, continuation);
        Object obj2 = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$listenToEboksObjectsCollections$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
