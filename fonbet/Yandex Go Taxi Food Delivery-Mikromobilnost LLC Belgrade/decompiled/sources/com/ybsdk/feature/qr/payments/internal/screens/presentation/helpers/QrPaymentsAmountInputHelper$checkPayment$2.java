package com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentCheckLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentCheckLoadedState;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.domain.model.QrPaymentBankInfo;
import com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.a;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.d9g0;
import defpackage.dqg;
import defpackage.fcy0;
import defpackage.gao;
import defpackage.ka6;
import defpackage.lrp0;
import defpackage.m9g0;
import defpackage.mgb;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.sue0;
import defpackage.th40;
import defpackage.tls;
import defpackage.tse;
import defpackage.v031;
import defpackage.vqy;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yj1;
import defpackage.yxf0;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.QrPaymentsAmountInputHelper$checkPayment$2", f = "QrPaymentsAmountInputHelper.kt", l = {HProv.PP_DELETE_KEYSET}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsAmountInputHelper$checkPayment$2 extends SuspendLambda implements wls {
    final /* synthetic */ d9g0 $currentAmountScreenState;
    final /* synthetic */ boolean $onConfirmClick;
    final /* synthetic */ v031 $previousValidation;
    final /* synthetic */ QrPaymentBankInfo $qrPaymentBankInfo;
    final /* synthetic */ String $selectedAgreementId;
    final /* synthetic */ String $selectedRepaymentPlanId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsAmountInputHelper$checkPayment$2(a aVar, String str, d9g0 d9g0Var, String str2, QrPaymentBankInfo qrPaymentBankInfo, v031 v031Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$selectedAgreementId = str;
        this.$currentAmountScreenState = d9g0Var;
        this.$selectedRepaymentPlanId = str2;
        this.$qrPaymentBankInfo = qrPaymentBankInfo;
        this.$previousValidation = v031Var;
        this.$onConfirmClick = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrPaymentsAmountInputHelper$checkPayment$2(this.this$0, this.$selectedAgreementId, this.$currentAmountScreenState, this.$selectedRepaymentPlanId, this.$qrPaymentBankInfo, this.$previousValidation, this.$onConfirmClick, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsAmountInputHelper$checkPayment$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        BoostStrategy boostStrategy;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        final int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            aVar.c.o(new vqy(aVar, this.$previousValidation, this.$currentAmountScreenState, this.$selectedRepaymentPlanId, 21));
            com.ybsdk.feature.qr.payments.internal.domain.v2.b bVar = this.this$0.d;
            String str = this.$selectedAgreementId;
            d9g0 d9g0Var = this.$currentAmountScreenState;
            BigDecimal bigDecimal = d9g0Var.g;
            String str2 = this.$selectedRepaymentPlanId;
            if (d9g0Var.f.b != ProductType.CREDIT_LIMIT) {
                str2 = null;
            }
            ka6 ka6Var = d9g0Var.p;
            String raw = (ka6Var == null || (boostStrategy = ka6Var.a) == null) ? null : boostStrategy.getRaw();
            if (this.$currentAmountScreenState.f.b != ProductType.WALLET) {
                raw = null;
            }
            QrPaymentBankInfo qrPaymentBankInfo = this.$qrPaymentBankInfo;
            this.label = 1;
            c = bVar.c(str, bigDecimal, str2, raw, qrPaymentBankInfo, this);
            if (c == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            c = ((Result) obj).getValue();
        }
        final a aVar2 = this.this$0;
        final v031 v031Var = this.$previousValidation;
        boolean z = this.$onConfirmClick;
        if (!(c instanceof Result.Failure)) {
            dqg dqgVar = (dqg) c;
            sue0 sue0Var = aVar2.c;
            n4u0 n4u0Var = aVar2.b.a;
            final d9g0 d9g0Var2 = (d9g0) n4u0Var.getValue();
            if (d9g0Var2 != null) {
                if (dqgVar instanceof bqg) {
                    yxf0 yxf0Var = aVar2.e;
                    QrPaymentEvents$QrPaymentCheckLoadedState qrPaymentEvents$QrPaymentCheckLoadedState = QrPaymentEvents$QrPaymentCheckLoadedState.DISALLOWED;
                    yj1 yj1Var = d9g0Var2.f;
                    ProductType productType = yj1Var != null ? yj1Var.b : null;
                    ka6 ka6Var2 = d9g0Var2.p;
                    yxf0Var.t(qrPaymentEvents$QrPaymentCheckLoadedState, null, productType, ka6Var2 != null ? ka6Var2.a : null, QrPaymentEvents$QrPaymentCheckLoadedResult.ERROR);
                    final int i3 = 0;
                    sue0Var.o(new tls() { // from class: t7g0
                        @Override // defpackage.tls
                        public final Object invoke(Object obj2) {
                            int i4 = i3;
                            v031 v031Var2 = v031Var;
                            a aVar3 = aVar2;
                            switch (i4) {
                                case 0:
                                    aVar3.getClass();
                                    return d9g0.c(d9g0Var2, null, null, null, null, null, null, new n031(a.b(v031Var2)), false, null, 57343);
                                default:
                                    aVar3.getClass();
                                    return d9g0.c(d9g0Var2, null, null, null, null, null, null, new n031(a.b(v031Var2)), false, null, 57343);
                            }
                        }
                    });
                    if (z) {
                        bqg bqgVar = (bqg) dqgVar;
                        Text.Constant constant = new Text.Constant(bqgVar.a);
                        String str3 = bqgVar.b;
                        Text constant2 = str3 != null ? new Text.Constant(str3) : null;
                        if (constant2 == null) {
                            constant2 = Text.Empty.INSTANCE;
                        }
                        ((com.ybsdk.feature.qr.payments.internal.screens.presentation.b) aVar2.c.b).Z(new m9g0(gao.e(constant, constant2, null, 4)));
                    }
                } else {
                    if (!(dqgVar instanceof cqg)) {
                        w511.b();
                        return null;
                    }
                    mgb mgbVar = (mgb) ((cqg) dqgVar).a;
                    d9g0 d9g0Var3 = (d9g0) n4u0Var.getValue();
                    if (d9g0Var3 != null) {
                        sue0Var.o(new th40(21, d9g0Var3, mgbVar, aVar2));
                        if (z) {
                            if (mgbVar.e != null) {
                                yxf0 yxf0Var2 = aVar2.e;
                                yj1 yj1Var2 = d9g0Var3.f;
                                String str4 = yj1Var2 != null ? yj1Var2.a : null;
                                fcy0 fcy0Var = ((AppAnalyticsReporter) yxf0Var2.a).m0;
                                LinkedHashMap linkedHashMap = new LinkedHashMap(1);
                                if (str4 != null) {
                                    linkedHashMap.put("agreementId", str4);
                                }
                                fcy0Var.a.a("tech.qr.refresh_widget_on_pay_click", linkedHashMap);
                            } else {
                                aVar2.c();
                            }
                        }
                    }
                }
            }
        }
        boolean z2 = this.$onConfirmClick;
        final a aVar3 = this.this$0;
        final d9g0 d9g0Var4 = this.$currentAmountScreenState;
        final v031 v031Var2 = this.$previousValidation;
        Throwable a = Result.a(c);
        if (a != null) {
            x4c.g("failed to check payment", a, null, Collections.singletonList(lrp0.x), 4);
            if (z2) {
                ((com.ybsdk.feature.qr.payments.internal.screens.presentation.b) aVar3.c.b).Z(new m9g0(gao.e(null, null, a, 3)));
            }
            aVar3.c.o(new tls() { // from class: t7g0
                @Override // defpackage.tls
                public final Object invoke(Object obj2) {
                    int i4 = i2;
                    v031 v031Var22 = v031Var2;
                    a aVar32 = aVar3;
                    switch (i4) {
                        case 0:
                            aVar32.getClass();
                            return d9g0.c(d9g0Var4, null, null, null, null, null, null, new n031(a.b(v031Var22)), false, null, 57343);
                        default:
                            aVar32.getClass();
                            return d9g0.c(d9g0Var4, null, null, null, null, null, null, new n031(a.b(v031Var22)), false, null, 57343);
                    }
                }
            });
        }
        return zy11.a;
    }
}
