package com.yandex.messaging.sync;

import com.yandex.messaging.profile.d;
import defpackage.ct21;
import defpackage.e1k;
import defpackage.pf4;

/* loaded from: classes15.dex */
public final class b implements e1k {
    public pf4 a;
    public ct21 b;

    public b(d dVar) {
        this.a = new pf4(dVar.a, dVar, new CrossProfileOnlineSubscription$profileSubscription$1(1, this, b.class, "onDefaultProfile", "onDefaultProfile(Lcom/yandex/messaging/profile/MessengerProfileComponent;)V", 0));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ct21 ct21Var = this.b;
        if (ct21Var != null) {
            ct21Var.close();
        }
        this.b = null;
        pf4 pf4Var = this.a;
        if (pf4Var != null) {
            pf4Var.close();
        }
        this.a = null;
    }
}
