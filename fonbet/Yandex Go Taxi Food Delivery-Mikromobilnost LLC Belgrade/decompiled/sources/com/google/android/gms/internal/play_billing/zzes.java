package com.google.android.gms.internal.play_billing;

import defpackage.g8e;
import defpackage.oyr;
import defpackage.ql91;
import defpackage.uj;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
abstract class zzes extends AtomicReference implements Runnable {
    public static final uj a;
    public static final uj b;

    static {
        int i = 28;
        a = new uj(i);
        b = new uj(i);
    }

    public abstract Object a();

    public abstract String b();

    public final void c(Thread thread) {
        Runnable runnable = (Runnable) get();
        zzep zzepVar = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof zzep;
            uj ujVar = b;
            if (!z2) {
                if (runnable != ujVar) {
                    break;
                }
            } else {
                zzepVar = (zzep) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == ujVar || compareAndSet(runnable, ujVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(zzepVar);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object a2;
        Thread currentThread = Thread.currentThread();
        if (compareAndSet(null, currentThread)) {
            zzfg zzfgVar = (zzfg) this;
            boolean isDone = zzfgVar.zza.isDone();
            uj ujVar = a;
            if (isDone) {
                a2 = null;
            } else {
                try {
                    a2 = a();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(currentThread, ujVar)) {
                            c(currentThread);
                        }
                        zzfgVar.zza.e(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(currentThread, ujVar)) {
                            c(currentThread);
                        }
                        i iVar = zzfgVar.zza;
                        iVar.getClass();
                        if (ql91.y.k(iVar, null, ql91.z)) {
                            ql91.h(iVar);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(currentThread, ujVar)) {
                c(currentThread);
            }
            if (isDone) {
                return;
            }
            i iVar2 = zzfgVar.zza;
            iVar2.getClass();
            if (a2 == null) {
                a2 = ql91.z;
            }
            if (ql91.y.k(iVar2, null, a2)) {
                ql91.h(iVar2);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        Runnable runnable = (Runnable) get();
        return g8e.p(runnable == a ? "running=[DONE]" : runnable instanceof zzep ? "running=[INTERRUPTED]" : runnable instanceof Thread ? oyr.p("running=[RUNNING ON ", ((Thread) runnable).getName(), "]") : "running=[NOT STARTED YET]", Extension.FIX_SPACE, b());
    }
}
