package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes3.dex */
public final class cza0<T> implements Comparator {
    public final /* synthetic */ di1 b;

    public cza0(di1 di1Var) {
        this.b = di1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        return compare != 0 ? compare : jw5.b(Integer.valueOf(((ems0) t2).c), Integer.valueOf(((ems0) t).c));
    }
}
