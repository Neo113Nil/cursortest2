package xsna;

/* compiled from: RoundCornerColorDrawable.kt */
/* loaded from: classes17.dex */
public final class vng0 extends wq70<Integer> {
    public final /* synthetic */ wng0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vng0(int i, wng0 wng0Var) {
        super(Integer.valueOf(i));
        this.b = wng0Var;
    }

    @Override // xsna.wq70
    public final void afterChange(qcy qcyVar, Integer num, Integer num2) {
        num.intValue();
        num2.intValue();
        wng0 wng0Var = this.b;
        wng0Var.d = true;
        wng0Var.invalidateSelf();
    }
}
