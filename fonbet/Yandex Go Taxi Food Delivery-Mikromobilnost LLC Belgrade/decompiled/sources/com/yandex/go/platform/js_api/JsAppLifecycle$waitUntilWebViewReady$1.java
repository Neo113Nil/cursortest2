package com.yandex.go.platform.js_api;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@mvg(c = "com.yandex.go.platform.js_api.JsAppLifecycle", f = "JsAppLifecycle.kt", l = {23}, m = "waitUntilWebViewReady")
/* loaded from: classes13.dex */
final class JsAppLifecycle$waitUntilWebViewReady$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsAppLifecycle$waitUntilWebViewReady$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
