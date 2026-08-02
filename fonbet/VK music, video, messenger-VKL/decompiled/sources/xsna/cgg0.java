package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes8.dex */
public final class cgg0 implements Comparator<Comparable<? super Object>> {
    public static final cgg0 b = new cgg0();

    @Override // java.util.Comparator
    public final int compare(Comparable<? super Object> comparable, Comparable<? super Object> comparable2) {
        return comparable2.compareTo(comparable);
    }

    @Override // java.util.Comparator
    public final Comparator<Comparable<? super Object>> reversed() {
        return gw50.b;
    }
}
