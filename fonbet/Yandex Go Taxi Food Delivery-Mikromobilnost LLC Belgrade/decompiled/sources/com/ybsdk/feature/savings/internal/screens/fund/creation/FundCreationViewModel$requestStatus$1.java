package com.ybsdk.feature.savings.internal.screens.fund.creation;

import defpackage.ins;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.s1r;
import defpackage.tse;
import defpackage.wls;
import defpackage.zps;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationViewModel$requestStatus$1", f = "FundCreationViewModel.kt", l = {152}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundCreationViewModel$requestStatus$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundCreationViewModel$requestStatus$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$requestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FundCreationViewModel$requestStatus$1(this.this$0, this.$requestId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FundCreationViewModel$requestStatus$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            String str = this.$requestId;
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, ins.a((ins) aVar.X(), null, null, null, str, null, 47)));
            a aVar2 = this.this$0;
            com.ybsdk.feature.savings.internal.interactors.a aVar3 = aVar2.J;
            String str2 = this.$requestId;
            String preselectedAgreementId = aVar2.B.getPreselectedAgreementId();
            s1r s1rVar = new s1r(19, this.this$0);
            this.label = 1;
            b = aVar3.b(str2, preselectedAgreementId, s1rVar, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar4 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            aVar4.r0((zps) b, null);
        }
        a aVar5 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            aVar5.r0(null, a);
        }
        return zy11.a;
    }
}
