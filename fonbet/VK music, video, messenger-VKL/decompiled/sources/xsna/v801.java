package xsna;

import android.net.Uri;
import java.io.File;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: com.google.mlkit:common@@18.7.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class v801 implements b9i, h9r {
    public static final /* synthetic */ v801 b = new v801();

    public static final lq9 d(spj spjVar) {
        lq9 lq9Var;
        lq9 lq9Var2;
        if (!(spjVar instanceof mcn)) {
            return new lq9(1, spjVar);
        }
        mcn mcnVar = (mcn) spjVar;
        con0 con0Var = upj.b;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mcn.i;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(mcnVar);
            lq9Var = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(mcnVar, con0Var);
                lq9Var2 = null;
                break;
            }
            if (obj instanceof lq9) {
                while (!atomicReferenceFieldUpdater.compareAndSet(mcnVar, obj, con0Var)) {
                    if (atomicReferenceFieldUpdater.get(mcnVar) != obj) {
                        break;
                    }
                }
                lq9Var2 = (lq9) obj;
                break loop0;
            }
            if (obj != con0Var && !(obj instanceof Throwable)) {
                throw new IllegalStateException(rqi.c(obj, "Inconsistent state "));
            }
        }
        if (lq9Var2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = lq9.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(lq9Var2);
            if (!(obj2 instanceof b8i) || ((b8i) obj2).d == null) {
                lq9.g.set(lq9Var2, 536870911);
                atomicReferenceFieldUpdater2.set(lq9Var2, e80.b);
                lq9Var = lq9Var2;
            } else {
                lq9Var2.k();
            }
            if (lq9Var != null) {
                return lq9Var;
            }
        }
        return new lq9(2, spjVar);
    }

    @Override // xsna.h9r
    public File a(Uri uri, String str) {
        throw new UnsupportedOperationException("Not implemented");
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        qhc qhcVar = new qhc();
        final ReferenceQueue referenceQueue = qhcVar.a;
        final Set set = qhcVar.b;
        set.add(new d701(qhcVar, referenceQueue, set));
        Thread thread = new Thread(new Runnable() { // from class: xsna.ntz0
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        d701 d701Var = (d701) referenceQueue2.remove();
                        if (d701Var.a.remove(d701Var)) {
                            d701Var.clear();
                            d701Var.b.getClass();
                        }
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return qhcVar;
    }
}
