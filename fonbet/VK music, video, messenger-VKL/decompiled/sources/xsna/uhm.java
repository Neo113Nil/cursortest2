package xsna;

/* compiled from: DialogMessagesEventObservable.kt */
/* loaded from: classes13.dex */
public final class uhm extends n8v {
    public final long b;
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c;

    public uhm(long j, a1w a1wVar) {
        this.b = j;
        this.c = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new qs6(new r3h(this, 6), 8)).U(new d22(new dhh(this, 7), 12));
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super m8v> vVar) {
        this.c.subscribe(vVar);
    }
}
