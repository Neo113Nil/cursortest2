package com.ybsdk.feature.transfer.internal.screens.targets.presentation;

import com.ybsdk.core.transfer.utils.domain.entities.TransferType;
import com.ybsdk.feature.transfer.internal.domain.PartnersEntity;
import defpackage.jl01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pt01;
import defpackage.pz40;
import defpackage.s8j0;
import defpackage.t8j0;
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
@mvg(c = "com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsViewModel$loadPartners$1", f = "TransferTargetsViewModel.kt", l = {108}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferTargetsViewModel$loadPartners$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferTargetsViewModel$loadPartners$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferTargetsViewModel$loadPartners$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferTargetsViewModel$loadPartners$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.C.f("", null);
            pz40 Y = this.this$0.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, pt01.a((pt01) value, new t8j0(), null, null, 14)));
            b bVar = this.this$0;
            com.ybsdk.feature.transfer.internal.domain.b bVar2 = bVar.B;
            TransferType transferType = bVar.D.getTransferType();
            this.label = 1;
            b = bVar2.b(transferType, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        b bVar3 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            bVar3.C.i("", null);
            bVar3.a0(new jl01(18, (PartnersEntity) b));
        }
        b bVar4 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            bVar4.C.g(a.getMessage(), "", null);
            pz40 Y2 = bVar4.Y();
            do {
                r0Var2 = (r0) Y2;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, pt01.a((pt01) value2, new s8j0(a), null, null, 14)));
        }
        return zy11.a;
    }
}
