package xsna;

/* compiled from: ChannelMessagesEventObservable.kt */
/* loaded from: classes16.dex */
public final class i2b extends n8v {
    public final long b;
    public final io.reactivex.rxjava3.internal.operators.observable.j1 c;

    public i2b(long j, a1w a1wVar) {
        this.b = j;
        this.c = new io.reactivex.rxjava3.internal.operators.observable.i0(a1wVar.l.a(), new pb(new iz(this, 14), 4)).U(new pi0(new com.vk.movika.sdk.base.observable.p(this, 17), 6));
    }

    @Override // io.reactivex.rxjava3.core.q
    public final void q0(io.reactivex.rxjava3.core.v<? super m8v> vVar) {
        this.c.subscribe(vVar);
    }
}
