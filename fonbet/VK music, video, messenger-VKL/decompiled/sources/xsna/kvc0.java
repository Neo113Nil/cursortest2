package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.avc0;
import xsna.xn60;

/* compiled from: PostsFromNotificationsMviListActor.kt */
/* loaded from: classes4.dex */
public final class kvc0 extends al50<uvc0, avc0.d, on50, hwc0, rvc0, dvc0> {
    public final go60 c;

    public kvc0(lvc0 lvc0Var, sj50<uvc0, on50, hwc0, rvc0, dvc0> sj50Var) {
        super(sj50Var);
        this.c = new go60(new dht(this, lvc0Var));
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        xn60.d dVar;
        avc0.d dVar2 = (avc0.d) lj50Var;
        if (dVar2.equals(avc0.d.a.b)) {
            dVar = xn60.d.a.b;
        } else if (dVar2.equals(avc0.d.b.b)) {
            dVar = xn60.d.b.b;
        } else {
            if (!dVar2.equals(avc0.d.c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar = xn60.d.c.b;
        }
        this.c.p(dVar);
    }
}
