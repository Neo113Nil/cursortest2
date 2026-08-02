package xsna;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.common.collect.Range;
import java.io.Serializable;
import java.lang.Comparable;

/* compiled from: Cut.java */
/* loaded from: classes13.dex */
public abstract class tpk<C extends Comparable> implements Comparable<tpk<C>>, Serializable {
    private static final long serialVersionUID = 0;
    final C endpoint;

    /* compiled from: Cut.java */
    public static final class a extends tpk<Comparable<?>> {
        public static final a b = new a("");
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return b;
        }

        @Override // xsna.tpk
        /* renamed from: a */
        public final int compareTo(tpk<Comparable<?>> tpkVar) {
            return tpkVar == this ? 0 : 1;
        }

        @Override // xsna.tpk
        public final void b(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // xsna.tpk
        public final void c(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // xsna.tpk, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((tpk) obj) == this ? 0 : 1;
        }

        @Override // xsna.tpk
        public final Comparable<?> h() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // xsna.tpk
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // xsna.tpk
        public final boolean i(Comparable<?> comparable) {
            return false;
        }

        public final String toString() {
            return "+∞";
        }
    }

    /* compiled from: Cut.java */
    public static final class b<C extends Comparable> extends tpk<C> {
        private static final long serialVersionUID = 0;

        @Override // xsna.tpk
        public final void b(StringBuilder sb) {
            sb.append('(');
            sb.append(this.endpoint);
        }

        @Override // xsna.tpk
        public final void c(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(']');
        }

        @Override // xsna.tpk, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((tpk) obj);
        }

        @Override // xsna.tpk
        public final int hashCode() {
            return ~this.endpoint.hashCode();
        }

        @Override // xsna.tpk
        public final boolean i(C c) {
            C c2 = this.endpoint;
            Range<Comparable> range = Range.b;
            return c2.compareTo(c) < 0;
        }

        public final String toString() {
            return DomExceptionUtils.SEPARATOR + this.endpoint + "\\";
        }
    }

    /* compiled from: Cut.java */
    public static final class c extends tpk<Comparable<?>> {
        public static final c b = new c("");
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return b;
        }

        @Override // xsna.tpk
        /* renamed from: a */
        public final int compareTo(tpk<Comparable<?>> tpkVar) {
            return tpkVar == this ? 0 : -1;
        }

        @Override // xsna.tpk
        public final void b(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // xsna.tpk
        public final void c(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // xsna.tpk, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((tpk) obj) == this ? 0 : -1;
        }

        @Override // xsna.tpk
        public final Comparable<?> h() {
            throw new IllegalStateException("range unbounded on this side");
        }

        @Override // xsna.tpk
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // xsna.tpk
        public final boolean i(Comparable<?> comparable) {
            return true;
        }

        public final String toString() {
            return "-∞";
        }
    }

    /* compiled from: Cut.java */
    public static final class d<C extends Comparable> extends tpk<C> {
        private static final long serialVersionUID = 0;

        @Override // xsna.tpk
        public final void b(StringBuilder sb) {
            sb.append('[');
            sb.append(this.endpoint);
        }

        @Override // xsna.tpk
        public final void c(StringBuilder sb) {
            sb.append(this.endpoint);
            sb.append(')');
        }

        @Override // xsna.tpk, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((tpk) obj);
        }

        @Override // xsna.tpk
        public final int hashCode() {
            return this.endpoint.hashCode();
        }

        @Override // xsna.tpk
        public final boolean i(C c) {
            C c2 = this.endpoint;
            Range<Comparable> range = Range.b;
            return c2.compareTo(c) <= 0;
        }

        public final String toString() {
            return "\\" + this.endpoint + DomExceptionUtils.SEPARATOR;
        }
    }

    public tpk(C c2) {
        this.endpoint = c2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(tpk<C> tpkVar) {
        if (tpkVar == c.b) {
            return 1;
        }
        if (tpkVar == a.b) {
            return -1;
        }
        C c2 = this.endpoint;
        C c3 = tpkVar.endpoint;
        Range<Comparable> range = Range.b;
        int compareTo = c2.compareTo(c3);
        return compareTo != 0 ? compareTo : Boolean.compare(this instanceof b, tpkVar instanceof b);
    }

    public abstract void b(StringBuilder sb);

    public abstract void c(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof tpk) {
            try {
                if (compareTo((tpk) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public C h() {
        return this.endpoint;
    }

    public abstract int hashCode();

    public abstract boolean i(C c2);
}
