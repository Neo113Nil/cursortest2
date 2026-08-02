package xsna;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import one.video.calls.sdk_private.ap$a;
import one.video.calls.sdk_private.bI;
import one.video.calls.sdk_private.bJ;
import one.video.calls.sdk_private.by;

/* compiled from: FlowControl.java */
/* loaded from: classes8.dex */
public final class vjy0 {
    public final bI a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public long f;
    public int k;
    public final ConcurrentHashMap j = new ConcurrentHashMap();
    public long g = 0;
    public final HashMap h = new HashMap();
    public final HashMap i = new HashMap();

    public vjy0(bI bIVar, long j, long j2, long j3, long j4, sp spVar) {
        this.a = bIVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = j;
    }

    public final long a(sdy0 sdy0Var) {
        int c = sdy0Var.c();
        long longValue = ((Long) this.h.get(Integer.valueOf(c))).longValue() - ((Long) this.i.get(Integer.valueOf(c))).longValue();
        long j = this.f - this.g;
        return longValue > j ? j : longValue;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0082, code lost:
    
        if ((r0 % 2) == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(one.video.calls.sdk_private.d dVar) throws bJ {
        synchronized (this) {
            try {
                int i = dVar.b;
                long j = dVar.c;
                boolean z = true;
                if (this.h.containsKey(Integer.valueOf(i))) {
                    if (j > ((Long) this.h.get(Integer.valueOf(i))).longValue()) {
                        if (((Long) this.i.get(Integer.valueOf(i))).longValue() != ((Long) this.h.get(Integer.valueOf(i))).longValue() || this.g == this.f) {
                            z = false;
                        }
                        this.h.put(Integer.valueOf(i), Long.valueOf(j));
                        if (z) {
                            ((wjy0) this.j.get(Integer.valueOf(i))).c();
                        }
                    }
                } else if (this.a == bI.a) {
                    if (i % 2 == 0) {
                        if (i > this.k) {
                            throw new bJ(ap$a.STREAM_STATE_ERROR);
                        }
                    }
                }
            } finally {
            }
        }
    }

    public final synchronized void c(final one.video.calls.sdk_private.u uVar) {
        try {
            if (this.a == bI.b) {
                throw new by();
            }
            long j = uVar.c;
            if (j > this.b && j > this.f) {
                this.f = j;
            }
            if (uVar.d > this.c) {
                this.h.entrySet().stream().filter(new h0y0(1)).forEach(new Consumer() { // from class: xsna.qjy0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        vjy0 vjy0Var = vjy0.this;
                        vjy0Var.getClass();
                        one.video.calls.sdk_private.u uVar2 = uVar;
                        if (uVar2.d > ((Long) entry.getValue()).longValue()) {
                            vjy0Var.h.put((Integer) entry.getKey(), Long.valueOf(uVar2.d));
                        }
                    }
                });
            }
            if (uVar.e > this.d) {
                this.h.entrySet().stream().filter(new rjy0()).forEach(new Consumer() { // from class: xsna.sjy0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        vjy0 vjy0Var = vjy0.this;
                        vjy0Var.getClass();
                        one.video.calls.sdk_private.u uVar2 = uVar;
                        if (uVar2.e > ((Long) entry.getValue()).longValue()) {
                            vjy0Var.h.put((Integer) entry.getKey(), Long.valueOf(uVar2.e));
                        }
                    }
                });
            }
            if (uVar.f > this.e) {
                this.h.entrySet().stream().filter(new cip0(1)).forEach(new Consumer() { // from class: xsna.tjy0
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        vjy0 vjy0Var = vjy0.this;
                        vjy0Var.getClass();
                        one.video.calls.sdk_private.u uVar2 = uVar;
                        if (uVar2.f > ((Long) entry.getValue()).longValue()) {
                            vjy0Var.h.put((Integer) entry.getKey(), Long.valueOf(uVar2.f));
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
