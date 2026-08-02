package xsna;

/* compiled from: PagingScrollListener.kt */
/* loaded from: classes17.dex */
public final class nf90 implements df90 {
    public final m2g b;

    public nf90(m2g m2gVar) {
        this.b = m2gVar;
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        if (i - 20 > i3 || i3 > i) {
            return;
        }
        this.b.invoke();
    }

    @Override // xsna.df90
    public final void l(int i) {
    }
}
