package com.yandex.go.taxi.order.details.v2.state.elements.companion.animation;

import defpackage.kek0;
import defpackage.lek0;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.xuc;
import defpackage.ytz;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class a {
    public final ytz a;

    public a(ytz ytzVar) {
        this.a = ytzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, String str2, ContinuationImpl continuationImpl) {
        RideCardCompanionAnimationDataSource$tryLoadAnimation$1 rideCardCompanionAnimationDataSource$tryLoadAnimation$1;
        int i;
        aVar.getClass();
        if (continuationImpl instanceof RideCardCompanionAnimationDataSource$tryLoadAnimation$1) {
            rideCardCompanionAnimationDataSource$tryLoadAnimation$1 = (RideCardCompanionAnimationDataSource$tryLoadAnimation$1) continuationImpl;
            int i2 = rideCardCompanionAnimationDataSource$tryLoadAnimation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardCompanionAnimationDataSource$tryLoadAnimation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardCompanionAnimationDataSource$tryLoadAnimation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardCompanionAnimationDataSource$tryLoadAnimation$1.label;
                if (i != 0) {
                    b.b(obj);
                    ytz ytzVar = aVar.a;
                    rideCardCompanionAnimationDataSource$tryLoadAnimation$1.L$0 = null;
                    rideCardCompanionAnimationDataSource$tryLoadAnimation$1.L$1 = str2;
                    rideCardCompanionAnimationDataSource$tryLoadAnimation$1.label = 1;
                    obj = ((com.yandex.go.lottie_loader.a) ytzVar).a(str, rideCardCompanionAnimationDataSource$tryLoadAnimation$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str2 = (String) rideCardCompanionAnimationDataSource$tryLoadAnimation$1.L$1;
                    b.b(obj);
                }
                nsz nszVar = (nsz) obj;
                return nszVar == null ? new kek0(str2, nszVar) : lek0.a;
            }
        }
        rideCardCompanionAnimationDataSource$tryLoadAnimation$1 = new RideCardCompanionAnimationDataSource$tryLoadAnimation$1(aVar, continuationImpl);
        Object obj2 = rideCardCompanionAnimationDataSource$tryLoadAnimation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardCompanionAnimationDataSource$tryLoadAnimation$1.label;
        if (i != 0) {
        }
        nsz nszVar2 = (nsz) obj2;
        if (nszVar2 == null) {
        }
    }

    public final rol0 b(xuc xucVar) {
        return new rol0(new RideCardCompanionAnimationDataSource$collectAnimationState$1(xucVar, this, null));
    }
}
