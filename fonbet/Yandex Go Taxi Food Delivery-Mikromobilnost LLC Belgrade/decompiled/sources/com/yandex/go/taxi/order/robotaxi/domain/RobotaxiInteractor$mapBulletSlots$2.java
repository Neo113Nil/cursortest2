package com.yandex.go.taxi.order.robotaxi.domain;

import com.yandex.go.slot.dto.SlotItemDto;
import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lxss0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.robotaxi.domain.RobotaxiInteractor$mapBulletSlots$2", f = "RobotaxiInteractor.kt", l = {HProv.PP_CONTAINER_EXTENSION_DEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RobotaxiInteractor$mapBulletSlots$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<SlotItemDto> $bulletSlots;
    final /* synthetic */ fef $currencyRules;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RobotaxiInteractor$mapBulletSlots$2(List list, c cVar, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.$bulletSlots = list;
        this.this$0 = cVar;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RobotaxiInteractor$mapBulletSlots$2 robotaxiInteractor$mapBulletSlots$2 = new RobotaxiInteractor$mapBulletSlots$2(this.$bulletSlots, this.this$0, this.$currencyRules, continuation);
        robotaxiInteractor$mapBulletSlots$2.L$0 = obj;
        return robotaxiInteractor$mapBulletSlots$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RobotaxiInteractor$mapBulletSlots$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        List<SlotItemDto> list = this.$bulletSlots;
        c cVar = this.this$0;
        fef fefVar = this.$currencyRules;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new RobotaxiInteractor$mapBulletSlots$2$1$1(cVar, (SlotItemDto) it.next(), fefVar, null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
