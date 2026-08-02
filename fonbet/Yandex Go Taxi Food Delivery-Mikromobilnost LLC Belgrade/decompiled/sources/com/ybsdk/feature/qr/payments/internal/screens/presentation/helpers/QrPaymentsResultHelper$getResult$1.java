package com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers;

import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.TarifficatorScenarioActivity;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrConfirmFailedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrConfirmFailedVersion;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentLoadedVersion;
import com.ybsdk.core.common.data.network.dto.Money;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import com.ybsdk.feature.qr.payments.api.QrSource;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.domain.model.QrPaymentBankInfo;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import defpackage.c6g0;
import defpackage.dag0;
import defpackage.e9g0;
import defpackage.f9g0;
import defpackage.g9g0;
import defpackage.h9g0;
import defpackage.hag0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.pk11;
import defpackage.pz40;
import defpackage.qca1;
import defpackage.qk11;
import defpackage.r8g0;
import defpackage.rk11;
import defpackage.rt1;
import defpackage.sk11;
import defpackage.tje;
import defpackage.tse;
import defpackage.tzj0;
import defpackage.ugd0;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.yj1;
import defpackage.yxf0;
import defpackage.zy11;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.QrPaymentsResultHelper$getResult$1", f = "QrPaymentsResultHelper.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsResultHelper$getResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $boostStrategy;
    final /* synthetic */ e9g0 $currentState;
    final /* synthetic */ ProductType $productType;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsResultHelper$getResult$1(b bVar, e9g0 e9g0Var, String str, String str2, ProductType productType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$currentState = e9g0Var;
        this.$verificationToken = str;
        this.$boostStrategy = str2;
        this.$productType = productType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrPaymentsResultHelper$getResult$1(this.this$0, this.$currentState, this.$verificationToken, this.$boostStrategy, this.$productType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsResultHelper$getResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        QrPaymentBankInfo qrPaymentBankInfo;
        Object d;
        QrPaymentEvents$QrConfirmFailedResult qrPaymentEvents$QrConfirmFailedResult;
        r0 r0Var;
        Object value;
        g9g0 g9g0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.qr.payments.internal.domain.v2.b bVar = this.this$0.h;
            e9g0 e9g0Var = this.$currentState;
            Money money = new Money(e9g0Var.g, e9g0Var.b);
            c6g0 c6g0Var = this.this$0.d;
            String str = c6g0Var.a;
            e9g0 e9g0Var2 = this.$currentState;
            String str2 = e9g0Var2.j;
            yj1 yj1Var = e9g0Var2.f;
            String str3 = this.$verificationToken;
            String str4 = e9g0Var2.l;
            String str5 = yj1Var.a;
            String str6 = e9g0Var2.h;
            String str7 = this.$boostStrategy;
            QrSource qrSource = c6g0Var.c;
            String str8 = yj1Var.c;
            if (str8 != null) {
                qrPaymentBankInfo = new QrPaymentBankInfo(yj1Var.b, str8, yj1Var.d);
                i = 1;
            } else {
                i = 1;
                qrPaymentBankInfo = null;
            }
            this.label = i;
            d = bVar.d(money, qrSource, qrPaymentBankInfo, str, str2, str3, str4, str5, str6, str7, this);
            if (d == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            d = obj;
        }
        sk11 sk11Var = (sk11) d;
        if (sk11Var instanceof pk11) {
            com.ybsdk.feature.qr.payments.internal.screens.presentation.a aVar = this.this$0.f;
            e9g0 e9g0Var3 = this.$currentState;
            pk11 pk11Var = (pk11) sk11Var;
            com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar2 = aVar.a;
            if (qca1.c((h9g0) bVar2.X()) != null) {
                pz40 Y = bVar2.Y();
                do {
                    r0Var = (r0) Y;
                    value = r0Var.getValue();
                    g9g0Var = ((h9g0) value).a;
                    if (g9g0Var instanceof f9g0) {
                        g9g0Var = e9g0.c(e9g0Var3, null, pk11Var.b, null, 30719);
                    }
                } while (!r0Var.k(value, new h9g0(g9g0Var)));
            }
            yxf0 yxf0Var = this.this$0.i;
            String str9 = this.$currentState.j;
            ProductType productType = this.$productType;
            rt1.A(((AppAnalyticsReporter) yxf0Var.a).Y, QrPaymentEvents$QrPaymentLoadedVersion.CREDLIM, productType != null ? productType.name() : null, QrPaymentEvents$QrPaymentLoadedResult.TWO_FA, str9, (String) yxf0Var.b, null);
            this.this$0.f.a(pk11Var.a, QrPaymentsSecondFactorScreenProvider$Request.PAYMENT);
        } else if (sk11Var instanceof qk11) {
            yxf0 yxf0Var2 = this.this$0.i;
            String str10 = this.$currentState.j;
            ProductType productType2 = this.$productType;
            rt1.A(((AppAnalyticsReporter) yxf0Var2.a).Y, QrPaymentEvents$QrPaymentLoadedVersion.CREDLIM, productType2 != null ? productType2.name() : null, QrPaymentEvents$QrPaymentLoadedResult.DENIED, str10, (String) yxf0Var2.b, null);
            this.this$0.f.b(new ugd0(18, (qk11) sk11Var, this.$currentState));
        } else {
            if (!(sk11Var instanceof rk11)) {
                w511.b();
                return null;
            }
            rk11 rk11Var = (rk11) sk11Var;
            tzj0 tzj0Var = (tzj0) rk11Var.a;
            int i3 = hag0.a[tzj0Var.a.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3) {
                yxf0 yxf0Var3 = this.this$0.i;
                String str11 = this.$currentState.j;
                ProductType productType3 = this.$productType;
                ResultStatus resultStatus = tzj0Var.a;
                yxf0Var3.getClass();
                int i4 = r8g0.b[resultStatus.ordinal()];
                if (i4 != 1) {
                    if (i4 == 2) {
                        qrPaymentEvents$QrConfirmFailedResult = QrPaymentEvents$QrConfirmFailedResult.FAILED;
                    } else if (i4 == 3) {
                        qrPaymentEvents$QrConfirmFailedResult = QrPaymentEvents$QrConfirmFailedResult.ERROR;
                    } else if (i4 != 4) {
                        if (i4 != 5) {
                            w511.b();
                            return null;
                        }
                        qrPaymentEvents$QrConfirmFailedResult = QrPaymentEvents$QrConfirmFailedResult.TIMEOUT;
                    }
                    rt1 rt1Var = ((AppAnalyticsReporter) yxf0Var3.a).Y;
                    QrPaymentEvents$QrConfirmFailedVersion qrPaymentEvents$QrConfirmFailedVersion = QrPaymentEvents$QrConfirmFailedVersion.CREDLIM;
                    String name = productType3 != null ? productType3.name() : null;
                    String str12 = (String) yxf0Var3.b;
                    LinkedHashMap linkedHashMap = new LinkedHashMap(5);
                    linkedHashMap.put("version", qrPaymentEvents$QrConfirmFailedVersion.getOriginalValue());
                    if (name != null) {
                        linkedHashMap.put("agreement", name);
                    }
                    linkedHashMap.put(TarifficatorScenarioActivity.RESULT_KEY, qrPaymentEvents$QrConfirmFailedResult.getOriginalValue());
                    if (str11 != null) {
                        linkedHashMap.put("transfer_id", str11);
                    }
                    if (str12 != null) {
                        linkedHashMap.put("origin", str12);
                    }
                    rt1Var.a.a("qr.confirm.failed", linkedHashMap);
                }
                ((com.ybsdk.screens.transaction.presentation.a) this.this$0.a.b).a();
                this.this$0.f.b(new ugd0(19, rk11Var, this.$currentState));
            } else {
                if (i3 != 4 && i3 != 5) {
                    w511.b();
                    return null;
                }
                b bVar3 = this.this$0;
                ProductType productType4 = this.$productType;
                n4u0 n4u0Var = bVar3.e.a;
                e9g0 e9g0Var4 = (e9g0) n4u0Var.getValue();
                if (e9g0Var4 != null) {
                    String str13 = tzj0Var.b;
                    if (str13 != null) {
                        e9g0 e9g0Var5 = (e9g0) n4u0Var.getValue();
                        if (e9g0Var5 != null) {
                            tje.N(bVar3.c, null, null, new QrPaymentsResultHelper$callGetResult$1(bVar3, str13, e9g0Var5, productType4, null), 3);
                        }
                    } else {
                        ((com.ybsdk.screens.transaction.presentation.a) bVar3.a.b).a();
                        x4c.g("Null payment_id on confirm result", null, null, Collections.singletonList(lrp0.x), 6);
                        bVar3.f.b(new dag0(e9g0Var4, 2));
                    }
                }
            }
        }
        return zy11.a;
    }
}
