package com.yandex.go.delivery.tracking.map_overlay;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.sth;
import defpackage.tth;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isMultiorderStarted", "", "Lxli;", "", "activeDeliveryDetails", "Luth;", "<anonymous>", "(ZLjava/util/Map;)Luth;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.tracking.map_overlay.DeliveriesMapPresenter$modeFlow$1", f = "DeliveriesMapPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveriesMapPresenter$modeFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DeliveriesMapPresenter$modeFlow$1 deliveriesMapPresenter$modeFlow$1 = new DeliveriesMapPresenter$modeFlow$1(3, (Continuation) obj3);
        deliveriesMapPresenter$modeFlow$1.Z$0 = booleanValue;
        deliveriesMapPresenter$modeFlow$1.L$0 = (Map) obj2;
        return deliveriesMapPresenter$modeFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        Map map = (Map) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!map.isEmpty()) {
            return new sth(map.keySet());
        }
        if (z) {
            return tth.b;
        }
        if (!z) {
            return tth.a;
        }
        w511.b();
        return null;
    }
}
