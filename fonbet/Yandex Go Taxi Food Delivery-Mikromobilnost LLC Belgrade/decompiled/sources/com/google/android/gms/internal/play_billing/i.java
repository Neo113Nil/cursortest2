package com.google.android.gms.internal.play_billing;

import defpackage.dl91;
import defpackage.dn91;
import defpackage.oyr;
import defpackage.uj;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes11.dex */
public final class i extends dn91 implements RunnableFuture {
    public volatile zzfg A;

    public i(Callable callable) {
        this.A = new zzfg(this, callable);
    }

    @Override // defpackage.ql91
    public final String a() {
        zzfg zzfgVar = this.A;
        return zzfgVar != null ? oyr.p("task=[", zzfgVar.toString(), "]") : super.a();
    }

    @Override // defpackage.ql91
    public final void b() {
        zzfg zzfgVar;
        Object obj = this.a;
        if ((obj instanceof dl91) && ((dl91) obj).a && (zzfgVar = this.A) != null) {
            uj ujVar = zzes.b;
            uj ujVar2 = zzes.a;
            Runnable runnable = (Runnable) zzfgVar.get();
            if (runnable instanceof Thread) {
                zzep zzepVar = new zzep(zzfgVar);
                zzepVar.setExclusiveOwnerThread(Thread.currentThread());
                if (zzfgVar.compareAndSet(runnable, zzepVar)) {
                    try {
                        Thread thread = (Thread) runnable;
                        thread.interrupt();
                        if (((Runnable) zzfgVar.getAndSet(ujVar2)) == ujVar) {
                            LockSupport.unpark(thread);
                        }
                    } catch (Throwable th) {
                        if (((Runnable) zzfgVar.getAndSet(ujVar2)) == ujVar) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th;
                    }
                }
            }
        }
        this.A = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        zzfg zzfgVar = this.A;
        if (zzfgVar != null) {
            zzfgVar.run();
        }
        this.A = null;
    }
}
