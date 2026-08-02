package com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation;

import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.MobileServicesEvents$PaymentMobileServicesProvidersLoadedResult;
import com.ybsdk.core.utils.dto.common.FailDataException;
import com.ybsdk.feature.transfer.version2.api.entities.paymentmethodssheet.PaymentProviderEntity;
import defpackage.bqg;
import defpackage.cqg;
import defpackage.ct11;
import defpackage.dqg;
import defpackage.g8e;
import defpackage.gu20;
import defpackage.lrp0;
import defpackage.m04;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pz40;
import defpackage.qq7;
import defpackage.r8j0;
import defpackage.s8j0;
import defpackage.scc;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.x4c;
import defpackage.zt20;
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
@mvg(c = "com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.presentation.MobileProvidersListViewModel$onRequestData$2", f = "MobileProvidersListViewModel.kt", l = {49}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MobileProvidersListViewModel$onRequestData$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileProvidersListViewModel$onRequestData$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MobileProvidersListViewModel$onRequestData$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MobileProvidersListViewModel$onRequestData$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
            a aVar = this.this$0;
            com.ybsdk.feature.transfer.version2.internal.screens.mobilepayments.screens.providers.data.a aVar2 = aVar.C;
            String phone = aVar.B.getPhone();
            this.label = 1;
            a = aVar2.a(phone, this);
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
        a aVar3 = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 == null) {
            Object obj2 = (dqg) a;
            if (obj2 instanceof bqg) {
                m04 m04Var = aVar3.E;
                m04Var.a.L.g(MobileServicesEvents$PaymentMobileServicesProvidersLoadedResult.ERROR, ((bqg) obj2).a);
                s8j0Var = new s8j0(new FailDataException((ct11) obj2));
            } else {
                if (!(obj2 instanceof cqg)) {
                    w511.b();
                    return null;
                }
                zt20 zt20Var = (zt20) ((cqg) obj2).a;
                ArrayList m0 = kotlin.collections.a.m0(zt20Var.b, scc.h(zt20Var.a));
                AppAnalyticsReporter appAnalyticsReporter = aVar3.E.a;
                appAnalyticsReporter.L.g(MobileServicesEvents$PaymentMobileServicesProvidersLoadedResult.OK, null);
                qq7 qq7Var = appAnalyticsReporter.L;
                JSONArray jSONArray = new JSONArray();
                Iterator it = m0.iterator();
                while (it.hasNext()) {
                    jSONArray.put(((PaymentProviderEntity) it.next()).getName());
                }
                qq7Var.a.a("payment.mobile_services.providers_shown", g8e.w(1, "providers", jSONArray.toString()));
                s8j0Var = new r8j0(new gu20(m0, "", zt20Var.c), null, 14);
            }
        } else {
            x4c.g("Can't load MobileProvidersListFragment", a2, null, Collections.singletonList(lrp0.r), 4);
            m04 m04Var2 = aVar3.E;
            m04Var2.a.L.g(MobileServicesEvents$PaymentMobileServicesProvidersLoadedResult.ERROR, a2.getMessage());
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
