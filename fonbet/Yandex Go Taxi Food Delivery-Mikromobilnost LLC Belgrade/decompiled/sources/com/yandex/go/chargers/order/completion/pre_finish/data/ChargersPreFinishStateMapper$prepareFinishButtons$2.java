package com.yandex.go.chargers.order.completion.pre_finish.data;

import com.yandex.go.chargers.data.model.ChargersOfferButtonDto;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
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
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Luo9;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.completion.pre_finish.data.ChargersPreFinishStateMapper$prepareFinishButtons$2", f = "ChargersPreFinishStateMapper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPreFinishStateMapper$prepareFinishButtons$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<ChargersOfferButtonDto> $buttons;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPreFinishStateMapper$prepareFinishButtons$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$buttons = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersPreFinishStateMapper$prepareFinishButtons$2 chargersPreFinishStateMapper$prepareFinishButtons$2 = new ChargersPreFinishStateMapper$prepareFinishButtons$2(this.$buttons, this.this$0, continuation);
        chargersPreFinishStateMapper$prepareFinishButtons$2.L$0 = obj;
        return chargersPreFinishStateMapper$prepareFinishButtons$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersPreFinishStateMapper$prepareFinishButtons$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        List<ChargersOfferButtonDto> list = this.$buttons;
        a aVar = this.this$0;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(tje.h(tseVar, null, null, new ChargersPreFinishStateMapper$prepareFinishButtons$2$1$1(aVar, (ChargersOfferButtonDto) it.next(), null), 3));
        }
        this.L$0 = null;
        this.label = 1;
        Object b = kotlinx.coroutines.a.b(arrayList, this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
