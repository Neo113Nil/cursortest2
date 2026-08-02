package com.yandex.mob.data;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.mob.data.MobContourProvisionMemoryStorage$invokeFlow-QLjEy4I$$inlined$map$1$2", f = "MobContourProvisionMemoryStorage.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SAFETY_TIPS_VALUE, 50}, m = "emit")
/* renamed from: com.yandex.mob.data.MobContourProvisionMemoryStorage$invokeFlow-QLjEy4I$$inlined$map$1$2$1, reason: invalid class name */
/* loaded from: classes8.dex */
public final class MobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1 extends ContinuationImpl {
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
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobContourProvisionMemoryStorage$invokeFlowQLjEy4I$$inlined$map$1$2$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
