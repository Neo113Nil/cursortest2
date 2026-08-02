package xsna;

import java.util.List;
import kotlin.coroutines.d;

/* compiled from: CompositionErrorContext.kt */
/* loaded from: classes11.dex */
public final class gvi implements fvi, vs80, d.b {
    public static final a c = new a();
    public final androidx.compose.runtime.c b;

    /* compiled from: CompositionErrorContext.kt */
    public static final class a implements d.c<gvi> {
        public final String toString() {
            return "CompositionErrorContext";
        }
    }

    public gvi(androidx.compose.runtime.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.vs80
    public final boolean a() {
        return this.b.C;
    }

    @Override // xsna.vs80
    public final List<vqi> d(Integer num) {
        return this.b.u0();
    }

    @Override // xsna.fvi
    public final boolean e(Object obj, Throwable th) {
        return qv20.p(th, new t9b(6, this, obj));
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final /* bridge */ <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<?> getKey() {
        return c;
    }

    @Override // kotlin.coroutines.d
    public final /* bridge */ kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}
