package xsna;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.ub9;

/* compiled from: ListFuture.java */
/* loaded from: classes11.dex */
public final class rez implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ ugz c;
    public final /* synthetic */ sez d;

    public rez(sez sezVar, int i, ugz ugzVar) {
        this.d = sezVar;
        this.b = i;
        this.c = ugzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ub9.a aVar;
        ArrayList arrayList;
        int i = this.b;
        ugz ugzVar = this.c;
        sez sezVar = this.d;
        boolean z = sezVar.d;
        AtomicInteger atomicInteger = sezVar.e;
        ArrayList arrayList2 = sezVar.c;
        if (sezVar.isDone() || arrayList2 == null) {
            obr.f("Future was done before all dependencies completed", z);
            return;
        }
        try {
            try {
                try {
                    obr.f("Tried to set value from future which is not done", ugzVar.isDone());
                    arrayList2.set(i, r0t.c(ugzVar));
                    int decrementAndGet = atomicInteger.decrementAndGet();
                    obr.f("Less than 0 remaining futures", decrementAndGet >= 0);
                    if (decrementAndGet == 0) {
                        ArrayList arrayList3 = sezVar.c;
                        if (arrayList3 != null) {
                            sezVar.g.b(new ArrayList(arrayList3));
                        } else {
                            obr.f(null, sezVar.isDone());
                        }
                    }
                } catch (RuntimeException e) {
                    if (z) {
                        sezVar.g.d(e);
                    }
                    int decrementAndGet2 = atomicInteger.decrementAndGet();
                    obr.f("Less than 0 remaining futures", decrementAndGet2 >= 0);
                    if (decrementAndGet2 == 0) {
                        ArrayList arrayList4 = sezVar.c;
                        if (arrayList4 != null) {
                            aVar = sezVar.g;
                            arrayList = new ArrayList(arrayList4);
                            aVar.b(arrayList);
                            return;
                        }
                        obr.f(null, sezVar.isDone());
                    }
                } catch (ExecutionException e2) {
                    if (z) {
                        sezVar.g.d(e2.getCause());
                    }
                    int decrementAndGet3 = atomicInteger.decrementAndGet();
                    obr.f("Less than 0 remaining futures", decrementAndGet3 >= 0);
                    if (decrementAndGet3 == 0) {
                        ArrayList arrayList5 = sezVar.c;
                        if (arrayList5 != null) {
                            aVar = sezVar.g;
                            arrayList = new ArrayList(arrayList5);
                            aVar.b(arrayList);
                            return;
                        }
                        obr.f(null, sezVar.isDone());
                    }
                }
            } catch (Error e3) {
                sezVar.g.d(e3);
                int decrementAndGet4 = atomicInteger.decrementAndGet();
                obr.f("Less than 0 remaining futures", decrementAndGet4 >= 0);
                if (decrementAndGet4 == 0) {
                    ArrayList arrayList6 = sezVar.c;
                    if (arrayList6 != null) {
                        aVar = sezVar.g;
                        arrayList = new ArrayList(arrayList6);
                        aVar.b(arrayList);
                        return;
                    }
                    obr.f(null, sezVar.isDone());
                }
            } catch (CancellationException unused) {
                if (z) {
                    sezVar.cancel(false);
                }
                int decrementAndGet5 = atomicInteger.decrementAndGet();
                obr.f("Less than 0 remaining futures", decrementAndGet5 >= 0);
                if (decrementAndGet5 == 0) {
                    ArrayList arrayList7 = sezVar.c;
                    if (arrayList7 != null) {
                        aVar = sezVar.g;
                        arrayList = new ArrayList(arrayList7);
                        aVar.b(arrayList);
                        return;
                    }
                    obr.f(null, sezVar.isDone());
                }
            }
        } catch (Throwable th) {
            int decrementAndGet6 = atomicInteger.decrementAndGet();
            obr.f("Less than 0 remaining futures", decrementAndGet6 >= 0);
            if (decrementAndGet6 == 0) {
                ArrayList arrayList8 = sezVar.c;
                if (arrayList8 != null) {
                    sezVar.g.b(new ArrayList(arrayList8));
                } else {
                    obr.f(null, sezVar.isDone());
                }
            }
            throw th;
        }
    }
}
