package com.ybsdk.feature.savings.internal.screens.fund.creation;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.bqs;
import defpackage.ct11;
import defpackage.fns;
import defpackage.gns;
import defpackage.h5a0;
import defpackage.ins;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tse;
import defpackage.vos;
import defpackage.w511;
import defpackage.wcm0;
import defpackage.wls;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.fund.creation.FundCreationViewModel$openFund$1", f = "FundCreationViewModel.kt", l = {BuildConfig.API_LEVEL}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundCreationViewModel$openFund$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundCreationViewModel$openFund$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FundCreationViewModel$openFund$1(this.this$0, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FundCreationViewModel$openFund$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h5a0 h5a0Var;
        Object a;
        r0 r0Var;
        Object value;
        r0 r0Var2;
        Object value2;
        pk11 pk11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            fns fnsVar = new fns(null, null);
            pz40 Y = aVar.Y();
            while (true) {
                r0 r0Var3 = (r0) Y;
                Object value3 = r0Var3.getValue();
                fns fnsVar2 = fnsVar;
                if (r0Var3.k(value3, ins.a((ins) value3, null, fnsVar2, null, null, null, 56))) {
                    break;
                }
                fnsVar = fnsVar2;
            }
            gns gnsVar = ((ins) this.this$0.X()).d;
            if (gnsVar == null || (h5a0Var = gnsVar.g) == null) {
                gns gnsVar2 = ((ins) this.this$0.X()).d;
                h5a0Var = gnsVar2 != null ? gnsVar2.f : null;
            }
            gns gnsVar3 = ((ins) this.this$0.X()).d;
            bqs bqsVar = ((gnsVar3 != null ? gnsVar3.e : null) == null || h5a0Var == null) ? null : new bqs(h5a0Var.getId(), ((ins) this.this$0.X()).d.l, ((ins) this.this$0.X()).d.e);
            a aVar2 = this.this$0;
            com.ybsdk.feature.savings.internal.interactors.a aVar3 = aVar2.J;
            String fundId = aVar2.B.getFundId();
            String str = ((ins) this.this$0.X()).f;
            String str2 = this.$verificationToken;
            a aVar4 = this.this$0;
            this.label = 1;
            a = aVar3.a(bqsVar, str2, str, aVar4, fundId, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        a aVar5 = this.this$0;
        if (!(a instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) a;
            if (sk11Var instanceof pk11) {
                pz40 Y2 = aVar5.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    pk11Var = (pk11) sk11Var;
                } while (!r0Var2.k(value2, ins.a((ins) aVar5.X(), null, null, null, null, pk11Var.b, 31)));
                aVar5.F.h(com.ybsdk.screens.registration.a.e(((wcm0) aVar5.K).a, new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null), pk11Var.a, null, null, false, null, null, "FUND_OPEN_REQUEST_KEY", OpenScreenRequirement.WithBuid.INSTANCE, false, null, 3308));
            } else if (sk11Var instanceof rk11) {
                aVar5.n0(((vos) ((rk11) sk11Var).a).a);
            } else {
                if (!(sk11Var instanceof qk11)) {
                    w511.b();
                    return null;
                }
                FailDataException failDataException = new FailDataException((ct11) sk11Var);
                pz40 Y3 = aVar5.Y();
                do {
                    r0Var = (r0) Y3;
                    value = r0Var.getValue();
                } while (!r0Var.k(value, ins.a((ins) value, failDataException, null, null, null, null, 16)));
            }
        }
        a aVar6 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            a.p0(aVar6, a2);
        }
        return zy11.a;
    }
}
