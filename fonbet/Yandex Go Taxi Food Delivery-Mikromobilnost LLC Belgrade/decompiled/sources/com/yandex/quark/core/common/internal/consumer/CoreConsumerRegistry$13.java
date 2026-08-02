package com.yandex.quark.core.common.internal.consumer;

import defpackage.ib20;
import defpackage.wls;
import defpackage.xa20;
import defpackage.xc41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class CoreConsumerRegistry$13 extends FunctionReferenceImpl implements wls {
    public static final CoreConsumerRegistry$13 b = new CoreConsumerRegistry$13(2, 0, ib20.class, "setMetrica", "setMetrica(Lcom/yandex/quark/analytics/Metrica;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((xc41) ((ib20) obj)).o((xa20) obj2);
        return zy11.a;
    }
}
