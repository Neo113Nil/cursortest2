package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class mbj<T> implements Comparator {
    public final /* synthetic */ lbj b;
    public final /* synthetic */ izs c;

    public mbj(lbj lbjVar, izs izsVar) {
        this.b = lbjVar;
        this.c = izsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        int compare = this.b.compare(t, t2);
        if (compare != 0) {
            return compare;
        }
        izs izsVar = this.c;
        return String.CASE_INSENSITIVE_ORDER.compare(izsVar.invoke(t), izsVar.invoke(t2));
    }
}
