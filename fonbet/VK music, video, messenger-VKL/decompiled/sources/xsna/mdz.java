package xsna;

import java.util.Comparator;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: LinkedSpan.kt */
/* loaded from: classes2.dex */
public final class mdz<Name> {
    public final long a;
    public final Name b;
    public final mdz<Name> c;
    public final long e;
    public final bpn0 d = new bpn0(new jg0(24));
    public final AtomicLong f = new AtomicLong(50);
    public final AtomicLong g = new AtomicLong(50);

    /* compiled from: LinkedSpan.kt */
    public static final class a {
        public static mdz a(Enum r4) {
            return new mdz(0L, r4, null);
        }
    }

    /* compiled from: Comparisons.kt */
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return jw5.b(Long.valueOf(((mdz) t).a), Long.valueOf(((mdz) t2).a));
        }
    }

    public mdz(long j, Name name, mdz<Name> mdzVar) {
        this.a = j;
        this.b = name;
        this.c = mdzVar;
        this.e = j * 100;
    }

    public final mdz<Name> a(Name name) {
        mdz<Name> mdzVar = new mdz<>(this.f.getAndIncrement() + this.e, name, this);
        ((ConcurrentSkipListSet) this.d.getValue()).add(mdzVar);
        return mdzVar;
    }

    public final mdz b(Enum r5) {
        long decrementAndGet = this.g.decrementAndGet();
        if (decrementAndGet <= 0) {
            return null;
        }
        mdz mdzVar = new mdz(this.e + decrementAndGet, r5, this);
        ((ConcurrentSkipListSet) this.d.getValue()).add(mdzVar);
        return mdzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mdz)) {
            return false;
        }
        mdz mdzVar = (mdz) obj;
        return this.a == mdzVar.a && epx.f(this.b, mdzVar.b) && epx.f(this.c, mdzVar.c);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        Name name = this.b;
        int hashCode2 = (hashCode + (name == null ? 0 : name.hashCode())) * 31;
        mdz<Name> mdzVar = this.c;
        return hashCode2 + (mdzVar != null ? mdzVar.hashCode() : 0);
    }

    public final String toString() {
        return "LinkedSpan(id=" + this.a + ", name=" + this.b + ", parentSpan=" + this.c + ')';
    }
}
