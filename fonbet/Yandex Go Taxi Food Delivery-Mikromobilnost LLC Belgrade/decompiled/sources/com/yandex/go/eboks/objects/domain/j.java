package com.yandex.go.eboks.objects.domain;

import defpackage.gh00;
import defpackage.ny61;
import defpackage.shn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public j(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1 eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1) {
            eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1 = (EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1) continuation;
            int i2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    shn shnVar = new shn(((gh00) this.b.a).e.f(), null, 14);
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.L$0 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.L$1 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.L$2 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.L$3 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(shnVar, eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1 = new EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1(this, continuation);
        Object obj22 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
