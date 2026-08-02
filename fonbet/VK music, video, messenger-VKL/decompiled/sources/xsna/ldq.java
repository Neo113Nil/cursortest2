package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes11.dex */
public final class ldq<T> implements Comparator {
    public final /* synthetic */ u2k0 b;

    public ldq(u2k0 u2k0Var) {
        this.b = u2k0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        u2k0 u2k0Var = this.b;
        return jw5.b((Comparable) u2k0Var.invoke(t), (Comparable) u2k0Var.invoke(t2));
    }
}
