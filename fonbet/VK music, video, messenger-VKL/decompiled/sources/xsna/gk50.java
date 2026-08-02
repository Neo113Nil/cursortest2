package xsna;

/* compiled from: Effects.kt */
/* loaded from: classes3.dex */
public final class gk50 implements kgn {
    public final /* synthetic */ fq9 a;

    public gk50(fq9 fq9Var) {
        this.a = fq9Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.cancel();
    }
}
