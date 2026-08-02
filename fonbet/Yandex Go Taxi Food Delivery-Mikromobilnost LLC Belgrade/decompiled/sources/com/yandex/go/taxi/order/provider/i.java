package com.yandex.go.taxi.order.provider;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements tpr {
    public final /* synthetic */ g a;
    public final /* synthetic */ l b;

    public i(g gVar, l lVar) {
        this.a = gVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        MapObjectsRepository$carIconFlow$$inlined$map$1$1 mapObjectsRepository$carIconFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof MapObjectsRepository$carIconFlow$$inlined$map$1$1) {
            mapObjectsRepository$carIconFlow$$inlined$map$1$1 = (MapObjectsRepository$carIconFlow$$inlined$map$1$1) continuation;
            int i2 = mapObjectsRepository$carIconFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mapObjectsRepository$carIconFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = mapObjectsRepository$carIconFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mapObjectsRepository$carIconFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar, this.b);
                    mapObjectsRepository$carIconFlow$$inlined$map$1$1.L$0 = null;
                    mapObjectsRepository$carIconFlow$$inlined$map$1$1.L$1 = null;
                    mapObjectsRepository$carIconFlow$$inlined$map$1$1.L$2 = null;
                    mapObjectsRepository$carIconFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, mapObjectsRepository$carIconFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        mapObjectsRepository$carIconFlow$$inlined$map$1$1 = new MapObjectsRepository$carIconFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = mapObjectsRepository$carIconFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mapObjectsRepository$carIconFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
