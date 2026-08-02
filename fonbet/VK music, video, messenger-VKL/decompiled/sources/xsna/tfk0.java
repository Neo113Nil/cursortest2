package xsna;

/* compiled from: DelegateUtils.kt */
/* loaded from: classes15.dex */
public final class tfk0 extends wq70<Boolean> {
    public final /* synthetic */ qfk0 b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tfk0(qfk0 qfk0Var) {
        super(r0);
        Boolean bool = Boolean.TRUE;
        this.b = qfk0Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        boolean booleanValue = bool2.booleanValue();
        bool.getClass();
        qxm0.z(this.b.i, booleanValue);
    }

    @Override // xsna.wq70
    public final boolean beforeChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        return !epx.f(bool, bool2);
    }
}
