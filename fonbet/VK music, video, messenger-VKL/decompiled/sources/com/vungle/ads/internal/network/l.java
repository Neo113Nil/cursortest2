package com.vungle.ads.internal.network;

import java.io.IOException;
import xsna.lb9;

/* loaded from: classes7.dex */
public final class l implements lb9 {
    public final /* synthetic */ m a;
    public final /* synthetic */ a b;

    public l(m mVar, a aVar) {
        this.a = mVar;
        this.b = aVar;
    }

    @Override // xsna.lb9
    public final void onFailure(okhttp3.d dVar, IOException iOException) {
        try {
            this.b.a(iOException);
        } catch (Throwable th) {
            h.a(th);
            boolean z = com.vungle.ads.internal.util.u.a;
            com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th);
        }
    }

    @Override // xsna.lb9
    public final void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
        o a;
        try {
            a = this.a.a(uVar);
            try {
                this.b.a(a);
            } catch (Throwable th) {
                h.a(th);
                boolean z = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass response to callback", th);
            }
        } catch (Throwable th2) {
            boolean z2 = com.vungle.ads.internal.util.u.a;
            StringBuilder a2 = com.iab.omid.library.vungle.internal.l.a("[enqueue] Failed to parse response: ");
            a2.append(th2.getLocalizedMessage());
            com.vungle.ads.internal.util.t.b("OkHttpCall", a2.toString());
            h.a(th2);
            try {
                this.b.a(th2);
            } catch (Throwable th3) {
                h.a(th3);
                boolean z3 = com.vungle.ads.internal.util.u.a;
                com.vungle.ads.internal.util.t.a("OkHttpCall", "Cannot pass failure to callback", th3);
            }
        }
    }
}
