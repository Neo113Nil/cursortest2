package com.yandex.go.chargers.passes.data;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.chargers.passes.data.ChargersPassesNotificationMapper", f = "ChargersPassesNotificationMapper.kt", l = {14}, m = PolicyMappingsExtension.MAP, v = 2)
/* loaded from: classes12.dex */
final class ChargersPassesNotificationMapper$map$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ m0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPassesNotificationMapper$map$1(m0 m0Var, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, this);
    }
}
