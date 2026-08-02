package com.yandex.go.user_profile.fullscreen.presentation;

import defpackage.bs21;
import defpackage.evu0;
import defpackage.k52;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xab1;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.analytics.j;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi$sendAnalyticsEvent$1", f = "UserProfileJsNativeApi.kt", l = {HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi$sendAnalyticsEvent$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ UserProfileJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileJsNativeApi$sendAnalyticsEvent$1(UserProfileJsNativeApi userProfileJsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = userProfileJsNativeApi;
        this.$params = strArr;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileJsNativeApi$sendAnalyticsEvent$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileJsNativeApi$sendAnalyticsEvent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m209decodeAnalyticsEventgIAlus;
        bs21 bs21Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            UserProfileJsNativeApi userProfileJsNativeApi = this.this$0;
            String[] strArr = this.$params;
            this.label = 1;
            m209decodeAnalyticsEventgIAlus = userProfileJsNativeApi.m209decodeAnalyticsEventgIAlus(strArr, this);
            if (m209decodeAnalyticsEventgIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            m209decodeAnalyticsEventgIAlus = ((Result) obj).getValue();
        }
        UserProfileJsNativeApi userProfileJsNativeApi2 = this.this$0;
        String str = this.$promiseId;
        if (!(m209decodeAnalyticsEventgIAlus instanceof Result.Failure)) {
            bs21Var = userProfileJsNativeApi2.userProfileAnalytics;
            ((j) bs21Var.a).u((k52) m209decodeAnalyticsEventgIAlus);
            userProfileJsNativeApi2.callbackResult(str);
        }
        UserProfileJsNativeApi userProfileJsNativeApi3 = this.this$0;
        String str2 = this.$promiseId;
        Throwable a = Result.a(m209decodeAnalyticsEventgIAlus);
        if (a != null) {
            String message = a.getMessage();
            if (message == null || evu0.J(message)) {
                message = "Send analytics event failed";
            }
            userProfileJsNativeApi3.postScriptEvaluation(xab1.c(str2, message));
        }
        return zy11.a;
    }
}
