package com.yandex.go.eboks.objects.domain;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class i implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.n a;
    public final /* synthetic */ n b;

    public i(kotlinx.coroutines.flow.n nVar, n nVar2) {
        this.a = nVar;
        this.b = nVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1 eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1;
        int i;
        if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1) {
            eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1 = (EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1) continuation;
            int i2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.L$0 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.L$1 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.L$2 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.label = 1;
                    if (this.a.collect(hVar, eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1) == coroutineSingletons) {
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
        eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1 = new EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1(this, continuation);
        Object obj2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
