package com.yandex.go.user_profile.fullscreen.presentation;

import defpackage.ag41;
import defpackage.evu0;
import defpackage.fti0;
import defpackage.jf41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xab1;
import defpackage.xf41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi$forceUpdate$1", f = "UserProfileJsNativeApi.kt", l = {109}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi$forceUpdate$1 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ UserProfileJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileJsNativeApi$forceUpdate$1(UserProfileJsNativeApi userProfileJsNativeApi, String str, Continuation continuation, String[] strArr) {
        super(2, continuation);
        this.this$0 = userProfileJsNativeApi;
        this.$params = strArr;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileJsNativeApi$forceUpdate$1(this.this$0, this.$promiseId, continuation, this.$params);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileJsNativeApi$forceUpdate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m210decodeReloadParamsgIAlus;
        xf41 xf41Var;
        xf41 xf41Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            UserProfileJsNativeApi userProfileJsNativeApi = this.this$0;
            String[] strArr = this.$params;
            this.label = 1;
            m210decodeReloadParamsgIAlus = userProfileJsNativeApi.m210decodeReloadParamsgIAlus(strArr, this);
            if (m210decodeReloadParamsgIAlus == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            m210decodeReloadParamsgIAlus = ((Result) obj).getValue();
        }
        if (!(m210decodeReloadParamsgIAlus instanceof Result.Failure)) {
            m210decodeReloadParamsgIAlus = ((fti0) m210decodeReloadParamsgIAlus).a;
        }
        UserProfileJsNativeApi userProfileJsNativeApi2 = this.this$0;
        String str = this.$promiseId;
        if (!(m210decodeReloadParamsgIAlus instanceof Result.Failure)) {
            String str2 = (String) m210decodeReloadParamsgIAlus;
            if (str2 != null) {
                xf41Var2 = userProfileJsNativeApi2.webViewNotifier;
                ((ag41) xf41Var2).d(str2);
            } else {
                xf41Var = userProfileJsNativeApi2.webViewNotifier;
                ((ag41) xf41Var).a.g(jf41.d);
            }
            userProfileJsNativeApi2.callbackResult(str);
        }
        UserProfileJsNativeApi userProfileJsNativeApi3 = this.this$0;
        String str3 = this.$promiseId;
        Throwable a = Result.a(m210decodeReloadParamsgIAlus);
        if (a != null) {
            String message = a.getMessage();
            if (message == null || evu0.J(message)) {
                message = "Web view force update failed";
            }
            userProfileJsNativeApi3.postScriptEvaluation(xab1.c(str3, message));
        }
        return zy11.a;
    }
}
