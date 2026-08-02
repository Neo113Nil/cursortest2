package xsna;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: ViewGroupExt.kt */
/* loaded from: classes17.dex */
public final class ixt0 implements Iterator<View>, gcy {
    public final ViewGroup b;
    public int c;

    public ixt0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c < this.b.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i = this.c;
        this.c = i + 1;
        return this.b.getChildAt(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
