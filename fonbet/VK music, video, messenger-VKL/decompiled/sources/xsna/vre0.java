package xsna;

import java.util.concurrent.CountDownLatch;
import xsna.cse0;

/* compiled from: QueueSyncManager.kt */
/* loaded from: classes.dex */
public interface vre0 {
    static /* synthetic */ io.reactivex.rxjava3.core.q a(vre0 vre0Var, dre0 dre0Var, k6k k6kVar, int i) {
        if ((i & 4) != 0) {
            k6kVar = null;
        }
        return vre0Var.d(dre0Var, k6kVar, new z7w(19));
    }

    static /* synthetic */ sq9 e(vre0 vre0Var, dre0 dre0Var, String str, gzs gzsVar, izs izsVar, yam yamVar, izs izsVar2, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            gzsVar = null;
        }
        if ((i & 32) != 0) {
            yamVar = null;
        }
        if ((i & 64) != 0) {
            izsVar2 = null;
        }
        return vre0Var.c(dre0Var, str, gzsVar, izsVar, yamVar, izsVar2);
    }

    CountDownLatch b();

    cse0.a c(dre0 dre0Var, Object obj, gzs gzsVar, izs izsVar, gzs gzsVar2, izs izsVar2);

    io.reactivex.rxjava3.internal.operators.observable.q d(dre0 dre0Var, gzs gzsVar, z7w z7wVar);

    CountDownLatch f(String str);
}
