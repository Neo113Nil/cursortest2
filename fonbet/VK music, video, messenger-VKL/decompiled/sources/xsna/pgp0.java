package xsna;

import java.util.Comparator;
import kotlin.Pair;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class pgp0<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b((Integer) ((Pair) t).j(), (Integer) ((Pair) t2).j());
    }
}
