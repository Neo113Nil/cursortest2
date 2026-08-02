package com.yandex.go.eboks.objects.domain;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.ygn;
import defpackage.zy11;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class l implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public l(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (r6.emit(r8, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1 eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1) {
            eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1 = (EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Pair pair = (Pair) obj;
                    ygn ygnVar = (ygn) pair.getFirst();
                    com.yandex.go.eboks.objects.domain.model.a aVar = (com.yandex.go.eboks.objects.domain.model.a) pair.getSecond();
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$0 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$1 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar2 = this.a;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$4 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$5 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$6 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.label = 1;
                    obj2 = n.a(this.b, ygnVar, aVar, eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1);
                    if (obj2 != coroutineSingletons) {
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                if (obj2 != null) {
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$0 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$1 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$2 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$3 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$4 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$5 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.L$6 = null;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1 = new EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1(this, continuation);
        obj2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        return zy11.a;
    }
}
