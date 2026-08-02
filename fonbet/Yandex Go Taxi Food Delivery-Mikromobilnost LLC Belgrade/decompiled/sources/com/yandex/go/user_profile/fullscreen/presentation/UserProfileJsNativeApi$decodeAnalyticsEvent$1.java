package com.yandex.go.user_profile.fullscreen.presentation;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.user_profile.fullscreen.presentation.UserProfileJsNativeApi", f = "UserProfileJsNativeApi.kt", l = {HProv.PP_DHOID}, m = "decodeAnalyticsEvent-gIAlu-s", v = 2)
/* loaded from: classes14.dex */
public final class UserProfileJsNativeApi$decodeAnalyticsEvent$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserProfileJsNativeApi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileJsNativeApi$decodeAnalyticsEvent$1(UserProfileJsNativeApi userProfileJsNativeApi, Continuation continuation) {
        super(continuation);
        this.this$0 = userProfileJsNativeApi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m209decodeAnalyticsEventgIAlus;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m209decodeAnalyticsEventgIAlus = this.this$0.m209decodeAnalyticsEventgIAlus(null, this);
        return m209decodeAnalyticsEventgIAlus == CoroutineSingletons.COROUTINE_SUSPENDED ? m209decodeAnalyticsEventgIAlus : new Result(m209decodeAnalyticsEventgIAlus);
    }
}
