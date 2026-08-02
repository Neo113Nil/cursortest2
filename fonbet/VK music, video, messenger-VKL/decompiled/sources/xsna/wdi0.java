package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes11.dex */
public final class wdi0<T> implements Comparator {
    public final /* synthetic */ vg50 b;

    public wdi0(vg50 vg50Var) {
        this.b = vg50Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        long longValue = ((Number) t).longValue();
        vg50 vg50Var = this.b;
        return jw5.b(Integer.valueOf(vg50Var.b(longValue)), Integer.valueOf(vg50Var.b(((Number) t2).longValue())));
    }
}
