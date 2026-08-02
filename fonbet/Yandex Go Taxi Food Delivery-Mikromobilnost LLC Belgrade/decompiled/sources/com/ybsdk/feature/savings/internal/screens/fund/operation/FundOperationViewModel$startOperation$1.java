package com.ybsdk.feature.savings.internal.screens.fund.operation;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.cps;
import defpackage.ct11;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qk11;
import defpackage.rk11;
import defpackage.sk11;
import defpackage.tfl0;
import defpackage.tse;
import defpackage.udm0;
import defpackage.w511;
import defpackage.wcm0;
import defpackage.wls;
import defpackage.yos;
import defpackage.zos;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.savings.internal.screens.fund.operation.FundOperationViewModel$startOperation$1", f = "FundOperationViewModel.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FundOperationViewModel$startOperation$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $confirmation;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FundOperationViewModel$startOperation$1(a aVar, String str, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$verificationToken = str;
        this.$confirmation = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FundOperationViewModel$startOperation$1(this.this$0, this.$verificationToken, this.$confirmation, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FundOperationViewModel$startOperation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        Object a;
        FundOperationViewModel$startOperation$1 fundOperationViewModel$startOperation$1;
        r0 r0Var2;
        Object value2;
        pk11 pk11Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        String str = null;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            zos zosVar = new zos(null, null);
            pz40 Y = aVar.Y();
            do {
                r0Var = (r0) Y;
                value = r0Var.getValue();
            } while (!r0Var.k(value, cps.a((cps) value, null, zosVar, null, null, null, 56)));
            a aVar2 = this.this$0;
            com.ybsdk.feature.savings.internal.interactors.b bVar = aVar2.G;
            String type = aVar2.B.getType();
            String agreementId = this.this$0.B.getAgreementId();
            String str2 = this.$verificationToken;
            String str3 = ((cps) this.this$0.X()).f;
            a aVar3 = this.this$0;
            boolean z = this.$confirmation;
            this.label = 1;
            a = bVar.a(type, agreementId, str2, str3, aVar3, z, this);
            fundOperationViewModel$startOperation$1 = this;
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
            fundOperationViewModel$startOperation$1 = this;
        }
        a aVar4 = fundOperationViewModel$startOperation$1.this$0;
        if (!(a instanceof Result.Failure)) {
            sk11 sk11Var = (sk11) a;
            if (sk11Var instanceof pk11) {
                pz40 Y2 = aVar4.Y();
                do {
                    r0Var2 = (r0) Y2;
                    value2 = r0Var2.getValue();
                    pk11Var = (pk11) sk11Var;
                } while (!r0Var2.k(value2, cps.a((cps) aVar4.X(), null, null, null, null, pk11Var.b, 31)));
                tfl0 tfl0Var = aVar4.F;
                udm0 udm0Var = aVar4.H;
                tfl0Var.h(com.ybsdk.screens.registration.a.e(((wcm0) udm0Var).a, new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null), pk11Var.a, null, null, false, null, null, "FUND_OPEN_REQUEST_KEY", OpenScreenRequirement.WithBuid.INSTANCE, false, null, 3308));
            } else if (sk11Var instanceof rk11) {
                aVar4.g0(((yos) ((rk11) sk11Var).a).a);
            } else {
                if (!(sk11Var instanceof qk11)) {
                    w511.b();
                    return null;
                }
                FailDataException failDataException = new FailDataException((ct11) sk11Var);
                pz40 Y3 = aVar4.Y();
                while (true) {
                    r0 r0Var3 = (r0) Y3;
                    Object value3 = r0Var3.getValue();
                    FailDataException failDataException2 = failDataException;
                    String str4 = str;
                    if (r0Var3.k(value3, cps.a((cps) value3, failDataException2, null, null, null, str4, 16))) {
                        break;
                    }
                    failDataException = failDataException2;
                    str = str4;
                }
            }
        }
        a aVar5 = fundOperationViewModel$startOperation$1.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            a.i0(aVar5, a2);
        }
        return zy11.a;
    }
}
