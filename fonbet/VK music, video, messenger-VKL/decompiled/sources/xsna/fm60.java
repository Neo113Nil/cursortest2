package xsna;

import xsna.vs60;

/* compiled from: NewsfeedItemActor.kt */
/* loaded from: classes4.dex */
public final class fm60 extends al50<qz60, vs60.e, on50, r070, jv60, xh60> {
    public final sj50<qz60, on50, r070, jv60, xh60> c;
    public final mq60 d;

    public fm60(ot60 ot60Var, sj50<qz60, on50, r070, jv60, xh60> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new mq60(new dht(this, ot60Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        this.d.p(((vs60.e) lj50Var).b);
    }
}
