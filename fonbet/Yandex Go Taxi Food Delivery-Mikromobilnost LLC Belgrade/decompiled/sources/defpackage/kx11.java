package defpackage;

/* loaded from: classes10.dex */
public final class kx11 implements qor {
    public final m3u0 a;

    public kx11(m3u0 m3u0Var) {
        this.a = m3u0Var;
    }

    @Override // defpackage.qor
    public final float getFloatValue() {
        return ((Number) this.a.getValue()).floatValue();
    }

    @Override // defpackage.m3u0
    public final Float getValue() {
        return (Float) this.a.getValue();
    }

    public final String toString() {
        return "UnboxedFloatState(baseState=" + this.a + ")@" + hashCode();
    }
}
