package com.yandex.go.overdraft.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.overdraft.ui.OverdraftStateBarControllerImpl", f = "OverdraftStateBarControllerImpl.kt", l = {258}, m = "createPaymentGeoContext", v = 2)
/* loaded from: classes13.dex */
final class OverdraftStateBarControllerImpl$createPaymentGeoContext$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftStateBarControllerImpl$createPaymentGeoContext$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.h(this.this$0, this);
    }
}
