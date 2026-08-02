package com.yandex.go.eboks.objects.domain;

import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.map.VisibleRegion;
import defpackage.ny61;
import defpackage.shn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class h implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ n b;

    public h(vpr vprVar, n nVar) {
        this.a = vprVar;
        this.b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1 eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1;
        int i;
        Object obj2;
        if (continuation instanceof EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1) {
            eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1 = (EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1) continuation;
            int i2 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    vpr vprVar = this.a;
                    VisibleRegion visibleRegion = this.b.j.a;
                    VisibleRegion visibleRegion2 = ((shn) obj).a;
                    if (visibleRegion == null) {
                        obj2 = null;
                    } else {
                        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                        double k = ru.yandex.taxi.map.utils.a.k(visibleRegion.getTopLeft(), visibleRegion.getBottomRight());
                        double k2 = ru.yandex.taxi.map.utils.a.k(visibleRegion2.getTopLeft(), visibleRegion2.getBottomRight());
                        if (1.0d - (Math.min(k, k2) / Math.max(Math.max(k, k2), Math.max(ru.yandex.taxi.map.utils.a.k(visibleRegion.getTopLeft(), visibleRegion2.getBottomRight()), ru.yandex.taxi.map.utils.a.k(visibleRegion2.getTopLeft(), visibleRegion.getBottomRight())))) > r0.f.a().c) {
                            obj2 = null;
                        }
                    }
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.L$0 = obj2;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.L$1 = obj2;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.L$2 = obj2;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.L$3 = obj2;
                    eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.label = 1;
                    if (vprVar.emit(obj, eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1 = new EboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1(this, continuation);
        Object obj32 = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eboksObjectsObjectsCollectionsInteractor$listenTriggers$$inlined$filter$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
