package xsna;

import kotlin.coroutines.d;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes11.dex */
public final class a3q0 implements d.b, d.c<a3q0> {
    public static final a3q0 b = new a3q0();

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<?> getKey() {
        return this;
    }
}
