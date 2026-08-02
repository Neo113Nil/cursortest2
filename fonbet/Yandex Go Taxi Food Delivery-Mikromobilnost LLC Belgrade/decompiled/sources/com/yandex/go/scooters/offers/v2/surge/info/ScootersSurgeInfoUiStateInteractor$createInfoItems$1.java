package com.yandex.go.scooters.offers.v2.surge.info;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.surge.info.ScootersSurgeInfoUiStateInteractor", f = "ScootersSurgeInfoUiStateInteractor.kt", l = {47}, m = "createInfoItems", v = 2)
/* loaded from: classes13.dex */
final class ScootersSurgeInfoUiStateInteractor$createInfoItems$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSurgeInfoUiStateInteractor$createInfoItems$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return i.a(this.this$0, null, this);
    }
}
