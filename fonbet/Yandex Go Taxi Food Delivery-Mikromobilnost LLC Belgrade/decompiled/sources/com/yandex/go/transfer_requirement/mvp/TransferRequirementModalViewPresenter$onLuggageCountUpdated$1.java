package com.yandex.go.transfer_requirement.mvp;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.op01;
import defpackage.tse;
import defpackage.wls;
import defpackage.yo01;
import defpackage.zo01;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.mvp.TransferRequirementModalViewPresenter$onLuggageCountUpdated$1", f = "TransferRequirementModalViewPresenter.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewPresenter$onLuggageCountUpdated$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $count;
    int label;
    final /* synthetic */ op01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewPresenter$onLuggageCountUpdated$1(op01 op01Var, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = op01Var;
        this.$count = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewPresenter$onLuggageCountUpdated$1(this.this$0, this.$count, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewPresenter$onLuggageCountUpdated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.transfer_requirement.card_state.a aVar = this.this$0.A;
        int i2 = this.$count;
        this.label = 1;
        zo01 zo01Var = aVar.e;
        yo01 a2 = zo01Var.a();
        if (i2 == a2.e) {
            a = zy11Var;
        } else {
            yo01 a3 = yo01.a(a2, null, null, null, null, i2, null, null, null, 239);
            zo01Var.b(a3);
            a = aVar.a(a3, this);
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
