package xsna;

/* compiled from: JobSupport.kt */
/* loaded from: classes11.dex */
public final class qsx extends jyx {
    public final izs<Throwable, s3q0> f;

    /* JADX WARN: Multi-variable type inference failed */
    public qsx(izs<? super Throwable, s3q0> izsVar) {
        this.f = izsVar;
    }

    @Override // xsna.jyx
    public final boolean h() {
        return false;
    }

    @Override // xsna.jyx
    public final void i(Throwable th) {
        this.f.invoke(th);
    }
}
