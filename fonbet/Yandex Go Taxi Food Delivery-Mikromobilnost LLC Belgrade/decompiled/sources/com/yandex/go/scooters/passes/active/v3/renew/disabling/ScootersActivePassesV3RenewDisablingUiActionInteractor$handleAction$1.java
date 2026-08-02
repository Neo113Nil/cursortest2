package com.yandex.go.scooters.passes.active.v3.renew.disabling;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.active.v3.renew.disabling.ScootersActivePassesV3RenewDisablingUiActionInteractor", f = "ScootersActivePassesV3RenewDisablingUiActionInteractor.kt", l = {33, 40}, m = "handleAction", v = 2)
/* loaded from: classes13.dex */
final class ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersActivePassesV3RenewDisablingUiActionInteractor$handleAction$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, null, this);
    }
}
