package xsna;

/* compiled from: SuspendableTicker.kt */
/* loaded from: classes17.dex */
public final class qkn0 {
    public final long a;
    public final io.reactivex.rxjava3.core.w b;
    public final io.reactivex.rxjava3.subjects.f<s3q0> c;
    public final io.reactivex.rxjava3.subjects.f d;
    public io.reactivex.rxjava3.disposables.c e;
    public long f;

    public qkn0(long j, io.reactivex.rxjava3.core.w wVar) {
        this.a = j;
        this.b = wVar;
        io.reactivex.rxjava3.subjects.f<s3q0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.c = fVar;
        this.d = fVar;
    }
}
