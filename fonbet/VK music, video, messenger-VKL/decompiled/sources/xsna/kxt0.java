package xsna;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
/* loaded from: classes11.dex */
public final class kxt0 implements Iterator<View>, gcy {
    public int b;
    public final /* synthetic */ ViewGroup c;

    public kxt0(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.c.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i = this.b;
        this.b = i + 1;
        View childAt = this.c.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.b - 1;
        this.b = i;
        this.c.removeViewAt(i);
    }
}
