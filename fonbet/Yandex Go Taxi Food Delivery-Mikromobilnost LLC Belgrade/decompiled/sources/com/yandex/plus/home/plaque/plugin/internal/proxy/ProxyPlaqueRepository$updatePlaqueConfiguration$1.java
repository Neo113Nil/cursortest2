package com.yandex.plus.home.plaque.plugin.internal.proxy;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.home.plaque.plugin.internal.proxy.ProxyPlaqueRepository", f = "ProxyPlaqueRepository.kt", l = {29, 29}, m = "updatePlaqueConfiguration")
/* loaded from: classes8.dex */
final class ProxyPlaqueRepository$updatePlaqueConfiguration$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProxyPlaqueRepository$updatePlaqueConfiguration$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.d(0, 0, this);
    }
}
