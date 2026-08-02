package xsna;

/* compiled from: PlaybackAnalyticsListenerChain.kt */
/* loaded from: classes3.dex */
public final class sva0 implements qx40 {
    public final boolean a;
    public final ex40 b;
    public final uw1 c;

    public sva0(boolean z, ex40 ex40Var, uw1 uw1Var) {
        this.a = z;
        this.b = ex40Var;
        this.c = uw1Var;
    }

    @Override // xsna.qx40
    public final px40 a(px40 px40Var) {
        return this.a ? new tva0(this.b, this.c, px40Var) : px40Var;
    }
}
