package xsna;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.BiConsumer;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class qhr implements BiConsumer {
    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        ArrayList arrayList = rhr.f;
        ReentrantLock reentrantLock = rhr.c;
        reentrantLock.lock();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((izs) it.next()).invoke(Boolean.TRUE);
            }
            arrayList.clear();
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
            rhr.d.signalAll();
            bpn0 bpn0Var = rhr.b;
            if (bpn0Var == null) {
                bpn0Var = null;
            }
            if (bpn0Var.isInitialized()) {
                bpn0 bpn0Var2 = rhr.b;
                ((ExecutorService) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).shutdown();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
