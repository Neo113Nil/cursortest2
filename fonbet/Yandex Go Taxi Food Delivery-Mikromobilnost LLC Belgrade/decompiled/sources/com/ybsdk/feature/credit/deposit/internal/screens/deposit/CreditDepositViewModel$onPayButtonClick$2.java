package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import defpackage.ds31;
import defpackage.mvg;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q2e0;
import defpackage.saf;
import defpackage.tje;
import defpackage.tse;
import defpackage.waf;
import defpackage.wls;
import defpackage.xaf;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositViewModel$onPayButtonClick$2", f = "CreditDepositViewModel.kt", l = {302}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositViewModel$onPayButtonClick$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositViewModel$onPayButtonClick$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreditDepositViewModel$onPayButtonClick$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditDepositViewModel$onPayButtonClick$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            com.ybsdk.feature.credit.deposit.internal.domain.a aVar2 = aVar.D;
            CreditScreenParams creditScreenParams = aVar.B;
            BigDecimal amount = ((waf) aVar.X()).d.getAmount();
            String currency = ((waf) this.this$0.X()).d.getCurrency();
            saf safVar = ((waf) this.this$0.X()).c;
            String str = safVar != null ? safVar.c : null;
            saf safVar2 = ((waf) this.this$0.X()).c;
            String str2 = safVar2 != null ? safVar2.a : null;
            a aVar3 = this.this$0;
            this.label = 1;
            b = aVar2.b(creditScreenParams, amount, currency, str, str2, aVar3, this);
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
            xaf xafVar = (xaf) b;
            q2e0 q2e0Var = new q2e0(xafVar, true);
            aVar4.C.m(q2e0Var);
            pz40 Y = aVar4.Y();
            while (true) {
                r0 r0Var = (r0) Y;
                Object value = r0Var.getValue();
                xaf xafVar2 = (xaf) q2e0Var.a;
                q2e0 q2e0Var2 = q2e0Var;
                if (r0Var.k(value, waf.a((waf) value, null, null, null, null, null, null, null, null, q2e0Var2, xafVar2.h, xafVar2.j, xafVar.a, null, null, false, null, 254463))) {
                    break;
                }
                q2e0Var = q2e0Var2;
            }
            String str3 = xafVar.a;
            pzt0 pzt0Var = aVar4.O;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            aVar4.O = tje.N(ds31.a(aVar4), null, null, new CreditDepositViewModel$observeTransactionStatus$1(aVar4, str3, null), 3);
        }
        a aVar5 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            n2e0 n2e0Var = new n2e0(a);
            aVar5.C.m(n2e0Var);
            pz40 Y2 = aVar5.Y();
            while (true) {
                r0 r0Var2 = (r0) Y2;
                Object value2 = r0Var2.getValue();
                pz40 pz40Var = Y2;
                if (r0Var2.k(value2, waf.a((waf) value2, null, null, null, null, null, null, null, null, n2e0Var, null, null, null, null, null, false, null, 261631))) {
                    break;
                }
                Y2 = pz40Var;
            }
        }
        return zy11.a;
    }
}
