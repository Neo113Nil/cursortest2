package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.ub9;

/* compiled from: ListFuture.java */
/* loaded from: classes11.dex */
public final class sez<V> implements ugz<List<V>> {

    @Nullable
    public ArrayList b;

    @Nullable
    public ArrayList c;
    public final boolean d;

    @NonNull
    public final AtomicInteger e;

    @NonNull
    public final ub9.d f;
    public ub9.a<List<V>> g;

    public sez(@NonNull ArrayList arrayList, boolean z, @NonNull mzm mzmVar) {
        this.b = arrayList;
        this.c = new ArrayList(arrayList.size());
        this.d = z;
        this.e = new AtomicInteger(arrayList.size());
        ub9.d a = ub9.a(new pez(this));
        this.f = a;
        a.addListener(new qez(this), xo9.g());
        if (this.b.isEmpty()) {
            this.g.b(new ArrayList(this.c));
            return;
        }
        for (int i = 0; i < this.b.size(); i++) {
            this.c.add(null);
        }
        ArrayList arrayList2 = this.b;
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            ugz ugzVar = (ugz) arrayList2.get(i2);
            ugzVar.addListener(new rez(this, i2, ugzVar), mzmVar);
        }
    }

    @Override // xsna.ugz
    public final void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
        this.f.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        ArrayList arrayList = this.b;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((ugz) it.next()).cancel(z);
            }
        }
        return this.f.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, @NonNull TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (List) this.f.c.get(j, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f.c.isDone();
    }

    @Override // java.util.concurrent.Future
    @Nullable
    public final Object get() throws ExecutionException, InterruptedException {
        ArrayList arrayList = this.b;
        if (arrayList != null && !isDone()) {
            Iterator it = arrayList.iterator();
            loop0: while (it.hasNext()) {
                ugz ugzVar = (ugz) it.next();
                while (!ugzVar.isDone()) {
                    try {
                        ugzVar.get();
                    } catch (Error e) {
                        throw e;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (Throwable unused) {
                        if (this.d) {
                            break loop0;
                        }
                    }
                }
            }
        }
        return (List) this.f.c.get();
    }
}
