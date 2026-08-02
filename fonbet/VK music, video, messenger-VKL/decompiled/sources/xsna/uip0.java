package xsna;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.d;

/* compiled from: RoomDatabase.android.kt */
/* loaded from: classes.dex */
public final class uip0 implements d.b {
    public static final a d = new a();
    public final kotlin.coroutines.c b;
    public final AtomicInteger c = new AtomicInteger(0);

    /* compiled from: RoomDatabase.android.kt */
    public static final class a implements d.c<uip0> {
    }

    public uip0(kotlin.coroutines.c cVar) {
        this.b = cVar;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<uip0> getKey() {
        return d;
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }
}
