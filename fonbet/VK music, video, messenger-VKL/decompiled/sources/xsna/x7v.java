package xsna;

import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.btx0;
import xsna.x7v;

/* compiled from: History.kt */
/* loaded from: classes2.dex */
public abstract class x7v<T extends btx0, H extends x7v<T, H>> implements Iterable<T>, gcy {
    private final ArraySet<Number> expired = new ArraySet<>();
    private final boolean hasHistoryAfter;
    private final boolean hasHistoryAfterCached;
    private final boolean hasHistoryBefore;
    private final boolean hasHistoryBeforeCached;
    private final List<T> list;

    public x7v(int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.hasHistoryBefore = z;
        this.hasHistoryBeforeCached = z2;
        this.hasHistoryAfter = z3;
        this.hasHistoryAfterCached = z4;
        this.list = new ArrayList(i);
    }

    public static void a(gj30 gj30Var, Collection collection) {
        EmptyList emptyList = EmptyList.b;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((x7v) gj30Var).list.add((btx0) it.next());
        }
        Iterator<E> it2 = emptyList.iterator();
        while (it2.hasNext()) {
            ((x7v) gj30Var).expired.add(Long.valueOf(((Number) it2.next()).longValue()));
        }
    }

    public final ArraySet<Number> d() {
        return this.expired;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        x7v x7vVar = (x7v) obj;
        return epx.f(k(), x7vVar.k()) && epx.f(this.expired, x7vVar.expired) && i() == x7vVar.i() && j() == x7vVar.j() && g() == x7vVar.g() && h() == x7vVar.h();
    }

    public boolean g() {
        return this.hasHistoryAfter;
    }

    public boolean h() {
        return this.hasHistoryAfterCached;
    }

    public int hashCode() {
        return Boolean.hashCode(h()) + ((Boolean.hashCode(g()) + ((Boolean.hashCode(j()) + ((Boolean.hashCode(i()) + ((this.expired.hashCode() + (k().hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public boolean i() {
        return this.hasHistoryBefore;
    }

    public final boolean isEmpty() {
        return k().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator<T> iterator() {
        return k().iterator();
    }

    public boolean j() {
        return this.hasHistoryBeforeCached;
    }

    public List<T> k() {
        return this.list;
    }

    public final boolean l(long j) {
        List<T> k = k();
        if ((k instanceof Collection) && k.isEmpty()) {
            return false;
        }
        Iterator<T> it = k.iterator();
        while (it.hasNext()) {
            if (((btx0) it.next()).getId().longValue() == j) {
                return true;
            }
        }
        return false;
    }

    public final boolean m() {
        return !this.expired.isEmpty();
    }

    public final boolean n(Integer num) {
        return this.expired.contains(num);
    }

    public final boolean o() {
        return (i() || g()) ? false : true;
    }

    public final boolean p() {
        return !isEmpty();
    }

    public final void q(Long l) {
        g5g.D(this.list, true, new s6k(l, 24));
        this.expired.remove(l);
    }

    public final int size() {
        return k().size();
    }
}
