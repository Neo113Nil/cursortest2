package xsna;

/* compiled from: CardDecorationHelper.kt */
/* loaded from: classes3.dex */
public final class bt9 implements mf7 {
    public final zoj0 b;

    /* compiled from: CardDecorationHelper.kt */
    public interface a {
        boolean F(int i);

        int u();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bt9(a aVar) {
        this.b = (zoj0) aVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.bt9$a, xsna.zoj0] */
    @Override // xsna.mf7
    public final int e0(int i) {
        ?? r0 = this.b;
        int u = r0.u();
        if (i >= 0 && i < u) {
            boolean z = i > 0 && r0.F(i + (-1));
            boolean F = r0.F(i);
            if (i < u - 1) {
                r0.F(i + 1);
            }
            if (z && F) {
                return 6;
            }
            if (z) {
                return 2;
            }
            if (F) {
                return 4;
            }
        }
        return 1;
    }
}
