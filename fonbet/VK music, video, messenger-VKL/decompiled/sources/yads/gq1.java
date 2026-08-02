package yads;

/* loaded from: classes10.dex */
public final class gq1 implements dy0 {
    public final v9 a;
    public final ir1 b;

    public gq1(v9 v9Var, ir1 ir1Var) {
        this.a = v9Var;
        this.b = ir1Var;
    }

    @Override // yads.dy0
    public final cy0 b(gy0 gy0Var) {
        return new zq1(gy0Var, this.a, this.b);
    }

    @Override // yads.dy0
    public final cy0 c(gy0 gy0Var) {
        return new com.monetization.ads.mediation.interstitial.c(gy0Var, this.a, this.b);
    }
}
