package xsna;

import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;

/* compiled from: RxTaskExecution.kt */
/* loaded from: classes3.dex */
public final class fvg0 extends yvg0 {
    public final long a;
    public final io.reactivex.rxjava3.disposables.c b;
    public final EmptyDisposable c = EmptyDisposable.NEVER;

    public fvg0(long j, io.reactivex.rxjava3.disposables.c cVar) {
        this.a = j;
        this.b = cVar;
    }

    @Override // xsna.jn50
    public final long b() {
        return this.a;
    }

    @Override // xsna.jn50
    public final boolean c() {
        return false;
    }

    @Override // xsna.yvg0, xsna.jn50
    public final boolean d() {
        return !this.b.h();
    }

    @Override // xsna.yvg0
    public final io.reactivex.rxjava3.disposables.c e() {
        return this.c;
    }

    @Override // xsna.yvg0, xsna.jn50
    public final void a() {
    }
}
