package com.yandex.go.payments.shared.family.web.nativeapi;

import defpackage.evu0;
import defpackage.k52;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wls;
import defpackage.xab1;
import defpackage.z9p;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.web.nativeapi.FamilyJsNativeApi$sendAnalyticsEvent$1", f = "FamilyJsNativeApi.kt", l = {HProv.PP_REBOOT}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class FamilyJsNativeApi$sendAnalyticsEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ FamilyJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyJsNativeApi$sendAnalyticsEvent$1(FamilyJsNativeApi familyJsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = familyJsNativeApi;
        this.$promiseId = str;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FamilyJsNativeApi$sendAnalyticsEvent$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyJsNativeApi$sendAnalyticsEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FamilyJsNativeApi familyJsNativeApi;
        String str;
        tt2 tt2Var;
        String str2;
        FamilyJsNativeApi familyJsNativeApi2;
        String message;
        z9p z9pVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                b.b(obj);
                familyJsNativeApi = this.this$0;
                String str3 = this.$promiseId;
                String[] strArr = this.$params;
                try {
                    tt2Var = familyJsNativeApi.appDispatchers;
                    tt2Var.getClass();
                    sjh sjhVar = uyj.a;
                    FamilyJsNativeApi$sendAnalyticsEvent$1$1$analyticsEvent$1 familyJsNativeApi$sendAnalyticsEvent$1$1$analyticsEvent$1 = new FamilyJsNativeApi$sendAnalyticsEvent$1$1$analyticsEvent$1(familyJsNativeApi, null, strArr);
                    this.L$0 = familyJsNativeApi;
                    this.L$1 = str3;
                    this.L$2 = familyJsNativeApi;
                    this.L$3 = str3;
                    this.label = 1;
                    Object k0 = tje.k0(sjhVar, familyJsNativeApi$sendAnalyticsEvent$1$1$analyticsEvent$1, this);
                    if (k0 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str = str3;
                    str2 = str;
                    obj = k0;
                    familyJsNativeApi2 = familyJsNativeApi;
                } catch (Throwable th) {
                    th = th;
                    str = str3;
                    message = th.getMessage();
                    if (message != null || evu0.J(message)) {
                        message = "Exception found";
                    }
                    familyJsNativeApi.postScriptEvaluation(xab1.c(str, message));
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.L$3;
                familyJsNativeApi = (FamilyJsNativeApi) this.L$2;
                str2 = (String) this.L$1;
                familyJsNativeApi2 = (FamilyJsNativeApi) this.L$0;
                try {
                    b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    message = th.getMessage();
                    if (message != null) {
                    }
                    message = "Exception found";
                    familyJsNativeApi.postScriptEvaluation(xab1.c(str, message));
                    return zy11.a;
                }
            }
            z9pVar = familyJsNativeApi2.familyAccountAnalytics;
            ((j) z9pVar.b).u((k52) obj);
            familyJsNativeApi2.callbackResult(str2);
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
