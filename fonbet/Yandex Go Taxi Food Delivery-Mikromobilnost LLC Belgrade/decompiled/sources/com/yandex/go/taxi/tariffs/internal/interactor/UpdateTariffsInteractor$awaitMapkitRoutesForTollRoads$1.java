package com.yandex.go.taxi.tariffs.internal.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.tariffs.internal.interactor.UpdateTariffsInteractor", f = "UpdateTariffsInteractor.kt", l = {111}, m = "awaitMapkitRoutesForTollRoads", v = 2)
/* loaded from: classes14.dex */
final class UpdateTariffsInteractor$awaitMapkitRoutesForTollRoads$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateTariffsInteractor$awaitMapkitRoutesForTollRoads$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
