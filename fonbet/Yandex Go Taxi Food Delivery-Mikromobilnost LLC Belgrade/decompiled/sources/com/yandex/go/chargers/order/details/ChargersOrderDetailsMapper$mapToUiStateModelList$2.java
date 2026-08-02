package com.yandex.go.chargers.order.details;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tba;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.details.ChargersOrderDetailsMapper$mapToUiStateModelList$2", f = "ChargersOrderDetailsMapper.kt", l = {16}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOrderDetailsMapper$mapToUiStateModelList$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<tba> $items;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOrderDetailsMapper$mapToUiStateModelList$2(List list, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$items = list;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersOrderDetailsMapper$mapToUiStateModelList$2 chargersOrderDetailsMapper$mapToUiStateModelList$2 = new ChargersOrderDetailsMapper$mapToUiStateModelList$2(this.$items, this.this$0, continuation);
        chargersOrderDetailsMapper$mapToUiStateModelList$2.L$0 = obj;
        return chargersOrderDetailsMapper$mapToUiStateModelList$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersOrderDetailsMapper$mapToUiStateModelList$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            List<tba> list = this.$items;
            a aVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new ChargersOrderDetailsMapper$mapToUiStateModelList$2$1$1(aVar, (tba) it.next(), null), 3));
            }
            this.L$0 = null;
            this.label = 1;
            obj = kotlinx.coroutines.a.b(arrayList, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return kotlin.collections.a.M((Iterable) obj);
    }
}
