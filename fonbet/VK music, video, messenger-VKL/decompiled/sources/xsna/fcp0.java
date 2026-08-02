package xsna;

/* compiled from: Delegates.kt */
/* loaded from: classes16.dex */
public final class fcp0 extends wq70<hq9> {
    @Override // xsna.wq70
    public final void afterChange(qcy<?> qcyVar, hq9 hq9Var, hq9 hq9Var2) {
        hq9 hq9Var3 = hq9Var;
        if (hq9Var3 == hq9Var2 || hq9Var3 == null) {
            return;
        }
        hq9Var3.cancel();
    }
}
