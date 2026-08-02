package xsna;

import kotlin.coroutines.d;

/* compiled from: Effects.kt */
/* loaded from: classes11.dex */
public final class xq9 implements d.b {
    public static final a b = new a();

    /* compiled from: Effects.kt */
    public static final class a implements d.c<xq9> {
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
        return b;
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
