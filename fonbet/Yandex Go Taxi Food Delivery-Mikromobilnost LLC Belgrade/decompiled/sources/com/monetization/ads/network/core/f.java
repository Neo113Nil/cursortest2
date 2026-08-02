package com.monetization.ads.network.core;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import defpackage.ew71;
import defpackage.gb81;
import defpackage.km81;
import defpackage.pw71;
import defpackage.uv81;
import java.util.concurrent.PriorityBlockingQueue;
import yads.jk3;

/* loaded from: classes7.dex */
public final class f extends Thread {
    public final PriorityBlockingQueue b;
    public final pw71 c;
    public final uv81 d;
    public final e e;
    public volatile boolean f = false;

    public f(PriorityBlockingQueue priorityBlockingQueue, pw71 pw71Var, uv81 uv81Var, e eVar) {
        this.b = priorityBlockingQueue;
        this.c = pw71Var;
        this.d = uv81Var;
        this.e = eVar;
    }

    private void a() throws InterruptedException {
        Request request = (Request) this.b.take();
        SystemClock.elapsedRealtime();
        request.sendEvent(3);
        try {
            try {
                request.addMarker("network-queue-take");
                if (request.isCanceled()) {
                    request.finish("network-discard-cancelled");
                    request.notifyListenerResponseNotUsable();
                } else {
                    TrafficStats.setThreadStatsTag(request.getTrafficStatsTag());
                    gb81 a = this.c.a(request);
                    request.addMarker("network-http-complete");
                    if (a.e && request.hasHadResponseDelivered()) {
                        request.finish("not-modified");
                        request.notifyListenerResponseNotUsable();
                    } else {
                        km81 parseNetworkResponse = request.parseNetworkResponse(a);
                        request.addMarker("network-parse-complete");
                        if (request.shouldCache() && parseNetworkResponse.b != null) {
                            this.d.a(request.getCacheKey(), parseNetworkResponse.b);
                            request.addMarker("network-cache-written");
                        }
                        request.markDelivered();
                        this.e.a(request, parseNetworkResponse, null);
                        request.notifyListenerResponseReceived(parseNetworkResponse);
                    }
                }
            } catch (jk3 e) {
                SystemClock.elapsedRealtime();
                jk3 parseNetworkError = request.parseNetworkError(e);
                e eVar = this.e;
                eVar.getClass();
                request.addMarker("post-error");
                km81 km81Var = new km81(parseNetworkError);
                c cVar = eVar.a;
                cVar.a.post(new d(request, km81Var, null));
                request.notifyListenerResponseNotUsable();
            } catch (Exception e2) {
                boolean z = ew71.a;
                jk3 jk3Var = new jk3(e2);
                SystemClock.elapsedRealtime();
                e eVar2 = this.e;
                eVar2.getClass();
                request.addMarker("post-error");
                km81 km81Var2 = new km81(jk3Var);
                c cVar2 = eVar2.a;
                cVar2.a.post(new d(request, km81Var2, null));
                request.notifyListenerResponseNotUsable();
            }
            request.sendEvent(4);
        } catch (Throwable th) {
            request.sendEvent(4);
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                boolean z = ew71.a;
            } catch (Throwable unused2) {
                boolean z2 = ew71.a;
                return;
            }
        }
    }
}
