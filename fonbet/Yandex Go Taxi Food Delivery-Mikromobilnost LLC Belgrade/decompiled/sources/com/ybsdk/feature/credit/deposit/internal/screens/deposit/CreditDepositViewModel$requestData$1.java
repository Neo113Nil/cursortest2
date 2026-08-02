package com.ybsdk.feature.credit.deposit.internal.screens.deposit;

import com.ybsdk.core.common.domain.entities.MoneyEntity;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.feature.credit.deposit.api.CreditScreenParams;
import defpackage.b790;
import defpackage.ds31;
import defpackage.gbf;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.paf;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.saf;
import defpackage.tse;
import defpackage.utb1;
import defpackage.v4b1;
import defpackage.waf;
import defpackage.wls;
import defpackage.x9f;
import defpackage.z690;
import defpackage.zva0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.credit.deposit.internal.screens.deposit.CreditDepositViewModel$requestData$1", f = "CreditDepositViewModel.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CreditDepositViewModel$requestData$1 extends SuspendLambda implements wls {
    final /* synthetic */ zva0 $screenOpenPerfTrace;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreditDepositViewModel$requestData$1(a aVar, zva0 zva0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$screenOpenPerfTrace = zva0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CreditDepositViewModel$requestData$1(this.this$0, this.$screenOpenPerfTrace, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CreditDepositViewModel$requestData$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object c;
        Object obj2;
        r0 r0Var2;
        Object value2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        RequestStatus$Data$Source requestStatus$Data$Source = null;
        if (i == 0) {
            b.b(obj);
            String str = ((waf) this.this$0.X()).n;
            saf safVar = ((waf) this.this$0.X()).c;
            MoneyEntity moneyEntity = ((waf) this.this$0.X()).b instanceof r8j0 ? ((waf) this.this$0.X()).d : null;
            a aVar = this.this$0;
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, utb1.c(aVar.B, aVar.J)));
            a aVar2 = this.this$0;
            com.ybsdk.feature.credit.deposit.internal.domain.a aVar3 = aVar2.D;
            CreditScreenParams creditScreenParams = aVar2.B;
            this.label = 1;
            c = aVar3.c(creditScreenParams, moneyEntity, safVar, str, this);
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
        a aVar4 = this.this$0;
        zva0 zva0Var = this.$screenOpenPerfTrace;
        if (c instanceof Result.Failure) {
            obj2 = c;
        } else {
            paf pafVar = (paf) c;
            b790 b790Var = pafVar.g;
            x9f x9fVar = pafVar.h;
            z690 z690Var = b790Var instanceof z690 ? (z690) b790Var : null;
            if (z690Var != null) {
                v4b1.g(z690Var.b, aVar4.F);
            }
            Text text = x9fVar.b;
            if (text != null) {
                a.b0(aVar4, text, x9fVar.d, x9fVar.e, x9fVar.f, x9fVar.g);
            }
            pz40 Y2 = aVar4.Y();
            while (true) {
                r0 r0Var3 = (r0) Y2;
                Object value3 = r0Var3.getValue();
                obj2 = c;
                if (r0Var3.k(value3, waf.a((waf) value3, new r8j0(pafVar, requestStatus$Data$Source, 14), pafVar.d, pafVar.f, x9fVar.a, null, x9fVar.h, x9fVar.i, null, null, null, null, null, null, null, pafVar.i, pafVar.e.a, 65313))) {
                    break;
                }
                c = obj2;
                requestStatus$Data$Source = null;
            }
            if (!aVar4.P) {
                paf pafVar2 = (paf) ((waf) aVar4.X()).b.a();
                if ((pafVar2 != null ? pafVar2.c : null) == null) {
                    aVar4.P = true;
                    c.a(aVar4.K.d, ds31.a(aVar4), new gbf(aVar4));
                }
            }
            zva0Var.a();
        }
        a aVar5 = this.this$0;
        zva0 zva0Var2 = this.$screenOpenPerfTrace;
        Throwable a = Result.a(obj2);
        if (a != null) {
            pz40 Y3 = aVar5.Y();
            do {
                r0Var2 = (r0) Y3;
                value2 = r0Var2.getValue();
            } while (!r0Var2.k(value2, waf.a((waf) value2, new s8j0(a), null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 262141)));
            zva0Var2.a();
        }
        return zy11.a;
    }
}
