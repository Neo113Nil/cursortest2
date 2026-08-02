package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes18.dex */
public final class hxj0<T> implements Comparator {
    public final /* synthetic */ gxj0 b;

    public hxj0(gxj0 gxj0Var) {
        this.b = gxj0Var;
    }

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        gxj0 gxj0Var = this.b;
        return jw5.b((Comparable) gxj0Var.invoke(t), (Comparable) gxj0Var.invoke(t2));
    }
}
