package com.ybsdk.feature.transfer.version2.internal.screens.main.presentation;

import defpackage.cjq0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wjq0;
import defpackage.wk01;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Result;", "Ldqg;", "Lnfb;", "Lcom/ybsdk/feature/transfer/version2/internal/screens/main/domain/entities/CheckTransferEntity;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainViewModel$checkTransferData$3", f = "TransferMainViewModel.kt", l = {1661}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMainViewModel$checkTransferData$3 extends SuspendLambda implements tls {
    final /* synthetic */ String $currentRequestId;
    final /* synthetic */ wk01 $currentState;
    final /* synthetic */ wjq0 $selectedSubject;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMainViewModel$checkTransferData$3(wjq0 wjq0Var, wk01 wk01Var, a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.$selectedSubject = wjq0Var;
        this.$currentState = wk01Var;
        this.this$0 = aVar;
        this.$currentRequestId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TransferMainViewModel$checkTransferData$3(this.$selectedSubject, this.$currentState, this.this$0, this.$currentRequestId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TransferMainViewModel$checkTransferData$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wjq0 wjq0Var;
        Object c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            wjq0 wjq0Var2 = this.$selectedSubject;
            if (wjq0Var2 instanceof cjq0) {
                wjq0Var = wjq0Var2;
            } else {
                wjq0Var = this.$currentState.d.compareTo(BigDecimal.ZERO) != 0 ? this.$selectedSubject : null;
            }
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.domain.b bVar = aVar.W;
            wk01 wk01Var = this.$currentState;
            String str = this.$currentRequestId;
            this.label = 1;
            c = bVar.c(wk01Var, wjq0Var, aVar, str, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            c = ((Result) obj).getValue();
        }
        return new Result(c);
    }
}
