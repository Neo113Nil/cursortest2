package xsna;

/* compiled from: PackLottieSticker.kt */
/* loaded from: classes5.dex */
public final class s690 extends v800 {
    public final int l;
    public final int m;

    public s690(int i, int i2, i700 i700Var, String str, String str2) {
        super(i700Var, str, i, str2);
        this.l = i;
        this.m = i2;
    }

    @Override // xsna.v800, xsna.kr9, xsna.nov
    public final nov E0(nov novVar) {
        return super.E0(new s690(this));
    }

    @Override // xsna.v800, xsna.kr9
    public final io.reactivex.rxjava3.core.q<nov> k() {
        bpn0 bpn0Var = c7r0.a;
        return c7r0.g(this.k, this.j, true).U(new b9(new owv(this, 22), 27)).r0(asu0.a.d());
    }

    public s690(s690 s690Var) {
        super(s690Var);
        this.l = s690Var.l;
        this.m = s690Var.m;
    }
}
