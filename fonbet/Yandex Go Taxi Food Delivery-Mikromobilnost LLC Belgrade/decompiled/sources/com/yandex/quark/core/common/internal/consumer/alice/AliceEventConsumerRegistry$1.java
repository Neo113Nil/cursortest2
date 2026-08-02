package com.yandex.quark.core.common.internal.consumer.alice;

import defpackage.gs1;
import defpackage.hs1;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class AliceEventConsumerRegistry$1 extends FunctionReferenceImpl implements wls {
    public static final AliceEventConsumerRegistry$1 b = new AliceEventConsumerRegistry$1(2, 0, hs1.class, "consumeAliceEvent", "consumeAliceEvent(Lcom/yandex/quark/contracts/internal/alice/AliceEvent;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((hs1) obj).b((gs1) obj2);
        return zy11.a;
    }
}
