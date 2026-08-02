package com.yandex.go.taxi.order.details.v2.state.elements.companion;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$ComboCompanion;
import defpackage.kek0;
import defpackage.mek0;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.oek0;
import defpackage.qek0;
import defpackage.sek0;
import defpackage.tek0;
import defpackage.uek0;
import defpackage.xuc;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmek0;", "animationState", "Lqek0;", "iconState", "Lvek0;", "<anonymous>", "(Lmek0;Lqek0;)Lvek0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.companion.RideCardCompanionItemDataSource$getTrailFlow$2", f = "RideCardCompanionItemDataSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardCompanionItemDataSource$getTrailFlow$2 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardItemDto$ComboCompanion $item;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardCompanionItemDataSource$getTrailFlow$2(RideCardItemDto$ComboCompanion rideCardItemDto$ComboCompanion, Continuation continuation) {
        super(3, continuation);
        this.$item = rideCardItemDto$ComboCompanion;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        RideCardCompanionItemDataSource$getTrailFlow$2 rideCardCompanionItemDataSource$getTrailFlow$2 = new RideCardCompanionItemDataSource$getTrailFlow$2(this.$item, (Continuation) obj3);
        rideCardCompanionItemDataSource$getTrailFlow$2.L$0 = (mek0) obj;
        rideCardCompanionItemDataSource$getTrailFlow$2.L$1 = (qek0) obj2;
        return rideCardCompanionItemDataSource$getTrailFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xuc.a aVar;
        Integer num;
        xuc.a aVar2;
        Long l;
        mek0 mek0Var = (mek0) this.L$0;
        qek0 qek0Var = (qek0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (!(mek0Var instanceof kek0)) {
            return qek0Var instanceof oek0 ? new uek0(((oek0) qek0Var).a) : tek0.a;
        }
        kek0 kek0Var = (kek0) mek0Var;
        String str = kek0Var.a;
        nsz nszVar = kek0Var.b;
        xuc xucVar = this.$item.f;
        long longValue = (xucVar == null || (aVar2 = xucVar.c) == null || (l = aVar2.a) == null) ? 0L : l.longValue();
        xuc xucVar2 = this.$item.f;
        return new sek0(str, nszVar, longValue, (xucVar2 == null || (aVar = xucVar2.c) == null || (num = aVar.b) == null) ? 0 : num.intValue());
    }
}
