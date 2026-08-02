package com.monetization.ads.network.core;

import defpackage.zs71;

/* loaded from: classes7.dex */
public final class g implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Request d;

    public g(Request request, String str, long j) {
        this.d = request;
        this.b = str;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zs71 zs71Var;
        zs71 zs71Var2;
        zs71Var = this.d.mEventLog;
        zs71Var.a();
        Request request = this.d;
        zs71Var2 = request.mEventLog;
        request.toString();
        zs71Var2.b();
    }
}
