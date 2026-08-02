package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: RxScheduler.kt */
/* loaded from: classes8.dex */
public final class f8h0 extends ovj implements osl {
    public final io.reactivex.rxjava3.core.w c;

    public f8h0(io.reactivex.rxjava3.core.w wVar) {
        this.c = wVar;
    }

    @Override // xsna.osl
    public final ogn J(long j, Runnable runnable, kotlin.coroutines.d dVar) {
        final io.reactivex.rxjava3.disposables.c d = this.c.d(runnable, j, TimeUnit.MILLISECONDS);
        return new ogn() { // from class: xsna.d8h0
            @Override // xsna.ogn
            public final void dispose() {
                io.reactivex.rxjava3.disposables.c.this.dispose();
            }
        };
    }

    @Override // xsna.ovj
    public final void P(kotlin.coroutines.d dVar, Runnable runnable) {
        this.c.c(runnable);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof f8h0) && ((f8h0) obj).c == this.c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.c);
    }

    @Override // xsna.osl
    public final void s(long j, lq9 lq9Var) {
        lq9Var.r(new f0z(this.c.d(new e50(7, lq9Var, this), j, TimeUnit.MILLISECONDS), 25));
    }

    @Override // xsna.ovj
    public final String toString() {
        return this.c.toString();
    }
}
