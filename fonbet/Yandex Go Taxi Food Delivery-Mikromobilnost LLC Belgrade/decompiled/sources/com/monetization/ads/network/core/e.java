package com.monetization.ads.network.core;

import android.os.Handler;
import defpackage.km81;

/* loaded from: classes7.dex */
public final class e {
    public final c a;

    public e(Handler handler) {
        this.a = new c(handler);
    }

    public final void a(Request request, km81 km81Var, a aVar) {
        request.markDelivered();
        request.addMarker("post-response");
        c cVar = this.a;
        cVar.a.post(new d(request, km81Var, aVar));
    }
}
