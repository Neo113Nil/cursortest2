package com.yandex.go.eboks.objects.domain;

import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class k implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ n b;

    public k(rol0 rol0Var, n nVar) {
        this.a = rol0Var;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1 eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1;
        int i;
        if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1) {
            eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1 = (EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1) continuation;
            int i2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.L$0 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.L$1 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.L$2 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1) == coroutineSingletons) {
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
        eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1 = new EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1(this, continuation);
        Object obj2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
