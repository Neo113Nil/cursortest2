package xsna;

/* compiled from: ImEngine.kt */
/* loaded from: classes2.dex */
public final class b1w implements izs<Throwable, s3q0> {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

    public b1w(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // xsna.izs
    public final s3q0 invoke(Throwable th) {
        this.b.dispose();
        return s3q0.a;
    }
}
