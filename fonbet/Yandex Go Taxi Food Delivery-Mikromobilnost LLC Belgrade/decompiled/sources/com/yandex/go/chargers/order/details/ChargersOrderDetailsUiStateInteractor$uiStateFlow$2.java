package com.yandex.go.chargers.order.details;

import defpackage.bvf0;
import defpackage.dca;
import defpackage.eca;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.z8y;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lz8y;", "order", "Ldca;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;Lz8y;)Ldca;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.order.details.ChargersOrderDetailsUiStateInteractor$uiStateFlow$2", f = "ChargersOrderDetailsUiStateInteractor.kt", l = {28}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersOrderDetailsUiStateInteractor$uiStateFlow$2 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ eca this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersOrderDetailsUiStateInteractor$uiStateFlow$2(eca ecaVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = ecaVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChargersOrderDetailsUiStateInteractor$uiStateFlow$2 chargersOrderDetailsUiStateInteractor$uiStateFlow$2 = new ChargersOrderDetailsUiStateInteractor$uiStateFlow$2(this.this$0, (Continuation) obj3);
        chargersOrderDetailsUiStateInteractor$uiStateFlow$2.L$0 = (z8y) obj2;
        return chargersOrderDetailsUiStateInteractor$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z8y z8yVar = (z8y) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0.c;
            ArrayList arrayList = z8yVar.m;
            this.L$0 = null;
            this.label = 1;
            aVar.getClass();
            obj = bvf0.n(new ChargersOrderDetailsMapper$mapToUiStateModelList$2(arrayList, aVar, null), this);
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
        return new dca((List) obj);
    }
}
