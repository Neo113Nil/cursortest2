package com.yandex.go.taxi.tariffs.internal.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.tariffs.internal.interactor.UpdateTariffsInteractor", f = "UpdateTariffsInteractor.kt", l = {53, 59, 62, 66}, m = "handleNewTariffs", v = 2)
/* loaded from: classes8.dex */
final class UpdateTariffsInteractor$handleNewTariffs$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTariffsInteractor$handleNewTariffs$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, null, null, false, this);
    }
}
