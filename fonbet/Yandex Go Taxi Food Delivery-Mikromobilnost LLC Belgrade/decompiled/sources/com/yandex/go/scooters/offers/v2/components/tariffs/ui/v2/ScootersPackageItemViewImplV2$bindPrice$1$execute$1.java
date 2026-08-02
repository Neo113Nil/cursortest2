package com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2;

import defpackage.mvg;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.components.tariffs.ui.v2.ScootersPackageItemViewImplV2$bindPrice$1", f = "ScootersPackageItemViewImplV2.kt", l = {40}, m = "execute", v = 2)
/* loaded from: classes13.dex */
final class ScootersPackageItemViewImplV2$bindPrice$1$execute$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPackageItemViewImplV2$bindPrice$1$execute$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        this.this$0.a(this);
        return zy11.a;
    }
}
