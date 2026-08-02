package com.yandex.go.user_profile.fullscreen.presentation;

import defpackage.k52;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lk52;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi$decodeAnalyticsEvent$2", f = "UserProfileJsNativeApi.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi$decodeAnalyticsEvent$2 extends SuspendLambda implements wls {
    final /* synthetic */ String[] $params;
    int label;
    final /* synthetic */ UserProfileJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileJsNativeApi$decodeAnalyticsEvent$2(UserProfileJsNativeApi userProfileJsNativeApi, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.this$0 = userProfileJsNativeApi;
        this.$params = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UserProfileJsNativeApi$decodeAnalyticsEvent$2(this.this$0, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserProfileJsNativeApi$decodeAnalyticsEvent$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Object deserialize;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        try {
            deserialize = this.this$0.deserialize(this.$params[0], k52.Companion.serializer());
            failure = (k52) deserialize;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            failure = new Result.Failure(e2);
        }
        return new Result(failure);
    }
}
