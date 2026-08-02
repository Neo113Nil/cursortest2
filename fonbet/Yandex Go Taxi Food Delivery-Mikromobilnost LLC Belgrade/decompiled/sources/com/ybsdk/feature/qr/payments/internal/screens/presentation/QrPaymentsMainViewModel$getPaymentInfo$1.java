package com.ybsdk.feature.qr.payments.internal.screens.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentInfoInitiatedVersion;
import defpackage.h9g0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p9g0;
import defpackage.rt1;
import defpackage.tse;
import defpackage.wls;
import defpackage.yj1;
import defpackage.yxf0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.presentation.QrPaymentsMainViewModel$getPaymentInfo$1", f = "QrPaymentsMainViewModel.kt", l = {284, 288}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsMainViewModel$getPaymentInfo$1 extends SuspendLambda implements wls {
    final /* synthetic */ h9g0 $currentState;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsMainViewModel$getPaymentInfo$1(b bVar, h9g0 h9g0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$currentState = h9g0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrPaymentsMainViewModel$getPaymentInfo$1(this.this$0, this.$currentState, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsMainViewModel$getPaymentInfo$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x009f, code lost:
    
        if (((defpackage.tpr) r8).collect(r1, r7) == r0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x00a1, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
    
        if (r8 == r0) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String agreementId;
        String autopaymentId;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            yxf0 yxf0Var = this.this$0.I;
            rt1 rt1Var = ((AppAnalyticsReporter) yxf0Var.a).Y;
            QrPaymentEvents$QrPaymentInfoInitiatedVersion qrPaymentEvents$QrPaymentInfoInitiatedVersion = QrPaymentEvents$QrPaymentInfoInitiatedVersion.CREDLIM;
            String str = (String) yxf0Var.b;
            LinkedHashMap linkedHashMap = new LinkedHashMap(3);
            linkedHashMap.put("version", qrPaymentEvents$QrPaymentInfoInitiatedVersion.getOriginalValue());
            if (str != null) {
                linkedHashMap.put("origin", str);
            }
            rt1Var.a.a("qr.payment_info.initiated", linkedHashMap);
            com.ybsdk.feature.qr.payments.internal.domain.v2.b bVar = this.this$0.H;
            yj1 b = this.$currentState.a.b();
            if (b == null || (agreementId = b.a) == null) {
                agreementId = this.this$0.B.getAgreementId();
            }
            BigDecimal amount = this.$currentState.a.getAmount();
            yj1 b2 = this.$currentState.a.b();
            if (b2 == null || (autopaymentId = b2.c) == null) {
                autopaymentId = this.this$0.B.getAutopaymentId();
            }
            this.label = 1;
            obj = bVar.g(agreementId, amount, autopaymentId, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        p9g0 p9g0Var = new p9g0(0, this.this$0, this.$currentState);
        this.label = 2;
    }
}
