package xsna;

import kotlin.Result;

/* compiled from: RxAwait.kt */
/* loaded from: classes8.dex */
public final class ssg0 implements io.reactivex.rxjava3.core.z<Object> {
    public final /* synthetic */ lq9 b;

    public ssg0(lq9 lq9Var) {
        this.b = lq9Var;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onError(Throwable th) {
        this.b.resumeWith(new Result.Failure(th));
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSubscribe(io.reactivex.rxjava3.disposables.c cVar) {
        this.b.r(new f0z(cVar, 25));
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void onSuccess(Object obj) {
        this.b.resumeWith(obj);
    }
}
