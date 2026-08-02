package com.yandex.go.user_profile.fullscreen.presentation;

import defpackage.ag41;
import defpackage.cu41;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xf41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi$webViewReadyCallback$1", f = "UserProfileJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi$webViewReadyCallback$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $promiseId;
    int label;
    final /* synthetic */ UserProfileJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileJsNativeApi$webViewReadyCallback$1(UserProfileJsNativeApi userProfileJsNativeApi, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileJsNativeApi;
        this.$promiseId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileJsNativeApi$webViewReadyCallback$1(this.this$0, this.$promiseId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        UserProfileJsNativeApi$webViewReadyCallback$1 userProfileJsNativeApi$webViewReadyCallback$1 = (UserProfileJsNativeApi$webViewReadyCallback$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        userProfileJsNativeApi$webViewReadyCallback$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xf41 xf41Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        xf41Var = this.this$0.webViewNotifier;
        ((ag41) xf41Var).c(cu41.c);
        this.this$0.callbackResult(this.$promiseId);
        return zy11.a;
    }
}
