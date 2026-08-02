package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.epx;

/* loaded from: classes7.dex */
public final class s implements h {
    public static final Handler g = new Handler(Looper.getMainLooper());
    public static final String h = UcumUtils.UCUM_SECONDS;
    public final e a;
    public final Executor b;
    public final n c;
    public long f = Long.MAX_VALUE;
    public final CopyOnWriteArrayList d = new CopyOnWriteArrayList();
    public final r e = new r(new WeakReference(this));

    public s(e eVar, com.vungle.ads.internal.executor.j jVar, i iVar) {
        this.a = eVar;
        this.b = jVar;
        this.c = iVar;
    }

    public final synchronized void a(f fVar) {
        try {
            f a = fVar.a();
            if (a != null) {
                String d = a.d();
                long b = a.b();
                a.g();
                if (a.f()) {
                    Iterator it = this.d.iterator();
                    while (it.hasNext()) {
                        q qVar = (q) it.next();
                        f a2 = qVar.a();
                        if (epx.f(a2 != null ? a2.d() : null, d)) {
                            boolean z = u.a;
                            t.a(h, "replacing pending job with new " + d);
                            this.d.remove(qVar);
                        }
                    }
                }
                this.d.add(new q(SystemClock.uptimeMillis() + b, a));
                a();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a() {
        try {
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator it = this.d.iterator();
            long j = Long.MAX_VALUE;
            while (it.hasNext()) {
                q qVar = (q) it.next();
                long j2 = qVar.a;
                if (uptimeMillis >= j2) {
                    this.d.remove(qVar);
                    f fVar = qVar.b;
                    if (fVar != null) {
                        this.b.execute(new g(fVar, this.a, this, this.c));
                    }
                } else {
                    j = Math.min(j, j2);
                }
            }
            if (j != Long.MAX_VALUE && j != this.f) {
                Handler handler = g;
                handler.removeCallbacks(this.e);
                handler.postAtTime(this.e, h, j);
            }
            this.f = j;
        } catch (Throwable th) {
            throw th;
        }
    }
}
