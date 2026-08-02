package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes11.dex */
public final class gw50 implements Comparator<Comparable<? super Object>> {
    public static final gw50 b = new gw50();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return cgg0.b;
    }
}
