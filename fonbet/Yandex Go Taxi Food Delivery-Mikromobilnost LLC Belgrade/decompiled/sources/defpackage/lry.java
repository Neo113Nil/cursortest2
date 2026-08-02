package defpackage;

import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class lry implements euy {
    public ArrayList a;
    public ArrayList b;
    public final boolean c;
    public final AtomicInteger w;
    public final gl7 x = jx81.r(new h2t(this));
    public b y;

    public lry(ArrayList arrayList, boolean z, zkj zkjVar) {
        this.a = arrayList;
        this.b = new ArrayList(arrayList.size());
        this.c = z;
        this.w = new AtomicInteger(arrayList.size());
        c(new i8m(22, this), geb1.b());
        if (this.a.isEmpty()) {
            this.y.b(new ArrayList(this.b));
            return;
        }
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(null);
        }
        ArrayList arrayList2 = this.a;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            euy euyVar = (euy) arrayList2.get(i2);
            euyVar.c(new xz(this, i2, euyVar, 4), zkjVar);
        }
    }

    @Override // defpackage.euy
    public final void c(Runnable runnable, Executor executor) {
        this.x.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.a;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((euy) it.next()).cancel(z);
            }
        }
        return this.x.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        ArrayList arrayList = this.a;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                euy euyVar = (euy) it.next();
                while (!euyVar.isDone()) {
                    try {
                        euyVar.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.c) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.x.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.x.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.x.b.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return (List) this.x.b.get(j, timeUnit);
    }
}
