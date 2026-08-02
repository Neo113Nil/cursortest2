package xsna;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class gl2 extends wq70<Boolean> {
    public final /* synthetic */ hl2 b;
    public final /* synthetic */ defpackage.r c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public gl2(hl2 hl2Var, defpackage.r rVar) {
        super(r0);
        Boolean bool = Boolean.FALSE;
        this.b = hl2Var;
        this.c = rVar;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, Boolean bool, Boolean bool2) {
        boolean booleanValue = bool2.booleanValue();
        if (booleanValue != bool.booleanValue()) {
            em2.b(this.b.a, booleanValue, this.c, null, 24);
        }
    }
}
