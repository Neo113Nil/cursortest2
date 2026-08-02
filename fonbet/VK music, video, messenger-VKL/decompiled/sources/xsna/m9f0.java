package xsna;

import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;

/* compiled from: Comparisons.kt */
/* loaded from: classes18.dex */
public final class m9f0<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        return jw5.b((Long) ((Pair) ((Map.Entry) t2).getValue()).j(), (Long) ((Pair) ((Map.Entry) t).getValue()).j());
    }
}
