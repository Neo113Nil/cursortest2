package xsna;

import xsna.lm50;

/* compiled from: MviStates.kt */
/* loaded from: classes3.dex */
public final class xtk0<State extends lm50> {
    public final yvj a;
    public final utk0 b;

    public xtk0(State state, yvj yvjVar) {
        this.a = yvjVar;
        this.b = vtk0.a(state);
    }

    public final wic a(izs izsVar) {
        return new wic(myc0.h(this.a, null, null, new wtk0(this, izsVar, null), 3));
    }

    public final State b() {
        return (State) this.b.getValue();
    }
}
