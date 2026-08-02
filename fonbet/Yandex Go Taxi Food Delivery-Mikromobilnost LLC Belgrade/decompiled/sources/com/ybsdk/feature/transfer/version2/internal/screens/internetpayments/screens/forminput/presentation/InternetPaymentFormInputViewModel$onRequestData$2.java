package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult;
import com.ybsdk.core.utils.dto.common.FailDataException;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.etw;
import defpackage.ftw;
import defpackage.g8e;
import defpackage.l0p;
import defpackage.lrp0;
import defpackage.m04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.tse;
import defpackage.u8j0;
import defpackage.w511;
import defpackage.wls;
import defpackage.wsw;
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
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.InternetPaymentFormInputViewModel$onRequestData$2", f = "InternetPaymentFormInputViewModel.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InternetPaymentFormInputViewModel$onRequestData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetPaymentFormInputViewModel$onRequestData$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InternetPaymentFormInputViewModel$onRequestData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InternetPaymentFormInputViewModel$onRequestData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        u8j0 s8j0Var;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.data.a aVar = bVar.C;
            String str = ((etw) bVar.X()).c;
            this.label = 1;
            a = aVar.a(str, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        b bVar2 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            Object obj2 = (dqg) a;
            if (obj2 instanceof bqg) {
                m04 m04Var = bVar2.G;
                m04Var.a.E.b(InternetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult.ERROR, ((bqg) obj2).a);
                s8j0Var = new s8j0(new FailDataException((ct11) obj2));
            } else {
                if (!(obj2 instanceof cqg)) {
                    w511.b();
                    return null;
                }
                wsw wswVar = (wsw) ((cqg) obj2).a;
                m04 m04Var2 = bVar2.G;
                String name = wswVar.a.getName();
                AppAnalyticsReporter appAnalyticsReporter = m04Var2.a;
                appAnalyticsReporter.E.b(InternetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult.OK, null);
                l0p l0pVar = appAnalyticsReporter.E;
                l0pVar.a.a("payment.internet_tv.providers_account_screen_shown", g8e.w(1, "provider", name));
                s8j0Var = new r8j0(new ftw(wswVar.a, wswVar.b, wswVar.c), null, 14);
            }
        } else {
            x4c.g("Can't load InternetPaymentFormInputFragment", a2, null, Collections.singletonList(lrp0.n), 4);
            m04 m04Var3 = bVar2.G;
            m04Var3.a.E.b(InternetServicesEvents$PaymentInternetTvProvidersAccountScreenLoadedResult.ERROR, a2.getMessage());
            s8j0Var = new s8j0(a2);
        }
        u8j0 u8j0Var = s8j0Var;
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, etw.a((etw) value, u8j0Var, null, null, false, 30)));
        return zy11.a;
    }
}
