package com.yandex.quark.core.common.internal.consumer;

import defpackage.cr6;
import defpackage.wj21;
import defpackage.wls;
import defpackage.xc41;
import defpackage.xj21;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
final /* synthetic */ class CoreConsumerRegistry$20 extends FunctionReferenceImpl implements wls {
    public static final CoreConsumerRegistry$20 b = new CoreConsumerRegistry$20(2, 0, xj21.class, "setUserAgentSetter", "setUserAgentSetter(Lcom/yandex/quark/contracts/internal/useragent/UserAgentSetter;)V");

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        wj21 wj21Var = (wj21) obj2;
        cr6 cr6Var = ((xc41) ((xj21) obj)).B.H;
        synchronized (cr6Var) {
            try {
                cr6Var.b = wj21Var;
                String str = cr6Var.a;
                if (str != null) {
                    wj21Var.a(str);
                }
                cr6Var.a = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zy11.a;
    }
}
