package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites;

import defpackage.ds31;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.tje;
import defpackage.tse;
import defpackage.uo6;
import defpackage.v7l;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.requisites.BudgetChargesRequisitesViewModel$loadRequisites$1", f = "BudgetChargesRequisitesViewModel.kt", l = {60}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BudgetChargesRequisitesViewModel$loadRequisites$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BudgetChargesRequisitesViewModel$loadRequisites$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BudgetChargesRequisitesViewModel$loadRequisites$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BudgetChargesRequisitesViewModel$loadRequisites$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object b;
        r0 r0Var2;
        Object value2;
        r0 r0Var3;
        Object value3;
        r0 r0Var4;
        Object value4;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            this.this$0.H.a.B.a.a("payment.gov.payment_info.initiated", null);
            a aVar = this.this$0;
            if (((uo6) aVar.X()).d) {
                pz40 Y = aVar.Y();
                do {
                    r0Var2 = (r0) Y;
                    value2 = r0Var2.getValue();
                } while (!r0Var2.k(value2, uo6.b((uo6) value2, null, null, null, 7)));
                tje.N(ds31.a(aVar), null, null, new BudgetChargesRequisitesViewModel$handleLoadingState$2(aVar, null), 3);
            }
            pz40 Y2 = this.this$0.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, uo6.b((uo6) value, null, null, null, 14)));
            a aVar2 = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b bVar = aVar2.C;
            String invoiceId = aVar2.B.getInvoiceId();
            this.label = 1;
            b = bVar.b(invoiceId, this);
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
        a aVar3 = this.this$0;
        Throwable a = Result.a(b);
        if (a == null) {
            v7l v7lVar = (v7l) b;
            aVar3.H.p(null, true);
            pz40 Y3 = aVar3.Y();
            do {
                r0Var4 = (r0) Y3;
                value4 = r0Var4.getValue();
            } while (!r0Var4.k(value4, uo6.b((uo6) value4, null, v7lVar, null, 13)));
            aVar3.D.c();
        } else {
            x4c.g("Failed to load BudgetChargesRequisitesFragment", a, null, Collections.singletonList(lrp0.f), 4);
            aVar3.H.p(a.getMessage(), false);
            pz40 Y4 = aVar3.Y();
            do {
                r0Var3 = (r0) Y4;
                value3 = r0Var3.getValue();
            } while (!r0Var3.k(value3, uo6.b((uo6) value3, a, null, null, 14)));
            aVar3.D.d();
        }
        return zy11.a;
    }
}
