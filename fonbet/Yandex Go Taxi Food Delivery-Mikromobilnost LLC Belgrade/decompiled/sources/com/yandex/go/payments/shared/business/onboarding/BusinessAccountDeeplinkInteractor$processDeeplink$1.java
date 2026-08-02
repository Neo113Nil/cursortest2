package com.yandex.go.payments.shared.business.onboarding;

import android.net.Uri;
import com.yandex.go.payments.shared.business.BusinessAccountFlowExperiment;
import com.yandex.go.sharedpayments.api.model.SharedAccountScreen;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.jst;
import defpackage.mvg;
import defpackage.nw6;
import defpackage.ny61;
import defpackage.pmr0;
import defpackage.pw6;
import defpackage.scc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.t;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.business.onboarding.BusinessAccountDeeplinkInteractor$processDeeplink$1", f = "BusinessAccountDeeplinkInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 58}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class BusinessAccountDeeplinkInteractor$processDeeplink$1 extends SuspendLambda implements wls {
    final /* synthetic */ nw6 $businessAccountDeeplinkCallback;
    final /* synthetic */ Consumer<Uri> $oldSharedAccountCallback;
    final /* synthetic */ Uri $uri;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BusinessAccountDeeplinkInteractor$processDeeplink$1(a aVar, Uri uri, nw6 nw6Var, Consumer consumer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$uri = uri;
        this.$businessAccountDeeplinkCallback = nw6Var;
        this.$oldSharedAccountCallback = consumer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BusinessAccountDeeplinkInteractor$processDeeplink$1(this.this$0, this.$uri, this.$businessAccountDeeplinkCallback, this.$oldSharedAccountCallback, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BusinessAccountDeeplinkInteractor$processDeeplink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x006f, code lost:
    
        if (r11 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0071, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x003a, code lost:
    
        if (r11 == r0) goto L23;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            t T = e.T(this.this$0.a.d.a.a(), 1);
            this.label = 1;
            obj = e.y(T, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    return zy11Var;
                }
                a aVar = this.this$0;
                Uri uri = this.$uri;
                String str = aVar.f;
                Uri.Builder path = new Uri.Builder().scheme(aVar.d).path("coopaccount");
                String str2 = aVar.g;
                Uri.Builder appendQueryParameter = path.appendQueryParameter(str2, "business");
                SharedAccountScreen.Companion.getClass();
                int i2 = pw6.a[pmr0.a(uri).ordinal()];
                if (i2 == 1) {
                    appendQueryParameter.appendQueryParameter(str, "payment_method");
                } else if (i2 == 2) {
                    appendQueryParameter.appendQueryParameter(str, "report");
                }
                List g = scc.g(str2, str);
                try {
                    Set<String> queryParameterNames = uri.getQueryParameterNames();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : queryParameterNames) {
                        if (!g.contains((String) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        String str3 = (String) it.next();
                        appendQueryParameter.appendQueryParameter(str3, uri.getQueryParameter(str3));
                    }
                } catch (Throwable unused) {
                }
                Uri build = appendQueryParameter.build();
                if (build == null) {
                    build = Uri.parse(aVar.e);
                }
                this.$oldSharedAccountCallback.accept(build);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        BusinessAccountFlowExperiment businessAccountFlowExperiment = (BusinessAccountFlowExperiment) obj;
        businessAccountFlowExperiment.getClass();
        boolean z = businessAccountFlowExperiment != BusinessAccountFlowExperiment.p;
        a aVar2 = this.this$0;
        if (!z) {
            aVar2.b.getClass();
            xby.l(jst.e, "B2B.TOKEN_ERROR:VALIDATE_BUSINESS_ACCOUNT_EXPERIMENT", null, new IllegalArgumentException(), "Experiment is not exists", 2);
            return zy11Var;
        }
        Uri uri2 = this.$uri;
        nw6 nw6Var = this.$businessAccountDeeplinkCallback;
        this.L$0 = null;
        this.label = 2;
        obj = a.a(aVar2, uri2, nw6Var, this);
    }
}
