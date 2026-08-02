package com.yandex.go.scooters.qr.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.qr.ui.ScootersQrPresenter", f = "ScootersQrPresenter.kt", l = {119, 120}, m = "prepareManualEnterViews", v = 2)
/* loaded from: classes13.dex */
final class ScootersQrPresenter$prepareManualEnterViews$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersQrPresenter$prepareManualEnterViews$1(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return e.Lg(this.this$0, this);
    }
}
