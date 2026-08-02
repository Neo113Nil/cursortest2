package xsna;

/* compiled from: CrossfadeAudioEffectListenerChain.kt */
/* loaded from: classes3.dex */
public final class gjk implements qx40 {
    public final fiq a;
    public final hx40 b;
    public final aw40 c;

    public gjk(fiq fiqVar, hx40 hx40Var, aw40 aw40Var) {
        this.a = fiqVar;
        this.b = hx40Var;
        this.c = aw40Var;
    }

    @Override // xsna.qx40
    public final px40 a(px40 px40Var) {
        return new pjk(this.a, px40Var, this.b, this.c);
    }
}
