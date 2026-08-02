package xsna;

import xsna.p8f0;

/* compiled from: RealConnection.kt */
/* loaded from: classes8.dex */
public final class j8f0 extends p8f0.c {
    public final /* synthetic */ u1q d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8f0(bn8 bn8Var, an8 an8Var, u1q u1qVar) {
        super(bn8Var, an8Var);
        this.d = u1qVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.a(-1L, true, true, null);
    }
}
