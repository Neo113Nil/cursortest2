package com.ybsdk.feature.autotopup.internal.presentation.saver;

import defpackage.cqg;
import defpackage.dqg;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qx3;
import defpackage.r8j0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.autotopup.internal.presentation.saver.AutoTopupRegularViewModel$updatePaymentMethods$1", f = "AutoTopupRegularViewModel.kt", l = {199}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class AutoTopupRegularViewModel$updatePaymentMethods$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoTopupRegularViewModel$updatePaymentMethods$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AutoTopupRegularViewModel$updatePaymentMethods$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AutoTopupRegularViewModel$updatePaymentMethods$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.autotopup.internal.domain.b bVar = aVar.G;
            String agreementId = aVar.B.getAgreementId();
            this.label = 1;
            a = bVar.a(agreementId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        if (a instanceof Result.Failure) {
            a = null;
        }
        dqg dqgVar = (dqg) a;
        if (dqgVar != null) {
            cqg cqgVar = dqgVar instanceof cqg ? (cqg) dqgVar : null;
            if (cqgVar != null) {
                pz40 Y = this.this$0.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, qx3.a((qx3) value, null, null, null, null, new r8j0(cqgVar.a, null, 14), null, null, false, 239)));
            }
        }
        return zy11.a;
    }
}
