package com.yandex.go.multimodal_route.ui.transport_tracking;

import com.yandex.messaging.domain.poll.PollMessageDraft;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.multimodal_route.ui.transport_tracking.TransportTrackingCardUiActionInteractor", f = "TransportTrackingCardUiActionInteractor.kt", l = {119, 120, PollMessageDraft.MAX_ANSWER_LENGTH}, m = "handleAction", v = 2)
/* loaded from: classes12.dex */
final class TransportTrackingCardUiActionInteractor$handleAction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransportTrackingCardUiActionInteractor$handleAction$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, null, null, this);
    }
}
