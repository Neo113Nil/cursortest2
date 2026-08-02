package xsna;

import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import xsna.wq2;

/* compiled from: AnimatorAnimationSpecs.kt */
/* loaded from: classes11.dex */
public final class vlr0<V extends wq2> implements xlr0<V> {
    public final ArrayList a;

    public vlr0(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // xsna.tlr0
    public final long c(V v, V v2, V v3) {
        Pair pair = (Pair) j5g.i0(this.a);
        return ((xlr0) pair.g()).c(v, v2, v3) + ((Number) pair.d()).longValue();
    }

    @Override // xsna.tlr0
    public final V d(long j, V v, V v2, V v3) {
        Pair<Long, xlr0<V>> h = h(j);
        return h.g().d(j - h.d().longValue(), v, v2, v3);
    }

    @Override // xsna.tlr0
    public final V g(long j, V v, V v2, V v3) {
        Pair<Long, xlr0<V>> h = h(j);
        return h.g().g(j - h.d().longValue(), v, v2, v3);
    }

    public final Pair<Long, xlr0<V>> h(long j) {
        Object obj;
        ArrayList arrayList = this.a;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((Number) ((Pair) obj).d()).longValue() <= j) {
                break;
            }
        }
        Pair<Long, xlr0<V>> pair = (Pair) obj;
        return pair == null ? (Pair) j5g.Y(arrayList) : pair;
    }
}
