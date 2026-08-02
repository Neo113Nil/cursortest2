package xsna;

import java.util.concurrent.atomic.AtomicReference;
import xsna.xn60;

/* compiled from: Actors.kt */
/* loaded from: classes4.dex */
public final class zb0 extends al50<Object, Object, on50, Object, Object, Object> {
    public final tq60 c;

    public zb0(yt60<Object, Object, Object> yt60Var, AtomicReference<wn60> atomicReference, sj50<Object, on50, Object, Object, Object> sj50Var) {
        super(sj50Var);
        this.c = new tq60(new dht(this, yt60Var), atomicReference);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        this.c.p((xn60.c) ((pj50) lj50Var).h());
    }
}
