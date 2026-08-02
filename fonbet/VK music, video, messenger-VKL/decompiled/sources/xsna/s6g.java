package xsna;

import java.util.Comparator;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class s6g<T> implements Comparator {
    public final /* synthetic */ t6g b;

    public s6g(t6g t6gVar) {
        this.b = t6gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        t6g t6gVar = this.b;
        return jw5.b(Integer.valueOf(!t6gVar.c.invoke((p9m) t).booleanValue() ? 1 : 0), Integer.valueOf(!t6gVar.c.invoke((p9m) t2).booleanValue() ? 1 : 0));
    }
}
