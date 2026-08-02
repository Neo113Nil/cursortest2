package com.yandex.go.inapp_calls.ui.fullscreenintent;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.ui.fullscreenintent.RequestUseFullScreenIntentPresenter", f = "RequestUseFullScreenIntentPresenter.kt", l = {53}, m = "awaitOpenSettingsResult", v = 2)
/* loaded from: classes12.dex */
final class RequestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequestUseFullScreenIntentPresenter$awaitOpenSettingsResult$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.Kg(this.this$0, this);
    }
}
