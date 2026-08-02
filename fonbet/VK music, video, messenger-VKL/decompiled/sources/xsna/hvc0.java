package xsna;

import xsna.avc0;

/* compiled from: PostsFromNotificationsMviItemActor.kt */
/* loaded from: classes4.dex */
public final class hvc0 extends al50<uvc0, avc0.b, on50, hwc0, rvc0, dvc0> {
    public final sj50<uvc0, on50, hwc0, rvc0, dvc0> c;
    public final mq60 d;

    public hvc0(lvc0 lvc0Var, sj50<uvc0, on50, hwc0, rvc0, dvc0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new mq60(new dht(this, lvc0Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        this.d.p(((avc0.b) lj50Var).b);
    }
}
