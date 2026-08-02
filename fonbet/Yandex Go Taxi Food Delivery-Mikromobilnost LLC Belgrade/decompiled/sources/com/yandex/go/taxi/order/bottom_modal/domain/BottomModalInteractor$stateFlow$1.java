package com.yandex.go.taxi.order.bottom_modal.domain;

import defpackage.fef;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uc6;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "Lhd6;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)Lhd6;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bottom_modal.domain.BottomModalInteractor$stateFlow$1", f = "BottomModalInteractor.kt", l = {22}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BottomModalInteractor$stateFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ uc6 $bottomModalParams;
    final /* synthetic */ fef $currencyRules;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomModalInteractor$stateFlow$1(a aVar, uc6 uc6Var, fef fefVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$bottomModalParams = uc6Var;
        this.$currencyRules = fefVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomModalInteractor$stateFlow$1(this.this$0, this.$bottomModalParams, this.$currencyRules, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomModalInteractor$stateFlow$1) create((ThemeType) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        b bVar = this.this$0.c;
        uc6 uc6Var = this.$bottomModalParams;
        fef fefVar = this.$currencyRules;
        this.label = 1;
        Object c = bVar.c(uc6Var, fefVar, this);
        return c == coroutineSingletons ? coroutineSingletons : c;
    }
}
