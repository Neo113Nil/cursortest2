package com.yandex.payment.divkit.cvv_confirm;

import com.yandex.payment.divkit.cvv_confirm.CvvScreenArguments;
import com.yandex.payment.divkit.usecases.f;
import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.xplat.payment.sdk.DivCardForAnalytics;
import defpackage.dof;
import defpackage.gvu0;
import defpackage.iho;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv90;
import defpackage.sv90;
import defpackage.tse;
import defpackage.tyh0;
import defpackage.vnf;
import defpackage.w511;
import defpackage.wls;
import defpackage.znb1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.cvv_confirm.CvvConfirmViewModel$loadDivJson$1", f = "CvvConfirmViewModel.kt", l = {105, 110}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class CvvConfirmViewModel$loadDivJson$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvvConfirmViewModel$loadDivJson$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CvvConfirmViewModel$loadDivJson$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CvvConfirmViewModel$loadDivJson$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(1:(1:(4:5|6|7|8)(2:10|11))(1:12))(6:22|(1:24)|25|(1:27)(2:31|(4:33|(1:35)(1:37)|36|29)(2:38|(1:40)(2:41|42)))|28|29)|13|14|15|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00c5, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        r3 = r7.this$0.b;
        r7.L$0 = null;
        r7.L$1 = null;
        r7.L$2 = r8;
        r7.label = 2;
        r1 = r3.b(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00d6, code lost:
    
        if (r1 != r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d8, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d9, code lost:
    
        r0 = r8;
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (r8 != r0) goto L30;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vnf vnfVar;
        String g;
        vnf vnfVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.z.m(dof.b);
            b bVar = this.this$0;
            CvvScreenArguments cvvScreenArguments = bVar.F;
            if (cvvScreenArguments == null) {
                cvvScreenArguments = null;
            }
            if (cvvScreenArguments instanceof CvvScreenArguments.Challenge) {
                CvvScreenArguments.Challenge challenge = (CvvScreenArguments.Challenge) cvvScreenArguments;
                vnfVar = new vnf(challenge.getCardSystem(), challenge.getCardSuffix());
            } else if (cvvScreenArguments instanceof CvvScreenArguments.ForceCvv) {
                PaymentMethod.Card method = ((CvvScreenArguments.ForceCvv) cvvScreenArguments).getMethod();
                if (method.getFamilyInfo() != null) {
                    g = bVar.y.a.getString(tyh0.paymentsdk_prebuilt_family_pay_title);
                } else {
                    g = znb1.g(method.getSystem());
                }
                vnfVar2 = new vnf(g, gvu0.B0(4, method.getAccount()));
                f fVar = this.this$0.b;
                this.L$0 = vnfVar2;
                this.label = 1;
                obj = fVar.a(vnfVar2, this);
            } else {
                if (!(cvvScreenArguments instanceof CvvScreenArguments.NoPaymentChallenge)) {
                    w511.b();
                    return null;
                }
                CvvScreenArguments.NoPaymentChallenge noPaymentChallenge = (CvvScreenArguments.NoPaymentChallenge) cvvScreenArguments;
                vnfVar = new vnf(noPaymentChallenge.getCardSystem(), noPaymentChallenge.getCardSuffix());
            }
            vnfVar2 = vnfVar;
            f fVar2 = this.this$0.b;
            this.L$0 = vnfVar2;
            this.label = 1;
            obj = fVar2.a(vnfVar2, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th = (Throwable) this.L$2;
                kotlin.b.b(obj);
                b.W(this.this$0, (JSONObject) obj);
                sv90 sv90Var = qv90.a;
                DivCardForAnalytics divCardForAnalytics = DivCardForAnalytics.CVV;
                sv90Var.getClass();
                iho.b(sv90.f0(divCardForAnalytics), th.getMessage(), 2).c();
                return zy11.a;
            }
            vnfVar2 = (vnf) this.L$0;
            kotlin.b.b(obj);
        }
        b.W(this.this$0, (JSONObject) obj);
        sv90 sv90Var2 = qv90.a;
        DivCardForAnalytics divCardForAnalytics2 = DivCardForAnalytics.CVV;
        sv90Var2.getClass();
        sv90.f0(divCardForAnalytics2).d(null).c();
        return zy11.a;
    }
}
