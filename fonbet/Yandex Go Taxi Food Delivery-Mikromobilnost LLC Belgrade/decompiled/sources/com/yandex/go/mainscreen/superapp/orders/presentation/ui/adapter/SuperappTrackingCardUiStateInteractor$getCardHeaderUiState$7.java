package com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.video.m3.data.exception.network.NetworkRequestException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.mainscreen.superapp.orders.presentation.ui.adapter.SuperappTrackingCardUiStateInteractor", f = "SuperappTrackingCardUiStateInteractor.kt", l = {444, 447, NetworkRequestException.BANNED}, m = "getCardHeaderUiState", v = 2)
/* loaded from: classes12.dex */
final class SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$7 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappTrackingCardUiStateInteractor$getCardHeaderUiState$7(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.e(this.this$0, null, null, this);
    }
}
