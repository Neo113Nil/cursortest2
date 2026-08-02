package xsna;

import java.util.Comparator;
import java.util.List;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class qdm<T> implements Comparator {
    public final /* synthetic */ List b;

    public qdm(List list) {
        this.b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        List list = this.b;
        Integer j = p4g.j(Integer.valueOf(((rdm) t).a), list);
        Integer valueOf = Integer.valueOf(j != null ? j.intValue() : Integer.MAX_VALUE);
        Integer j2 = p4g.j(Integer.valueOf(((rdm) t2).a), list);
        return jw5.b(valueOf, Integer.valueOf(j2 != null ? j2.intValue() : Integer.MAX_VALUE));
    }
}
