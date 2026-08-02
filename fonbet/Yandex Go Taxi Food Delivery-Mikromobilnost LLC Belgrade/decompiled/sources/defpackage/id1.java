package defpackage;

import android.view.View;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class id1 implements ar31 {
    public final String a;
    public final wt31 b;
    public final iva0 c;
    public final ar31 d;
    public final fq31 e;
    public final AtomicInteger g;
    public final boolean i;
    public volatile int j;
    public final LinkedBlockingQueue f = new LinkedBlockingQueue();
    public final AtomicBoolean h = new AtomicBoolean(false);

    public id1(String str, wt31 wt31Var, iva0 iva0Var, ar31 ar31Var, fq31 fq31Var, int i) {
        this.a = str;
        this.b = wt31Var;
        this.c = iva0Var;
        this.d = ar31Var;
        this.e = fq31Var;
        this.g = new AtomicInteger(i);
        this.i = !r1.isEmpty();
        this.j = i;
        for (int i2 = 0; i2 < i; i2++) {
            this.e.a.b.offer(new bq31(this, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v4, types: [ar31] */
    /* JADX WARN: Type inference failed for: r2v5, types: [ar31] */
    /* JADX WARN: Type inference failed for: r2v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // defpackage.ar31
    public final View a() {
        Object obj;
        long nanoTime = System.nanoTime();
        Object poll = this.f.poll();
        long nanoTime2 = System.nanoTime() - nanoTime;
        if (poll == null) {
            long nanoTime3 = System.nanoTime();
            ?? r2 = this.d;
            try {
                this.e.a(this);
                View view = (View) this.f.poll(16L, TimeUnit.MILLISECONDS);
                if (view != null) {
                    this.g.decrementAndGet();
                    r2 = view;
                } else {
                    r2 = r2.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                r2 = r2.a();
            }
            long nanoTime4 = System.nanoTime() - nanoTime3;
            wt31 wt31Var = this.b;
            if (wt31Var != null) {
                String str = this.a;
                synchronized (wt31Var.a) {
                    wt31Var.a.c(nanoTime4, str);
                    wt31Var.b.a(wt31Var.c);
                }
            }
            iva0 iva0Var = this.c;
            this.f.size();
            iva0Var.getClass();
            obj = r2;
        } else {
            this.g.decrementAndGet();
            wt31 wt31Var2 = this.b;
            if (wt31Var2 != null) {
                synchronized (wt31Var2.a) {
                    wt31Var2.a.d(nanoTime2);
                    wt31Var2.b.a(wt31Var2.c);
                }
            }
            iva0 iva0Var2 = this.c;
            this.f.size();
            iva0Var2.getClass();
            obj = poll;
        }
        if (this.j > this.g.get()) {
            long nanoTime5 = System.nanoTime();
            this.e.a.b.offer(new bq31(this, this.f.size()));
            this.g.incrementAndGet();
            long nanoTime6 = System.nanoTime() - nanoTime5;
            wt31 wt31Var3 = this.b;
            if (wt31Var3 != null) {
                wt31Var3.a.e(nanoTime6);
                wt31Var3.b.a(wt31Var3.c);
            }
        }
        return (View) obj;
    }
}
