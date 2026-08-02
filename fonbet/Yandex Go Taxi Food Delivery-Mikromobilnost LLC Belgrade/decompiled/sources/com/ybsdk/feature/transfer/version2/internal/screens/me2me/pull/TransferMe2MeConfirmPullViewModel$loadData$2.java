package com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull;

import com.ybsdk.core.analytics.generated.delegates.Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult;
import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.bqg;
import defpackage.c910;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.d910;
import defpackage.dqg;
import defpackage.km01;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.us3;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.TransferMe2MeConfirmPullViewModel$loadData$2", f = "TransferMe2MeConfirmPullViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransferMe2MeConfirmPullViewModel$loadData$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferMe2MeConfirmPullViewModel$loadData$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferMe2MeConfirmPullViewModel$loadData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferMe2MeConfirmPullViewModel$loadData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a aVar;
        Object obj2;
        Object s8j0Var;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar2 = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.domain.a aVar3 = aVar2.I;
            String partnerId = aVar2.D.getPartnerId();
            this.L$0 = aVar2;
            this.label = 1;
            Object b = aVar3.b(partnerId, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
            aVar = aVar2;
            obj2 = b;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = (a) this.L$0;
            b.b(obj);
            obj2 = ((Result) obj).getValue();
        }
        us3 us3Var = aVar.G;
        Throwable a = Result.a(obj2);
        if (a == null) {
            Object obj3 = (dqg) obj2;
            if (obj3 instanceof cqg) {
                Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult = Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult.OK;
                d910 d910Var = (d910) ((cqg) obj3).a;
                c910 c910Var = (c910) kotlin.collections.a.R(d910Var.b);
                us3Var.x(me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult, c910Var != null ? c910Var.a.a : null);
                ArrayList arrayList = d910Var.b;
                s8j0Var = new r8j0(new km01(d910Var, arrayList, (c910) kotlin.collections.a.P(arrayList), Status.INITIAL, null), null, 14);
            } else {
                if (!(obj3 instanceof bqg)) {
                    w511.b();
                    return null;
                }
                us3Var.x(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult.ERROR, null);
                s8j0Var = new s8j0(new FailDataException((ct11) obj3));
            }
        } else {
            us3Var.x(Me2mePullDebitEvents$Me2mePullDebitAutoPullScreenLoadedResult.ERROR, null);
            x4c.g("Can't load initial me2me confirm pull data", a, null, Collections.singletonList(lrp0.p), 4);
            s8j0Var = new s8j0(a);
        }
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s8j0Var));
        return zy11.a;
    }
}
