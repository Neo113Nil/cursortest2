package xsna;

import com.ironsource.X3;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableArrayValueImpl.java */
/* loaded from: classes8.dex */
public final class wnw extends re implements vnw {
    public static final wnw c = new wnw(new kjr0[0]);
    public final kjr0[] b;

    /* compiled from: ImmutableArrayValueImpl.java */
    public static class a extends AbstractList<kjr0> {
        public final kjr0[] b;

        public a(kjr0[] kjr0VarArr) {
            this.b = kjr0VarArr;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            return this.b[i];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.b.length;
        }
    }

    /* compiled from: ImmutableArrayValueImpl.java */
    public static class b implements Iterator<kjr0> {
        public final kjr0[] b;
        public int c = 0;

        public b(kjr0[] kjr0VarArr) {
            this.b = kjr0VarArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c != this.b.length;
        }

        @Override // java.util.Iterator
        public final kjr0 next() {
            int i = this.c;
            kjr0[] kjr0VarArr = this.b;
            if (i >= kjr0VarArr.length) {
                throw new NoSuchElementException();
            }
            this.c = i + 1;
            return kjr0VarArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public wnw(kjr0[] kjr0VarArr) {
        this.b = kjr0VarArr;
    }

    @Override // xsna.kjr0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kjr0) {
            kjr0 kjr0Var = (kjr0) obj;
            boolean z = kjr0Var instanceof wnw;
            kjr0[] kjr0VarArr = this.b;
            if (z) {
                return Arrays.equals(kjr0VarArr, ((wnw) kjr0Var).b);
            }
            if (kjr0Var.l()) {
                wnw wnwVar = (wnw) kjr0Var.m();
                if (kjr0VarArr.length == wnwVar.b.length) {
                    Iterator<kjr0> it = wnwVar.iterator();
                    for (kjr0 kjr0Var2 : kjr0VarArr) {
                        b bVar = (b) it;
                        int i = (bVar.hasNext() && kjr0Var2.equals(bVar.next())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.ARRAY;
    }

    public final int hashCode() {
        int i = 1;
        int i2 = 0;
        while (true) {
            kjr0[] kjr0VarArr = this.b;
            if (i2 >= kjr0VarArr.length) {
                return i;
            }
            i = (i * 31) + kjr0VarArr[i2].hashCode();
            i2++;
        }
    }

    @Override // java.lang.Iterable
    public final Iterator<kjr0> iterator() {
        return new b(this.b);
    }

    @Override // xsna.kjr0
    public final String toJson() {
        kjr0[] kjr0VarArr = this.b;
        if (kjr0VarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        sb.append(kjr0VarArr[0].toJson());
        for (int i = 1; i < kjr0VarArr.length; i++) {
            sb.append(StringUtils.COMMA);
            sb.append(kjr0VarArr[i].toJson());
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    public final String toString() {
        kjr0[] kjr0VarArr = this.b;
        if (kjr0VarArr.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(X3.j.d);
        kjr0 kjr0Var = kjr0VarArr[0];
        if (kjr0Var.A()) {
            sb.append(kjr0Var.toJson());
        } else {
            sb.append(kjr0Var.toString());
        }
        for (int i = 1; i < kjr0VarArr.length; i++) {
            sb.append(StringUtils.COMMA);
            kjr0 kjr0Var2 = kjr0VarArr[i];
            if (kjr0Var2.A()) {
                sb.append(kjr0Var2.toJson());
            } else {
                sb.append(kjr0Var2.toString());
            }
        }
        sb.append(X3.j.e);
        return sb.toString();
    }

    @Override // xsna.re
    /* renamed from: H */
    public final vnw m() {
        return this;
    }

    @Override // xsna.re, xsna.kjr0
    public final vnw m() {
        return this;
    }
}
