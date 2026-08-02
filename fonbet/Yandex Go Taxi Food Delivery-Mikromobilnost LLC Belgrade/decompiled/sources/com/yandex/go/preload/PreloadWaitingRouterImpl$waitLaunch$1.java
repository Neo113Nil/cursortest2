package com.yandex.go.preload;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.preload.PreloadWaitingRouterImpl", f = "PreloadWaitingRouterImpl.kt", l = {47}, m = "waitLaunch", v = 2)
/* loaded from: classes13.dex */
final class PreloadWaitingRouterImpl$waitLaunch$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreloadWaitingRouterImpl$waitLaunch$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.P(this.this$0, this);
    }
}
