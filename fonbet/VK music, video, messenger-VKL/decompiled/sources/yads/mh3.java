package yads;

import xsna.qcy;
import xsna.wq70;

/* loaded from: classes10.dex */
public final class mh3 extends wq70 {
    public final /* synthetic */ nh3 a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mh3(nh3 nh3Var) {
        super(r0);
        lh3 lh3Var = lh3.b;
        this.a = nh3Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy qcyVar, Object obj, Object obj2) {
        this.a.a.add((lh3) obj2);
    }
}
