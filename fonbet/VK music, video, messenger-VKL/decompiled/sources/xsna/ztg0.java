package xsna;

/* compiled from: RxExt.kt */
/* loaded from: classes6.dex */
public final class ztg0 extends io.reactivex.rxjava3.observers.b<Object> {
    public final /* synthetic */ izs<Object, s3q0> c;
    public final /* synthetic */ izs<Throwable, s3q0> d;

    /* JADX WARN: Multi-variable type inference failed */
    public ztg0(izs<Object, s3q0> izsVar, izs<? super Throwable, s3q0> izsVar2) {
        this.c = izsVar;
        this.d = izsVar2;
    }

    @Override // io.reactivex.rxjava3.observers.b, io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        this.d.invoke(th);
        dispose();
    }

    @Override // io.reactivex.rxjava3.observers.b, io.reactivex.rxjava3.core.z
    public final void onSuccess(Object obj) {
        this.c.invoke(obj);
        dispose();
    }
}
