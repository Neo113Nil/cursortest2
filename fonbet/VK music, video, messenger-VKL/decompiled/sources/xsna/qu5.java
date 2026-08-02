package xsna;

import java.util.concurrent.Executor;

/* loaded from: classes11.dex */
public final class qu5 {
    public static bpn0 a;

    public static final Executor a(ovj ovjVar) {
        Executor U;
        i3q i3qVar = ovjVar instanceof i3q ? (i3q) ovjVar : null;
        return (i3qVar == null || (U = i3qVar.U()) == null) ? new rcn(ovjVar) : U;
    }

    public static final ovj b(Executor executor) {
        ovj ovjVar;
        rcn rcnVar = executor instanceof rcn ? (rcn) executor : null;
        return (rcnVar == null || (ovjVar = rcnVar.b) == null) ? new j3q(executor) : ovjVar;
    }

    public static final o1b0 c() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (o1b0) bpn0Var.getValue();
    }
}
