package xsna;

/* compiled from: SearchVideoPickerFeature.kt */
/* loaded from: classes18.dex */
public final class qzh0 implements yf90 {
    public String a = "";
    public final /* synthetic */ rzh0 b;

    public qzh0(rzh0 rzh0Var) {
        this.b = rzh0Var;
    }

    @Override // xsna.yf90
    public final io.reactivex.rxjava3.core.q<wia0<o2t0>> a(int i, int i2) {
        String str = this.a;
        rzh0 rzh0Var = this.b;
        return new io.reactivex.rxjava3.internal.operators.single.o(rzh0Var.g.a(i, i2, str).l(new l340(new yvd(i, 1), 10)), new eiy(new hsc0(rzh0Var, 9), 17)).h(new ubq(new d0w(rzh0Var, 23), 29)).w();
    }
}
