package xsna;

import java.util.Collection;
import java.util.List;

/* compiled from: ImmutableList.kt */
/* loaded from: classes8.dex */
public interface xow<E> extends List<E>, Collection, gcy {

    /* compiled from: ImmutableList.kt */
    public static final class a<E> extends ff<E> implements xow<E> {
        public final xow<E> b;
        public final int c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(xow<? extends E> xowVar, int i, int i2) {
            this.b = xowVar;
            this.c = i;
            tci.e(i, i2, xowVar.size());
            this.d = i2 - i;
        }

        @Override // xsna.ff, java.util.List
        public final E get(int i) {
            tci.a(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // xsna.ff, xsna.qd
        public final int getSize() {
            return this.d;
        }

        @Override // xsna.ff, java.util.List
        public final List subList(int i, int i2) {
            tci.e(i, i2, this.d);
            int i3 = this.c;
            return new a(this.b, i + i3, i3 + i2);
        }
    }
}
