package com.yandex.go.superapp.order.multi.old.provider;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wl40;
import defpackage.zls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0000\"\u0006\b\u0001\u0010\u0001\u0018\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"R", "T", "Lvpr;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Lkotlin/Array;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.order.multi.old.provider.MultiOrderProvider$startOrdersSubscription$$inlined$combine$1$3", f = "MultiOrderProvider.kt", l = {MSException.ERROR_MORE_DATA}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
public final class MultiOrderProvider$startOrdersSubscription$$inlined$combine$1$3 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ g receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiOrderProvider$startOrdersSubscription$$inlined$combine$1$3(Continuation continuation, g gVar) {
        super(3, continuation);
        this.receiver$inlined = gVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MultiOrderProvider$startOrdersSubscription$$inlined$combine$1$3 multiOrderProvider$startOrdersSubscription$$inlined$combine$1$3 = new MultiOrderProvider$startOrdersSubscription$$inlined$combine$1$3((Continuation) obj3, this.receiver$inlined);
        multiOrderProvider$startOrdersSubscription$$inlined$combine$1$3.L$0 = (vpr) obj;
        multiOrderProvider$startOrdersSubscription$$inlined$combine$1$3.L$1 = (Object[]) obj2;
        return multiOrderProvider$startOrdersSubscription$$inlined$combine$1$3.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object[] objArr = (Object[]) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Object obj2 = objArr[0];
            Object obj3 = objArr[1];
            Object obj4 = objArr[2];
            Object obj5 = objArr[3];
            Object obj6 = objArr[4];
            Object obj7 = objArr[5];
            Object obj8 = objArr[6];
            Object obj9 = objArr[7];
            List list = (List) objArr[8];
            List list2 = (List) obj7;
            List list3 = (List) obj6;
            List list4 = (List) obj5;
            List list5 = (List) obj4;
            List list6 = (List) obj3;
            List list7 = (List) obj2;
            this.receiver$inlined.getClass();
            wl40 wl40Var = new wl40(list7, list6, list5, list4, list3, list2, (List) obj8, (List) obj9, list);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(wl40Var, this) == coroutineSingletons) {
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
