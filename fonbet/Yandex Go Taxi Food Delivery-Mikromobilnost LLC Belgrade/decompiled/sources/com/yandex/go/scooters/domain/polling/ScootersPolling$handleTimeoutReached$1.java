package com.yandex.go.scooters.domain.polling;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.domain.polling.ScootersPolling", f = "ScootersPollingInteractorImpl.kt", l = {PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC}, m = "handleTimeoutReached", v = 2)
/* loaded from: classes13.dex */
final class ScootersPolling$handleTimeoutReached$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPolling$handleTimeoutReached$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(this);
    }
}
