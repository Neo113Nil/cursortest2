package com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search;

import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.entities.BudgetGetStatusEntity$Status;
import defpackage.dp6;
import defpackage.ds31;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.q8u0;
import defpackage.qp6;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tje;
import defpackage.tse;
import defpackage.up6;
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
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.budget.presentation.search.BudgetChargesSearchStatusViewModel$onStartSearch$2", f = "BudgetChargesSearchStatusViewModel.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class BudgetChargesSearchStatusViewModel$onStartSearch$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BudgetChargesSearchStatusViewModel$onStartSearch$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BudgetChargesSearchStatusViewModel$onStartSearch$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BudgetChargesSearchStatusViewModel$onStartSearch$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object d;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        q8u0 q8u0Var;
        BudgetGetStatusEntity$Status budgetGetStatusEntity$Status;
        q8u0 q8u0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.b bVar = aVar.C;
            String uin = aVar.B.getUin();
            String qrString = this.this$0.B.getQrString();
            a aVar2 = this.this$0;
            this.label = 1;
            d = bVar.d(aVar2, uin, qrString, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            d = ((Result) obj).getValue();
        }
        a aVar3 = this.this$0;
        Throwable a = Result.a(d);
        if (a == null) {
            up6 up6Var = (up6) d;
            pz40 Y = aVar3.Y();
            do {
                r0Var2 = (r0) Y;
                value2 = r0Var2.getValue();
                q8u0Var = up6Var.c;
                budgetGetStatusEntity$Status = BudgetGetStatusEntity$Status.IN_PROGRESS;
                q8u0Var2 = up6Var.b;
            } while (!r0Var2.k(value2, new r8j0(new dp6(q8u0Var, new qp6(budgetGetStatusEntity$Status, new q8u0(null, q8u0Var2.b, q8u0Var2.c, null), 4)), null, 14)));
            tje.N(ds31.a(aVar3), null, null, new BudgetChargesSearchStatusViewModel$getSearchStatus$1(aVar3, up6Var.a, null), 3);
        } else {
            if (!(a instanceof FailDataException)) {
                x4c.g("Can't load BudgetChargesSearchFragment", a, null, Collections.singletonList(lrp0.f), 4);
            }
            pz40 Y2 = aVar3.Y();
            do {
                r0Var = (r0) Y2;
                value = r0Var.getValue();
            } while (!r0Var.k(value, new s8j0(a)));
        }
        return zy11.a;
    }
}
