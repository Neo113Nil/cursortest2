package xsna;

import kotlin.NoWhenBranchMatchedException;
import xsna.hwc0;
import xsna.jm50;

/* compiled from: PostsFromNotificationsMviStoriesTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class awc0 extends evg0<uvc0, on50, hwc0.b, hwc0, rvc0, dvc0> {
    public final cs60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public awc0(qn60 qn60Var, pn60 pn60Var, lvc0 lvc0Var, nn50 nn50Var) {
        super(r0, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new cs60(qn60Var, pn60Var, aVar, new eht(this, lvc0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        hwc0.b bVar = (hwc0.b) hn50Var;
        if (!(bVar instanceof hwc0.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.f.s(((hwc0.b.a) bVar).b);
        return null;
    }
}
