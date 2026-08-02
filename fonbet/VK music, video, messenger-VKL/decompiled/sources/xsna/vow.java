package xsna;

import java.util.Collection;
import java.util.List;

/* compiled from: ImmutableList.kt */
/* loaded from: classes11.dex */
public interface vow<E> extends List<E>, Collection, gcy {

    /* compiled from: ImmutableList.kt */
    public static final class a<E> extends ff<E> implements vow<E> {
        public final vow<E> b;
        public final int c;
        public final int d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(vow<? extends E> vowVar, int i, int i2) {
            this.b = vowVar;
            this.c = i;
            dz5.n(i, i2, vowVar.size());
            this.d = i2 - i;
        }

        @Override // xsna.ff, java.util.List
        public final E get(int i) {
            dz5.k(i, this.d);
            return this.b.get(this.c + i);
        }

        @Override // xsna.ff, xsna.qd
        public final int getSize() {
            return this.d;
        }

        @Override // xsna.ff, java.util.List
        public final List subList(int i, int i2) {
            dz5.n(i, i2, this.d);
            int i3 = this.c;
            return new a(this.b, i + i3, i3 + i2);
        }
    }
}
