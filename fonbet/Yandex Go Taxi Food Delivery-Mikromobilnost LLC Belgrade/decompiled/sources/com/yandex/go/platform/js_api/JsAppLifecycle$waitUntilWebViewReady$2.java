package com.yandex.go.platform.js_api;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "it"}, k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "com.yandex.go.platform.js_api.JsAppLifecycle$waitUntilWebViewReady$2", f = "JsAppLifecycle.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes13.dex */
final class JsAppLifecycle$waitUntilWebViewReady$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        JsAppLifecycle$waitUntilWebViewReady$2 jsAppLifecycle$waitUntilWebViewReady$2 = new JsAppLifecycle$waitUntilWebViewReady$2(2, continuation);
        jsAppLifecycle$waitUntilWebViewReady$2.Z$0 = ((Boolean) obj).booleanValue();
        return jsAppLifecycle$waitUntilWebViewReady$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((JsAppLifecycle$waitUntilWebViewReady$2) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(this.Z$0);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
