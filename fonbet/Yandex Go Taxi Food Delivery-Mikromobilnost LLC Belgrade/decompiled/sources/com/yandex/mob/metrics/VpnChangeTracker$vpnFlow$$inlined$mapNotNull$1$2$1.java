package com.yandex.mob.metrics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.metrics.VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2", f = "VpnChangeTracker.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE, 60, 66}, m = "emit")
/* loaded from: classes8.dex */
public final class VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VpnChangeTracker$vpnFlow$$inlined$mapNotNull$1$2$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
