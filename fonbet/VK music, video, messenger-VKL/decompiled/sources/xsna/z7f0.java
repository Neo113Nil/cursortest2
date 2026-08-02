package xsna;

import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: Share.kt */
/* loaded from: classes8.dex */
public final class z7f0<T> implements baj0<T>, ksr, m0t<T> {
    public final /* synthetic */ caj0 b;
    public final eyx c;

    public z7f0(caj0 caj0Var, yok0 yok0Var) {
        this.b = caj0Var;
        this.c = yok0Var;
    }

    @Override // xsna.m0t
    public final ksr<T> a(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return lyd.e(this, dVar, i, bufferOverflow);
    }

    @Override // xsna.ksr
    public final Object collect(lsr<? super T> lsrVar, spj<?> spjVar) {
        return caj0.k(this.b, lsrVar, spjVar);
    }
}
