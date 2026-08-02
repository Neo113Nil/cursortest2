package xsna;

import xsna.lm50;
import xsna.yl50;

/* compiled from: DefaultMviReducer.kt */
/* loaded from: classes3.dex */
public final class ejl<State extends lm50, Patch extends yl50> implements bm50<State, Patch> {
    public final yzs<bm50<State, Patch>, State, Patch, State> a;

    public ejl(dmi dmiVar, yzs yzsVar) {
        this.a = yzsVar;
    }

    @Override // xsna.bm50
    public final State a(State state, Patch patch) {
        if (Boolean.TRUE.booleanValue()) {
            return this.a.invoke(this, state, patch);
        }
        return null;
    }

    @Override // xsna.bm50
    public final boolean b(Patch patch) {
        return Boolean.TRUE.booleanValue();
    }
}
