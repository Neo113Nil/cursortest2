package xsna;

/* compiled from: Transition.kt */
/* loaded from: classes11.dex */
public final class bi50<S> extends z46 {
    public final wh50 d;
    public final wh50 e;

    public bi50(S s) {
        super(5);
        this.d = androidx.compose.runtime.k.b(s);
        this.e = androidx.compose.runtime.k.b(s);
    }

    @Override // xsna.z46
    public final S B() {
        return (S) ((zak0) this.d).getValue();
    }

    @Override // xsna.z46
    public final void S(S s) {
        ((zak0) this.d).setValue(s);
    }

    public final void w0(Boolean bool) {
        ((zak0) this.e).setValue(bool);
    }

    @Override // xsna.z46
    public final void h0() {
    }

    @Override // xsna.z46
    public final void f0(wlp0<S> wlp0Var) {
    }
}
