package xsna;

import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.d;

/* compiled from: ThreadContext.kt */
/* loaded from: classes8.dex */
public final class aro0<T> implements kqo0<T> {
    public final T b;
    public final ThreadLocal<T> c;
    public final dro0 d;

    public aro0(T t, ThreadLocal<T> threadLocal) {
        this.b = t;
        this.c = threadLocal;
        this.d = new dro0(threadLocal);
    }

    @Override // xsna.kqo0
    public final T O(kotlin.coroutines.d dVar) {
        ThreadLocal<T> threadLocal = this.c;
        T t = threadLocal.get();
        threadLocal.set(this.b);
        return t;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        if (this.d.equals(cVar)) {
            return this;
        }
        return null;
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<?> getKey() {
        return this.d;
    }

    @Override // xsna.kqo0
    public final void j(Object obj) {
        this.c.set(obj);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return this.d.equals(cVar) ? EmptyCoroutineContext.b : this;
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }

    public final String toString() {
        return "ThreadLocal(value=" + this.b + ", threadLocal = " + this.c + ')';
    }
}
