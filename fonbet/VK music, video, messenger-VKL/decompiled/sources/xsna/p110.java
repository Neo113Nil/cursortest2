package xsna;

/* compiled from: MarketItemDecoratorHelper.kt */
/* loaded from: classes18.dex */
public final class p110 {
    public static final float b = iah0.b(18.0f);
    public static final int c = iah0.a(8);
    public final n110 a;

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.n110] */
    public p110(final jid0 jid0Var) {
        this.a = new mf7() { // from class: xsna.n110
            @Override // xsna.mf7
            public final int e0(int i) {
                jid0 jid0Var2 = jid0.this;
                if (i == jid0Var2.c.size() - 1) {
                    int e0 = jid0Var2.e0(i);
                    if ((e0 & 4) != 4 || (e0 = e0 & (-5)) != 0) {
                        return e0;
                    }
                } else {
                    if (i != 0) {
                        return jid0Var2.e0(i);
                    }
                    int e02 = jid0Var2.e0(i);
                    if ((e02 & 2) != 2 || (e02 = e02 & (-3)) != 0) {
                        return e02;
                    }
                }
                return 1;
            }
        };
    }
}
