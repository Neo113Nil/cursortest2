package defpackage;

import androidx.concurrent.futures.b;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes10.dex */
public class jqs implements euy {
    public final euy a;
    public b b;

    public jqs() {
        this.a = jx81.r(new mum(this));
    }

    public static jqs a(euy euyVar) {
        return euyVar instanceof jqs ? (jqs) euyVar : new jqs(euyVar);
    }

    @Override // defpackage.euy
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.a.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }

    public jqs(euy euyVar) {
        euyVar.getClass();
        this.a = euyVar;
    }
}
