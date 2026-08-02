package xsna;

/* compiled from: PagingScrollListener.kt */
/* loaded from: classes18.dex */
public final class if90 implements df90 {
    public final tf90 b;

    public if90(tf90 tf90Var) {
        this.b = tf90Var;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - 5 > i3 || i3 > i) {
            return;
        }
        this.b.a();
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
