package com.yandex.go.taxi.order.provider;

import defpackage.d1s;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class e implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ d1s b;

    public e(jqr jqrVar, d1s d1sVar) {
        this.a = jqrVar;
        this.b = d1sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ForceDestinationProvider$flow$$inlined$filter$1$1 forceDestinationProvider$flow$$inlined$filter$1$1;
        int i;
        if (continuation instanceof ForceDestinationProvider$flow$$inlined$filter$1$1) {
            forceDestinationProvider$flow$$inlined$filter$1$1 = (ForceDestinationProvider$flow$$inlined$filter$1$1) continuation;
            int i2 = forceDestinationProvider$flow$$inlined$filter$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                forceDestinationProvider$flow$$inlined$filter$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = forceDestinationProvider$flow$$inlined$filter$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = forceDestinationProvider$flow$$inlined$filter$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    forceDestinationProvider$flow$$inlined$filter$1$1.L$0 = null;
                    forceDestinationProvider$flow$$inlined$filter$1$1.L$1 = null;
                    forceDestinationProvider$flow$$inlined$filter$1$1.L$2 = null;
                    forceDestinationProvider$flow$$inlined$filter$1$1.label = 1;
                    if (this.a.collect(dVar, forceDestinationProvider$flow$$inlined$filter$1$1) == coroutineSingletons) {
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
        forceDestinationProvider$flow$$inlined$filter$1$1 = new ForceDestinationProvider$flow$$inlined$filter$1$1(this, continuation);
        Object obj2 = forceDestinationProvider$flow$$inlined$filter$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = forceDestinationProvider$flow$$inlined$filter$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
