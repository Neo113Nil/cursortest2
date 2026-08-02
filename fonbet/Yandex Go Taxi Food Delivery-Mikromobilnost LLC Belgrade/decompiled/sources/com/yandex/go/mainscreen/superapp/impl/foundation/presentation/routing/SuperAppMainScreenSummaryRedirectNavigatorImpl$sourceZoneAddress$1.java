package com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.routing.SuperAppMainScreenSummaryRedirectNavigatorImpl", f = "SuperAppMainScreenSummaryRedirectNavigatorImpl.kt", l = {233, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC, 246}, m = "sourceZoneAddress", v = 2)
/* loaded from: classes12.dex */
final class SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenSummaryRedirectNavigatorImpl$sourceZoneAddress$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.c(this.this$0, this);
    }
}
