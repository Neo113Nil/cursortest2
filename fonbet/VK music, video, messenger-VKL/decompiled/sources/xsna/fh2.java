package xsna;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class fh2 extends wq70<Boolean> {
    public final /* synthetic */ gh2 b;
    public final /* synthetic */ igg c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fh2(gh2 gh2Var, igg iggVar) {
        super(r0);
        Boolean bool = Boolean.FALSE;
        this.b = gh2Var;
        this.c = iggVar;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        boolean booleanValue = bool2.booleanValue();
        if (booleanValue != bool.booleanValue()) {
            em2.b(this.b.b, booleanValue, this.c, null, 24);
        }
    }
}
