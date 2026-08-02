package xsna;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: ViewGroup.kt */
/* loaded from: classes11.dex */
public final class qpp0<T> implements Iterator<T>, gcy {
    public final ArrayList b = new ArrayList();
    public Iterator<? extends T> c;

    public qpp0(kxt0 kxt0Var) {
        this.c = kxt0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final T next() {
        T next = this.c.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        kxt0 kxt0Var = viewGroup != null ? new kxt0(viewGroup) : null;
        ArrayList arrayList = this.b;
        if (kxt0Var != null && kxt0Var.hasNext()) {
            arrayList.add(this.c);
            this.c = kxt0Var;
            return next;
        }
        while (!this.c.hasNext() && !arrayList.isEmpty()) {
            this.c = (Iterator) j5g.i0(arrayList);
            g5g.I(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
