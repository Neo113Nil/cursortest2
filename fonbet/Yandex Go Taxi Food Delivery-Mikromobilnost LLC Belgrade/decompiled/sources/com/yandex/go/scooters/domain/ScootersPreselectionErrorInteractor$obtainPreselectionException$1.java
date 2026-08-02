package com.yandex.go.scooters.domain;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.domain.ScootersPreselectionErrorInteractor", f = "ScootersPreselectionErrorInteractor.kt", l = {42}, m = "obtainPreselectionException", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreselectionErrorInteractor$obtainPreselectionException$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreselectionErrorInteractor$obtainPreselectionException$1(z zVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return z.a(this.this$0, this);
    }
}
