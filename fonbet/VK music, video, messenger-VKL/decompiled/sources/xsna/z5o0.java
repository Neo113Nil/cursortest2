package xsna;

import xsna.ds60;
import xsna.jm50;

/* compiled from: TaskExecutors.kt */
/* loaded from: classes4.dex */
public final class z5o0 extends evg0<Object, on50, Object, Object, Object, Object> {
    public final kr60 f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public z5o0(es60 es60Var, yt60 yt60Var, nn50 nn50Var) {
        super(r6, nn50Var);
        jm50.a aVar = jm50.a.a;
        this.f = new kr60(es60Var.c, es60Var.e, es60Var.g, es60Var.i, es60Var.j, aVar, new eht(this, yt60Var));
    }

    @Override // xsna.mn50
    public final jn50 d(hn50 hn50Var) {
        return this.f.d((ds60.e) ((sn50) hn50Var).e());
    }
}
