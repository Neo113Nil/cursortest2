package com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrPaymentLoadedVersion;
import com.ybsdk.feature.qr.payments.api.data.BoostStrategy;
import com.ybsdk.feature.qr.payments.api.data.ProductType;
import com.ybsdk.feature.qr.payments.internal.domain.v2.result.Funding;
import com.ybsdk.feature.qr.payments.internal.screens.result.data.entities.ResultStatus;
import com.ybsdk.feature.rateapp.api.RateAppFeature$Source;
import defpackage.b8g0;
import defpackage.e9g0;
import defpackage.eag0;
import defpackage.gag0;
import defpackage.gtu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8g0;
import defpackage.rt1;
import defpackage.tls;
import defpackage.tse;
import defpackage.tzj0;
import defpackage.vzj0;
import defpackage.w511;
import defpackage.wls;
import defpackage.yxf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.QrPaymentsResultHelper$callGetResult$1", f = "QrPaymentsResultHelper.kt", l = {275}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsResultHelper$callGetResult$1 extends SuspendLambda implements wls {
    final /* synthetic */ e9g0 $currentState;
    final /* synthetic */ String $paymentId;
    final /* synthetic */ ProductType $productType;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsResultHelper$callGetResult$1(b bVar, String str, e9g0 e9g0Var, ProductType productType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$paymentId = str;
        this.$currentState = e9g0Var;
        this.$productType = productType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrPaymentsResultHelper$callGetResult$1(this.this$0, this.$paymentId, this.$currentState, this.$productType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsResultHelper$callGetResult$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h;
        int i;
        int i2;
        int i3;
        String str;
        Pair pair;
        Boolean bool;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        final int i5 = 1;
        if (i4 == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.qr.payments.internal.domain.v2.b bVar = this.this$0.h;
            String str2 = this.$paymentId;
            this.label = 1;
            h = bVar.h(str2, this);
            if (h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i4 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            h = obj;
        }
        final tzj0 tzj0Var = (tzj0) h;
        yxf0 yxf0Var = this.this$0.i;
        ResultStatus resultStatus = tzj0Var.a;
        e9g0 e9g0Var = this.$currentState;
        String str3 = e9g0Var.j;
        ProductType productType = this.$productType;
        BoostStrategy boostStrategy = e9g0Var.o;
        vzj0 vzj0Var = tzj0Var.c;
        Funding funding = vzj0Var != null ? vzj0Var.e : null;
        yxf0Var.getClass();
        int i6 = r8g0.b[resultStatus.ordinal()];
        final int i7 = 0;
        if (i6 != 1) {
            if (i6 == 2 || i6 == 3) {
                pair = new Pair(QrPaymentEvents$QrPaymentLoadedResult.ERROR, null);
            } else if (i6 == 4) {
                QrPaymentEvents$QrPaymentLoadedResult qrPaymentEvents$QrPaymentLoadedResult = QrPaymentEvents$QrPaymentLoadedResult.OK;
                if (funding != null) {
                    bool = Boolean.valueOf(funding == Funding.BOOST);
                } else {
                    bool = null;
                }
                pair = new Pair(qrPaymentEvents$QrPaymentLoadedResult, bool);
            } else {
                if (i6 != 5) {
                    w511.b();
                    return null;
                }
                pair = new Pair(QrPaymentEvents$QrPaymentLoadedResult.TIMEOUT, null);
            }
            QrPaymentEvents$QrPaymentLoadedResult qrPaymentEvents$QrPaymentLoadedResult2 = (QrPaymentEvents$QrPaymentLoadedResult) pair.getFirst();
            Boolean bool2 = (Boolean) pair.getSecond();
            rt1 rt1Var = ((AppAnalyticsReporter) yxf0Var.a).Y;
            QrPaymentEvents$QrPaymentLoadedVersion qrPaymentEvents$QrPaymentLoadedVersion = QrPaymentEvents$QrPaymentLoadedVersion.CREDLIM;
            String x = yxf0.x(productType, boostStrategy);
            String str4 = (String) yxf0Var.b;
            i = 4;
            i3 = 2;
            i2 = 3;
            rt1.A(rt1Var, qrPaymentEvents$QrPaymentLoadedVersion, x, qrPaymentEvents$QrPaymentLoadedResult2, str3, str4, bool2);
        } else {
            i = 4;
            i2 = 3;
            i3 = 2;
        }
        int i8 = gag0.a[tzj0Var.a.ordinal()];
        if (i8 != 1) {
            if (i8 == i3 || i8 == i2 || i8 == i) {
                ((com.ybsdk.screens.transaction.presentation.a) this.this$0.a.b).a();
                com.ybsdk.feature.qr.payments.internal.screens.presentation.a aVar = this.this$0.f;
                final e9g0 e9g0Var2 = this.$currentState;
                aVar.b(new tls() { // from class: fag0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj2) {
                        int i9 = i7;
                        tzj0 tzj0Var2 = tzj0Var;
                        e9g0 e9g0Var3 = e9g0Var2;
                        e9g0 e9g0Var4 = (e9g0) obj2;
                        switch (i9) {
                            case 0:
                                return e9g0.c(e9g0Var3, tzj0.a(e9g0Var4.k, tzj0Var2.a, null, null, tzj0Var2.d, 6), null, null, 31743);
                            default:
                                return e9g0.c(e9g0Var3, tzj0.a(e9g0Var4.k, tzj0Var2.a, tzj0Var2.b, tzj0Var2.c, null, 8), null, null, 31743);
                        }
                    }
                });
            } else {
                if (i8 != 5) {
                    w511.b();
                    return null;
                }
                ((com.ybsdk.screens.transaction.presentation.a) this.this$0.a.b).a();
                b bVar2 = this.this$0;
                Object obj2 = bVar2.b.b;
                RateAppFeature$Source rateAppFeature$Source = RateAppFeature$Source.None;
                b8g0 b8g0Var = bVar2.g;
                ProductType productType2 = this.$productType;
                int i9 = productType2 == null ? -1 : eag0.b[productType2.ordinal()];
                if (i9 != -1) {
                    if (i9 == 1 || i9 == i3 || i9 == i2) {
                        str = productType2.name();
                        b8g0Var.a.a(gtu0.a("external_transaction.payment.success", str));
                        com.ybsdk.feature.qr.payments.internal.screens.presentation.a aVar2 = this.this$0.f;
                        final e9g0 e9g0Var3 = this.$currentState;
                        aVar2.b(new tls() { // from class: fag0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj22) {
                                int i92 = i5;
                                tzj0 tzj0Var2 = tzj0Var;
                                e9g0 e9g0Var32 = e9g0Var3;
                                e9g0 e9g0Var4 = (e9g0) obj22;
                                switch (i92) {
                                    case 0:
                                        return e9g0.c(e9g0Var32, tzj0.a(e9g0Var4.k, tzj0Var2.a, null, null, tzj0Var2.d, 6), null, null, 31743);
                                    default:
                                        return e9g0.c(e9g0Var32, tzj0.a(e9g0Var4.k, tzj0Var2.a, tzj0Var2.b, tzj0Var2.c, null, 8), null, null, 31743);
                                }
                            }
                        });
                    } else if (i9 != i) {
                        w511.b();
                        return null;
                    }
                }
                str = "other";
                b8g0Var.a.a(gtu0.a("external_transaction.payment.success", str));
                com.ybsdk.feature.qr.payments.internal.screens.presentation.a aVar22 = this.this$0.f;
                final e9g0 e9g0Var32 = this.$currentState;
                aVar22.b(new tls() { // from class: fag0
                    @Override // defpackage.tls
                    public final Object invoke(Object obj22) {
                        int i92 = i5;
                        tzj0 tzj0Var2 = tzj0Var;
                        e9g0 e9g0Var322 = e9g0Var32;
                        e9g0 e9g0Var4 = (e9g0) obj22;
                        switch (i92) {
                            case 0:
                                return e9g0.c(e9g0Var322, tzj0.a(e9g0Var4.k, tzj0Var2.a, null, null, tzj0Var2.d, 6), null, null, 31743);
                            default:
                                return e9g0.c(e9g0Var322, tzj0.a(e9g0Var4.k, tzj0Var2.a, tzj0Var2.b, tzj0Var2.c, null, 8), null, null, 31743);
                        }
                    }
                });
            }
        }
        return zy11.a;
    }
}
