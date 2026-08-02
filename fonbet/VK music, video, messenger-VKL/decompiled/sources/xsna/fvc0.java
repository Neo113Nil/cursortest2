package xsna;

import xsna.avc0;
import xsna.xn60;

/* compiled from: PostsFromNotificationsMviExternalActionActor.kt */
/* loaded from: classes4.dex */
public final class fvc0 extends al50<uvc0, avc0.a, on50, hwc0, rvc0, dvc0> {
    public final sj50<uvc0, on50, hwc0, rvc0, dvc0> c;
    public final hq60 d;

    public fvc0(lvc0 lvc0Var, sj50<uvc0, on50, hwc0, rvc0, dvc0> sj50Var) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new hq60(new dht(this, lvc0Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        this.d.p(new xn60.a(((avc0.a) lj50Var).b.b));
    }
}
