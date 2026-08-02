package com.yandex.quark.core.common.internal.consumer;

import defpackage.apc;
import defpackage.wls;
import defpackage.xc41;
import defpackage.zoc;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class CoreConsumerRegistry$1 extends FunctionReferenceImpl implements wls {
    public static final CoreConsumerRegistry$1 b = new CoreConsumerRegistry$1(2, 0, apc.class, "setCommonQuarkConfig", "setCommonQuarkConfig(Lcom/yandex/quark/contracts/internal/config/CommonQuarkConfig;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((xc41) ((apc) obj)).x.a = (zoc) obj2;
        return zy11.a;
    }
}
