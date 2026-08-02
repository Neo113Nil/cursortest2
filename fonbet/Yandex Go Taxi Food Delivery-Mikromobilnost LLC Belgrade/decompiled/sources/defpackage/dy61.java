package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.network.core.Request;
import com.monetization.ads.network.core.b;
import com.monetization.ads.network.core.e;
import com.monetization.ads.network.core.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class dy61 {
    public final AtomicInteger a;
    public final HashSet b;
    public final PriorityBlockingQueue c;
    public final PriorityBlockingQueue d;
    public final uv81 e;
    public final pw71 f;
    public final e g;
    public final f[] h;
    public b i;
    public final ArrayList j;
    public final ArrayList k;

    public dy61(uv81 uv81Var, pw71 pw71Var, int i) {
        e eVar = new e(new Handler(Looper.getMainLooper()));
        this.a = new AtomicInteger();
        this.b = new HashSet();
        this.c = new PriorityBlockingQueue();
        this.d = new PriorityBlockingQueue();
        this.j = new ArrayList();
        this.k = new ArrayList();
        this.e = uv81Var;
        this.f = pw71Var;
        this.h = new f[i];
        this.g = eVar;
    }

    public final void a() {
        b bVar = this.i;
        if (bVar != null) {
            bVar.f = true;
            bVar.interrupt();
        }
        for (f fVar : this.h) {
            if (fVar != null) {
                fVar.f = true;
                fVar.interrupt();
            }
        }
        b bVar2 = new b(this.c, this.d, this.e, this.g);
        this.i = bVar2;
        bVar2.start();
        for (int i = 0; i < this.h.length; i++) {
            f fVar2 = new f(this.d, this.f, this.e, this.g);
            this.h[i] = fVar2;
            fVar2.start();
        }
    }

    public final void b(Request request) {
        request.setRequestQueue(this);
        synchronized (this.b) {
            this.b.add(request);
        }
        request.setSequence(this.a.incrementAndGet());
        request.addMarker("add-to-queue");
        c(request, 0);
        if (request.shouldCache()) {
            this.c.add(request);
        } else {
            this.d.add(request);
        }
    }

    public final void c(Request request, int i) {
        bj81 bj81Var;
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((k981) it.next()).getClass();
                    aj61 aj61Var = request instanceof aj61 ? (aj61) request : null;
                    if (aj61Var != null && i == 3 && (bj81Var = aj61Var.c) != null) {
                        bj81Var.u();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
