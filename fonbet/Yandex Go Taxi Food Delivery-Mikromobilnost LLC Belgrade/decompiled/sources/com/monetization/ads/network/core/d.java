package com.monetization.ads.network.core;

import defpackage.km81;
import yads.jk3;

/* loaded from: classes7.dex */
public final class d implements Runnable {
    public final Request b;
    public final km81 c;
    public final a d;

    public d(Request request, km81 km81Var, a aVar) {
        this.b = request;
        this.c = km81Var;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b.isCanceled()) {
            this.b.finish("canceled-at-delivery");
            return;
        }
        km81 km81Var = this.c;
        jk3 jk3Var = km81Var.c;
        Request request = this.b;
        if (jk3Var == null) {
            request.deliverResponse(km81Var.a);
        } else {
            request.deliverError(jk3Var);
        }
        boolean z = this.c.d;
        Request request2 = this.b;
        if (z) {
            request2.addMarker("intermediate-response");
        } else {
            request2.finish("done");
        }
        a aVar = this.d;
        if (aVar != null) {
            aVar.run();
        }
    }
}
