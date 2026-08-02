package com.yandex.go.scooters.qr.domain.result;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.qr.domain.result.ScootersScanResultHandlingInteractorFactory", f = "ScootersScanResultHandlingInteractorFactory.kt", l = {20, 21}, m = "create", v = 2)
/* loaded from: classes13.dex */
final class ScootersScanResultHandlingInteractorFactory$create$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersScanResultHandlingInteractorFactory$create$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(this);
    }
}
