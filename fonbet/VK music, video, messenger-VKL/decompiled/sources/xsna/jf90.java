package xsna;

/* compiled from: PagingScrollListener.kt */
/* loaded from: classes18.dex */
public final class jf90 implements df90 {
    public final gzs<s3q0> b;

    public jf90(gzs<s3q0> gzsVar) {
        this.b = gzsVar;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - 3 > i3 || i3 > i) {
            return;
        }
        this.b.invoke();
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
