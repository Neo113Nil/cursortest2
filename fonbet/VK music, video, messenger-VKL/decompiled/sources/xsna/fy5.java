package xsna;

/* compiled from: ModifierLocalModifierNode.kt */
/* loaded from: classes11.dex */
public final class fy5 extends be {
    public b730<?> b;

    @Override // xsna.be
    public final boolean K(x630<?> x630Var) {
        return x630Var == this.b.getKey();
    }

    @Override // xsna.be
    public final Object O() {
        if (ey6.a != this.b.getKey()) {
            uzw.b("Check failed.");
        }
        return this.b.getValue();
    }
}
