package kotlin.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.d.b;
import xsna.izs;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes11.dex */
public abstract class b<B extends d.b, E extends B> implements d.c<E> {
    public final izs<d.b, E> b;
    public final d.c<?> c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.coroutines.d$c<?>] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v0, types: [xsna.izs<? super kotlin.coroutines.d$b, ? extends E extends B>, xsna.izs<kotlin.coroutines.d$b, E extends B>] */
    public b(d.c<B> cVar, izs<? super d.b, ? extends E> izsVar) {
        this.b = izsVar;
        this.c = cVar instanceof b ? (d.c<B>) ((b) cVar).c : cVar;
    }
}
