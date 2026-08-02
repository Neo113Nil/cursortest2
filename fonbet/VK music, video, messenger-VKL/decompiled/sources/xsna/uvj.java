package xsna;

import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: CoroutineMviTaskExecutor.kt */
/* loaded from: classes3.dex */
public abstract class uvj<State extends lm50, TaskId extends on50, InTask extends hn50<TaskId>, OutTask extends hn50<TaskId>, Patch extends yl50, Event extends pk50> extends dl50<State, TaskId, InTask, OutTask, bwj, Patch, Event> implements dwj {
    public final nk50 d;
    public final bpn0 e;
    public final hpj f;

    public uvj(nk50 nk50Var, nn50 nn50Var) {
        super(nn50Var);
        this.d = nk50Var;
        this.e = new bpn0(new ozf(this, 11));
        this.f = zvj.a(nk50Var.c());
    }

    @Override // xsna.dl50, xsna.uic
    public final void clear() {
        zvj.c(this.f, null);
    }

    @Override // xsna.dwj
    public final hpj getScope() {
        return this.f;
    }

    @Override // xsna.dwj
    public final cwj m(eyx eyxVar) {
        n().getClass();
        cwj cwjVar = new cwj(pn50.d(), eyxVar);
        eyxVar.E(new d05(13, this, cwjVar));
        return cwjVar;
    }

    @Override // xsna.dl50, xsna.mn50
    public final pn50<TaskId, InTask, bwj> n() {
        return (pn50) this.e.getValue();
    }

    public final wvj s(yok0 yok0Var) {
        n().getClass();
        wvj wvjVar = new wvj(pn50.d(), yok0Var);
        yok0Var.E(new he3(16, this, wvjVar));
        return wvjVar;
    }
}
