package xsna;

import com.vk.dto.common.id.UserId;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import xsna.yre0;

/* compiled from: QueueSyncManagerHolderImpl.kt */
/* loaded from: classes.dex */
public final class zre0 implements yre0 {
    public final vdw0 a;
    public final qd5 b;

    public zre0(ese0 ese0Var, mui0 mui0Var) {
        this.a = new vdw0(ese0Var);
        this.b = new qd5(ese0Var, mui0Var);
    }

    @Override // xsna.yre0
    public final ure0 a(yre0.a.b bVar) {
        if (bVar != null) {
            return this.a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.yre0
    public final vre0 b(yre0.a aVar) {
        cse0 cse0Var;
        if (!(aVar instanceof yre0.a.b)) {
            if (!(aVar instanceof yre0.a.C4133a)) {
                throw new NoWhenBranchMatchedException();
            }
            qd5 qd5Var = this.b;
            yre0.a.C4133a c4133a = (yre0.a.C4133a) aVar;
            ConcurrentHashMap<UserId, vre0> concurrentHashMap = qd5Var.c;
            UserId invoke = c4133a.a().invoke();
            vre0 vre0Var = concurrentHashMap.get(invoke);
            if (vre0Var == null) {
                gzs<UserId> a = c4133a.a();
                ese0 ese0Var = qd5Var.a;
                cse0 cse0Var2 = new cse0(a, ese0Var.b, ese0Var.c, ese0Var.d, ese0Var.e, new ca(qd5Var, 8));
                vre0 putIfAbsent = concurrentHashMap.putIfAbsent(invoke, cse0Var2);
                vre0Var = putIfAbsent == null ? cse0Var2 : putIfAbsent;
            }
            return vre0Var;
        }
        vdw0 vdw0Var = this.a;
        yre0.a.b bVar = (yre0.a.b) aVar;
        synchronized (vdw0Var) {
            cse0Var = vdw0Var.b;
            if (cse0Var == null) {
                gzs<UserId> b = bVar.b();
                gzs<String> a2 = bVar.a();
                ese0 ese0Var2 = vdw0Var.a;
                j55 j55Var = ese0Var2.b;
                ExecutorService executorService = ese0Var2.c;
                wuj wujVar = ese0Var2.d;
                gzs<dox> gzsVar = ese0Var2.e;
                tdw0 tdw0Var = new tdw0(b, a2, j55Var, executorService, vdw0Var.c);
                cse0 cse0Var3 = new cse0(b, j55Var, executorService, wujVar, gzsVar, bse0.c);
                cse0Var3.h = tdw0Var;
                vdw0Var.b = cse0Var3;
                cse0Var = cse0Var3;
            }
        }
        return cse0Var;
    }
}
