package com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrSubscriptionLoadedVersion;
import com.ybsdk.feature.qr.payments.api.QrPaymentsSecondFactorScreenProvider$Request;
import com.ybsdk.feature.qr.payments.internal.screens.subscription.data.entities.SubscriptionStatus;
import defpackage.dag0;
import defpackage.e9g0;
import defpackage.f9g0;
import defpackage.g9g0;
import defpackage.gbg0;
import defpackage.h9g0;
import defpackage.hbg0;
import defpackage.iag0;
import defpackage.ibg0;
import defpackage.jbg0;
import defpackage.lrp0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qca1;
import defpackage.sag0;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.qr.payments.internal.screens.presentation.helpers.QrPaymentsResultHelper$startSubscriptionWidgetStatuses$2", f = "QrPaymentsResultHelper.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class QrPaymentsResultHelper$startSubscriptionWidgetStatuses$2 extends SuspendLambda implements wls {
    final /* synthetic */ e9g0 $currentState;
    final /* synthetic */ String $verificationToken;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QrPaymentsResultHelper$startSubscriptionWidgetStatuses$2(b bVar, e9g0 e9g0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$currentState = e9g0Var;
        this.$verificationToken = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new QrPaymentsResultHelper$startSubscriptionWidgetStatuses$2(this.this$0, this.$currentState, this.$verificationToken, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((QrPaymentsResultHelper$startSubscriptionWidgetStatuses$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object e;
        r0 r0Var;
        Object value;
        g9g0 g9g0Var;
        r0 r0Var2;
        Object value2;
        g9g0 g9g0Var2;
        r0 r0Var3;
        Object value3;
        g9g0 g9g0Var3;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.qr.payments.internal.domain.v2.b bVar = this.this$0.h;
            e9g0 e9g0Var = this.$currentState;
            String str = e9g0Var.f.a;
            String str2 = this.$verificationToken;
            String str3 = e9g0Var.m;
            this.label = 1;
            e = bVar.e(str, str2, str3, this);
            if (e == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            e = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        e9g0 e9g0Var2 = this.$currentState;
        Throwable a = Result.a(e);
        if (a == null) {
            jbg0 jbg0Var = (jbg0) e;
            if (jbg0Var instanceof gbg0) {
                gbg0 gbg0Var = (gbg0) jbg0Var;
                com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar3 = bVar2.f.a;
                if (qca1.c((h9g0) bVar3.X()) != null) {
                    pz40 Y = bVar3.Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                        g9g0Var3 = ((h9g0) value3).a;
                        if (g9g0Var3 instanceof f9g0) {
                            g9g0Var3 = e9g0.c(e9g0Var2, null, null, gbg0Var.b, 28671);
                        }
                    } while (!r0Var3.k(value3, new h9g0(g9g0Var3)));
                }
                ((AppAnalyticsReporter) bVar2.i.a).Y.D(QrPaymentEvents$QrSubscriptionLoadedVersion.CREDLIM, QrPaymentEvents$QrSubscriptionLoadedResult.TWO_FA, null);
                bVar2.f.a(gbg0Var.a, QrPaymentsSecondFactorScreenProvider$Request.SUBSCRIPTION);
            } else if (jbg0Var instanceof hbg0) {
                e9g0 e9g0Var3 = (e9g0) bVar2.e.a.getValue();
                if (e9g0Var3 != null) {
                    ((AppAnalyticsReporter) bVar2.i.a).Y.D(QrPaymentEvents$QrSubscriptionLoadedVersion.CREDLIM, QrPaymentEvents$QrSubscriptionLoadedResult.DENIED, null);
                    bVar2.c(SubscriptionStatus.FAILED, null);
                    bVar2.f.b(new dag0(e9g0Var3, 3));
                }
            } else {
                if (!(jbg0Var instanceof ibg0)) {
                    w511.b();
                    return null;
                }
                sag0 sag0Var = (sag0) ((ibg0) jbg0Var).a;
                int i2 = iag0.a[sag0Var.a.ordinal()];
                if (i2 == 1) {
                    com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar4 = bVar2.f.a;
                    if (qca1.c((h9g0) bVar4.X()) != null) {
                        pz40 Y2 = bVar4.Y();
                        do {
                            r0Var2 = (r0) Y2;
                            value2 = r0Var2.getValue();
                            g9g0Var2 = ((h9g0) value2).a;
                            if (g9g0Var2 instanceof f9g0) {
                                g9g0Var2 = e9g0.c(e9g0Var2, null, null, null, 28671);
                            }
                        } while (!r0Var2.k(value2, new h9g0(g9g0Var2)));
                    }
                } else if (i2 != 2 && i2 != 3 && i2 != 4) {
                    w511.b();
                    return null;
                }
                bVar2.b(sag0Var.a, sag0Var.b, null);
            }
        } else {
            x4c.g("Fail to get subscription widget status", a, null, Collections.singletonList(lrp0.x), 4);
            com.ybsdk.feature.qr.payments.internal.screens.presentation.b bVar5 = bVar2.f.a;
            if (qca1.c((h9g0) bVar5.X()) != null) {
                pz40 Y3 = bVar5.Y();
                do {
                    r0Var = (r0) Y3;
                    value = r0Var.getValue();
                    g9g0Var = ((h9g0) value).a;
                    if (g9g0Var instanceof f9g0) {
                        g9g0Var = e9g0.c(e9g0Var2, null, null, null, 28671);
                    }
                } while (!r0Var.k(value, new h9g0(g9g0Var)));
            }
            bVar2.b(SubscriptionStatus.FAILED, null, a);
        }
        return zy11.a;
    }
}
