package com.monetization.ads.network.core;

import defpackage.et81;
import defpackage.ew71;
import defpackage.km81;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.PriorityBlockingQueue;

/* loaded from: classes7.dex */
public final class j implements h {
    public final HashMap a = new HashMap();
    public final e b;
    public final b c;
    public final PriorityBlockingQueue d;

    public j(b bVar, PriorityBlockingQueue priorityBlockingQueue, e eVar) {
        this.b = eVar;
        this.c = bVar;
        this.d = priorityBlockingQueue;
    }

    public final void a(Request request, km81 km81Var) {
        List list;
        et81 et81Var = km81Var.b;
        if (et81Var != null) {
            if (et81Var.e >= System.currentTimeMillis()) {
                String cacheKey = request.getCacheKey();
                synchronized (this) {
                    list = (List) this.a.remove(cacheKey);
                }
                if (list != null) {
                    if (ew71.a) {
                        list.size();
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        this.b.a((Request) it.next(), km81Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(request);
    }

    public final synchronized void b(Request request) {
        PriorityBlockingQueue priorityBlockingQueue;
        try {
            String cacheKey = request.getCacheKey();
            List list = (List) this.a.remove(cacheKey);
            if (list != null && !list.isEmpty()) {
                if (ew71.a) {
                    list.size();
                }
                Request request2 = (Request) list.remove(0);
                this.a.put(cacheKey, list);
                request2.setNetworkRequestCompleteListener(this);
                if (this.c != null && (priorityBlockingQueue = this.d) != null) {
                    try {
                        priorityBlockingQueue.put(request2);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        b bVar = this.c;
                        bVar.f = true;
                        bVar.interrupt();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean a(Request request) {
        try {
            String cacheKey = request.getCacheKey();
            boolean containsKey = this.a.containsKey(cacheKey);
            HashMap hashMap = this.a;
            if (containsKey) {
                List list = (List) hashMap.get(cacheKey);
                if (list == null) {
                    list = new ArrayList();
                }
                request.addMarker("waiting-for-response");
                list.add(request);
                this.a.put(cacheKey, list);
                boolean z = ew71.a;
                return true;
            }
            hashMap.put(cacheKey, null);
            request.setNetworkRequestCompleteListener(this);
            boolean z2 = ew71.a;
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }
}
