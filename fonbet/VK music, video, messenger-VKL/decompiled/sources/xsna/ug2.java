package xsna;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class ug2 extends wq70<Boolean> {
    public final /* synthetic */ vg2 b;
    public final /* synthetic */ igg c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ug2(vg2 vg2Var, igg iggVar) {
        super(r0);
        Boolean bool = Boolean.FALSE;
        this.b = vg2Var;
        this.c = iggVar;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        boolean booleanValue = bool2.booleanValue();
        if (booleanValue != bool.booleanValue()) {
            vg2 vg2Var = this.b;
            em2.b(vg2Var.a, booleanValue, this.c, new qg2(booleanValue, vg2Var), 16);
        }
    }
}
