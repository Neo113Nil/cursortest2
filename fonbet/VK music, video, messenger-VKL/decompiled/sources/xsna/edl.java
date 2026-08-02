package xsna;

import xsna.hn50;
import xsna.lm50;
import xsna.on50;
import xsna.pk50;
import xsna.yl50;

/* compiled from: DefaultCoroutineMviTaskExecutor.kt */
/* loaded from: classes3.dex */
public final class edl<State extends lm50, TaskId extends on50, InTask extends hn50<TaskId>, OutTask extends hn50<TaskId>, Patch extends yl50, Event extends pk50> extends uvj<State, TaskId, InTask, OutTask, Patch, Event> {
    public final gqg g;
    public final wzs<uvj<State, TaskId, InTask, OutTask, Patch, Event>, InTask, bwj> h;
    public final md8 i;

    public edl(nn50 nn50Var, gqg gqgVar, wzs wzsVar, md8 md8Var) {
        super(tci.c, nn50Var);
        this.g = gqgVar;
        this.h = wzsVar;
        this.i = md8Var;
    }

    @Override // xsna.dl50, xsna.mn50
    public final boolean B(InTask intask) {
        this.g.getClass();
        return Boolean.TRUE.booleanValue();
    }

    @Override // xsna.dl50, xsna.mn50
    public final ln50<TaskId> F(InTask intask) {
        this.i.getClass();
        return intask.d();
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return this.h.invoke(this, hn50Var);
    }

    @Override // xsna.dl50, xsna.mn50
    public final void init() {
    }
}
