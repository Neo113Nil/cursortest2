package xsna;

import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Share.kt */
/* loaded from: classes11.dex */
public final class b8f0<T> implements ttk0<T>, ksr, m0t<T> {
    public final /* synthetic */ ttk0<T> b;
    public final eyx c;

    public b8f0(xh50 xh50Var, eyx eyxVar) {
        this.b = xh50Var;
        this.c = eyxVar;
    }

    @Override // xsna.m0t
    public final ksr<T> a(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? lyd.e(this, dVar, i, bufferOverflow) : this;
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super T> lsrVar, spj<?> spjVar) {
        return this.b.collect(lsrVar, spjVar);
    }

    @Override // xsna.ttk0
    public final T getValue() {
        return this.b.getValue();
    }
}
