package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.d;
import xsna.wzs;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes11.dex */
public final class EmptyCoroutineContext implements d, Serializable {
    public static final EmptyCoroutineContext b = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return b;
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // kotlin.coroutines.d
    public final d minusKey(d.c<?> cVar) {
        return this;
    }

    @Override // kotlin.coroutines.d
    public final d plus(d dVar) {
        return dVar;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return r;
    }
}
