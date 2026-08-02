package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.core.v;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.internal.operators.flowable.c;
import java.util.Queue;
import xsna.axm0;

/* compiled from: QueueDrainHelper.java */
/* loaded from: classes8.dex */
public final class i {
    public static boolean a(boolean z, boolean z2, v vVar, io.reactivex.rxjava3.internal.queue.a aVar, io.reactivex.rxjava3.disposables.c cVar, io.reactivex.rxjava3.internal.observers.i iVar) {
        if (iVar.e) {
            aVar.clear();
            cVar.dispose();
            return true;
        }
        if (!z || !z2) {
            return false;
        }
        if (cVar != null) {
            cVar.dispose();
        }
        vVar.onComplete();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        r1 = r7.b.addAndGet(-r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r1 != 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(io.reactivex.rxjava3.internal.queue.a aVar, io.reactivex.rxjava3.observers.e eVar, io.reactivex.rxjava3.disposables.c cVar, io.reactivex.rxjava3.internal.observers.i iVar) {
        int i = 1;
        while (true) {
            io.reactivex.rxjava3.internal.queue.a aVar2 = aVar;
            io.reactivex.rxjava3.observers.e eVar2 = eVar;
            io.reactivex.rxjava3.disposables.c cVar2 = cVar;
            io.reactivex.rxjava3.internal.observers.i iVar2 = iVar;
            if (a(iVar.f, aVar.isEmpty(), eVar2, aVar2, cVar2, iVar2)) {
                return;
            }
            while (true) {
                boolean z = iVar2.f;
                Object poll = aVar2.poll();
                boolean z2 = poll == null;
                boolean z3 = z2;
                if (a(z, z2, eVar2, aVar2, cVar2, iVar2)) {
                    return;
                }
                if (z3) {
                    break;
                } else {
                    iVar2.a(eVar2, poll);
                }
            }
            eVar = eVar2;
            aVar = aVar2;
            cVar = cVar2;
            iVar = iVar2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r10 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001e, code lost:
    
        r10.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0021, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(io.reactivex.rxjava3.internal.queue.a aVar, io.reactivex.rxjava3.subscribers.a aVar2, io.reactivex.rxjava3.disposables.c cVar, io.reactivex.rxjava3.internal.subscribers.c cVar2) {
        int i = 1;
        while (true) {
            boolean z = cVar2.g;
            Object poll = aVar.poll();
            boolean z2 = poll == null;
            if (!cVar2.f) {
                if (z && z2) {
                    aVar2.onComplete();
                    break;
                }
                if (z2) {
                    i = cVar2.b.addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                } else {
                    long j = cVar2.c.get();
                    if (j == 0) {
                        aVar.clear();
                        if (cVar != null) {
                            cVar.dispose();
                        }
                        aVar2.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                        return;
                    }
                    cVar2.a(poll, aVar2);
                    if (j != Long.MAX_VALUE) {
                        cVar2.c.addAndGet(-1L);
                    }
                }
            } else {
                aVar.clear();
                break;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0033, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean d(long j, axm0 axm0Var, Queue queue, c.b bVar, c.b bVar2) {
        boolean z;
        boolean z2;
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                try {
                    z = bVar2.d();
                } catch (Throwable th) {
                    io.reactivex.rxjava3.exceptions.a.b(th);
                    z = true;
                }
                if (z) {
                    break;
                }
                Object poll = queue.poll();
                if (poll == null) {
                    axm0Var.onComplete();
                    return true;
                }
                axm0Var.onNext(poll);
                j2++;
            } else {
                try {
                    z2 = bVar2.d();
                } catch (Throwable th2) {
                    io.reactivex.rxjava3.exceptions.a.b(th2);
                    z2 = true;
                }
                if (z2) {
                    break;
                }
                if (queue.isEmpty()) {
                    axm0Var.onComplete();
                    return true;
                }
                j = bVar.get();
                if (j == j2) {
                    long addAndGet = bVar.addAndGet(-(j2 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & addAndGet) == 0) {
                        return false;
                    }
                    j2 = addAndGet & Long.MIN_VALUE;
                    j = addAndGet;
                } else {
                    continue;
                }
            }
        }
    }
}
