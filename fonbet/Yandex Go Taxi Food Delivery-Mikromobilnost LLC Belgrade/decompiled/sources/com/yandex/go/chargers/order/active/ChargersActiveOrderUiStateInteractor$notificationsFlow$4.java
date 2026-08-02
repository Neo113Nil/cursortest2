package com.yandex.go.chargers.order.active;

import defpackage.il9;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.wls;
import defpackage.yca;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lyca;", "notifications", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.active.ChargersActiveOrderUiStateInteractor$notificationsFlow$4", f = "ChargersActiveOrderUiStateInteractor.kt", l = {HProv.PP_VERSION_TIMESTAMP}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersActiveOrderUiStateInteractor$notificationsFlow$4 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ il9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersActiveOrderUiStateInteractor$notificationsFlow$4(il9 il9Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = il9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$notificationsFlow$4 chargersActiveOrderUiStateInteractor$notificationsFlow$4 = new ChargersActiveOrderUiStateInteractor$notificationsFlow$4(this.this$0, continuation);
        chargersActiveOrderUiStateInteractor$notificationsFlow$4.L$0 = obj;
        return chargersActiveOrderUiStateInteractor$notificationsFlow$4;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ChargersActiveOrderUiStateInteractor$notificationsFlow$4) create((List) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (!list.isEmpty()) {
                com.yandex.go.chargers.data.b bVar = this.this$0.j;
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((yca) it.next()).a);
                }
                this.L$0 = null;
                this.label = 1;
                if (bVar.a(arrayList, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
