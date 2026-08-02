package xsna;

import xsna.lm50;
import xsna.on50;
import xsna.pk50;

/* compiled from: DefaultCoroutineMviInlineTaskExecutor.kt */
/* loaded from: classes3.dex */
public final class ddl<State extends lm50, TaskId extends on50, Event extends pk50> extends cl50<Object, Object, bwj, dwj, Object> implements dwj {
    public final bpn0 c;
    public final hpj d;

    public ddl(nn50 nn50Var) {
        super(nn50Var);
        this.c = new bpn0(new tvj(this, 0));
        this.d = zvj.a(hqu0.b());
    }

    @Override // xsna.cl50, xsna.uic
    public final void clear() {
        zvj.c(this.d, null);
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return (bwj) ((ll50) hn50Var).a(this);
    }

    @Override // xsna.dwj
    public final hpj getScope() {
        return this.d;
    }

    @Override // xsna.dwj
    public final cwj m(eyx eyxVar) {
        n().getClass();
        cwj cwjVar = new cwj(pn50.d(), eyxVar);
        eyxVar.E(new u9(9, this, cwjVar));
        return cwjVar;
    }

    @Override // xsna.mn50
    public final pn50<Object, ll50<Object, bwj, dwj>, bwj> n() {
        return (pn50) this.c.getValue();
    }

    @Override // xsna.mn50
    public final void init() {
    }
}
