package xsna;

import com.googlecode.mp4parser.BasicContainer;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: LazyList.java */
/* loaded from: classes13.dex */
public final class ruy<E> extends AbstractList<E> {
    public static final q100 d = q100.a(ruy.class);
    public final List<E> b;
    public final BasicContainer c;

    /* compiled from: LazyList.java */
    public class a implements Iterator<E> {
        public int b = 0;

        public a() {
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            int i = this.b;
            ruy ruyVar = ruy.this;
            return i < ruyVar.b.size() || ruyVar.c.hasNext();
        }

        @Override // java.util.Iterator
        public final E next() {
            int i = this.b;
            ruy ruyVar = ruy.this;
            if (i >= ruyVar.b.size()) {
                ruyVar.b.add(ruyVar.c.next());
                return (E) next();
            }
            List<E> list = ruyVar.b;
            int i2 = this.b;
            this.b = i2 + 1;
            return list.get(i2);
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public ruy(List list, BasicContainer basicContainer) {
        this.b = list;
        this.c = basicContainer;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        List<E> list = this.b;
        if (list.size() > i) {
            return (E) list.get(i);
        }
        BasicContainer basicContainer = this.c;
        if (!basicContainer.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(basicContainer.next());
        return get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<E> iterator() {
        return new a();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        q100 q100Var = d;
        q100Var.b("potentially expensive size() call");
        q100Var.b("blowup running");
        while (true) {
            BasicContainer basicContainer = this.c;
            boolean hasNext = basicContainer.hasNext();
            List<E> list = this.b;
            if (!hasNext) {
                return list.size();
            }
            list.add(basicContainer.next());
        }
    }
}
