package com.yandex.go.chargers.subscription.domain;

import defpackage.ny61;
import defpackage.po21;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes12.dex */
public final class b {
    public final com.yandex.go.zone.interactors.b a;
    public final po21 b;

    public b(com.yandex.go.zone.interactors.b bVar, po21 po21Var) {
        this.a = bVar;
        this.b = po21Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        if (r7.c((defpackage.mo21) r8, r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersFetchZoneInteractor$fetchZoneOrGetCache$1 chargersFetchZoneInteractor$fetchZoneOrGetCache$1;
        int i;
        com.yandex.go.zone.interactors.b bVar;
        if (continuationImpl instanceof ChargersFetchZoneInteractor$fetchZoneOrGetCache$1) {
            chargersFetchZoneInteractor$fetchZoneOrGetCache$1 = (ChargersFetchZoneInteractor$fetchZoneOrGetCache$1) continuationImpl;
            int i2 = chargersFetchZoneInteractor$fetchZoneOrGetCache$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersFetchZoneInteractor$fetchZoneOrGetCache$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersFetchZoneInteractor$fetchZoneOrGetCache$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersFetchZoneInteractor$fetchZoneOrGetCache$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.zone.interactors.b bVar2 = this.a;
                    chargersFetchZoneInteractor$fetchZoneOrGetCache$1.L$0 = bVar2;
                    chargersFetchZoneInteractor$fetchZoneOrGetCache$1.label = 1;
                    Object h = ((e) this.b).h(chargersFetchZoneInteractor$fetchZoneOrGetCache$1);
                    if (h != coroutineSingletons) {
                        obj = h;
                        bVar = bVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = (com.yandex.go.zone.interactors.b) chargersFetchZoneInteractor$fetchZoneOrGetCache$1.L$0;
                kotlin.b.b(obj);
                chargersFetchZoneInteractor$fetchZoneOrGetCache$1.L$0 = null;
                chargersFetchZoneInteractor$fetchZoneOrGetCache$1.label = 2;
            }
        }
        chargersFetchZoneInteractor$fetchZoneOrGetCache$1 = new ChargersFetchZoneInteractor$fetchZoneOrGetCache$1(this, continuationImpl);
        Object obj2 = chargersFetchZoneInteractor$fetchZoneOrGetCache$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersFetchZoneInteractor$fetchZoneOrGetCache$1.label;
        if (i != 0) {
        }
        chargersFetchZoneInteractor$fetchZoneOrGetCache$1.L$0 = null;
        chargersFetchZoneInteractor$fetchZoneOrGetCache$1.label = 2;
    }
}
