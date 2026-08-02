package xsna;

import kotlin.Lazy;
import xsna.jm50;

/* compiled from: PostsFromNotificationsMviExternalTaskExecutor.kt */
/* loaded from: classes4.dex */
public final class gvc0 extends evg0<uvc0, on50, cwc0, hwc0, rvc0, dvc0> {
    public final kq60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gvc0(lvc0 lvc0Var, qn60 qn60Var, pn60 pn60Var, Lazy lazy, nn50 nn50Var) {
        super(r4, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new kq60(qn60Var, pn60Var, lazy, aVar, new eht(this, lvc0Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        this.f.s(((cwc0) hn50Var).b);
        return null;
    }
}
