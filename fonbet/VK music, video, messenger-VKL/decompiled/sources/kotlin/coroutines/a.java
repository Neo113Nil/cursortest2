package kotlin.coroutines;

import kotlin.coroutines.d;
import xsna.wzs;

/* compiled from: CoroutineContextImpl.kt */
/* loaded from: classes11.dex */
public abstract class a implements d.b {
    private final d.c<?> key;

    public a(d.c<?> cVar) {
        this.key = cVar;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public /* bridge */ <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public d.c<?> getKey() {
        return this.key;
    }

    @Override // kotlin.coroutines.d
    public /* bridge */ d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public d plus(d dVar) {
        return d.a.a(this, dVar);
    }
}
