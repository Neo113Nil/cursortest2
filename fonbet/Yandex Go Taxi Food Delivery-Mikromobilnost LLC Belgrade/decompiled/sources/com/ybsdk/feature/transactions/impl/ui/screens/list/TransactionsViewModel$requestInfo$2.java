package com.ybsdk.feature.transactions.impl.ui.screens.list;

import com.ybsdk.feature.transactions.api.entities.TransactionsLoadType;
import defpackage.cg01;
import defpackage.lj91;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ppl;
import defpackage.pz40;
import defpackage.rf01;
import defpackage.tse;
import defpackage.uf01;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transactions.impl.ui.screens.list.TransactionsViewModel$requestInfo$2", f = "TransactionsViewModel.kt", l = {48}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class TransactionsViewModel$requestInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $refreshing;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionsViewModel$requestInfo$2(a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$refreshing = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransactionsViewModel$requestInfo$2(this.this$0, this.$refreshing, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransactionsViewModel$requestInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        r0 r0Var;
        Object value;
        ppl pplVar;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.transactions.impl.domain.interactors.b bVar = aVar.C;
            String agreementId = aVar.B.getAgreementId();
            this.label = 1;
            b = bVar.b(agreementId, this);
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
        boolean z = this.$refreshing;
        a aVar2 = this.this$0;
        if (!(b instanceof Result.Failure)) {
            rf01 rf01Var = (rf01) b;
            if (z) {
                TransactionsLoadType transactionsLoadType = TransactionsLoadType.REFRESH;
                ppl pplVar2 = ((uf01) aVar2.X()).d;
                if (pplVar2 == null) {
                    pplVar2 = new ppl();
                }
                pplVar = lj91.b(transactionsLoadType, pplVar2, rf01Var.c);
            } else {
                pplVar = rf01Var.c;
            }
            ppl pplVar3 = pplVar;
            pz40 Y = aVar2.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, uf01.a((uf01) value2, rf01Var.a, rf01Var.b, pplVar3, null, null, false, 112)));
        }
        a aVar3 = this.this$0;
        boolean z2 = this.$refreshing;
        Throwable a = Result.a(b);
        if (a != null) {
            x4c.g("Failed to fetch transactions info", a, null, null, 12);
            pz40 Y2 = aVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, uf01.a((uf01) value, null, null, null, null, a, z2, 31)));
        }
        this.this$0.Z(new cg01(false));
        return zy11.a;
    }
}
