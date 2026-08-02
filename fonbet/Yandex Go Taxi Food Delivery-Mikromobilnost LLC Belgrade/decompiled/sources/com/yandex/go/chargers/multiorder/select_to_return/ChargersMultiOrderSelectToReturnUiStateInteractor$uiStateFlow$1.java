package com.yandex.go.chargers.multiorder.select_to_return;

import com.yandex.go.chargers.multiorder.ui.g;
import defpackage.c5a;
import defpackage.d5a;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r5a;
import defpackage.rl9;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lrl9;", "activeOrders", "Lc5a;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lrl9;)Lc5a;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.multiorder.select_to_return.ChargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1", f = "ChargersMultiOrderSelectToReturnUiStateInteractor.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d5a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1(d5a d5aVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = d5aVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1 chargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1 = new ChargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1(this.this$0, (Continuation) obj3);
        chargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1.L$0 = (rl9) obj2;
        return chargersMultiOrderSelectToReturnUiStateInteractor$uiStateFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        rl9 rl9Var = (rl9) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            g gVar = this.this$0.c;
            List list = rl9Var.a;
            this.L$0 = null;
            this.label = 1;
            obj = gVar.c(list, this, false);
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
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            if (obj2 instanceof r5a) {
                arrayList.add(obj2);
            }
        }
        return new c5a(arrayList);
    }
}
