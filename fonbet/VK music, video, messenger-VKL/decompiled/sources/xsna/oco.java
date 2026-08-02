package xsna;

import kotlin.coroutines.d;

/* compiled from: SafeCollector.kt */
/* loaded from: classes11.dex */
public final class oco implements kotlin.coroutines.d {
    public final /* synthetic */ kotlin.coroutines.d b;
    public final Throwable c;

    public oco(kotlin.coroutines.d dVar, Throwable th) {
        this.b = dVar;
        this.c = th;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return (R) this.b.fold(r, wzsVar);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) this.b.get(cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return this.b.minusKey(cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return this.b.plus(dVar);
    }
}
