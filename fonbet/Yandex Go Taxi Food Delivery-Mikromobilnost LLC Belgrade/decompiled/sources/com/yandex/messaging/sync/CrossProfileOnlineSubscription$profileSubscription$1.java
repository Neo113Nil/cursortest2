package com.yandex.messaging.sync;

import defpackage.ct21;
import defpackage.p8g;
import defpackage.s2u0;
import defpackage.tls;
import defpackage.v320;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class CrossProfileOnlineSubscription$profileSubscription$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        v320 v320Var = (v320) obj;
        b bVar = (b) this.receiver;
        ct21 ct21Var = bVar.b;
        if (ct21Var != null) {
            ct21Var.close();
        }
        bVar.b = new ct21(((p8g) v320Var).p(), new s2u0(5));
        return zy11.a;
    }
}
