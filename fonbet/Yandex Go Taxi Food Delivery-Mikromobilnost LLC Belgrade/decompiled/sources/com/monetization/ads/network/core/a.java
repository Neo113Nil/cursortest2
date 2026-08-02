package com.monetization.ads.network.core;

/* loaded from: classes7.dex */
public final class a implements Runnable {
    public final /* synthetic */ Request b;
    public final /* synthetic */ b c;

    public a(b bVar, Request request) {
        this.c = bVar;
        this.b = request;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.c.c.put(this.b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
