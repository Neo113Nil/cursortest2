package xsna;

/* compiled from: RedirectInterceptor.kt */
/* loaded from: classes.dex */
public final class kmf0 extends cm6 {
    public final dev0 a;

    public kmf0(dev0 dev0Var) {
        this.a = dev0Var;
    }

    @Override // xsna.cm6
    public final boolean b() {
        return !this.a.isEnabled();
    }

    @Override // xsna.cm6
    public final boolean c() {
        return !this.a.isEnabled();
    }

    @Override // xsna.uz80
    public final String getTag() {
        return "Redirect";
    }
}
