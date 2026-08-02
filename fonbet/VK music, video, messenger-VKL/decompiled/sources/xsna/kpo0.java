package xsna;

import java.util.Comparator;
import xsna.jpo0;

/* compiled from: Comparisons.kt */
/* loaded from: classes2.dex */
public final class kpo0<T> implements Comparator {
    public final /* synthetic */ lpo0 b;

    public kpo0(lpo0 lpo0Var) {
        this.b = lpo0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        jpo0 jpo0Var = (jpo0) t;
        boolean z = jpo0Var instanceof jpo0.a;
        int i = 2;
        lpo0 lpo0Var = this.b;
        Integer valueOf = Integer.valueOf(z ? 0 : epx.f(jpo0Var.a, lpo0Var.b) ? 1 : 2);
        jpo0 jpo0Var2 = (jpo0) t2;
        if (jpo0Var2 instanceof jpo0.a) {
            i = 0;
        } else if (epx.f(jpo0Var2.a, lpo0Var.b)) {
            i = 1;
        }
        return jw5.b(valueOf, Integer.valueOf(i));
    }
}
