package xsna;

/* compiled from: SbpToSbpTransferStrategy.kt */
/* loaded from: classes3.dex */
public final class d3h0 implements yp80 {
    public final /* synthetic */ k9k b;

    public d3h0(k9k k9kVar) {
        this.b = k9kVar;
    }

    @Override // xsna.yp80
    public final void U() {
        this.b.a(new IllegalStateException("App does not support SBP transfer"));
    }

    @Override // xsna.yp80
    public final void onError(Throwable th) {
        this.b.a(th);
    }

    @Override // xsna.yp80
    public final void onSuccess() {
        this.b.b(cgq.a);
    }

    @Override // xsna.yp80
    public final void I() {
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
    }
}
