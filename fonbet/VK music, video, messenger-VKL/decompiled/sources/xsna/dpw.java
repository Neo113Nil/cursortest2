package xsna;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.msgpack.value.ValueType;

/* compiled from: ImmutableMapValueImpl.java */
/* loaded from: classes8.dex */
public final class dpw extends re implements cpw {
    public static final dpw c = new dpw(new kjr0[0]);
    public final kjr0[] b;

    /* compiled from: ImmutableMapValueImpl.java */
    public static class a extends AbstractSet<Map.Entry<kjr0, kjr0>> {
        public final kjr0[] b;

        public a(kjr0[] kjr0VarArr) {
            this.b = kjr0VarArr;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public final Iterator<Map.Entry<kjr0, kjr0>> iterator() {
            return new b(this.b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.b.length / 2;
        }
    }

    /* compiled from: ImmutableMapValueImpl.java */
    public static class b implements Iterator<Map.Entry<kjr0, kjr0>> {
        public final kjr0[] b;
        public int c = 0;

        public b(kjr0[] kjr0VarArr) {
            this.b = kjr0VarArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.b.length;
        }

        @Override // java.util.Iterator
        public final Map.Entry<kjr0, kjr0> next() {
            int i = this.c;
            kjr0[] kjr0VarArr = this.b;
            if (i >= kjr0VarArr.length) {
                throw new NoSuchElementException();
            }
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(kjr0VarArr[i], kjr0VarArr[i + 1]);
            this.c += 2;
            return simpleImmutableEntry;
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: ImmutableMapValueImpl.java */
    public static class c extends AbstractMap<kjr0, kjr0> {
        public final kjr0[] b;

        public c(kjr0[] kjr0VarArr) {
            this.b = kjr0VarArr;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final Set<Map.Entry<kjr0, kjr0>> entrySet() {
            return new a(this.b);
        }
    }

    public dpw(kjr0[] kjr0VarArr) {
        this.b = kjr0VarArr;
    }

    public static void N(StringBuilder sb, kjr0 kjr0Var) {
        if (kjr0Var.A()) {
            sb.append(kjr0Var.toJson());
        } else {
            sb.append(kjr0Var.toString());
        }
    }

    @Override // xsna.bm00
    public final c c() {
        return new c(this.b);
    }

    @Override // xsna.re, xsna.kjr0
    public final bm00 d() {
        return this;
    }

    @Override // xsna.kjr0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kjr0)) {
            return false;
        }
        kjr0 kjr0Var = (kjr0) obj;
        if (!kjr0Var.F()) {
            return false;
        }
        return c().equals(((dpw) kjr0Var.d()).c());
    }

    @Override // xsna.kjr0
    public final ValueType h() {
        return ValueType.MAP;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            kjr0[] kjr0VarArr = this.b;
            if (i >= kjr0VarArr.length) {
                return i2;
            }
            i2 += kjr0VarArr[i + 1].hashCode() ^ kjr0VarArr[i].hashCode();
            i += 2;
        }
    }

    @Override // xsna.kjr0
    public final String toJson() {
        kjr0[] kjr0VarArr = this.b;
        if (kjr0VarArr.length == 0) {
            return "{}";
        }
        StringBuilder e = fw3.e("{");
        kjr0 kjr0Var = kjr0VarArr[0];
        if (kjr0Var.A()) {
            e.append(kjr0Var.toJson());
        } else {
            qe.N(kjr0Var.toString(), e);
        }
        e.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        e.append(kjr0VarArr[1].toJson());
        for (int i = 2; i < kjr0VarArr.length; i += 2) {
            e.append(StringUtils.COMMA);
            kjr0 kjr0Var2 = kjr0VarArr[i];
            if (kjr0Var2.A()) {
                e.append(kjr0Var2.toJson());
            } else {
                qe.N(kjr0Var2.toString(), e);
            }
            e.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            e.append(kjr0VarArr[i + 1].toJson());
        }
        e.append("}");
        return e.toString();
    }

    public final String toString() {
        kjr0[] kjr0VarArr = this.b;
        if (kjr0VarArr.length == 0) {
            return "{}";
        }
        StringBuilder e = fw3.e("{");
        N(e, kjr0VarArr[0]);
        e.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        N(e, kjr0VarArr[1]);
        for (int i = 2; i < kjr0VarArr.length; i += 2) {
            e.append(StringUtils.COMMA);
            N(e, kjr0VarArr[i]);
            e.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
            N(e, kjr0VarArr[i + 1]);
        }
        e.append("}");
        return e.toString();
    }

    @Override // xsna.re, xsna.rpw, xsna.kjr0
    public final cpw d() {
        return this;
    }
}
