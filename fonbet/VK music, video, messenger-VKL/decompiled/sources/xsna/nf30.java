package xsna;

import java.util.List;
import java.util.RandomAccess;
import xsna.ff;

/* compiled from: SlidingWindow.kt */
/* loaded from: classes8.dex */
public final class nf30<E> extends ff<E> implements RandomAccess {
    public final List<E> b;
    public int c;
    public int d;

    /* JADX WARN: Multi-variable type inference failed */
    public nf30(List<? extends E> list) {
        this.b = list;
    }

    public final void b(int i, int i2) {
        ff.a aVar = ff.Companion;
        int size = this.b.size();
        aVar.getClass();
        ff.a.d(i, i2, size);
        this.c = i;
        this.d = i2 - i;
    }

    @Override // xsna.ff, java.util.List
    public final E get(int i) {
        ff.a aVar = ff.Companion;
        int i2 = this.d;
        aVar.getClass();
        ff.a.b(i, i2);
        return this.b.get(this.c + i);
    }

    @Override // xsna.ff, xsna.qd
    public final int getSize() {
        return this.d;
    }
}
