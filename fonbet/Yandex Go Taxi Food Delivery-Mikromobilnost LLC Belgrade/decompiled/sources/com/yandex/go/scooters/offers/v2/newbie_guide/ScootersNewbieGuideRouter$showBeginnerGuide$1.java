package com.yandex.go.scooters.offers.v2.newbie_guide;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.offers.v2.newbie_guide.ScootersNewbieGuideRouter", f = "ScootersNewbieGuideRouter.kt", l = {56, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 59}, m = "showBeginnerGuide", v = 2)
/* loaded from: classes13.dex */
final class ScootersNewbieGuideRouter$showBeginnerGuide$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersNewbieGuideRouter$showBeginnerGuide$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.Q(this.this$0, null, this);
    }
}
