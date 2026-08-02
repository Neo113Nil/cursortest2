package xsna;

import xsna.bt9;

/* compiled from: HeaderCardAdapter.kt */
/* loaded from: classes3.dex */
public abstract class iwu<T> extends awu<T> implements mf7, bt9.a {
    public final bt9 i;

    public iwu(int i) {
        super(null);
        this.i = new bt9(this);
    }

    @Override // xsna.bt9.a
    public boolean F(int i) {
        return i < getItemCount() - 1 && getItemViewType(i + 1) == U0();
    }

    public abstract int U0();

    public int e0(int i) {
        return this.i.e0(i);
    }
}
