package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.utils.text.Text;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.waf;
import defpackage.wls;
import defpackage.x9f;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Lx9f;", TarifficatorScenarioActivity.RESULT_KEY, "Lzy11;", "<anonymous>", "(Lkotlin/Result;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositViewModel$checkAmount$3", f = "CreditDepositViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositViewModel$checkAmount$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositViewModel$checkAmount$3(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CreditDepositViewModel$checkAmount$3 creditDepositViewModel$checkAmount$3 = new CreditDepositViewModel$checkAmount$3(this.this$0, continuation);
        creditDepositViewModel$checkAmount$3.L$0 = obj;
        return creditDepositViewModel$checkAmount$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        CreditDepositViewModel$checkAmount$3 creditDepositViewModel$checkAmount$3 = (CreditDepositViewModel$checkAmount$3) create(new Result(((Result) obj).getValue()), (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        creditDepositViewModel$checkAmount$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        Object value3 = ((Result) this.L$0).getValue();
        a aVar = this.this$0;
        if (!(value3 instanceof Result.Failure)) {
            x9f x9fVar = (x9f) value3;
            Text text = x9fVar.b;
            if (text != null) {
                a.b0(aVar, text, x9fVar.d, x9fVar.e, x9fVar.f, x9fVar.g);
            }
            pz40 Y = aVar.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, waf.a((waf) value2, null, null, null, x9fVar.a, new r8j0(x9fVar, null, 14), x9fVar.h, x9fVar.i, null, null, null, null, null, null, null, false, null, 261903)));
        }
        a aVar2 = this.this$0;
        Throwable a = Result.a(value3);
        if (a != null) {
            pz40 Y2 = aVar2.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, waf.a((waf) value, null, null, null, null, new s8j0(a), null, null, null, null, null, null, null, null, null, false, null, 262111)));
        }
        return zy11.a;
    }
}
