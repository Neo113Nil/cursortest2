package kotlin.coroutines;

import xsna.epx;
import xsna.ivj;
import xsna.wzs;

/* compiled from: CoroutineContext.kt */
/* loaded from: classes11.dex */
public interface d {

    /* compiled from: CoroutineContext.kt */
    public static final class a {
        public static d a(d dVar, d dVar2) {
            return dVar2 == EmptyCoroutineContext.b ? dVar : (d) dVar2.fold(dVar, new ivj());
        }
    }

    /* compiled from: CoroutineContext.kt */
    public interface b extends d {

        /* compiled from: CoroutineContext.kt */
        public static final class a {
            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E a(b bVar, c<E> cVar) {
                if (epx.f(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static d b(b bVar, c<?> cVar) {
                return epx.f(bVar.getKey(), cVar) ? EmptyCoroutineContext.b : bVar;
            }
        }

        c<?> getKey();
    }

    /* compiled from: CoroutineContext.kt */
    public interface c<E extends b> {
    }

    <R> R fold(R r, wzs<? super R, ? super b, ? extends R> wzsVar);

    <E extends b> E get(c<E> cVar);

    d minusKey(c<?> cVar);

    d plus(d dVar);
}
