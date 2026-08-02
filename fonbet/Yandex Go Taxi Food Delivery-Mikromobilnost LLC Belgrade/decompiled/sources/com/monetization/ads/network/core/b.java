package com.monetization.ads.network.core;

import android.os.Process;
import defpackage.et81;
import defpackage.ew71;
import defpackage.gb81;
import defpackage.km81;
import defpackage.uv81;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes7.dex */
public final class b extends Thread {
    public static final boolean h = ew71.a;
    public final PriorityBlockingQueue b;
    public final PriorityBlockingQueue c;
    public final uv81 d;
    public final e e;
    public volatile boolean f = false;
    public final j g;

    public b(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, uv81 uv81Var, e eVar) {
        this.b = priorityBlockingQueue;
        this.c = priorityBlockingQueue2;
        this.d = uv81Var;
        this.e = eVar;
        this.g = new j(this, priorityBlockingQueue2, eVar);
    }

    private void a() throws InterruptedException {
        Request request = (Request) this.b.take();
        request.addMarker("cache-queue-take");
        request.sendEvent(1);
        try {
            if (request.isCanceled()) {
                request.finish("cache-discard-canceled");
            } else {
                et81 et81Var = this.d.get(request.getCacheKey());
                if (et81Var == null) {
                    request.addMarker("cache-miss");
                    if (!this.g.a(request)) {
                        this.c.put(request);
                    }
                } else {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (et81Var.e < currentTimeMillis) {
                        request.addMarker("cache-hit-expired");
                        request.setCacheEntry(et81Var);
                        if (!this.g.a(request)) {
                            this.c.put(request);
                        }
                    } else {
                        request.addMarker("cache-hit");
                        km81 parseNetworkResponse = request.parseNetworkResponse(new gb81(200, et81Var.a, et81Var.g, false));
                        request.addMarker("cache-hit-parsed");
                        if (parseNetworkResponse.c != null) {
                            request.addMarker("cache-parsing-failed");
                            this.d.a(request.getCacheKey());
                            request.setCacheEntry(null);
                            if (!this.g.a(request)) {
                                this.c.put(request);
                            }
                        } else if (et81Var.f < currentTimeMillis) {
                            request.addMarker("cache-hit-refresh-needed");
                            request.setCacheEntry(et81Var);
                            parseNetworkResponse.d = true;
                            boolean a = this.g.a(request);
                            e eVar = this.e;
                            if (a) {
                                eVar.a(request, parseNetworkResponse, null);
                            } else {
                                eVar.a(request, parseNetworkResponse, new a(this, request));
                            }
                        } else {
                            this.e.a(request, parseNetworkResponse, null);
                        }
                    }
                }
            }
            request.sendEvent(2);
        } catch (Throwable th) {
            request.sendEvent(2);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
            } catch (Throwable unused2) {
                return;
            }
        }
    }
}
