package xsna;

/* compiled from: DelegateUtils.kt */
/* loaded from: classes15.dex */
public final class vfk0 extends wq70<Boolean> {
    public final /* synthetic */ qfk0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vfk0(qfk0 qfk0Var) {
        super(r0);
        Boolean bool = Boolean.TRUE;
        this.b = qfk0Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        boolean booleanValue = bool2.booleanValue();
        bool.getClass();
        qfk0 qfk0Var = this.b;
        if (booleanValue) {
            qfk0Var.e.setEnabled(true);
            qfk0Var.f.setAlpha(1.0f);
        } else {
            qfk0Var.e.setEnabled(false);
            qfk0Var.f.setAlpha(0.64f);
        }
    }

    @Override // xsna.wq70
    public final boolean beforeChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        return !epx.f(bool, bool2);
    }
}
