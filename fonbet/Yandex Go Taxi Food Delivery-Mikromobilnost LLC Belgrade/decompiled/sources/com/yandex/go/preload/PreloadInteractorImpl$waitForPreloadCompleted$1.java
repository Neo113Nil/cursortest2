package com.yandex.go.preload;

import defpackage.mvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preload.PreloadInteractorImpl", f = "PreloadInteractorImpl.kt", l = {58}, m = "waitForPreloadCompleted", v = 2)
/* loaded from: classes13.dex */
final class PreloadInteractorImpl$waitForPreloadCompleted$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadInteractorImpl$waitForPreloadCompleted$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.c(this);
        return zy11.a;
    }
}
