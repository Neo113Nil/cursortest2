package xsna;

/* compiled from: RxTaskExecution.kt */
/* loaded from: classes3.dex */
public final class zvg0 extends yvg0 {
    public final long a;
    public final io.reactivex.rxjava3.disposables.c b;

    public zvg0(long j, io.reactivex.rxjava3.disposables.c cVar) {
        this.a = j;
        this.b = cVar;
    }

    @Override // xsna.jn50
    public final long b() {
        return this.a;
    }

    @Override // xsna.yvg0
    public final io.reactivex.rxjava3.disposables.c e() {
        return this.b;
    }
}
