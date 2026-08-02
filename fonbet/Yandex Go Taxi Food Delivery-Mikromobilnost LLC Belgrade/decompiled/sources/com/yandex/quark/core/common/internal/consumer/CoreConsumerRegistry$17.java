package com.yandex.quark.core.common.internal.consumer;

import defpackage.eya0;
import defpackage.fya0;
import defpackage.wls;
import defpackage.xc41;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class CoreConsumerRegistry$17 extends FunctionReferenceImpl implements wls {
    public static final CoreConsumerRegistry$17 b = new CoreConsumerRegistry$17(2, 0, fya0.class, "setPermissionChecker", "setPermissionChecker(Lcom/yandex/quark/permissions/PermissionChecker;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ((xc41) ((fya0) obj)).B.z.b = (eya0) obj2;
        return zy11.a;
    }
}
