package xsna;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import xsna.avc0;

/* compiled from: PostsFromNotificationsMviLifecycleActor.kt */
/* loaded from: classes4.dex */
public final class jvc0 extends al50<uvc0, avc0.c, on50, hwc0, rvc0, dvc0> {
    public final sj50<uvc0, on50, hwc0, rvc0, dvc0> c;
    public final tq60 d;

    public jvc0(lvc0 lvc0Var, sj50<uvc0, on50, hwc0, rvc0, dvc0> sj50Var, AtomicReference<wn60> atomicReference) {
        super(sj50Var);
        this.c = sj50Var;
        this.d = new tq60(new dht(this, lvc0Var), atomicReference);
    }

    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        avc0.c cVar = (avc0.c) lj50Var;
        if (!(cVar instanceof avc0.c.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.d.p(((avc0.c.a) cVar).b);
    }
}
