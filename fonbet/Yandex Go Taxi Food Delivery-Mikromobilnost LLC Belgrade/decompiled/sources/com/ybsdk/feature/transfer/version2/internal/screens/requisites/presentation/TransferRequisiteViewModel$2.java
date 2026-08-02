package com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation;

import com.ybsdk.rconfig.configs.TransfersRequisitesFormPayloadsConfig;
import defpackage.bw01;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qo01;
import defpackage.qu01;
import defpackage.tse;
import defpackage.wls;
import defpackage.zq01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.TransferRequisiteViewModel$2", f = "TransferRequisiteViewModel.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferRequisiteViewModel$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequisiteViewModel$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequisiteViewModel$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequisiteViewModel$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            TransferRequisiteScreenParams transferRequisiteScreenParams = bVar.C;
            qo01 entity = ((TransfersRequisitesFormPayloadsConfig) ((qu01) bVar.H).b.d(bw01.a).getData()).toEntity();
            this.label = 1;
            obj = com.ybsdk.feature.transfer.version2.internal.screens.requisites.presentation.state.a.a(transferRequisiteScreenParams, entity, this);
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
        zq01 zq01Var = (zq01) obj;
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, zq01Var));
        return zy11.a;
    }
}
