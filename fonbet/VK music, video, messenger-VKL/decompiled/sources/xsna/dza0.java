package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class dza0<T> implements Comparator {
    public final /* synthetic */ bza0 b;

    public dza0(bza0 bza0Var) {
        this.b = bza0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        ems0 ems0Var = (ems0) t2;
        ems0 ems0Var2 = (ems0) t;
        return jw5.b(Integer.valueOf(ems0Var.a * ems0Var.b), Integer.valueOf(ems0Var2.a * ems0Var2.b));
    }
}
