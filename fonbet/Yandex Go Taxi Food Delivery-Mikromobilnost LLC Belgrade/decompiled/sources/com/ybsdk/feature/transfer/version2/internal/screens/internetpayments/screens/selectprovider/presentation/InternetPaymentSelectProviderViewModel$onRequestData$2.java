package com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.InternetServicesEvents$PaymentInternetTvProvidersLoadedResult;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.domain.InternetProviderWithPersonalAccountEntity;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.duw;
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
import defpackage.utw;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import org.json.JSONArray;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderViewModel$onRequestData$2", f = "InternetPaymentSelectProviderViewModel.kt", l = {52}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class InternetPaymentSelectProviderViewModel$onRequestData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternetPaymentSelectProviderViewModel$onRequestData$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InternetPaymentSelectProviderViewModel$onRequestData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((InternetPaymentSelectProviderViewModel$onRequestData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        Object s8j0Var;
        r0 r0Var;
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.data.a aVar = this.this$0.C;
            this.label = 1;
            a = aVar.a(this);
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
        b bVar = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            Object obj2 = (dqg) a;
            if (obj2 instanceof bqg) {
                m04 m04Var = bVar.G;
                m04Var.a.E.c(InternetServicesEvents$PaymentInternetTvProvidersLoadedResult.ERROR, ((bqg) obj2).a);
                s8j0Var = new s8j0(new FailDataException((ct11) obj2));
            } else {
                if (!(obj2 instanceof cqg)) {
                    w511.b();
                    return null;
                }
                duw duwVar = (duw) ((cqg) obj2).a;
                m04 m04Var2 = bVar.G;
                ArrayList arrayList = duwVar.a;
                AppAnalyticsReporter appAnalyticsReporter = m04Var2.a;
                appAnalyticsReporter.E.c(InternetServicesEvents$PaymentInternetTvProvidersLoadedResult.OK, null);
                l0p l0pVar = appAnalyticsReporter.E;
                JSONArray jSONArray = new JSONArray();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((InternetProviderWithPersonalAccountEntity) it.next()).getProvider().getName());
                }
                l0pVar.a.a("payment.internet_tv.providers_shown", g8e.w(1, "providers", jSONArray.toString()));
                s8j0Var = new r8j0(new utw(duwVar.a, "", duwVar.b), null, 14);
            }
        } else {
            x4c.g("Can't load InternetPaymentSelectProviderFragment", a2, null, Collections.singletonList(lrp0.n), 4);
            m04 m04Var3 = bVar.G;
            m04Var3.a.E.c(InternetServicesEvents$PaymentInternetTvProvidersLoadedResult.ERROR, a2.getMessage());
            s8j0Var = new s8j0(a2);
        }
        pz40 Y = this.this$0.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, s8j0Var));
        return zy11.a;
    }
}
