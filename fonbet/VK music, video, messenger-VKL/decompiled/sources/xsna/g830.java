package xsna;

import kotlin.coroutines.d;

/* compiled from: MonotonicFrameClock.kt */
/* loaded from: classes11.dex */
public interface g830 extends d.b {

    /* compiled from: MonotonicFrameClock.kt */
    public static final class a implements d.c<g830> {
        public static final /* synthetic */ a b = new a();
    }

    @Override // kotlin.coroutines.d.b
    default d.c<?> getKey() {
        return a.b;
    }

    <R> Object k(izs<? super Long, ? extends R> izsVar, spj<? super R> spjVar);
}
