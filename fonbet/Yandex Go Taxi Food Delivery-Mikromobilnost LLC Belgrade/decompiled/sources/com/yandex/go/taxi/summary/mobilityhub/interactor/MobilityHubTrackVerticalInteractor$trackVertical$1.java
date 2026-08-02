package com.yandex.go.taxi.summary.mobilityhub.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.mobilityhub.interactor.MobilityHubTrackVerticalInteractor", f = "MobilityHubTrackVerticalInteractor.kt", l = {17, 27}, m = "trackVertical", v = 2)
/* loaded from: classes14.dex */
final class MobilityHubTrackVerticalInteractor$trackVertical$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobilityHubTrackVerticalInteractor$trackVertical$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
