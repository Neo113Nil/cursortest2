package com.yandex.go.transfer_requirement.mvp;

import defpackage.e4m;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.op01;
import defpackage.tse;
import defpackage.wls;
import defpackage.wo01;
import defpackage.yo01;
import defpackage.zo01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.mvp.TransferRequirementModalViewPresenter$onTrainCarriageUpdated$1", f = "TransferRequirementModalViewPresenter.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewPresenter$onTrainCarriageUpdated$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $carriage;
    int label;
    final /* synthetic */ op01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewPresenter$onTrainCarriageUpdated$1(op01 op01Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = op01Var;
        this.$carriage = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewPresenter$onTrainCarriageUpdated$1(this.this$0, this.$carriage, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewPresenter$onTrainCarriageUpdated$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0078 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
        String str = this.$carriage;
        this.label = 1;
        zo01 zo01Var = aVar.e;
        yo01 a2 = zo01Var.a();
        if (!jl40.l(str, a2.d.a)) {
            if (str.length() != 0) {
                wo01 wo01Var = a2.d;
                yo01 a3 = yo01.a(a2, null, null, null, new wo01(str, wo01Var.b, wo01Var.c), 0, null, null, null, 247);
                zo01Var.b(a3);
                a = aVar.a(a3, this);
                return a != coroutineSingletons ? coroutineSingletons : zy11Var;
            }
            aVar.c.e();
            zo01Var.b(yo01.a(a2, null, null, null, wo01.d, 0, null, null, new e4m(false), 119));
        }
        a = zy11Var;
        if (a != coroutineSingletons) {
        }
    }
}
